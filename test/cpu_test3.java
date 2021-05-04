public class cpu_test3 {

    private static void pushTest() throws Exception{ // test method for push instruction
        System.out.println("~~~~ TEST \"push\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        String[] test1 = {
            "move R1 -1",
            "push R1", // SP: 1020 => 1016
            "interrupt 0",
            "interrupt 1",
            "halt"
        };
        String[] assembled_code1 = Assembler.assemble(test1);
        computer cpu1 = new computer();
        cpu1.preload(assembled_code1); cpu1.run();
        System.out.println("push test1 successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        String[] test2 = {
            "move R2 -1",
            "push R2", // SP: 1020 => 1016
            "move R15 100",
            "push R15", // SP: 1016 => 1012
            "interrupt 0",
            "interrupt 1",
            "halt"
        };
        String[] assembled_code2 = Assembler.assemble(test2);
        computer cpu2 = new computer();
        cpu2.preload(assembled_code2); cpu2.run();
        System.out.println("push test2 successed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        String[] test3 = {
            "move R0 127",
            "move R1 -1",
            "push R0", // SP: 1020 => 1016
            "push R1", // SP: 1016 => 1012
            "and R0 R1 R3",
            "push R3", // SP: 1012 => 1008
            "interrupt 0",
            "interrupt 1",
            "halt"
        };
        String[] assembled_code3 = Assembler.assemble(test3);
        computer cpu3 = new computer();
        cpu3.preload(assembled_code3); cpu3.run();
        System.out.println("push test3 successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        String[] test4 = {
            "move R7 2",
            "push R7", // SP: 1020 => 1016
            "move R10 3",
            "push R10", // SP: 1016 => 1012
            "add R7 R10 R0",
            "push R0", // SP: 1012 => 1008
            "interrupt 0",
            "interrupt 1",
            "halt"
        };
        String[] assembled_code4 = Assembler.assemble(test4);
        computer cpu4 = new computer();
        cpu4.preload(assembled_code4); cpu4.run();
        System.out.println("push test4 successed");
        System.out.println("==== CASE 4 END ====\n");
        
        // case 5
        System.out.println("==== CASE 5 START ====");
        String[] test5 = {
            "move R1 -1",
            "push R1", // SP: 1020 => 1016
            "move R2 -1",
            "push R2", // SP: 1016 => 1012
            "subtract R1 R2 R0",
            "push R0", // SP: 1012 => 1008
            "interrupt 0",
            "interrupt 1",
            "halt"
        };
        String[] assembled_code5 = Assembler.assemble(test5);
        computer cpu5 = new computer();
        cpu5.preload(assembled_code5); cpu5.run();
        System.out.println("push test5 successed");
        System.out.println("==== CASE 5 END ====\n");

        System.out.println("~~~~ TEST \"push\" END ~~~~\n");
    }

    private static void popTest() throws Exception{ // test method for pop instruction
        System.out.println("~~~~ TEST \"pop\" START ~~~~\n");

        // case 1
        System.out.println("==== CASE 1 START ====");
        String[] test1 = {
            "move R1 -1",
            "push R1", // SP: 1020 => 1016
            "pop R2", // SP: 1016 => 1020
            "interrupt 1",
            "interrupt 0",
            "halt"
        };
        String[] assembled_code1 = Assembler.assemble(test1);
        computer cpu1 = new computer();
        cpu1.preload(assembled_code1); cpu1.run();
        int r2_value = cpu1.getResiterValue(2);
        System.out.println("Expected R2 value: -1");
        System.out.println("Test R2 value: " + r2_value);
        if(r2_value == -1) System.out.println("pop test1 successed");
        else throw new Exception("pop test1 failed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        String[] test2 = {
            "move R2 -1",
            "push R2", // SP: 1020 => 1016
            "move R15 100",
            "push R15", // SP: 1016 => 1012
            "pop R0", // SP: 1012 => 1016
            "interrupt 1",
            "interrupt 0",
            "halt"
        };
        String[] assembled_code2 = Assembler.assemble(test2);
        computer cpu2 = new computer();
        cpu2.preload(assembled_code2); cpu2.run();
        int r15_value = cpu2.getResiterValue(15);
        System.out.println("Expected R15 value: 100");
        System.out.println("Test R15 value: " + r15_value);
        if(r15_value == 100) System.out.println("pop test2 successed");
        else throw new Exception("pop test2 failed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        String[] test3 = {
            "move R0 127",
            "move R1 -1",
            "push R0", // SP: 1020 => 1016
            "push R1", // SP: 1016 => 1012
            "and R0 R1 R3",
            "push R3", // SP: 1012 => 1008
            "pop R3", // SP: 1008 => 1012
            "interrupt 1",
            "interrupt 0",
            "halt"
        };
        String[] assembled_code3 = Assembler.assemble(test3);
        computer cpu3 = new computer();
        cpu3.preload(assembled_code3); cpu3.run();
        int r3_value = cpu3.getResiterValue(3);
        System.out.println("Expected R3 value: 127");
        System.out.println("Test R3 value: " + r3_value);
        if(r3_value == 127) System.out.println("pop test3 successed");
        else throw new Exception("pop test3 failed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        String[] test4 = {
            "move R7 2",
            "push R7", // SP: 1020 => 1016
            "move R10 3",
            "push R10", // SP: 1016 => 1012
            "add R7 R10 R0",
            "push R0", // SP: 1012 => 1008
            "pop R0", // SP: 1008 => 1012
            "interrupt 1",
            "interrupt 0",
            "halt"
        };
        String[] assembled_code4 = Assembler.assemble(test4);
        computer cpu4 = new computer();
        cpu4.preload(assembled_code4); cpu4.run();
        int r0_value = cpu4.getResiterValue(0);
        System.out.println("Expected R0 value: 5");
        System.out.println("Test R0 value: " + r0_value);
        if(r0_value == 5) System.out.println("pop test4 successed");
        else throw new Exception("pop test4 failed");
        System.out.println("==== CASE 4 END ====\n");
        
        // case 5
        System.out.println("==== CASE 5 START ====");
        String[] test5 = {
            "move R1 -1",
            "push R1", // SP: 1020 => 1016
            "move R2 -1",
            "push R2", // SP: 1016 => 1012
            "subtract R1 R2 R0",
            "push R0", // SP: 1012 => 1008
            "pop R0", // SP: 1008 => 1012
            "interrupt 1",
            "interrupt 0",
            "halt"
        };
        String[] assembled_code5 = Assembler.assemble(test5);
        computer cpu5 = new computer();
        cpu5.preload(assembled_code5); cpu5.run();
        int r0_value2 = cpu5.getResiterValue(0);
        System.out.println("Expected R0 value: 0");
        System.out.println("Test R0 value: " + r0_value2);
        if(r0_value2 == 0) System.out.println("pop test5 successed");
        else throw new Exception("pop test5 failed");
        System.out.println("==== CASE 5 END ====\n");

        System.out.println("~~~~ TEST \"pop\" END ~~~~\n");
    }

    private static void callAndReturnTest() throws Exception{ // test method for call instruction
        System.out.println("~~~~ TEST \"call and return\" START ~~~~\n");

        // case 1
        System.out.println("==== CASE 1 START ====");
        String[] test1 = {
            "jump 10", // PC: 0 => 10
            "move R1 -1",
            "and R1 R0 R2",
            "push R1", 
            "return", // PC: 8 => 12, SP: 1016 => 1020
            "call 8", // PC: 10 => 8, SP: 1020 => 1016
            "interrupt 0",
            "halt"
        };
        String[] assembled_code1 = Assembler.assemble(test1);
        computer cpu1 = new computer();
        cpu1.preload(assembled_code1); cpu1.run();
        int r1_value = cpu1.getResiterValue(1);
        System.out.println("Expected R1 value: 0");
        System.out.println("Test R1 value: " + r1_value);
        if(r1_value == 0) System.out.println("call and return test1 successed");
        else throw new Exception("call and return test1 failed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        String[] test2 = {
            "jump 12", // PC: 0 => 12
            "move R2 -1",
            "return", // PC: 2 => 14, SP: 1016 => 1020
            "move R3 -1",
            "move R0 -1",
            "pop R0",
            "call 2", // PC: 12 => 2, SP: 1020 => 1016
            "interrupt 0",
            "halt"
        };
        String[] assembled_code2 = Assembler.assemble(test2);
        computer cpu2 = new computer();
        cpu2.preload(assembled_code2); cpu2.run();
        int r3_value = cpu2.getResiterValue(3);
        System.out.println("Expected R3 value: 0");
        System.out.println("Test R3 value: " + r3_value);
        if(r3_value == 0) System.out.println("call and return test2 successed");
        else throw new Exception("call and return test2 failed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        String[] test3 = {
            "jump 16", // PC: 0 => 16
            "move R0 127",
            "move R1 -1",
            "push R0", 
            "push R1", 
            "move R0 100", // PC: 10 => 12
            "return", // PC: 12 => 18, SP: 1016 => 1020
            "pop R15", 
            "call 10", // PC: 16 => 10, SP: 1020 => 1016
            "interrupt 0",
            "halt"
        };
        String[] assembled_code3 = Assembler.assemble(test3);
        computer cpu3 = new computer();
        cpu3.preload(assembled_code3); cpu3.run();
        int r0_value = cpu3.getResiterValue(0);
        System.out.println("Expected R0 value: 100");
        System.out.println("Test R0 value: " + r0_value);
        if(r0_value == 100) System.out.println("call and return test3 successed");
        else throw new Exception("call and return test3 failed");
        System.out.println("==== CASE 3 END ====\n");

        System.out.println("~~~~ TEST \"call and return\" END ~~~~\n");
    }

    public static void runTest() throws Exception{ // test execution method
        // executes a test method
        pushTest();
        popTest();
        callAndReturnTest();
    }
    
    public static void main(String[] args) throws Exception{ // main method
        runTest(); // executes a test
    }
}
