public class computer {
    private final int REG_SIZE = 16; // sets size of registers
    private final int OP_INDEX0 = 0; // opcode index
    private final int OP_INDEX1 = 1;
    private final int OP_INDEX2 = 2;
    private final int OP_INDEX3 = 3;

    
    private memory memory = null; // declares memory
    private bit[] opcode = null; // declares opcode
    private bit halt_bit = null; // declares halt bit
    private bit bit_zero = null; // declares bit 0 of a result of a compare instruction
    private bit bit_one = null; // declares bit 1 of a result of a compare instruction
    private longword[] registers = null; // declares registers
    private longword PC = null; // declares program counter
    private longword currentInstruction = null; // declares current instruction
    private longword op1 = null; // declares operand 1
    private longword op2 = null; // declares operand 2
    private longword result = null; // declares result

    public computer() throws Exception{
        this.opcode = new bit[4];
        this.halt_bit = new bit(0); // sets the bit's value to default value (0: not running)
        this.memory = new memory(); // allocates memories
        this.PC = new longword(); this.PC.set(0); // sets program counter to default value (0)
        this.currentInstruction = new longword();
        this.registers = new longword[REG_SIZE]; // initializes registers
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
        
        if(!MOVE() && !HALT() && !INTERRUPT() && !JUMP()){ // ALU instruction
            int reg_index1 = 0, reg_index2 = 0, factor = 1;
            for(int index = 7; index >= 4; index--){ // sets register index
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
        }else if(!JUMP()){ // ALU instruction
            longword value = ALU.doOp(opcode ,this.op1,this.op2); // executes an instruction
            this.result.copy(value); // copies result value
        }
    }
    
    private void store(){  // store method
        if(!HALT() && !INTERRUPT() && !JUMP()){ // checks halt bit
            int reg_index = 0, start = 0, factor = 1;
            start = MOVE() ? 7 : 15; // move: start => 7, ALU: start => 15
            for(int index = start; index >= start-3; index--){ // sets store register index
                reg_index += this.currentInstruction.getBit(index).getValue()*factor;
                factor *= 2;
            }
            this.registers[reg_index].copy(this.result); // stores value into the register
        }else if(JUMP()){ // updates PC by a jump instruction
            generateJump();
        }
        if(this.PC.getSigned()*8 > 1024*8-16){ // sets halt bit to 0 if PC is out of bounds
            this.halt_bit.set(0); // sets halt bit to 0
            System.out.println("HALT: All instructions have been completed");
        }
    }

    public void preload(String[] instructions) throws Exception{ // preload method
        if(instructions.length > 2048){
            throw new Exception("The length of instructions exceeds 2048");
        }
        longword address = new longword(); address.set(0); // sets memory address
        String str_instruction = "";
        int instructions_index = 0;
        do{ // loops until memory is completely filled
            while(instructions_index < instructions.length){ // loops until every instruction is stored
                str_instruction += instructions[instructions_index++];
                if(str_instruction.length() == 32) break;
            };
            longword longword_instruction = convertInstruction(str_instruction); // converts string instruction to longword instruction
            longword four = new longword(); four.setBit(29, new bit(1)); // creates a longword type variable meaing of 4
            longword next_address = rippleAdder.add(address, four); // gets next address for reading
            this.memory.write(address, longword_instruction);
            address.copy(next_address);
            str_instruction = "";
        }while(address.getSigned()*8 <= 8*1024-32);
        this.halt_bit.set(1);
    }

    private void generateJump(){ // generates jump
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
}
