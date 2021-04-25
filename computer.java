public class computer {
    private final int REG_SIZE = 16; // sets size of registers
    private final int OP_INDEX0 = 0; // opcode index
    private final int OP_INDEX1 = 1;
    private final int OP_INDEX2 = 2;
    private final int OP_INDEX3 = 3;

    private memory memory = null; // declare memory
    private bit[] opcode = null; // declare opcode
    private bit halt_bit = null; // declare halt bit
    private bit bit0 = null; // declare compare bit0
    private bit bit1 = null; // declare compare bit1
    private longword[] registers = null; // declare registers
    private longword PC = null; // declare program counter
    private longword currentInstruction = null; // declare current instruction
    private longword op1 = null; // declare operand 1
    private longword op2 = null; // declare operand 2
    private longword result = null; // declare result

    public computer() throws Exception{
        this.opcode = new bit[4];
        this.halt_bit = new bit(0); // set the bit's value to default value (0: not running)
        this.bit0 = new bit(1);
        this.bit1 = new bit(1);
        this.memory = new memory(); // allocate memories
        this.PC = new longword(); this.PC.set(0); // set program counter to default value (0)
        this.currentInstruction = new longword();
        this.registers = new longword[REG_SIZE]; // initialize registers
        this.op1 = new longword();
        this.op2 = new longword();
        this.result = new longword();
        for(int index = 0; index < 4; index++) this.opcode[index] = new bit();
        for(int index = 0; index < REG_SIZE; index++) this.registers[index] = new longword(); // allocates memory to each register
    }

    public void run() throws Exception{ // run method
        /**
         * halt_bit
         * 0: computer is not running
         * 1: computer is running
         */
        while(this.halt_bit.getValue() != 0){ // performs the loop until the halt_bit's value changes into 1
            this.fetch();
            this.decode();
            this.execute();
            this.store();
        }
    }

    private void fetch() throws Exception{ // fetch method
        longword instruction = this.memory.read(this.PC); // reads the current instruction
        longword two = new longword(); two.setBit(30, new bit(1)); // creates a longword type variable meaing of 2
        longword next_address = rippleAdder.add(this.PC, two); // gets next address for reading
        this.currentInstruction.copy(instruction); // copies the instruction to currentInstruction
        this.PC.copy(next_address); // copies the next address to program counter
    } 
    
    private void decode(){  // decode method
        // sets opcode
        this.opcode[0].set(this.currentInstruction.getBit(0).getValue());
        this.opcode[1].set(this.currentInstruction.getBit(1).getValue());
        this.opcode[2].set(this.currentInstruction.getBit(2).getValue());
        this.opcode[3].set(this.currentInstruction.getBit(3).getValue());
        
        if(!MOVE() && !HALT() && !INTERRUPT() && !JUMP() && !BRANCH()){ // ALU instruction & compare instruction
            int start = COMPARE() ? 11 : 7;
            int reg_index1 = 0, reg_index2 = 0, factor = 1;
            for(int index = start; index >= start-3; index--){ // sets register index
                reg_index1 += factor*this.currentInstruction.getBit(index).getValue();
                reg_index2 += factor*this.currentInstruction.getBit(index+4).getValue();
                factor *= 2;
            }
            this.op1.copy(this.registers[reg_index1]); // copies data from a register.
            this.op2.copy(this.registers[reg_index2]);
        }
    }
    
    private void execute() throws Exception{ // execute method
        if(HALT()){ // halt instruction
            this.halt_bit.set(0); // sets halt bit to 0 (not running)
            System.out.println("HALT: HALT instruction has been completed");
        }else if(MOVE()){ // move instruction
            generateMove();
        }else if(INTERRUPT()){ // interrupt instruction
            generateInterrupt();
        }else if(COMPARE()){ // compare instruction
            compareRegisters();
        }else if(!JUMP() && !BRANCH()){ // ALU instruction
            longword value = ALU.doOp(opcode ,this.op1,this.op2); // executes an instruction
            this.result.copy(value); // copies result value
        }
    }
    
    private void store() throws Exception{  // store method
        if(!HALT() && !INTERRUPT() && !JUMP() && !BRANCH()){
            int reg_index = 0, start = 0, factor = 1;
            start = MOVE() ? 7 : 15; // move: start => 7, ALU: start => 15
            for(int index = start; index >= start-3; index--){ // set store register index
                reg_index += this.currentInstruction.getBit(index).getValue()*factor;
                factor *= 2;
            }
            this.registers[reg_index].copy(this.result); // store value into the register
        }else if(JUMP()){ // update PC by a jump instruction
            generateJump();
        }else if(BRANCH()){ // update PC by a branch instruction
            if(checkCondition()){
                // PC already copied next address. It has to go back to formal address to be applied to branch instruction
                longword two = new longword(); two.setBit(30, new bit(1)); two = two.not();
                longword one = new longword(); one.setBit(31, new bit(1));
                longword minus_two = rippleAdder.add(two, one);
                longword go_back = rippleAdder.add(this.PC, minus_two); // go back
                this.PC.copy(go_back);
                generateBranch();
            }
        }
        if(this.PC.getSigned() < 0 || this.PC.getSigned() > 1024){ // occur an error when PC is negative
            throw new Exception("The address\"" + this.PC.getSigned() + "\" is out of range (0 ~ 1024)");
        }
        if(this.PC.getSigned()*8 > 1024*8-16){ // set halt bit to 0 if PC is out of bounds
            this.halt_bit.set(0); // set halt bit to 0
            System.out.println("HALT: All instructions have been completed");
        }
    }

    public void preload(String[] instructions) throws Exception{ // preload method
        if(instructions.length > 2048){
            throw new Exception("The length of instructions exceeds 2048");
        }
        longword address = new longword(); address.set(0); // set memory address
        String str_instruction = "";
        int instructions_index = 0;
        do{ // loops until memory is completely filled
            while(instructions_index < instructions.length){ // loop until every instruction is stored
                str_instruction += instructions[instructions_index++];
                if(str_instruction.length() == 32) break;
            };
            longword longword_instruction = convertInstruction(str_instruction); // convert string instruction to longword instruction
            longword four = new longword(); four.setBit(29, new bit(1)); // create a longword type variable meaing of 4
            longword next_address = rippleAdder.add(address, four); // get next address for reading
            this.memory.write(address, longword_instruction);
            address.copy(next_address);
            str_instruction = "";
        }while(address.getSigned()*8 <= 8*1024-32);
        this.halt_bit.set(1); // set halt bit to 1
    }

    private Boolean checkCondition() throws Exception{ // check branch's condition
        int cc1 = this.currentInstruction.getBit(4).getValue();
        int cc2 = this.currentInstruction.getBit(5).getValue();
        if(this.bit0.getValue() == 1 && this.bit1.getValue() == 1){
            throw new Exception("there is no compare result.");
        }
        if(cc1 == 1 && cc2 == 1){ // branchifequal
            return this.bit1.getValue() == 1;
        }
        if(cc1 == 1 && cc2 == 0){ // branchifnotequal
            return this.bit1.getValue() == 0;
        }
        if(cc1 == 0 && cc2 == 0){ // branchifgreaterthan
            return this.bit0.getValue() == 1 && this.bit1.getValue() == 0;
        }
        if(cc1 == 0 && cc2 == 1){ // branchifgreaterthanorequal
            return this.bit0.getValue() == 1 || this.bit1.getValue() == 1;
        }
        return false;
    }
    
    private void compareRegisters() throws Exception{ // compare registers by a compare instruction
        int result = rippleAdder.subtract(this.op1, this.op2).getSigned();
        if(result > 0){ // result (from subtract) is bigger than 0. it means about "compare a b" that "a" is bigger than "b"
            this.bit0.set(1); // set first bit to 1 because "a" is greater than "b"
        }else{
            this.bit0.set(0);
        };
        if(result != 0){
            this.bit1.set(0);
        }else{
            this.bit1.set(1);
        };
    }

    private void generateBranch() throws Exception{ // generate branch
        longword longword = new longword(); longword.set(0);
        if(this.currentInstruction.getBit(6).getValue() == 1) longword.set(1);
        for(int index = 7; index < 16; index++){
            longword.setBit(index+16, this.currentInstruction.getBit(index));
        }
        longword next_address = rippleAdder.add(this.PC, longword);
        this.PC.copy(next_address);
    }
    
    private void generateJump(){ // generate jump
        longword address = new longword(); address.set(0);
        for(int index = 4; index < 16; index++){
            address.setBit(index+16, this.currentInstruction.getBit(index));
        }
        this.PC.copy(address); // jump to the address
    }

    private void generateMove(){ // generates move
        longword value = new longword();
        switch(this.currentInstruction.getBit(8).getValue()){  // checks if value is negative
            case 1: value.set(1); break; // negative
            default: value.set(0); // positive
        }
        for(int index = 9; index < 16; index++){
            value.setBit(index+16, this.currentInstruction.getBit(index));
        }
        this.result.copy(value); // copies result value
    }

    private longword convertInstruction(String instructions) throws Exception{ // converts a string instruction to a longword instruction
        int index = 0;
        longword longword = new longword();
        while(index < instructions.length()){
            longword.setBit(index, new bit(instructions.charAt(index++) - '0'));
        };
        while(index < 32){ // pads with 0's
            longword.setBit(index++, new bit(0));
        }
        return longword;
    }

    private void generateInterrupt(){ // generates interrupt
        StringBuilder sb = new StringBuilder();
        int bit_value = this.currentInstruction.getBit(15).getValue();
        if(bit_value == 0){ // prints all of the registers
            for(int index = 0; index < REG_SIZE; index++){
                sb.append("REGISTER"+index+": " + this.registers[index].toString() + "\n");
            }
        }else{ // prints all 1024 bytes of memory
            sb.append("MEMORY: " + this.memory.toString());
        }
        System.out.println(sb.toString());
    }

    protected int[] getCompareBitValue(){
        int[] result = {this.bit0.getValue(), this.bit1.getValue()};
        return result;
    }

    protected int getResiterValue(int index){
        return this.registers[index].getSigned();
    }

    private Boolean HALT(){ // checks if an instruction is a halt instruction
        return ( // 0000
            this.opcode[OP_INDEX0].getValue() == 0 &&
            this.opcode[OP_INDEX1].getValue() == 0 &&
            this.opcode[OP_INDEX2].getValue() == 0 &&
            this.opcode[OP_INDEX3].getValue() == 0
        );
    }

    private Boolean MOVE(){ // checks if an instruction is a move instruction
        return ( // 0001
            this.opcode[OP_INDEX0].getValue() == 0 &&
            this.opcode[OP_INDEX1].getValue() == 0 &&
            this.opcode[OP_INDEX2].getValue() == 0 &&
            this.opcode[OP_INDEX3].getValue() == 1
        );
    }

    private Boolean INTERRUPT(){ // chekcs if an instruction is an interrupt instruction
        return ( // 0010
            this.opcode[OP_INDEX0].getValue() == 0 &&
            this.opcode[OP_INDEX1].getValue() == 0 &&
            this.opcode[OP_INDEX2].getValue() == 1 &&
            this.opcode[OP_INDEX3].getValue() == 0
        );
    }

    private Boolean JUMP(){ // checks if an instruction is a jump instruction
        return ( // 0011
            this.opcode[OP_INDEX0].getValue() == 0 &&
            this.opcode[OP_INDEX1].getValue() == 0 &&
            this.opcode[OP_INDEX2].getValue() == 1 &&
            this.opcode[OP_INDEX3].getValue() == 1
        );
    }

    private Boolean COMPARE(){ // checks if an instruction is a compare instruction
        return ( // 0100
            this.opcode[OP_INDEX0].getValue() == 0 &&
            this.opcode[OP_INDEX1].getValue() == 1 &&
            this.opcode[OP_INDEX2].getValue() == 0 &&
            this.opcode[OP_INDEX3].getValue() == 0
        );
    }

    private Boolean BRANCH(){ // checks if an instruction is a compare instruction
        return ( // 0101
            this.opcode[OP_INDEX0].getValue() == 0 &&
            this.opcode[OP_INDEX1].getValue() == 1 &&
            this.opcode[OP_INDEX2].getValue() == 0 &&
            this.opcode[OP_INDEX3].getValue() == 1
        );
    }
}
