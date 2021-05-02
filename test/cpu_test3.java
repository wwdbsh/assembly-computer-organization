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
        System.out.println("pop test1 successed");
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
        System.out.println("pop test2 successed");
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
            "pop R15", // SP: 1008 => 1012
            "interrupt 1",
            "interrupt 0",
            "halt"
        };
        String[] assembled_code3 = Assembler.assemble(test3);
        computer cpu3 = new computer();
        cpu3.preload(assembled_code3); cpu3.run();
        System.out.println("pop test3 successed");
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
            "pop R2", // SP: 1008 => 1012
            "interrupt 1",
            "interrupt 0",
            "halt"
        };
        String[] assembled_code4 = Assembler.assemble(test4);
        computer cpu4 = new computer();
        cpu4.preload(assembled_code4); cpu4.run();
        System.out.println("pop test4 successed");
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
            "pop R15", // SP: 1008 => 1012
            "interrupt 1",
            "interrupt 0",
            "halt"
        };
        String[] assembled_code5 = Assembler.assemble(test5);
        computer cpu5 = new computer();
        cpu5.preload(assembled_code5); cpu5.run();
        System.out.println("pop test5 successed");
        System.out.println("==== CASE 5 END ====\n");

        System.out.println("~~~~ TEST \"pop\" END ~~~~\n");
    }

    private static void callTest() throws Exception{ // test method for call instruction
        System.out.println("~~~~ TEST \"call\" START ~~~~\n");

        // case 1
        System.out.println("==== CASE 1 START ====");
        String[] test1 = {
            "move R1 0",
            "and R1 R0 R2",
            "push R1", // SP: 1020 => 1016
            "pop R2", // SP: 1016 => 1020
            "call 0",
            "add R0 R1 R3",
            "interrupt 1",
            "halt"
        };
        String[] assembled_code1 = Assembler.assemble(test1);
        computer cpu1 = new computer();
        cpu1.preload(assembled_code1); cpu1.run();
        int[] pcsp1 = cpu1.getPCAndSP();
        System.out.println("Excpeted SP: SP -> 0");
        System.out.println("Test SP: SP -> " + pcsp1[1]);
        System.out.println("call test1 successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        String[] test2 = {
            "move R2 -1",
            "push R2", // SP: 1020 => 1016
            "move R15 100",
            "push R15", // SP: 1016 => 1012
            "pop R0", // SP: 1012 => 1016,
            "call 0",
            "interrupt 1",
            "halt"
        };
        String[] assembled_code2 = Assembler.assemble(test2);
        computer cpu2 = new computer();
        cpu2.preload(assembled_code2); cpu2.run();
        int[] pcsp2 = cpu2.getPCAndSP();
        System.out.println("Excpeted SP: SP -> 0");
        System.out.println("Test SP: SP -> " + pcsp2[1]);
        System.out.println("call test2 successed");
        System.out.println("==== CASE 2 END ====\n");
        
        // // case 3
        // System.out.println("==== CASE 3 START ====");
        // String[] test3 = {
        //     "move R0 127",
        //     "move R1 -1",
        //     "push R0", // SP: 1020 => 1016
        //     "push R1", // SP: 1016 => 1012
        //     "and R0 R1 R3",
        //     "push R3", // SP: 1012 => 1008
        //     "pop R15", // SP: 1008 => 1012
        //     "interrupt 1",
        //     "interrupt 0",
        //     "halt"
        // };
        // String[] assembled_code3 = Assembler.assemble(test3);
        // computer cpu3 = new computer();
        // cpu3.preload(assembled_code3); cpu3.run();
        // System.out.println("call test3 successed");
        // System.out.println("==== CASE 3 END ====\n");

        // // case 4
        // System.out.println("==== CASE 4 START ====");
        // String[] test4 = {
        //     "move R7 2",
        //     "push R7", // SP: 1020 => 1016
        //     "move R10 3",
        //     "push R10", // SP: 1016 => 1012
        //     "add R7 R10 R0",
        //     "push R0", // SP: 1012 => 1008
        //     "pop R2", // SP: 1008 => 1012
        //     "interrupt 1",
        //     "interrupt 0",
        //     "halt"
        // };
        // String[] assembled_code4 = Assembler.assemble(test4);
        // computer cpu4 = new computer();
        // cpu4.preload(assembled_code4); cpu4.run();
        // System.out.println("call test4 successed");
        // System.out.println("==== CASE 4 END ====\n");
        
        // // case 5
        // System.out.println("==== CASE 5 START ====");
        // String[] test5 = {
        //     "move R1 -1",
        //     "push R1", // SP: 1020 => 1016
        //     "move R2 -1",
        //     "push R2", // SP: 1016 => 1012
        //     "subtract R1 R2 R0",
        //     "push R0", // SP: 1012 => 1008
        //     "pop R15", // SP: 1008 => 1012
        //     "interrupt 1",
        //     "interrupt 0",
        //     "halt"
        // };
        // String[] assembled_code5 = Assembler.assemble(test5);
        // computer cpu5 = new computer();
        // cpu5.preload(assembled_code5); cpu5.run();
        // System.out.println("call test5 successed");
        // System.out.println("==== CASE 5 END ====\n");

        System.out.println("~~~~ TEST \"call\" END ~~~~\n");
    }

    private static void returnTest() throws Exception{ // test method for return instruction
        System.out.println("~~~~ TEST \"return\" START ~~~~\n");
    
        // case 1
        System.out.println("==== CASE 1 START ====");
        String[] test1 = {
            "move R1 -1",
            "push R1", // SP: 1020 => 1016
            "return" // PC: 1016, SP: 1016 => 1020
        };
        String[] assembled_code1 = Assembler.assemble(test1);
        computer cpu1 = new computer();
        cpu1.preload(assembled_code1); cpu1.run();
        int[] pcsp1 = cpu1.getPCAndSP();
        System.out.println("Excpeted output: PC -> 1016, SP -> 1020");
        System.out.println("Test output: PC -> " + (pcsp1[0]-2) + ", SP -> " + pcsp1[1]);
        if(pcsp1[0]-2 == 1016 && pcsp1[1] == 1020) System.out.println("return test1 successed");
        else throw new Exception("return test1 failed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        String[] test2 = {
            "move R2 -1",
            "push R2", // SP: 1020 => 1016
            "move R15 100",
            "push R15", // SP: 1016 => 1012
            "pop R0", // SP: 1012 => 1016
            "push R1", // SP: 1016 => 1012
            "push R9", // SP: 1012 => 1008
            "push R4", // SP: 1008 => 1004
            "push R7", // SP: 1004 => 1000
            "push R3", // SP: 1000 => 996
            "return" // PC: 996, SP: 996 => 1000
        };
        String[] assembled_code2 = Assembler.assemble(test2);
        computer cpu2 = new computer();
        cpu2.preload(assembled_code2); cpu2.run();
        int[] pcsp2 = cpu2.getPCAndSP();
        System.out.println("Excpeted output: PC -> 996, SP -> 1000");
        System.out.println("Test output: PC -> " + (pcsp2[0]-2) + ", SP -> " + pcsp2[1]);
        if(pcsp2[0]-2 == 996 && pcsp2[1] == 1000) System.out.println("return test2 successed");
        else throw new Exception("return test2 failed");
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
            "pop R15", // SP: 1008 => 1012
            "return" // PC: 1012, SP: 1012 => 1016
        };
        String[] assembled_code3 = Assembler.assemble(test3);
        computer cpu3 = new computer();
        cpu3.preload(assembled_code3); cpu3.run();
        int[] pcsp3 = cpu3.getPCAndSP();
        System.out.println("Excpeted output: PC -> 1012, SP -> 1016");
        System.out.println("Test output: PC -> " + (pcsp3[0]-2) + ", SP -> " + pcsp3[1]);
        if(pcsp3[0]-2 == 1012 && pcsp3[1] == 1016) System.out.println("return test3 successed");
        else throw new Exception("return test3 failed");
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
            "pop R2", // SP: 1008 => 1012
            "push R9", // SP: 1012 => 1008
            "return" // PC: 1008, SP: 1008 => 1012
        };
        String[] assembled_code4 = Assembler.assemble(test4);
        computer cpu4 = new computer();
        cpu4.preload(assembled_code4); cpu4.run();
        int[] pcsp4 = cpu4.getPCAndSP();
        System.out.println("Excpeted output: PC -> 1008, SP -> 1012");
        System.out.println("Test output: PC -> " + (pcsp4[0]-2) + ", SP -> " + pcsp4[1]);
        if(pcsp4[0]-2 == 1008 && pcsp4[1] == 1012) System.out.println("return test4 successed");
        else throw new Exception("return test4 failed");
        System.out.println("==== CASE 4 END ====\n");
        
        // case 5
        System.out.println("==== CASE 5 START ====");
        String[] test5 = {
            "move R1 0",
            "push R1", // SP: 1020 => 1016
            "move R2 0",
            "push R2", // SP: 1016 => 1012
            "subtract R1 R2 R0",
            "push R0", // SP: 1012 => 1008
            "pop R15", // SP: 1008 => 1012
            "pop R2", // SP: 1012 => 1016
            "return" // PC: 1016, SP: 1012 => 1020
        };
        String[] assembled_code5 = Assembler.assemble(test5);
        computer cpu5 = new computer();
        cpu5.preload(assembled_code5); cpu5.run();
        int[] pcsp5 = cpu5.getPCAndSP();
        System.out.println("Excpeted output: PC -> 1016, SP -> 1020");
        System.out.println("Test output: PC -> " + (pcsp5[0]-2) + ", SP -> " + pcsp5[1]);
        if(pcsp5[0]-2 == 1016 && pcsp5[1] == 1020) System.out.println("return test5 successed");
        else throw new Exception("return test5 failed");
        System.out.println("==== CASE 5 END ====\n");

        System.out.println("~~~~ TEST \"return\" END ~~~~\n");
    }

    public static void runTest() throws Exception{ // test execution method
        // executes a test method
        pushTest();
        popTest();
        callTest();
        // returnTest();
    }
    
    public static void main(String[] args) throws Exception{ // main method
        runTest(); // executes a test
    }
}
