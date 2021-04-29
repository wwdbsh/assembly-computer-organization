import java.util.*;

public class Assembler{
    private static final String ZEROS = "0000"; // variable for initializing bit patterns
    private static final int SIZE = 2048; // size of string array that will be returned from assemble method 

    private static String[] instructions = null; // string type instructions
    private static String[] bit_patterns = null; // bit patterns instructions
    private static String command = null; // operation command variable for error checking
    private static int bit_patterns_index = 0; // index of bit pattenrs container
    private static int instruction_index = 0; // index of instruction

    public static String[] assemble(String[] string_input) throws Exception{
        initializeVariables(); // initializes global variables
        bit_patterns = new String[SIZE];
        for(int index = 0; index < SIZE; index++){ // initializes bit patterns with zeros
            bit_patterns[index] = ZEROS;
        }
        instructions = string_input;
        if(instructions.length <= SIZE/4 && instructions.length > 0){
            saveBitPatterns(0);
            return bit_patterns;
        }else if(instructions.length > SIZE/4){ // occurs error when the input is out of bounds
            throw new Exception("The number of the input is out of bounds (512)");
        }else{ // occurs error when there is no input
            throw new Exception("There is no input to assemble");
        }
    }

    private static void saveBitPatterns(int index) throws Exception{
        if(bit_patterns_index%4 != 0){ // occurs error when a instruction is incomplete. ex) multiply R0
            throw new Exception("\"" + instructions[instruction_index] + "\" is not valid operation");
        }
        if(index == instructions.length){ // if all instructions are saved, finishes recursion
            return;
        }
        command = null; // initializes command variable
        instruction_index = index; // stores index of an instruction being converted
        parser(instructions[index], "", 0); // performs parser for an instruction
        saveBitPatterns(index+1); // lets it call itself for next instruction
    }

    private static void parser(String instruction, String token, int index) throws Exception{
        if(
            index == instruction.length() || // index exceeds the index range of instruction
            (index < instruction.length() && instruction.charAt(index) == ' ') // index indicates white space character
        ){
            String bit_pattern = convertTokenToBitPattern(token); // converts token to bit pattern
            if(bit_pattern.length() > 4){ // if bit pattern is longer than 4, we can know that it is number, not command or register
                String four_bits = "";
                for(int pattern_index = 0; pattern_index <= bit_pattern.length(); pattern_index++){
                    // stores bit patterns indicating number (ex. 1111 1111)
                    if(pattern_index == bit_pattern.length()){
                        bit_patterns[bit_patterns_index++] = four_bits;
                    }else if(bit_pattern.charAt(pattern_index) == ' '){
                        bit_patterns[bit_patterns_index++] = four_bits;
                        four_bits = "";
                    }else{
                        four_bits += bit_pattern.charAt(pattern_index); // assemble pattern
                    }
                }
            }else{
                bit_patterns[bit_patterns_index++] = bit_pattern;
            }
            if(index != instruction.length()){
                parser(instruction, "", index+1); // gets next token
            }
            return;
        }
        parser(instruction, token+instruction.charAt(index), index+1); // assembles pattern
    }
    
    private static String convertTokenToBitPattern(String token) throws Exception{
        if(token.length() > 5 && token.substring(0, 6).equals("branch")){ // branch
            saveOpcode(token); return "0101";
        }
        switch(token){ // gets bit pattern from command token
            case "multiply": saveOpcode(token); return "0111"; 
            case "subtract": saveOpcode(token); return "1111";
            case "add": saveOpcode(token); return "1110";
            case "rightShift": saveOpcode(token); return "1101";
            case "leftShift": saveOpcode(token); return "1100";
            case "not": saveOpcode(token); return "1011";
            case "xor": saveOpcode(token); return "1010";
            case "or": saveOpcode(token); return "1001";
            case "and": saveOpcode(token); return "1000";
            case "move": saveOpcode(token); return "0001";
            case "jump": saveOpcode(token); return "0011";
            case "call": saveOpcode(token); return "0110";
            case "compare": saveOpcode(token); return "0100 0000";
            case "interrupt": saveOpcode(token); return "0010 0000";
            case "push": saveOpcode(token); return "0110 0000 0000";
            case "pop": saveOpcode(token); return "0110 0100 0000";
            case "halt": saveOpcode(token); return "0000 0000 0000 0000";
            case "return": saveOpcode(token); return "0110 1100 0000 0000";
            default: return getRegister(token); // if token is not a command, gets a pattern of register 
        }
    }
    private static String getRegister(String token) throws Exception{
        validateInstruction(); // occurs error when a instruction is unvalid
        switch(token){ // gets bit pattern from register token
            case "R0": return "0000"; 
            case "R1": return "0001";
            case "R2": return "0010"; 
            case "R3": return "0011";
            case "R4": return "0100"; 
            case "R5": return "0101";
            case "R6": return "0110"; 
            case "R7": return "0111";
            case "R8": return "1000"; 
            case "R9": return "1001";
            case "R10": return "1010";
            case "R11": return "1011";
            case "R12": return "1100";
            case "R13": return "1101";
            case "R14": return "1110";
            case "R15": return "1111";
            default: return convertDecimalToBinary(token); // if token is not a register, gets a pattern of signed integer
        }
    }

    private static String convertDecimalToBinary(String token) throws Exception{ // method for getting a 8 bits pattern from signed integer
        validateToken(token); // occurs error when the token is invalid string value
        validateDecimalNumber(token); // occurs error when decimal value is out of range
        longword longword = new longword(); longword.set(0);
        int number = token.charAt(0) == '-' ? Integer.parseInt(token.substring(1)) : Integer.parseInt(token);
        int index = 31;
        while(number != 0){ // sets signed 8 bits binary
            longword.setBit(index--, new bit(number%2));
            number /= 2;
        }
        if(token.charAt(0) == '-'){ // if token is negative number, performs two's complement
            longword carry = new longword(); carry.setBit(31, new bit(1));
            longword = longword.not();
            longword = rippleAdder.add(longword, carry);
        }
        int end_point = 24;
        String bit_pattern = "";
        String cc = "";
        switch(command){
            case "branchIfEqual": cc = "11"; end_point = 22; break;
            case "branchIfNotEqual": cc = "10"; end_point = 22; break;
            case "branchIfGreaterThan": cc = "00"; end_point = 22; break;
            case "branchIfGreaterThanOrEqual": cc = "01"; end_point = 22; break;
            case "call": cc = "10"; end_point = 22; break;
            case "jump": end_point = 20;
        }
        for(index = 31; index >= end_point; index--){ // assembles the pattern
            bit_pattern = longword.getBit(index).toString() + bit_pattern;
            if(
                index == 28 ||
                (command.equals("jump") && index == 24) ||
                (((command.length() > 5 && command.substring(0, 6).equals("branch")) || command.equals("call")) && index == 24)
            ){
                bit_pattern = " " + bit_pattern;
            }
        }
        return cc+bit_pattern;
    }

    private static void initializeVariables(){ // method for initializing variables
        instructions = null;
        bit_patterns = null;
        command = null;
        bit_patterns_index = 0;
        instruction_index = 0;
    }

    private static void saveOpcode(String token) throws Exception{
        if(command == null){
            command = token;
        }else{
            throw new Exception("\"" + instructions[instruction_index] + "\" is not valid operation");
        }
    }

    private static void validateToken(String token) throws Exception{ // method for checking if a token is valid
        try{
            Integer.parseInt(token);
        }catch(Exception e){
            throw new Exception(
                "the token \"" + 
                token + 
                "\" is not allowed. " + 
                "(not operation command, registers, and decimal values)"
            );
        }
    }

    private static void validateDecimalNumber(String token) throws Exception{ // method for checking if a token is valid decimal number
        int number = Integer.parseInt(token);
        if(command != null && command.equals("interrupt") && (number < 0 || number > 1)){ // error handler for when the command is "interrupt"
            throw new Exception(
                "the decimal value \"" +
                token +
                "\" is out of range for interrupt operation (0 ~ 1)"
            );
        }
        if(command != null && command.equals("move") && (number < -128 || number > 127)){ // error handler for when the command is "move"
            throw new Exception(
                "the decimal \"" +
                token +
                "\" value is out of range (-128 ~ 127)"
            );
        }
        if(command != null && command.equals("jump") && (number%2 != 0 || number < 0 || number > 1022)){ // error handler for when the command is "jump"
            throw new Exception(
                "the decimal \"" +
                token +
                "\" value of " + 
                "\"jump\" instruction" +
                " is either out of range (0 ~ 1022) or not an even number"
            );
        }
        if(command != null && command.equals("call") && (number%2 != 0 || number < 0 || number > 1020)){ // error handler for when the command is "call"
            throw new Exception(
                "the decimal \"" +
                token +
                "\" value of " + 
                "\"call\" instruction" +
                " is either out of range (0 ~ 1020) or not an even number"
            );
        }
        if(command != null && command.length() > 5 && command.substring(0, 6).equals("branch") && (Math.abs(number)%2 != 0 || number > 510 || number < -512)){ // error handler for when the command is "branch"
            throw new Exception(
                "the decimal \"" +
                token +
                "\" value of " + 
                "\"branch\" instruction" +
                " is either out of range (-512 ~ 510) or not an even number"
            );
        }
    }

    private static void validateInstruction() throws Exception{ // method for checking if an instruction is valid
        if(command == null){ // error handler for when the instruction has no operation command (operation command => null)
            throw new Exception("\"" + instructions[instruction_index] + "\" is not valid operation");
        }
    }

    public static void main(String[] args) throws Exception{
        String[] strArr = new String[512];
        // for(int i = 0; i < 512; i++){
        //     strArr[i] = "halt";
        // }
        String[] cmd = {"multiply","subtract","add","rightShift","leftShift","not","xor","or","and","move"};
        // String[] cmd = {"multiply","subtract","add","rightShift","leftShift","not","xor","or","and","move","interrupt"};
        String[] reg = {"R0","R1","R2","R3","R4","R5","R6","R7","R8","R9","R10","R11","R12","R13","R14","R15"};
        for(int i = 0; i < 512; i++){
            String instruction = cmd[(int)(Math.random()*cmd.length)];
            if(instruction.equals("interrupt")){
                instruction += " " + Integer.toString((int)(Math.random()*2));
            }else if(instruction.equals("move")){
                instruction += (" " + reg[(int)(Math.random()*reg.length)]);
                instruction += (" " + Integer.toString((new Random()).nextInt(128+128)-128));
            }else{
                for(int j = 0; j < 3; j++){
                    instruction += (" " + reg[(int)(Math.random()*reg.length)]);
                }
            }
            strArr[i] = instruction;
            // System.out.println(strArr[i]);
        }
        // strArr[505] = "compare R15 R1";
        // strArr[506] = "branchIfEqual 2";
        // strArr[507] = "branchIfNotEqual 2";
        // strArr[508] = "branchIfGreaterThan 2";
        // strArr[509] = "branchIfGreaterThanOrEqual 2";
        // strArr[510] = "jump 1022";

        strArr[507] = "push R1";
        strArr[508] = "pop R2";
        strArr[509] = "call 10";
        strArr[510] = "return";
        strArr[511] = "halt";

        String[] arr = assemble(strArr);
        StringBuilder sb = new StringBuilder();
        for(int index = 0; index < strArr.length*4; index++){
            if(index != 0 && index % 4 == 0){
                sb.append(strArr[index/4-1] + "\n");
            }
            sb.append(arr[index] + " ");
            if(index == strArr.length*4-1){
                sb.append(strArr[index/4]);
            }
        }
        System.out.println(sb.toString());
        // computer cpu = new computer();
        // cpu.preload(arr);
        // cpu.run();
    }
}

