public class cpu_test2 {

    private static void jumpTest() throws Exception{ // test method for jump instruction
        System.out.println("~~~~ TEST \"jump\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        String[] test1 = {"jump 4", "move R1 5", "interrupt 0", "halt"};
        String[] assembled_code1 = Assembler.assemble(test1);
        computer cpu1 = new computer();
        cpu1.preload(assembled_code1); cpu1.run();
        int r1_value = cpu1.getResiterValue(1);
        System.out.println("Test output: R1 is " + r1_value);
        System.out.println("Expected output: R1 is 0");
        if(r1_value == 0) System.out.println("jump test1 successed");
        else throw new Exception("jump test1 failed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        String[] test2 = {"jump 8", "move R2 5", "interrupt 0", "interrupt 1", "interrupt 0", "halt"};
        String[] assembled_code2 = Assembler.assemble(test2);
        computer cpu2 = new computer();
        cpu2.preload(assembled_code2); cpu2.run();
        cpu1.preload(assembled_code1); cpu1.run();
        int r2_value = cpu1.getResiterValue(2);
        System.out.println("Test output: R2 is " + r2_value);
        System.out.println("Expected output: R2 is 0");
        if(r2_value == 0) System.out.println("jump test2 successed");
        else throw new Exception("jump test2 failed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        String[] test3 = {"jump 8", "interrupt 0", "interrupt 1", "interrupt 0", "halt"};
        String[] assembled_code3 = Assembler.assemble(test3);
        computer cpu3 = new computer();
        cpu3.preload(assembled_code3); cpu3.run();
        System.out.println("jump test3 successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        String[] test4 = {"jump 6", "interrupt 0", "halt", "move R0 125", "jump 2", "halt"};
        String[] assembled_code4 = Assembler.assemble(test4);
        computer cpu4 = new computer();
        cpu4.preload(assembled_code4); cpu4.run();
        int r0_value = cpu1.getResiterValue(0);
        System.out.println("Test output: R0 is " + r0_value);
        System.out.println("Expected output: R0 is 0");
        if(r0_value == 0) System.out.println("jump test4 successed");
        else throw new Exception("jump test4 failed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        String[] test5 = {"jump 10", "jump 8", "interrupt 0", "halt", "jump 4", "jump 2", "interrupt 1"};
        String[] assembled_code5 = Assembler.assemble(test5);
        computer cpu5 = new computer();
        cpu5.preload(assembled_code5); cpu5.run();
        System.out.println("jump test5 successed");
        System.out.println("==== CASE 5 END ====\n");

        System.out.println("~~~~ TEST \"jump\" END ~~~~\n");
    }

    private static void compareTest() throws Exception{ // test method for compare instruction
        System.out.println("~~~~ TEST \"compare\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        String[] test1 = {"move R0 10", "move R1 10", "compare R0 R1", "interrupt 0", "halt"};
        String[] assembled_code1 = Assembler.assemble(test1);
        computer cpu1 = new computer();
        cpu1.preload(assembled_code1); cpu1.run();
        int[] result1 = cpu1.getCompareBitValue();
        System.out.println("R0 is equal to R1");
        System.out.println("Test output: "+ result1[0] + " " + result1[1] + "\nExcpected output: 0 1");
        if(result1[0] == 0 && result1[1] == 1) System.out.println("compare test1 successed");
        else throw new Exception("compare test1 failed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        String[] test2 = {"move R1 10", "move R2 20", "compare R1 R2", "interrupt 0", "halt"};
        String[] assembled_code2 = Assembler.assemble(test2);
        computer cpu2 = new computer();
        cpu2.preload(assembled_code2); cpu2.run();
        int[] result2 = cpu2.getCompareBitValue();
        System.out.println("R1 is Less than R2");
        System.out.println("Test output: "+ result2[0] + " " + result2[1] + "\nExcpected output: 0 0");
        if(result2[0] == 0 && result2[1] == 0) System.out.println("compare test2 successed");
        else throw new Exception("compare test2 failed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        String[] test3 = {"move R4 30", "move R10 3", "compare R4 R10", "interrupt 0", "halt"};
        String[] assembled_code3 = Assembler.assemble(test3);
        computer cpu3 = new computer();
        cpu3.preload(assembled_code3); cpu3.run();
        int[] result3 = cpu3.getCompareBitValue();
        System.out.println("R4 is greater than R10");
        System.out.println("Test output: "+ result3[0] + " " + result3[1] + "\nExcpected output: 1 0");
        if(result3[0] == 1 && result3[1] == 0) System.out.println("compare test3 successed");
        else throw new Exception("compare test3 failed");
        System.out.println("==== CASE 3 END ====\n");

        System.out.println("~~~~ TEST \"compare\" END ~~~~\n");
    }

    private static void branchIfEqualTest() throws Exception{ // test method for branchIfEqual instruction
        System.out.println("~~~~ TEST \"branchIfEqual\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        String[] test1 = {"move R0 10", "move R1 10", "compare R0 R1", "branchIfEqual 4", "move R0 20","interrupt 0", "halt"};
        String[] assembled_code1 = Assembler.assemble(test1);
        computer cpu1 = new computer();
        cpu1.preload(assembled_code1); cpu1.run();
        int register_value1 = cpu1.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value1);
        System.out.println("Expected output: R0 is 10");
        if(register_value1 == 10) System.out.println("branchIfEqual test1 successed");
        else throw new Exception("branchIfEqual test1 failed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        String[] test2 = {"move R0 15","move R2 15", "move R3 15", "compare R2 R3", "branchIfEqual 4", "move R0 20","interrupt 0", "halt"};
        String[] assembled_code2 = Assembler.assemble(test2);
        computer cpu2 = new computer();
        cpu2.preload(assembled_code2); cpu2.run();
        int register_value2 = cpu2.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value2);
        System.out.println("Expected output: R0 is 15");
        if(register_value2 == 15) System.out.println("branchIfEqual test2 successed");
        else throw new Exception("branchIfEqual test2 failed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        String[] test3 = {"move R0 15","move R2 15", "move R3 15", "compare R2 R3", "branchIfEqual 4", "move R0 20", "move R0 -70", "interrupt 0", "halt"};
        String[] assembled_code3 = Assembler.assemble(test3);
        computer cpu3 = new computer();
        cpu3.preload(assembled_code3); cpu3.run();
        int register_value3 = cpu3.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value3);
        System.out.println("Expected output: R0 is -70");
        if(register_value3 == -70) System.out.println("branchIfEqual test3 successed");
        else throw new Exception("branchIfEqual test3 failed");
        System.out.println("==== CASE 3 END ====\n");
        
        // case 4
        System.out.println("==== CASE 4 START ====");
        String[] test4 = {"move R2 15", "move R3 15", "compare R2 R3", "branchIfEqual 8", "move R0 20", "interrupt 0", "interrupt 0", "move R0 -100", "halt"};
        String[] assembled_code4 = Assembler.assemble(test4);
        computer cpu4 = new computer();
        cpu4.preload(assembled_code4); cpu4.run();
        int register_value4 = cpu4.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value4);
        System.out.println("Expected output: R0 is -100");
        if(register_value4 == -100) System.out.println("branchIfEqual test4 successed");
        else throw new Exception("branchIfEqual test4 failed");
        System.out.println("==== CASE 4 END ====\n");
        
        // case 5
        System.out.println("==== CASE 5 START ====");
        String[] test5 = {"move R2 15", "move R3 15", "compare R2 R3", "branchIfEqual 8", "move R0 20", "interrupt 0", "halt", "move R0 -100", "branchIfEqual -8"};
        String[] assembled_code5 = Assembler.assemble(test5);
        computer cpu5 = new computer();
        cpu5.preload(assembled_code5); cpu5.run();
        int register_value5 = cpu5.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value5);
        System.out.println("Expected output: R0 is 20");
        if(register_value5 == 20) System.out.println("branchIfEqual test5 successed");
        else throw new Exception("branchIfEqual test5 failed");
        System.out.println("==== CASE 5 END ====\n");

        System.out.println("~~~~ TEST \"branchIfEqual\" END ~~~~\n");
    }

    private static void branchIfNotEqualTest() throws Exception{ // test method for branchIfNotEqual instruction
        System.out.println("~~~~ TEST \"branchIfNotEqual\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        String[] test1 = {"move R0 15", "move R1 10", "compare R0 R1", "branchIfNotEqual 4", "move R0 20","interrupt 0", "halt"};
        String[] assembled_code1 = Assembler.assemble(test1);
        computer cpu1 = new computer();
        cpu1.preload(assembled_code1); cpu1.run();
        int register_value1 = cpu1.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value1);
        System.out.println("Expected output: R0 is 15");
        if(register_value1 == 15) System.out.println("branchIfNotEqual test1 successed");
        else throw new Exception("branchIfNotEqual test1 failed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        String[] test2 = {"move R0 15","move R2 20", "move R3 15", "compare R2 R3", "branchIfNotEqual 4", "move R0 20","interrupt 0", "halt"};
        String[] assembled_code2 = Assembler.assemble(test2);
        computer cpu2 = new computer();
        cpu2.preload(assembled_code2); cpu2.run();
        int register_value2 = cpu2.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value2);
        System.out.println("Expected output: R0 is 15");
        if(register_value2 == 15) System.out.println("branchIfNotEqual test2 successed");
        else throw new Exception("branchIfNotEqual test2 failed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        String[] test3 = {"move R0 15","move R2 30", "move R3 15", "compare R2 R3", "branchIfNotEqual 4", "move R0 20", "move R0 -70", "interrupt 0", "halt"};
        String[] assembled_code3 = Assembler.assemble(test3);
        computer cpu3 = new computer();
        cpu3.preload(assembled_code3); cpu3.run();
        int register_value3 = cpu3.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value3);
        System.out.println("Expected output: R0 is -70");
        if(register_value3 == -70) System.out.println("branchIfNotEqual test3 successed");
        else throw new Exception("branchIfNotEqual test3 failed");
        System.out.println("==== CASE 3 END ====\n");
        
        // case 4
        System.out.println("==== CASE 4 START ====");
        String[] test4 = {"move R2 15", "move R3 40", "compare R2 R3", "branchIfNotEqual 8", "move R0 20", "interrupt 0", "interrupt 0", "move R0 -100", "halt"};
        String[] assembled_code4 = Assembler.assemble(test4);
        computer cpu4 = new computer();
        cpu4.preload(assembled_code4); cpu4.run();
        int register_value4 = cpu4.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value4);
        System.out.println("Expected output: R0 is -100");
        if(register_value4 == -100) System.out.println("branchIfNotEqual test4 successed");
        else throw new Exception("branchIfNotEqual test4 failed");
        System.out.println("==== CASE 4 END ====\n");
        
        // case 5
        System.out.println("==== CASE 5 START ====");
        String[] test5 = {"move R2 80", "move R3 15", "compare R2 R3", "branchIfNotEqual 8", "move R0 20", "interrupt 0", "halt", "move R0 -100", "branchIfNotEqual -8"};
        String[] assembled_code5 = Assembler.assemble(test5);
        computer cpu5 = new computer();
        cpu5.preload(assembled_code5); cpu5.run();
        int register_value5 = cpu5.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value5);
        System.out.println("Expected output: R0 is 20");
        if(register_value5 == 20) System.out.println("branchIfNotEqual test5 successed");
        else throw new Exception("branchIfNotEqual test5 failed");
        System.out.println("==== CASE 5 END ====\n");

        System.out.println("~~~~ TEST \"branchIfNotEqual\" END ~~~~\n");
    }

    private static void branchIfGreaterThanTest() throws Exception{ // test method for branchIfGreaterThan instruction
        System.out.println("~~~~ TEST \"branchIfGreaterThan\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        String[] test1 = {"move R0 15", "move R1 10", "compare R0 R1", "branchIfGreaterThan 4", "move R0 20","interrupt 0", "halt"};
        String[] assembled_code1 = Assembler.assemble(test1);
        computer cpu1 = new computer();
        cpu1.preload(assembled_code1); cpu1.run();
        int register_value1 = cpu1.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value1);
        System.out.println("Expected output: R0 is 15");
        if(register_value1 == 15) System.out.println("branchIfGreaterThan test1 successed");
        else throw new Exception("branchIfGreaterThan test1 failed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        String[] test2 = {"move R0 15","move R2 20", "move R3 15", "compare R2 R3", "branchIfGreaterThan 4", "move R0 20","interrupt 0", "halt"};
        String[] assembled_code2 = Assembler.assemble(test2);
        computer cpu2 = new computer();
        cpu2.preload(assembled_code2); cpu2.run();
        int register_value2 = cpu2.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value2);
        System.out.println("Expected output: R0 is 15");
        if(register_value2 == 15) System.out.println("branchIfGreaterThan test2 successed");
        else throw new Exception("branchIfGreaterThan test2 failed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        String[] test3 = {"move R0 15","move R2 30", "move R3 15", "compare R2 R3", "branchIfGreaterThan 4", "move R0 20", "move R0 -70", "interrupt 0", "halt"};
        String[] assembled_code3 = Assembler.assemble(test3);
        computer cpu3 = new computer();
        cpu3.preload(assembled_code3); cpu3.run();
        int register_value3 = cpu3.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value3);
        System.out.println("Expected output: R0 is -70");
        if(register_value3 == -70) System.out.println("branchIfGreaterThan test3 successed");
        else throw new Exception("branchIfGreaterThan test3 failed");
        System.out.println("==== CASE 3 END ====\n");
        
        // case 4
        System.out.println("==== CASE 4 START ====");
        String[] test4 = {"move R2 15", "move R3 40", "compare R2 R3", "branchIfGreaterThan 8", "move R0 20", "interrupt 0", "halt", "move R0 -100", "halt"};
        String[] assembled_code4 = Assembler.assemble(test4);
        computer cpu4 = new computer();
        cpu4.preload(assembled_code4); cpu4.run();
        int register_value4 = cpu4.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value4);
        System.out.println("Expected output: R0 is 20");
        if(register_value4 == 20) System.out.println("branchIfGreaterThan test4 successed");
        else throw new Exception("branchIfGreaterThan test4 failed");
        System.out.println("==== CASE 4 END ====\n");
        
        // case 5
        System.out.println("==== CASE 5 START ====");
        String[] test5 = {"move R2 80", "move R3 15", "compare R2 R3", "branchIfGreaterThan 8", "move R0 20", "interrupt 0", "halt", "move R0 -100", "branchIfGreaterThan -8"};
        String[] assembled_code5 = Assembler.assemble(test5);
        computer cpu5 = new computer();
        cpu5.preload(assembled_code5); cpu5.run();
        int register_value5 = cpu5.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value5);
        System.out.println("Expected output: R0 is 20");
        if(register_value5 == 20) System.out.println("branchIfGreaterThan test5 successed");
        else throw new Exception("branchIfGreaterThan test5 failed");
        System.out.println("==== CASE 5 END ====\n");

        System.out.println("~~~~ TEST \"branchIfGreaterThan\" END ~~~~\n");
    }

    private static void branchIfGreaterThanOrEqualTest() throws Exception{ // test method for branchIfGreaterThanOrEqual instruction
        System.out.println("~~~~ TEST \"branchIfGreaterThanOrEqual\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        String[] test1 = {"move R0 15", "move R1 10", "compare R0 R1", "branchIfGreaterThanOrEqual 4", "move R0 20","interrupt 0", "halt"};
        String[] assembled_code1 = Assembler.assemble(test1);
        computer cpu1 = new computer();
        cpu1.preload(assembled_code1); cpu1.run();
        int register_value1 = cpu1.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value1);
        System.out.println("Expected output: R0 is 15");
        if(register_value1 == 15) System.out.println("branchIfGreaterThanOrEqual test1 successed");
        else throw new Exception("branchIfGreaterThanOrEqual test1 failed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        String[] test2 = {"move R0 15","move R2 20", "move R3 20", "compare R2 R3", "branchIfGreaterThanOrEqual 4", "move R0 20","interrupt 0", "halt"};
        String[] assembled_code2 = Assembler.assemble(test2);
        computer cpu2 = new computer();
        cpu2.preload(assembled_code2); cpu2.run();
        int register_value2 = cpu2.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value2);
        System.out.println("Expected output: R0 is 15");
        if(register_value2 == 15) System.out.println("branchIfGreaterThanOrEqual test2 successed");
        else throw new Exception("branchIfGreaterThanOrEqual test2 failed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        String[] test3 = {"move R0 15","move R2 30", "move R3 15", "compare R2 R3", "branchIfGreaterThanOrEqual 4", "move R0 20", "move R0 -70", "interrupt 0", "halt"};
        String[] assembled_code3 = Assembler.assemble(test3);
        computer cpu3 = new computer();
        cpu3.preload(assembled_code3); cpu3.run();
        int register_value3 = cpu3.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value3);
        System.out.println("Expected output: R0 is -70");
        if(register_value3 == -70) System.out.println("branchIfGreaterThanOrEqual test3 successed");
        else throw new Exception("branchIfGreaterThanOrEqual test3 failed");
        System.out.println("==== CASE 3 END ====\n");
        
        // case 4
        System.out.println("==== CASE 4 START ====");
        String[] test4 = {"move R2 40", "move R3 40", "compare R2 R3", "branchIfGreaterThanOrEqual 8", "move R0 20", "interrupt 0", "halt", "move R0 -100", "halt"};
        String[] assembled_code4 = Assembler.assemble(test4);
        computer cpu4 = new computer();
        cpu4.preload(assembled_code4); cpu4.run();
        int register_value4 = cpu4.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value4);
        System.out.println("Expected output: R0 is -100");
        if(register_value4 == -100) System.out.println("branchIfGreaterThanOrEqual test4 successed");
        else throw new Exception("branchIfGreaterThanOrEqual test4 failed");
        System.out.println("==== CASE 4 END ====\n");
        
        // case 5
        System.out.println("==== CASE 5 START ====");
        String[] test5 = {"move R2 80", "move R3 15", "compare R2 R3", "branchIfGreaterThanOrEqual 8", "move R0 20", "interrupt 0", "halt", "move R0 -100", "branchIfGreaterThanOrEqual -8"};
        String[] assembled_code5 = Assembler.assemble(test5);
        computer cpu5 = new computer();
        cpu5.preload(assembled_code5); cpu5.run();
        int register_value5 = cpu5.getResiterValue(0);
        System.out.println("Test output: R0 is " + register_value5);
        System.out.println("Expected output: R0 is 20");
        if(register_value5 == 20) System.out.println("branchIfGreaterThanOrEqual test5 successed");
        else throw new Exception("branchIfGreaterThanOrEqual test5 failed");
        System.out.println("==== CASE 5 END ====\n");
        
        System.out.println("~~~~ TEST \"branchIfGreaterThanOrEqual\" END ~~~~\n");
    }

    public static void runTest() throws Exception{ // test execution method
        // executes a test method
        jumpTest();
        compareTest();
        branchIfEqualTest();
        branchIfNotEqualTest();
        branchIfGreaterThanTest();
        branchIfGreaterThanOrEqualTest();
    }
    
    public static void main(String[] args) throws Exception{ // main method
        runTest(); // executes a test
    }
}
