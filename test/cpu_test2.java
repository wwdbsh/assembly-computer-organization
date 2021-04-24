public class cpu_test2 {
    private static void jumpTest() throws Exception{ // test method for jump instruction
        System.out.println("~~~~ TEST \"jump\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        String[] test1 = {"jump 4", "move R1 5", "interrupt 0", "halt"};
        String[] assembled_code1 = Assembler.assemble(test1);
        computer cpu1 = new computer();
        cpu1.preload(assembled_code1);
        cpu1.run();
        System.out.println("jump test1 successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        String[] test2 = {"jump 8", "move R2 5", "interrupt 0", "interrupt 1", "interrupt 0", "halt"};
        String[] assembled_code2 = Assembler.assemble(test2);
        computer cpu2 = new computer();
        cpu2.preload(assembled_code2);
        cpu2.run();
        System.out.println("jump test2 successed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        String[] test3 = {"jump 8", "interrupt 0", "interrupt 1", "interrupt 0", "halt"};
        String[] assembled_code3 = Assembler.assemble(test3);
        computer cpu3 = new computer();
        cpu3.preload(assembled_code3);
        cpu3.run();
        System.out.println("jump test3 successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        String[] test4 = {"jump 6", "interrupt 0", "halt", "move R0 125", "jump 2", "halt"};
        String[] assembled_code4 = Assembler.assemble(test4);
        computer cpu4 = new computer();
        cpu4.preload(assembled_code4);
        cpu4.run();
        System.out.println("jump test4 successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        String[] test5 = {"jump 10", "jump 8", "interrupt 0", "halt", "jump 4", "jump 2", "interrupt 1"};
        String[] assembled_code5 = Assembler.assemble(test5);
        computer cpu5 = new computer();
        cpu5.preload(assembled_code5);
        cpu5.run();
        System.out.println("jump test5 successed");
        System.out.println("==== CASE 5 END ====\n");

        System.out.println("~~~~ TEST \"jump\" END ~~~~\n");
    }

    private static void compareTest() throws Exception{ // test method for compare instruction
        System.out.println("~~~~ TEST \"compare\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");


        System.out.println("compare test1 successed");
        System.out.println("==== CASE 1 END ====\n");
    }

    private static void branchIfEqualTest() throws Exception{ // test method for branchIfEqual instruction
        System.out.println("~~~~ TEST \"branchIfEqual\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");


        System.out.println("branchIfEqual test1 successed");
        System.out.println("==== CASE 1 END ====\n");
    }

    private static void branchIfNotEqualTest() throws Exception{ // test method for branchIfNotEqual instruction
        System.out.println("~~~~ TEST \"branchIfNotEqual\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");


        System.out.println("branchIfNotEqual test1 successed");
        System.out.println("==== CASE 1 END ====\n");
    }

    private static void branchIfGreaterThanTest() throws Exception{ // test method for branchIfGreaterThan instruction
        System.out.println("~~~~ TEST \"branchIfGreaterThan\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");


        System.out.println("branchIfGreaterThan test1 successed");
        System.out.println("==== CASE 1 END ====\n");
    }

    private static void branchIfGreaterThanOrEqualTest() throws Exception{ // test method for branchIfGreaterThanOrEqual instruction
        System.out.println("~~~~ TEST \"branchIfGreaterThanOrEqual\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");


        System.out.println("branchIfGreaterThanOrEqual test1 successed");
        System.out.println("==== CASE 1 END ====\n");
    }

    public static void runTest() throws Exception{ // test execution method
        // executes a test method
        jumpTest();
        // compareTest();
        // branchIfEqualTest();
        // branchIfNotEqualTest();
        // branchIfGreaterThanTest();
        // branchIfGreaterThanOrEqualTest();
    }
    
    public static void main(String[] args) throws Exception{ // main method
        runTest(); // executes a test
    }
}
