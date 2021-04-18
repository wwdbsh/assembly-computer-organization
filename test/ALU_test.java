public class ALU_test {

    private static void test1000() throws Exception{ // test method for "and"
        System.out.println("~~~~ TEST \"1000\" START ~~~~\n");
        
        // bit operation
        bit[] operation = new bit[4];
        operation[0] = new bit(1);
        operation[1] = new bit(0);
        operation[2] = new bit(0);
        operation[3] = new bit(0);

        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_a = new longword(); longword1_a.set(0);
        longword longword1_b = new longword(); longword1_b.set(0);
        String longword1_output = ALU.doOp(operation,  longword1_a, longword1_b).toString();
        String expected_output1 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword1_a.toString() +
            "\nLongword b: " + longword1_b.toString() +
            "\nExpected Output: " + expected_output1 + 
            "\nTest Output: " + longword1_output);
        if(!longword1_output.equals(expected_output1)) throw new Exception("and failed");
        else System.out.println("and successed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2_a = new longword(); longword2_a.set(0);
        longword longword2_b = new longword(); longword2_b.set(1);
        String longword2_output = ALU.doOp(operation,  longword2_a, longword2_b).toString();
        String expected_output2 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword2_a.toString() +
            "\nLongword b: " + longword2_b.toString() +
            "\nExpected Output: " + expected_output2 + 
            "\nTest Output: " + longword2_output);
        if(!longword2_output.equals(expected_output2)) throw new Exception("and failed");
        else System.out.println("and successed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3_a = new longword(); longword3_a.set(1);
        longword longword3_b = new longword(); longword3_b.set(1);
        String longword3_output = ALU.doOp(operation,  longword3_a, longword3_b).toString();
        String expected_output3 = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        System.out.println(
            "Longword a: " + longword3_a.toString() +
            "\nLongword b: " + longword3_b.toString() +
            "\nExpected Output: " + expected_output3 + 
            "\nTest Output: " + longword3_output);
        if(!longword3_output.equals(expected_output3)) throw new Exception("and failed");
        else System.out.println("and successed");
        System.out.println("==== CASE 3 END ====\n");
        
        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4_a = new longword(); longword4_a.set(0);
        longword4_a.setBit(0, new bit(1)); longword4_a.setBit(1, new bit(1));
        longword4_a.setBit(2, new bit(1)); longword4_a.setBit(3, new bit(1));
        longword4_a.setBit(4, new bit(1)); longword4_a.setBit(6, new bit(1));
        longword4_a.setBit(7, new bit(1)); longword4_a.setBit(8, new bit(1));
        longword4_a.setBit(10, new bit(1)); longword4_a.setBit(13, new bit(1));
        longword4_a.setBit(16, new bit(1)); longword4_a.setBit(17, new bit(1));
        longword4_a.setBit(18, new bit(1)); longword4_a.setBit(20, new bit(1));
        longword4_a.setBit(21, new bit(1)); longword4_a.setBit(22, new bit(1));
        longword4_a.setBit(25, new bit(1)); longword4_a.setBit(27, new bit(1));
        longword4_a.setBit(29, new bit(1)); longword4_a.setBit(30, new bit(1));
        longword4_a.setBit(31, new bit(1));
        longword longword4_b = new longword(); longword4_b.set(0);
        longword4_b.setBit(0, new bit(1)); longword4_b.setBit(2, new bit(1));
        longword4_b.setBit(5, new bit(1)); longword4_b.setBit(6, new bit(1));
        longword4_b.setBit(7, new bit(1)); longword4_b.setBit(9, new bit(1));
        longword4_b.setBit(10, new bit(1)); longword4_b.setBit(11, new bit(1));
        longword4_b.setBit(13, new bit(1)); longword4_b.setBit(14, new bit(1));
        longword4_b.setBit(17, new bit(1)); longword4_b.setBit(20, new bit(1));
        longword4_b.setBit(23, new bit(1)); longword4_b.setBit(24, new bit(1));
        longword4_b.setBit(25, new bit(1)); longword4_b.setBit(26, new bit(1));
        longword4_b.setBit(27, new bit(1)); longword4_b.setBit(30, new bit(1));
        String longword4_output = ALU.doOp(operation,  longword4_a, longword4_b).toString();
        String expected_output4 = "1,0,1,0,0,0,1,1,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,0,0,1,0,1,0,0,1,0";
        System.out.println(
            "Longword a: " + longword4_a.toString() +
            "\nLongword b: " + longword4_b.toString() +
            "\nExpected Output: " + expected_output4 + 
            "\nTest Output: " + longword4_output);
        if(!longword4_output.equals(expected_output4)) throw new Exception("and failed");
        else System.out.println("and successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5_a = new longword(); longword5_a.set(0);
        longword5_a.setBit(0, new bit(1)); longword5_a.setBit(1, new bit(1));
        longword5_a.setBit(3, new bit(1)); longword5_a.setBit(4, new bit(1));
        longword5_a.setBit(9, new bit(1)); longword5_a.setBit(10, new bit(1));
        longword5_a.setBit(14, new bit(1)); longword5_a.setBit(20, new bit(1));
        longword5_a.setBit(21, new bit(1)); longword5_a.setBit(24, new bit(1));
        longword5_a.setBit(25, new bit(1)); longword5_a.setBit(26, new bit(1));
        longword5_a.setBit(27, new bit(1));
        longword longword5_b = new longword(); longword5_b.set(0);
        longword5_b.setBit(0, new bit(1)); longword5_b.setBit(1, new bit(1));
        longword5_b.setBit(5, new bit(1)); longword5_b.setBit(6, new bit(1));
        longword5_b.setBit(8, new bit(1)); longword5_b.setBit(10, new bit(1));
        longword5_b.setBit(12, new bit(1)); longword5_b.setBit(14, new bit(1));
        longword5_b.setBit(15, new bit(1)); longword5_b.setBit(17, new bit(1));
        longword5_b.setBit(21, new bit(1)); longword5_b.setBit(23, new bit(1));
        longword5_b.setBit(25, new bit(1)); longword5_b.setBit(27, new bit(1));
        longword5_b.setBit(28, new bit(1));
        String longword5_output = ALU.doOp(operation,  longword5_a, longword5_b).toString();
        String expected_output5 = "1,1,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0";
        System.out.println(
            "Longword a: " + longword5_a.toString() +
            "\nLongword b: " + longword5_b.toString() +
            "\nExpected Output: " + expected_output5 + 
            "\nTest Output: " + longword5_output);
        if(!longword5_output.equals(expected_output5)) throw new Exception("and failed");
        else System.out.println("and successed");
        System.out.println("==== CASE 5 END ====\n");

        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6_a = new longword(); longword6_a.set(0);
        longword6_a.setBit(2, new bit(1)); longword6_a.setBit(7, new bit(1));
        longword6_a.setBit(8, new bit(1)); longword6_a.setBit(10, new bit(1));
        longword6_a.setBit(12, new bit(1)); longword6_a.setBit(15, new bit(1));
        longword6_a.setBit(17, new bit(1)); longword6_a.setBit(19, new bit(1));
        longword6_a.setBit(21, new bit(1)); longword6_a.setBit(23, new bit(1));
        longword6_a.setBit(24, new bit(1)); longword6_a.setBit(25, new bit(1));
        longword6_a.setBit(26, new bit(1)); longword6_a.setBit(27, new bit(1));
        longword6_a.setBit(29, new bit(1));
        longword longword6_b = new longword(); longword6_b.set(0);
        longword6_b.setBit(0, new bit(1)); longword6_b.setBit(1, new bit(1));
        longword6_b.setBit(7, new bit(1)); longword6_b.setBit(8, new bit(1));
        longword6_b.setBit(11, new bit(1)); longword6_b.setBit(15, new bit(1));
        longword6_b.setBit(16, new bit(1)); longword6_b.setBit(17, new bit(1));
        longword6_b.setBit(20, new bit(1)); longword6_b.setBit(21, new bit(1));
        longword6_b.setBit(26, new bit(1)); longword6_b.setBit(27, new bit(1));
        longword6_b.setBit(28, new bit(1)); longword6_b.setBit(30, new bit(1));
        String longword6_output = ALU.doOp(operation,  longword6_a, longword6_b).toString();
        String expected_output6 = "0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,1,1,0,0,0,0";
        System.out.println(
            "Longword a: " + longword6_a.toString() +
            "\nLongword b: " + longword6_b.toString() +
            "\nExpected Output: " + expected_output6 + 
            "\nTest Output: " + longword6_output);
        if(!longword6_output.equals(expected_output6)) throw new Exception("and failed");
        else System.out.println("and successed");
        System.out.println("==== CASE 6 END ====\n");

        // case 7
        System.out.println("==== CASE 7 START ====");
        longword longword7_a = new longword(); longword7_a.set(0);
        longword7_a.setBit(2, new bit(1)); longword7_a.setBit(3, new bit(1));
        longword7_a.setBit(4, new bit(1)); longword7_a.setBit(5, new bit(1));
        longword7_a.setBit(6, new bit(1)); longword7_a.setBit(11, new bit(1));
        longword7_a.setBit(12, new bit(1)); longword7_a.setBit(13, new bit(1));
        longword7_a.setBit(14, new bit(1)); longword7_a.setBit(15, new bit(1));
        longword7_a.setBit(16, new bit(1)); longword7_a.setBit(18, new bit(1));
        longword7_a.setBit(20, new bit(1)); longword7_a.setBit(21, new bit(1));
        longword7_a.setBit(27, new bit(1)); longword7_a.setBit(31, new bit(1));
        longword longword7_b = new longword(); longword7_b.set(0);
        longword7_b.setBit(0, new bit(1)); longword7_b.setBit(1, new bit(1));
        longword7_b.setBit(2, new bit(1)); longword7_b.setBit(3, new bit(1));
        longword7_b.setBit(5, new bit(1)); longword7_b.setBit(7, new bit(1));
        longword7_b.setBit(13, new bit(1)); longword7_b.setBit(18, new bit(1));
        longword7_b.setBit(20, new bit(1)); longword7_b.setBit(21, new bit(1));
        longword7_b.setBit(23, new bit(1)); longword7_b.setBit(25, new bit(1));
        longword7_b.setBit(27, new bit(1)); longword7_b.setBit(28, new bit(1));
        longword7_b.setBit(29, new bit(1)); longword7_b.setBit(30, new bit(1));
        String longword7_output = ALU.doOp(operation,  longword7_a, longword7_b).toString();
        String expected_output7 = "0,0,1,1,0,1,0,0,0,0,0,0,0,1,0,0,0,0,1,0,1,1,0,0,0,0,0,1,0,0,0,0";
        System.out.println(
            "Longword a: " + longword7_a.toString() +
            "\nLongword b: " + longword7_b.toString() +
            "\nExpected Output: " + expected_output7 + 
            "\nTest Output: " + longword7_output);
        if(!longword7_output.equals(expected_output7)) throw new Exception("and failed");
        else System.out.println("and successed");
        System.out.println("==== CASE 7 END ====\n");

        // case 8
        System.out.println("==== CASE 8 START ====");
        longword longword8_a = new longword(); longword8_a.set(0);
        longword8_a.setBit(2, new bit(1)); longword8_a.setBit(4, new bit(1));
        longword8_a.setBit(5, new bit(1)); longword8_a.setBit(8, new bit(1));
        longword8_a.setBit(9, new bit(1)); longword8_a.setBit(10, new bit(1));
        longword8_a.setBit(16, new bit(1)); longword8_a.setBit(18, new bit(1));
        longword8_a.setBit(20, new bit(1)); longword8_a.setBit(21, new bit(1));
        longword8_a.setBit(23, new bit(1)); longword8_a.setBit(28, new bit(1));
        longword8_a.setBit(29, new bit(1)); longword8_a.setBit(30, new bit(1));
        longword longword8_b = new longword(); longword8_b.set(0);
        longword8_b.setBit(1, new bit(1)); longword8_b.setBit(2, new bit(1));
        longword8_b.setBit(3, new bit(1)); longword8_b.setBit(4, new bit(1));
        longword8_b.setBit(6, new bit(1)); longword8_b.setBit(9, new bit(1));
        longword8_b.setBit(10, new bit(1)); longword8_b.setBit(15, new bit(1));
        longword8_b.setBit(16, new bit(1)); longword8_b.setBit(18, new bit(1));
        longword8_b.setBit(25, new bit(1)); longword8_b.setBit(28, new bit(1));
        longword8_b.setBit(29, new bit(1));
        String longword8_output = ALU.doOp(operation,  longword8_a, longword8_b).toString();
        String expected_output8 = "0,0,1,0,1,0,0,0,0,1,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,1,0,0";
        System.out.println(
            "Longword a: " + longword8_a.toString() +
            "\nLongword b: " + longword8_b.toString() +
            "\nExpected Output: " + expected_output8 + 
            "\nTest Output: " + longword8_output);
        if(!longword8_output.equals(expected_output8)) throw new Exception("and failed");
        else System.out.println("and successed");
        System.out.println("==== CASE 8 END ====\n");

        // case 9
        System.out.println("==== CASE 9 START ====");
        longword longword9_a = new longword(); longword9_a.set(0);
        longword9_a.setBit(0, new bit(1)); longword9_a.setBit(1, new bit(1));
        longword9_a.setBit(3, new bit(1)); longword9_a.setBit(4, new bit(1));
        longword9_a.setBit(5, new bit(1)); longword9_a.setBit(7, new bit(1));
        longword9_a.setBit(11, new bit(1)); longword9_a.setBit(12, new bit(1));
        longword9_a.setBit(13, new bit(1)); longword9_a.setBit(16, new bit(1));
        longword9_a.setBit(18, new bit(1)); longword9_a.setBit(20, new bit(1));
        longword9_a.setBit(25, new bit(1)); longword9_a.setBit(26, new bit(1));
        longword9_a.setBit(27, new bit(1)); longword9_a.setBit(30, new bit(1));
        longword longword9_b = new longword(); longword9_b.set(0);
        longword9_b.setBit(0, new bit(1)); longword9_b.setBit(3, new bit(1));
        longword9_b.setBit(6, new bit(1)); longword9_b.setBit(7, new bit(1));
        longword9_b.setBit(8, new bit(1)); longword9_b.setBit(9, new bit(1));
        longword9_b.setBit(10, new bit(1)); longword9_b.setBit(16, new bit(1));
        longword9_b.setBit(17, new bit(1)); longword9_b.setBit(21, new bit(1));
        longword9_b.setBit(22, new bit(1)); longword9_b.setBit(23, new bit(1));
        longword9_b.setBit(24, new bit(1)); longword9_b.setBit(26, new bit(1));
        longword9_b.setBit(28, new bit(1)); longword9_b.setBit(29, new bit(1));
        longword9_b.setBit(31, new bit(1));
        String longword9_output = ALU.doOp(operation,  longword9_a, longword9_b).toString();
        String expected_output9 = "1,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword9_a.toString() +
            "\nLongword b: " + longword9_b.toString() +
            "\nExpected Output: " + expected_output9 + 
            "\nTest Output: " + longword9_output);
        if(!longword9_output.equals(expected_output9)) throw new Exception("and failed");
        else System.out.println("and successed");
        System.out.println("==== CASE 9 END ====\n");

        // case 10
        System.out.println("==== CASE 10 START ====");
        longword longword10_a = new longword(); longword10_a.set(0);
        longword10_a.setBit(0, new bit(1)); longword10_a.setBit(2, new bit(1));
        longword10_a.setBit(4, new bit(1)); longword10_a.setBit(8, new bit(1));
        longword10_a.setBit(9, new bit(1)); longword10_a.setBit(12, new bit(1));
        longword10_a.setBit(15, new bit(1)); longword10_a.setBit(16, new bit(1));
        longword10_a.setBit(18, new bit(1)); longword10_a.setBit(19, new bit(1));
        longword10_a.setBit(22, new bit(1)); longword10_a.setBit(24, new bit(1));
        longword10_a.setBit(28, new bit(1)); longword10_a.setBit(29, new bit(1));
        longword10_a.setBit(31, new bit(1));
        longword longword10_b = new longword(); longword10_b.set(0);
        longword10_b.setBit(0, new bit(1)); longword10_b.setBit(6, new bit(1));
        longword10_b.setBit(7, new bit(1)); longword10_b.setBit(9, new bit(1));
        longword10_b.setBit(15, new bit(1)); longword10_b.setBit(19, new bit(1));
        longword10_b.setBit(21, new bit(1)); longword10_b.setBit(23, new bit(1));
        longword10_b.setBit(24, new bit(1)); longword10_b.setBit(27, new bit(1));
        longword10_b.setBit(30, new bit(1));
        String longword10_output = ALU.doOp(operation, longword10_a, longword10_b).toString();
        String expected_output10 = "1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword10_a.toString() +
            "\nLongword b: " + longword10_b.toString() +
            "\nExpected Output: " + expected_output10 + 
            "\nTest Output: " + longword10_output);
        if(!longword10_output.equals(expected_output10)) throw new Exception("and failed");
        else System.out.println("and successed");
        System.out.println("==== CASE 10 END ====\n");
        
        System.out.println("~~~~ TEST \"1000\" END ~~~~\n");
    }

    private static void test1001() throws Exception{ // test method for "or"
        System.out.println("~~~~ TEST \"1001\" START ~~~~\n");
        
        // bit operation
        bit[] operation = new bit[4];
        operation[0] = new bit(1);
        operation[1] = new bit(0);
        operation[2] = new bit(0);
        operation[3] = new bit(1);

        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_a = new longword(); longword1_a.set(0);
        longword longword1_b = new longword(); longword1_b.set(0);
        String longword1_output = ALU.doOp(operation, longword1_a, longword1_b).toString();
        String expected_output1 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword1_a.toString() +
            "\nLongword b: " + longword1_b.toString() +
            "\nExpected Output: " + expected_output1 + 
            "\nTest Output: " + longword1_output);
        if(!longword1_output.equals(expected_output1)) throw new Exception("or failed");
        else System.out.println("or successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2_a = new longword(); longword2_a.set(1);
        longword longword2_b = new longword(); longword2_b.set(0);
        String longword2_output = ALU.doOp(operation, longword2_a, longword2_b).toString();
        String expected_output2 = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        System.out.println(
            "Longword a: " + longword2_a.toString() +
            "\nLongword b: " + longword2_b.toString() +
            "\nExpected Output: " + expected_output2 + 
            "\nTest Output: " + longword2_output);
        if(!longword2_output.equals(expected_output2)) throw new Exception("or failed");
        else System.out.println("or successed");
        System.out.println("==== CASE 2 END ====\n");

       // case 3
       System.out.println("==== CASE 3 START ====");
       longword longword3_a = new longword(); longword3_a.set(1);
       longword longword3_b = new longword(); longword3_b.set(1);
       String longword3_output = ALU.doOp(operation, longword3_a, longword3_b).toString();
       String expected_output3 = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
       System.out.println(
           "Longword a: " + longword3_a.toString() +
           "\nLongword b: " + longword3_b.toString() +
           "\nExpected Output: " + expected_output3 + 
           "\nTest Output: " + longword3_output);
       if(!longword3_output.equals(expected_output3)) throw new Exception("or failed");
       else System.out.println("or successed");
       System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4_a = new longword(); longword4_a.set(0);
        longword4_a.setBit(0, new bit(1)); longword4_a.setBit(3, new bit(1));
        longword4_a.setBit(4, new bit(1)); longword4_a.setBit(8, new bit(1));
        longword4_a.setBit(9, new bit(1)); longword4_a.setBit(10, new bit(1));
        longword4_a.setBit(13, new bit(1)); longword4_a.setBit(14, new bit(1));
        longword4_a.setBit(15, new bit(1)); longword4_a.setBit(17, new bit(1));
        longword4_a.setBit(19, new bit(1)); longword4_a.setBit(20, new bit(1));
        longword4_a.setBit(21, new bit(1));  longword4_a.setBit(22, new bit(1));
        longword4_a.setBit(24, new bit(1)); longword4_a.setBit(25, new bit(1));
        longword4_a.setBit(28, new bit(1)); longword4_a.setBit(29, new bit(1));
        longword4_a.setBit(30, new bit(1));
        longword longword4_b = new longword(); longword4_b.set(0);
        longword4_b.setBit(0, new bit(1)); longword4_b.setBit(1, new bit(1));
        longword4_b.setBit(2, new bit(1)); longword4_b.setBit(5, new bit(1));
        longword4_b.setBit(7, new bit(1)); longword4_b.setBit(8, new bit(1));
        longword4_b.setBit(10, new bit(1)); longword4_b.setBit(11, new bit(1));
        longword4_b.setBit(12, new bit(1)); longword4_b.setBit(15, new bit(1));
        longword4_b.setBit(18, new bit(1)); longword4_b.setBit(21, new bit(1));
        longword4_b.setBit(24, new bit(1)); longword4_b.setBit(25, new bit(1));
        longword4_b.setBit(28, new bit(1)); longword4_b.setBit(29, new bit(1));
        longword4_b.setBit(30, new bit(1));
        String longword4_output = ALU.doOp(operation, longword4_a, longword4_b).toString();
        String expected_output4 = "1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,0,0,1,1,1,0";
        System.out.println(
            "Longword a: " + longword4_a.toString() +
            "\nLongword b: " + longword4_b.toString() +
            "\nExpected Output: " + expected_output4 + 
            "\nTest Output: " + longword4_output);
        if(!longword4_output.equals(expected_output4)) throw new Exception("or failed");
        else System.out.println("or successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5_a = new longword(); longword5_a.set(0);
        longword5_a.setBit(2, new bit(1)); longword5_a.setBit(15, new bit(1));
        longword5_a.setBit(19, new bit(1)); longword5_a.setBit(20, new bit(1));
        longword5_a.setBit(23, new bit(1)); longword5_a.setBit(26, new bit(1));
        longword5_a.setBit(30, new bit(1));
        longword longword5_b = new longword(); longword5_b.set(0);
        longword5_b.setBit(1, new bit(1)); longword5_b.setBit(6, new bit(1));
        longword5_b.setBit(7, new bit(1)); longword5_b.setBit(9, new bit(1));
        longword5_b.setBit(11, new bit(1)); longword5_b.setBit(12, new bit(1));
        longword5_b.setBit(14, new bit(1)); longword5_b.setBit(16, new bit(1));
        longword5_b.setBit(18, new bit(1)); longword5_b.setBit(19, new bit(1));
        longword5_b.setBit(24, new bit(1)); longword5_b.setBit(26, new bit(1));
        longword5_b.setBit(29, new bit(1)); longword5_b.setBit(30, new bit(1));
        longword5_b.setBit(31, new bit(1));
        String longword5_output = ALU.doOp(operation, longword5_a, longword5_b).toString();
        String expected_output5 = "0,1,1,0,0,0,1,1,0,1,0,1,1,0,1,1,1,0,1,1,1,0,0,1,1,0,1,0,0,1,1,1";
        System.out.println(
            "Longword a: " + longword5_a.toString() +
            "\nLongword b: " + longword5_b.toString() +
            "\nExpected Output: " + expected_output5 + 
            "\nTest Output: " + longword5_output);
        if(!longword5_output.equals(expected_output5)) throw new Exception("or failed");
        else System.out.println("or successed");
        System.out.println("==== CASE 5 END ====\n");

        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6_a = new longword(); longword6_a.set(0);
        longword6_a.setBit(1, new bit(1)); longword6_a.setBit(3, new bit(1));
        longword6_a.setBit(4, new bit(1)); longword6_a.setBit(8, new bit(1));
        longword6_a.setBit(12, new bit(1)); longword6_a.setBit(13, new bit(1));
        longword6_a.setBit(18, new bit(1)); longword6_a.setBit(19, new bit(1));
        longword6_a.setBit(21, new bit(1)); longword6_a.setBit(23, new bit(1));
        longword6_a.setBit(25, new bit(1)); longword6_a.setBit(29, new bit(1));
        longword6_a.setBit(30, new bit(1));
        longword longword6_b = new longword(); longword6_b.set(0);
        longword6_b.setBit(2, new bit(1)); longword6_b.setBit(3, new bit(1));
        longword6_b.setBit(4, new bit(1)); longword6_b.setBit(7, new bit(1));
        longword6_b.setBit(9, new bit(1)); longword6_b.setBit(10, new bit(1));
        longword6_b.setBit(14, new bit(1)); longword6_b.setBit(15, new bit(1));
        longword6_b.setBit(16, new bit(1)); longword6_b.setBit(18, new bit(1));
        longword6_b.setBit(21, new bit(1)); longword6_b.setBit(22, new bit(1));
        longword6_b.setBit(23, new bit(1)); longword6_b.setBit(27, new bit(1));
        longword6_b.setBit(28, new bit(1)); longword6_b.setBit(30, new bit(1));
        String longword6_output = ALU.doOp(operation, longword6_a, longword6_b).toString();
        String expected_output6 = "0,1,1,1,1,0,0,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,0,1,0,1,1,1,1,0";
        System.out.println(
            "Longword a: " + longword6_a.toString() +
            "\nLongword b: " + longword6_b.toString() +
            "\nExpected Output: " + expected_output6 + 
            "\nTest Output: " + longword6_output);
        if(!longword6_output.equals(expected_output6)) throw new Exception("or failed");
        else System.out.println("or successed");
        System.out.println("==== CASE 6 END ====\n");

        // case 7
        System.out.println("==== CASE 7 START ====");
        longword longword7_a = new longword(); longword7_a.set(0);
        longword7_a.setBit(1, new bit(1)); longword7_a.setBit(3, new bit(1));
        longword7_a.setBit(4, new bit(1)); longword7_a.setBit(5, new bit(1));
        longword7_a.setBit(11, new bit(1)); longword7_a.setBit(12, new bit(1));
        longword7_a.setBit(14, new bit(1)); longword7_a.setBit(20, new bit(1));
        longword7_a.setBit(22, new bit(1)); longword7_a.setBit(24, new bit(1));
        longword7_a.setBit(27, new bit(1)); longword7_a.setBit(30, new bit(1));
        longword7_a.setBit(31, new bit(1));
        longword longword7_b = new longword(); longword7_b.set(0);
        longword7_b.setBit(0, new bit(1)); longword7_b.setBit(2, new bit(1));
        longword7_b.setBit(3, new bit(1)); longword7_b.setBit(4, new bit(1));
        longword7_b.setBit(5, new bit(1)); longword7_b.setBit(6, new bit(1));
        longword7_b.setBit(7, new bit(1)); longword7_b.setBit(8, new bit(1));
        longword7_b.setBit(10, new bit(1)); longword7_b.setBit(13, new bit(1));
        longword7_b.setBit(14, new bit(1)); longword7_b.setBit(15, new bit(1));
        longword7_b.setBit(18, new bit(1)); longword7_b.setBit(19, new bit(1));
        longword7_b.setBit(24, new bit(1)); longword7_b.setBit(26, new bit(1));
        longword7_b.setBit(27, new bit(1)); longword7_b.setBit(30, new bit(1));
        String longword7_output = ALU.doOp(operation, longword7_a, longword7_b).toString();
        String expected_output7 = "1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,0,1,0,1,1,0,0,1,1";
        System.out.println(
            "Longword a: " + longword7_a.toString() +
            "\nLongword b: " + longword7_b.toString() +
            "\nExpected Output: " + expected_output7 + 
            "\nTest Output: " + longword7_output);
        if(!longword7_output.equals(expected_output7)) throw new Exception("or failed");
        else System.out.println("or successed");
        System.out.println("==== CASE 7 END ====\n");

        // case 8
        System.out.println("==== CASE 8 START ====");
        longword longword8_a = new longword(); longword8_a.set(0);
        longword8_a.setBit(1, new bit(1)); longword8_a.setBit(2, new bit(1));
        longword8_a.setBit(5, new bit(1)); longword8_a.setBit(6, new bit(1));
        longword8_a.setBit(9, new bit(1)); longword8_a.setBit(10, new bit(1));
        longword8_a.setBit(13, new bit(1)); longword8_a.setBit(15, new bit(1));
        longword8_a.setBit(17, new bit(1)); longword8_a.setBit(21, new bit(1));
        longword8_a.setBit(22, new bit(1)); longword8_a.setBit(23, new bit(1));
        longword8_a.setBit(28, new bit(1)); longword8_a.setBit(29, new bit(1));
        longword8_a.setBit(30, new bit(1)); longword8_a.setBit(31, new bit(1));
        longword longword8_b = new longword(); longword8_b.set(0);
        longword8_b.setBit(3, new bit(1)); longword8_b.setBit(4, new bit(1));
        longword8_b.setBit(8, new bit(1)); longword8_b.setBit(12, new bit(1));
        longword8_b.setBit(15, new bit(1)); longword8_b.setBit(16, new bit(1));
        longword8_b.setBit(17, new bit(1)); longword8_b.setBit(18, new bit(1));
        longword8_b.setBit(20, new bit(1)); longword8_b.setBit(24, new bit(1));
        longword8_b.setBit(28, new bit(1)); longword8_b.setBit(29, new bit(1));
        longword8_b.setBit(30, new bit(1));
        String longword8_output = ALU.doOp(operation, longword8_a, longword8_b).toString();
        String expected_output8 = "0,1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,1,1,1,0,1,1,1,1,1,0,0,0,1,1,1,1";
        System.out.println(
            "Longword a: " + longword8_a.toString() +
            "\nLongword b: " + longword8_b.toString() +
            "\nExpected Output: " + expected_output8 + 
            "\nTest Output: " + longword8_output);
        if(!longword8_output.equals(expected_output8)) throw new Exception("or failed");
        else System.out.println("or successed");
        System.out.println("==== CASE 8 END ====\n");

        // case 9
        System.out.println("==== CASE 9 START ====");
        longword longword9_a = new longword(); longword9_a.set(0);
        longword9_a.setBit(0, new bit(1)); longword9_a.setBit(6, new bit(1));
        longword9_a.setBit(9, new bit(1)); longword9_a.setBit(11, new bit(1));
        longword9_a.setBit(12, new bit(1)); longword9_a.setBit(15, new bit(1));
        longword9_a.setBit(16, new bit(1)); longword9_a.setBit(20, new bit(1));
        longword9_a.setBit(21, new bit(1)); longword9_a.setBit(23, new bit(1));
        longword9_a.setBit(24, new bit(1)); longword9_a.setBit(26, new bit(1));
        longword9_a.setBit(27, new bit(1));
        longword longword9_b = new longword(); longword9_b.set(0);
        longword9_b.setBit(0, new bit(1)); longword9_b.setBit(2, new bit(1));
        longword9_b.setBit(3, new bit(1)); longword9_b.setBit(5, new bit(1));
        longword9_b.setBit(6, new bit(1)); longword9_b.setBit(9, new bit(1));
        longword9_b.setBit(12, new bit(1)); longword9_b.setBit(13, new bit(1));
        longword9_b.setBit(14, new bit(1)); longword9_b.setBit(15, new bit(1));
        longword9_b.setBit(16, new bit(1)); longword9_b.setBit(19, new bit(1));
        longword9_b.setBit(20, new bit(1)); longword9_b.setBit(22, new bit(1));
        longword9_b.setBit(23, new bit(1)); longword9_b.setBit(24, new bit(1));
        longword9_b.setBit(27, new bit(1)); longword9_b.setBit(28, new bit(1));
        longword9_b.setBit(31, new bit(1));
        String longword9_output = ALU.doOp(operation, longword9_a, longword9_b).toString();
        String expected_output9 = "1,0,1,1,0,1,1,0,0,1,0,1,1,1,1,1,1,0,0,1,1,1,1,1,1,0,1,1,1,0,0,1";
        System.out.println(
            "Longword a: " + longword9_a.toString() +
            "\nLongword b: " + longword9_b.toString() +
            "\nExpected Output: " + expected_output9 + 
            "\nTest Output: " + longword9_output);
        if(!longword9_output.equals(expected_output9)) throw new Exception("or failed");
        else System.out.println("or successed");
        System.out.println("==== CASE 9 END ====\n");

        // case 10
        System.out.println("==== CASE 10 START ====");
        longword longword10_a = new longword(); longword10_a.set(0);
        longword10_a.setBit(1, new bit(1)); longword10_a.setBit(3, new bit(1));
        longword10_a.setBit(8, new bit(1)); longword10_a.setBit(10, new bit(1));
        longword10_a.setBit(11, new bit(1)); longword10_a.setBit(12, new bit(1));
        longword10_a.setBit(14, new bit(1)); longword10_a.setBit(16, new bit(1));
        longword10_a.setBit(19, new bit(1)); longword10_a.setBit(20, new bit(1));
        longword10_a.setBit(21, new bit(1)); longword10_a.setBit(25, new bit(1));
        longword10_a.setBit(26, new bit(1)); longword10_a.setBit(30, new bit(1));
        longword longword10_b = new longword(); longword10_b.set(0);
        longword10_b.setBit(1, new bit(1)); longword10_b.setBit(6, new bit(1));
        longword10_b.setBit(11, new bit(1)); longword10_b.setBit(13, new bit(1));
        longword10_b.setBit(14, new bit(1)); longword10_b.setBit(17, new bit(1));
        longword10_b.setBit(19, new bit(1)); longword10_b.setBit(20, new bit(1));
        longword10_b.setBit(21, new bit(1)); longword10_b.setBit(22, new bit(1));
        longword10_b.setBit(24, new bit(1)); longword10_b.setBit(26, new bit(1));
        longword10_b.setBit(27, new bit(1)); longword10_b.setBit(30, new bit(1));
        String longword10_output = ALU.doOp(operation, longword10_a, longword10_b).toString();
        String expected_output10 = "0,1,0,1,0,0,1,0,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,0,1,1,1,1,0,0,1,0";
        System.out.println(
            "Longword a: " + longword10_a.toString() +
            "\nLongword b: " + longword10_b.toString() +
            "\nExpected Output: " + expected_output10 + 
            "\nTest Output: " + longword10_output);
        if(!longword10_output.equals(expected_output10)) throw new Exception("or failed");
        else System.out.println("or successed");
        System.out.println("==== CASE 10 END ====\n");
        
        System.out.println("~~~~ TEST \"1001\" END ~~~~\n");
    }

    private static void test1010() throws Exception{ // test method for "xor"
        System.out.println("~~~~ TEST \"1010\" START ~~~~\n");
        
        // bit operation
        bit[] operation = new bit[4];
        operation[0] = new bit(1);
        operation[1] = new bit(0);
        operation[2] = new bit(1);
        operation[3] = new bit(0);

        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_a = new longword(); longword1_a.set(0);
        longword longword1_b = new longword(); longword1_b.set(0);
        String longword1_output = ALU.doOp(operation, longword1_a, longword1_b).toString();
        String expected_output1 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword1_a.toString() +
            "\nLongword b: " + longword1_b.toString() +
            "\nExpected Output: " + expected_output1 + 
            "\nTest Output: " + longword1_output);
        if(!longword1_output.equals(expected_output1)) throw new Exception("xor failed");
        else System.out.println("xor successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2_a = new longword(); longword2_a.set(1);
        longword longword2_b = new longword(); longword2_b.set(1);
        String longword2_output = ALU.doOp(operation, longword2_a, longword2_b).toString();
        String expected_output2 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword2_a.toString() +
            "\nLongword b: " + longword2_b.toString() +
            "\nExpected Output: " + expected_output2 + 
            "\nTest Output: " + longword2_output);
        if(!longword2_output.equals(expected_output2)) throw new Exception("xor failed");
        else System.out.println("xor successed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3_a = new longword(); longword3_a.set(1);
        longword longword3_b = new longword(); longword3_b.set(0);
        String longword3_output = ALU.doOp(operation, longword3_a, longword3_b).toString();
        String expected_output3 = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        System.out.println(
            "Longword a: " + longword3_a.toString() +
            "\nLongword b: " + longword3_b.toString() +
            "\nExpected Output: " + expected_output3 + 
            "\nTest Output: " + longword3_output);
        if(!longword3_output.equals(expected_output3)) throw new Exception("xor failed");
        else System.out.println("xor successed");
        System.out.println("==== CASE 3 END ====\n");
 
        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4_a = new longword(); longword4_a.set(0);
        longword4_a.setBit(0, new bit(1)); longword4_a.setBit(1, new bit(1));
        longword4_a.setBit(2, new bit(1)); longword4_a.setBit(3, new bit(1));
        longword4_a.setBit(4, new bit(1)); longword4_a.setBit(5, new bit(1));
        longword4_a.setBit(6, new bit(1)); longword4_a.setBit(8, new bit(1));
        longword4_a.setBit(9, new bit(1)); longword4_a.setBit(15, new bit(1));
        longword4_a.setBit(17, new bit(1)); longword4_a.setBit(18, new bit(1));
        longword4_a.setBit(21, new bit(1)); longword4_a.setBit(24, new bit(1));
        longword4_a.setBit(27, new bit(1)); longword4_a.setBit(28, new bit(1));
        longword4_a.setBit(30, new bit(1)); longword4_a.setBit(31, new bit(1));
        longword longword4_b = new longword(); longword4_b.set(0);
        longword4_b.setBit(5, new bit(1)); longword4_b.setBit(6, new bit(1));
        longword4_b.setBit(8, new bit(1)); longword4_b.setBit(10, new bit(1));
        longword4_b.setBit(12, new bit(1)); longword4_b.setBit(14, new bit(1));
        longword4_b.setBit(16, new bit(1)); longword4_b.setBit(17, new bit(1));
        longword4_b.setBit(18, new bit(1)); longword4_b.setBit(19, new bit(1));
        longword4_b.setBit(20, new bit(1)); longword4_b.setBit(30, new bit(1));
        longword4_b.setBit(31, new bit(1));
        String longword4_output = ALU.doOp(operation, longword4_a, longword4_b).toString();
        String expected_output4 = "1,1,1,1,1,0,0,0,0,1,1,0,1,0,1,1,1,0,0,1,1,1,0,0,1,0,0,1,1,0,0,0";
        System.out.println(
            "Longword a: " + longword4_a.toString() +
            "\nLongword b: " + longword4_b.toString() +
            "\nExpected Output: " + expected_output4 + 
            "\nTest Output: " + longword4_output);
        if(!longword4_output.equals(expected_output4)) throw new Exception("xor failed");
        else System.out.println("xor successed");
        System.out.println("==== CASE 4 END ====\n");
 
        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5_a = new longword(); longword5_a.set(0);
        longword5_a.setBit(1, new bit(1)); longword5_a.setBit(3, new bit(1));
        longword5_a.setBit(4, new bit(1)); longword5_a.setBit(5, new bit(1));
        longword5_a.setBit(6, new bit(1)); longword5_a.setBit(8, new bit(1));
        longword5_a.setBit(9, new bit(1)); longword5_a.setBit(11, new bit(1));
        longword5_a.setBit(12, new bit(1)); longword5_a.setBit(13, new bit(1));
        longword5_a.setBit(14, new bit(1)); longword5_a.setBit(16, new bit(1));
        longword5_a.setBit(18, new bit(1)); longword5_a.setBit(20, new bit(1));
        longword5_a.setBit(23, new bit(1)); longword5_a.setBit(26, new bit(1));
        longword5_a.setBit(27, new bit(1)); longword5_a.setBit(30, new bit(1));
        longword5_a.setBit(31, new bit(1));
        longword longword5_b = new longword(); longword5_b.set(0);
        longword5_b.setBit(0, new bit(1)); longword5_b.setBit(3, new bit(1));
        longword5_b.setBit(8, new bit(1)); longword5_b.setBit(9, new bit(1));
        longword5_b.setBit(10, new bit(1)); longword5_b.setBit(11, new bit(1));
        longword5_b.setBit(12, new bit(1)); longword5_b.setBit(14, new bit(1));
        longword5_b.setBit(15, new bit(1)); longword5_b.setBit(18, new bit(1));
        longword5_b.setBit(23, new bit(1)); longword5_b.setBit(25, new bit(1));
        longword5_b.setBit(28, new bit(1)); longword5_b.setBit(29, new bit(1));
        longword5_b.setBit(31, new bit(1));
        String longword5_output = ALU.doOp(operation, longword5_a, longword5_b).toString();
        String expected_output5 = "1,1,0,0,1,1,1,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,0,0,0,1,1,1,1,1,1,0";
        System.out.println(
            "Longword a: " + longword5_a.toString() +
            "\nLongword b: " + longword5_b.toString() +
            "\nExpected Output: " + expected_output5 + 
            "\nTest Output: " + longword5_output);
        if(!longword5_output.equals(expected_output5)) throw new Exception("xor failed");
        else System.out.println("xor successed");
        System.out.println("==== CASE 5 END ====\n");
 
        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6_a = new longword(); longword6_a.set(0);
        longword6_a.setBit(0, new bit(1)); longword6_a.setBit(1, new bit(1));
        longword6_a.setBit(2, new bit(1)); longword6_a.setBit(3, new bit(1));
        longword6_a.setBit(5, new bit(1)); longword6_a.setBit(7, new bit(1));
        longword6_a.setBit(8, new bit(1)); longword6_a.setBit(9, new bit(1));
        longword6_a.setBit(12, new bit(1)); longword6_a.setBit(14, new bit(1));
        longword6_a.setBit(18, new bit(1)); longword6_a.setBit(19, new bit(1));
        longword6_a.setBit(24, new bit(1)); longword6_a.setBit(27, new bit(1));
        longword6_a.setBit(28, new bit(1)); longword6_a.setBit(29, new bit(1));
        longword longword6_b = new longword(); longword6_b.set(0);
        longword6_b.setBit(1, new bit(1)); longword6_b.setBit(3, new bit(1));
        longword6_b.setBit(4, new bit(1)); longword6_b.setBit(5, new bit(1));
        longword6_b.setBit(9, new bit(1)); longword6_b.setBit(11, new bit(1));
        longword6_b.setBit(13, new bit(1)); longword6_b.setBit(14, new bit(1));
        longword6_b.setBit(15, new bit(1)); longword6_b.setBit(16, new bit(1));
        longword6_b.setBit(18, new bit(1)); longword6_b.setBit(20, new bit(1));
        longword6_b.setBit(23, new bit(1)); longword6_b.setBit(26, new bit(1));
        longword6_b.setBit(31, new bit(1));
        String longword6_output = ALU.doOp(operation, longword6_a, longword6_b).toString();
        String expected_output6 = "1,0,1,0,1,0,0,1,1,0,0,1,1,1,0,1,1,0,0,1,1,0,0,1,1,0,1,1,1,1,0,1";
        System.out.println(
            "Longword a: " + longword6_a.toString() +
            "\nLongword b: " + longword6_b.toString() +
            "\nExpected Output: " + expected_output6 + 
            "\nTest Output: " + longword6_output);
        if(!longword6_output.equals(expected_output6)) throw new Exception("xor failed");
        else System.out.println("xor successed");
        System.out.println("==== CASE 6 END ====\n");
 
        // case 7
        System.out.println("==== CASE 7 START ====");
        longword longword7_a = new longword(); longword7_a.set(0);
        longword7_a.setBit(3, new bit(1)); longword7_a.setBit(4, new bit(1));
        longword7_a.setBit(7, new bit(1)); longword7_a.setBit(9, new bit(1));
        longword7_a.setBit(17, new bit(1)); longword7_a.setBit(21, new bit(1));
        longword7_a.setBit(24, new bit(1)); longword7_a.setBit(25, new bit(1));
        longword7_a.setBit(26, new bit(1)); longword7_a.setBit(31, new bit(1));
        longword longword7_b = new longword(); longword7_b.set(0);
        longword7_b.setBit(1, new bit(1)); longword7_b.setBit(2, new bit(1));
        longword7_b.setBit(3, new bit(1)); longword7_b.setBit(4, new bit(1));
        longword7_b.setBit(6, new bit(1)); longword7_b.setBit(11, new bit(1));
        longword7_b.setBit(12, new bit(1)); longword7_b.setBit(17, new bit(1));
        longword7_b.setBit(18, new bit(1)); longword7_b.setBit(19, new bit(1));
        longword7_b.setBit(20, new bit(1)); longword7_b.setBit(24, new bit(1));
        longword7_b.setBit(26, new bit(1)); longword7_b.setBit(28, new bit(1));
        longword7_b.setBit(31, new bit(1));
        String longword7_output = ALU.doOp(operation, longword7_a, longword7_b).toString();
        String expected_output7 = "0,1,1,0,0,0,1,1,0,1,0,1,1,0,0,0,0,0,1,1,1,1,0,0,0,1,0,0,1,0,0,0";
        System.out.println(
            "Longword a: " + longword7_a.toString() +
            "\nLongword b: " + longword7_b.toString() +
            "\nExpected Output: " + expected_output7 + 
            "\nTest Output: " + longword7_output);
        if(!longword7_output.equals(expected_output7)) throw new Exception("xor failed");
        else System.out.println("xor successed");
        System.out.println("==== CASE 7 END ====\n");
 
        // case 8
        System.out.println("==== CASE 8 START ====");
        longword longword8_a = new longword(); longword8_a.set(0);
        longword8_a.setBit(2, new bit(1)); longword8_a.setBit(4, new bit(1));
        longword8_a.setBit(7, new bit(1)); longword8_a.setBit(8, new bit(1));
        longword8_a.setBit(10, new bit(1)); longword8_a.setBit(12, new bit(1));
        longword8_a.setBit(13, new bit(1)); longword8_a.setBit(17, new bit(1));
        longword8_a.setBit(22, new bit(1)); longword8_a.setBit(23, new bit(1));
        longword8_a.setBit(24, new bit(1)); longword8_a.setBit(27, new bit(1));
        longword8_a.setBit(31, new bit(1));
        longword longword8_b = new longword(); longword8_b.set(0);
        longword8_b.setBit(3, new bit(1)); longword8_b.setBit(7, new bit(1));
        longword8_b.setBit(9, new bit(1)); longword8_b.setBit(10, new bit(1));
        longword8_b.setBit(16, new bit(1)); longword8_b.setBit(17, new bit(1));
        longword8_b.setBit(18, new bit(1)); longword8_b.setBit(19, new bit(1));
        longword8_b.setBit(23, new bit(1)); longword8_b.setBit(25, new bit(1));
        longword8_b.setBit(27, new bit(1));
        String longword8_output = ALU.doOp(operation, longword8_a, longword8_b).toString();
        String expected_output8 = "0,0,1,1,1,0,0,0,1,1,0,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,0,0,0,1";
        System.out.println(
            "Longword a: " + longword8_a.toString() +
            "\nLongword b: " + longword8_b.toString() +
            "\nExpected Output: " + expected_output8 + 
            "\nTest Output: " + longword8_output);
        if(!longword8_output.equals(expected_output8)) throw new Exception("xor failed");
        else System.out.println("xor successed");
        System.out.println("==== CASE 8 END ====\n");
 
        // case 9
        System.out.println("==== CASE 9 START ====");
        longword longword9_a = new longword(); longword9_a.set(0);
        longword9_a.setBit(0, new bit(1)); longword9_a.setBit(1, new bit(1));
        longword9_a.setBit(3, new bit(1)); longword9_a.setBit(4, new bit(1));
        longword9_a.setBit(6, new bit(1)); longword9_a.setBit(10, new bit(1));
        longword9_a.setBit(11, new bit(1)); longword9_a.setBit(12, new bit(1));
        longword9_a.setBit(17, new bit(1)); longword9_a.setBit(20, new bit(1));
        longword9_a.setBit(21, new bit(1)); longword9_a.setBit(27, new bit(1));
        longword9_a.setBit(28, new bit(1)); longword9_a.setBit(29, new bit(1));
        longword longword9_b = new longword(); longword9_b.set(0);
        longword9_b.setBit(1, new bit(1)); longword9_b.setBit(4, new bit(1));
        longword9_b.setBit(5, new bit(1)); longword9_b.setBit(6, new bit(1));
        longword9_b.setBit(7, new bit(1)); longword9_b.setBit(8, new bit(1));
        longword9_b.setBit(9, new bit(1)); longword9_b.setBit(10, new bit(1));
        longword9_b.setBit(12, new bit(1)); longword9_b.setBit(14, new bit(1));
        longword9_b.setBit(15, new bit(1)); longword9_b.setBit(16, new bit(1));
        longword9_b.setBit(17, new bit(1)); longword9_b.setBit(20, new bit(1));
        longword9_b.setBit(22, new bit(1)); longword9_b.setBit(24, new bit(1));
        longword9_b.setBit(29, new bit(1));
        String longword9_output = ALU.doOp(operation, longword9_a, longword9_b).toString();
        String expected_output9 = "1,0,0,1,0,1,0,1,1,1,0,1,0,0,1,1,1,0,0,0,0,1,1,0,1,0,0,1,1,0,0,0";
        System.out.println(
            "Longword a: " + longword9_a.toString() +
            "\nLongword b: " + longword9_b.toString() +
            "\nExpected Output: " + expected_output9 + 
            "\nTest Output: " + longword9_output);
        if(!longword9_output.equals(expected_output9)) throw new Exception("xor failed");
        else System.out.println("xor successed");
        System.out.println("==== CASE 9 END ====\n");
 
        // case 10
        System.out.println("==== CASE 10 START ====");
        longword longword10_a = new longword(); longword10_a.set(0);
        longword10_a.setBit(2, new bit(1)); longword10_a.setBit(6, new bit(1));
        longword10_a.setBit(10, new bit(1)); longword10_a.setBit(11, new bit(1));
        longword10_a.setBit(13, new bit(1)); longword10_a.setBit(14, new bit(1));
        longword10_a.setBit(16, new bit(1)); longword10_a.setBit(17, new bit(1));
        longword10_a.setBit(18, new bit(1)); longword10_a.setBit(20, new bit(1));
        longword10_a.setBit(22, new bit(1)); longword10_a.setBit(24, new bit(1));
        longword10_a.setBit(27, new bit(1)); longword10_a.setBit(30, new bit(1));
        longword10_a.setBit(31, new bit(1));
        longword longword10_b = new longword(); longword10_b.set(0);
        longword10_b.setBit(3, new bit(1)); longword10_b.setBit(5, new bit(1));
        longword10_b.setBit(6, new bit(1)); longword10_b.setBit(7, new bit(1));
        longword10_b.setBit(9, new bit(1)); longword10_b.setBit(10, new bit(1));
        longword10_b.setBit(11, new bit(1)); longword10_b.setBit(12, new bit(1));
        longword10_b.setBit(15, new bit(1)); longword10_b.setBit(17, new bit(1));
        longword10_b.setBit(20, new bit(1)); longword10_b.setBit(21, new bit(1));
        longword10_b.setBit(22, new bit(1)); longword10_b.setBit(23, new bit(1));
        longword10_b.setBit(24, new bit(1)); longword10_b.setBit(25, new bit(1));
        longword10_b.setBit(26, new bit(1)); longword10_b.setBit(29, new bit(1));
        String longword10_output = ALU.doOp(operation, longword10_a, longword10_b).toString();
        String expected_output10 = "0,0,1,1,0,1,0,1,0,1,0,0,1,1,1,1,1,0,1,0,0,1,0,1,0,1,1,1,0,1,1,1";
        System.out.println(
            "Longword a: " + longword10_a.toString() +
            "\nLongword b: " + longword10_b.toString() +
            "\nExpected Output: " + expected_output10 + 
            "\nTest Output: " + longword10_output);
        if(!longword10_output.equals(expected_output10)) throw new Exception("xor failed");
        else System.out.println("xor successed");
        System.out.println("==== CASE 10 END ====\n");
        
        System.out.println("~~~~ TEST \"1010\" END ~~~~\n");
    }

    private static void test1011() throws Exception{ // test method for "not"
        System.out.println("~~~~ TEST \"1011\" START ~~~~\n");
        
        // bit operation
        bit[] operation = new bit[4];
        operation[0] = new bit(1);
        operation[1] = new bit(0);
        operation[2] = new bit(1);
        operation[3] = new bit(1);

        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_a = new longword(); longword1_a.set(0);
        String longword1_output = ALU.doOp(operation, longword1_a, new longword()).toString();
        String expected_output1 = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        System.out.println(
            "Longword a: " + longword1_a.toString() +
            "\nExpected Output: " + expected_output1 + 
            "\nTest Output: " + longword1_output);
        if(!longword1_output.equals(expected_output1)) throw new Exception("not failed");
        else System.out.println("not successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2_a = new longword(); longword2_a.set(1);
        String longword2_output = ALU.doOp(operation, longword2_a, new longword()).toString();
        String expected_output2 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword2_a.toString() +
            "\nExpected Output: " + expected_output2 + 
            "\nTest Output: " + longword2_output);
        if(!longword2_output.equals(expected_output2)) throw new Exception("not failed");
        else System.out.println("not successed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3_a = new longword(); longword3_a.set(0);
        longword3_a.setBit(0, new bit(1)); longword3_a.setBit(1, new bit(1));
        longword3_a.setBit(2, new bit(1)); longword3_a.setBit(3, new bit(1));
        longword3_a.setBit(4, new bit(1)); longword3_a.setBit(5, new bit(1));
        longword3_a.setBit(6, new bit(1)); longword3_a.setBit(8, new bit(1));
        longword3_a.setBit(10, new bit(1)); longword3_a.setBit(14, new bit(1));
        longword3_a.setBit(15, new bit(1)); longword3_a.setBit(16, new bit(1));
        longword3_a.setBit(20, new bit(1)); longword3_a.setBit(23, new bit(1));
        longword3_a.setBit(25, new bit(1)); longword3_a.setBit(26, new bit(1));
        String longword3_output = ALU.doOp(operation, longword3_a, new longword()).toString();
        String expected_output3 = "0,0,0,0,0,0,0,1,0,1,0,1,1,1,0,0,0,1,1,1,0,1,1,0,1,0,0,1,1,1,1,1";
        System.out.println(
            "Longword a: " + longword3_a.toString() +
            "\nExpected Output: " + expected_output3 + 
            "\nTest Output: " + longword3_output);
        if(!longword3_output.equals(expected_output3)) throw new Exception("not failed");
        else System.out.println("not successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4_a = new longword(); longword4_a.set(0);
        longword4_a.setBit(0, new bit(1)); longword4_a.setBit(1, new bit(1));
        longword4_a.setBit(3, new bit(1)); longword4_a.setBit(5, new bit(1));
        longword4_a.setBit(6, new bit(1)); longword4_a.setBit(7, new bit(1));
        longword4_a.setBit(17, new bit(1)); longword4_a.setBit(19, new bit(1));
        longword4_a.setBit(21, new bit(1)); longword4_a.setBit(23, new bit(1));
        longword4_a.setBit(27, new bit(1)); longword4_a.setBit(29, new bit(1));
        String longword4_output = ALU.doOp(operation, longword4_a, new longword()).toString();
        String expected_output4 = "0,0,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,0,1,1,1,0,1,0,1,1";
        System.out.println(
            "Longword a: " + longword4_a.toString() +
            "\nExpected Output: " + expected_output4 + 
            "\nTest Output: " + longword4_output);
        if(!longword4_output.equals(expected_output4)) throw new Exception("not failed");
        else System.out.println("not successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5_a = new longword(); longword5_a.set(0);
        longword5_a.setBit(1, new bit(1)); longword5_a.setBit(2, new bit(1));
        longword5_a.setBit(3, new bit(1)); longword5_a.setBit(4, new bit(1));
        longword5_a.setBit(7, new bit(1)); longword5_a.setBit(11, new bit(1));
        longword5_a.setBit(13, new bit(1)); longword5_a.setBit(14, new bit(1));
        longword5_a.setBit(17, new bit(1)); longword5_a.setBit(18, new bit(1));
        longword5_a.setBit(22, new bit(1)); longword5_a.setBit(24, new bit(1));
        longword5_a.setBit(25, new bit(1)); longword5_a.setBit(27, new bit(1));
        longword5_a.setBit(28, new bit(1)); longword5_a.setBit(31, new bit(1));
        String longword5_output = ALU.doOp(operation, longword5_a, new longword()).toString();
        String expected_output5 = "1,0,0,0,0,1,1,0,1,1,1,0,1,0,0,1,1,0,0,1,1,1,0,1,0,0,1,0,0,1,1,0";
        System.out.println(
            "Longword a: " + longword5_a.toString() +
            "\nExpected Output: " + expected_output5 + 
            "\nTest Output: " + longword5_output);
        if(!longword5_output.equals(expected_output5)) throw new Exception("not failed");
        else System.out.println("not successed");
        System.out.println("==== CASE 5 END ====\n");

        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6_a = new longword(); longword6_a.set(0);
        longword6_a.setBit(2, new bit(1)); longword6_a.setBit(5, new bit(1));
        longword6_a.setBit(7, new bit(1)); longword6_a.setBit(10, new bit(1));
        longword6_a.setBit(12, new bit(1)); longword6_a.setBit(15, new bit(1));
        longword6_a.setBit(16, new bit(1)); longword6_a.setBit(17, new bit(1));
        longword6_a.setBit(18, new bit(1)); longword6_a.setBit(20, new bit(1));
        longword6_a.setBit(21, new bit(1)); longword6_a.setBit(26, new bit(1));
        longword6_a.setBit(30, new bit(1));
        String longword6_output = ALU.doOp(operation, longword6_a, new longword()).toString();
        String expected_output6 = "1,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,0,0,0,1,0,0,1,1,1,1,0,1,1,1,0,1";
        System.out.println(
            "Longword a: " + longword6_a.toString() +
            "\nExpected Output: " + expected_output6 + 
            "\nTest Output: " + longword6_output);
        if(!longword6_output.equals(expected_output6)) throw new Exception("not failed");
        else System.out.println("not successed");
        System.out.println("==== CASE 6 END ====\n");

        // case 7
        System.out.println("==== CASE 7 START ====");        
        longword longword7_a = new longword(); longword7_a.set(0);
        longword7_a.setBit(1, new bit(1)); longword7_a.setBit(8, new bit(1));
        longword7_a.setBit(9, new bit(1)); longword7_a.setBit(10, new bit(1));
        longword7_a.setBit(12, new bit(1)); longword7_a.setBit(13, new bit(1));
        longword7_a.setBit(14, new bit(1)); longword7_a.setBit(17, new bit(1));
        longword7_a.setBit(19, new bit(1)); longword7_a.setBit(20, new bit(1));
        longword7_a.setBit(21, new bit(1)); longword7_a.setBit(22, new bit(1));
        longword7_a.setBit(23, new bit(1)); longword7_a.setBit(24, new bit(1));
        longword7_a.setBit(25, new bit(1));
        String longword7_output = ALU.doOp(operation, longword7_a, new longword()).toString();
        String expected_output7 = "1,0,1,1,1,1,1,1,0,0,0,1,0,0,0,1,1,0,1,0,0,0,0,0,0,0,1,1,1,1,1,1";
        System.out.println(
            "Longword a: " + longword7_a.toString() +
            "\nExpected Output: " + expected_output7 + 
            "\nTest Output: " + longword7_output);
        if(!longword7_output.equals(expected_output7)) throw new Exception("not failed");
        else System.out.println("not successed");
        System.out.println("==== CASE 7 END ====\n");

        // case 8
        System.out.println("==== CASE 8 START ====");
        longword longword8_a = new longword(); longword8_a.set(0);
        longword8_a.setBit(0, new bit(1)); longword8_a.setBit(1, new bit(1));
        longword8_a.setBit(2, new bit(1)); longword8_a.setBit(4, new bit(1));
        longword8_a.setBit(5, new bit(1)); longword8_a.setBit(6, new bit(1));
        longword8_a.setBit(8, new bit(1)); longword8_a.setBit(9, new bit(1));
        longword8_a.setBit(12, new bit(1)); longword8_a.setBit(14, new bit(1));
        longword8_a.setBit(15, new bit(1)); longword8_a.setBit(17, new bit(1));
        longword8_a.setBit(19, new bit(1)); longword8_a.setBit(20, new bit(1));
        longword8_a.setBit(23, new bit(1)); longword8_a.setBit(24, new bit(1));
        longword8_a.setBit(25, new bit(1)); longword8_a.setBit(27, new bit(1));
        longword8_a.setBit(28, new bit(1)); longword8_a.setBit(29, new bit(1));
        longword8_a.setBit(30, new bit(1)); longword8_a.setBit(31, new bit(1));
        String longword8_output = ALU.doOp(operation, longword8_a, new longword()).toString();
        String expected_output8 = "0,0,0,1,0,0,0,1,0,0,1,1,0,1,0,0,1,0,1,0,0,1,1,0,0,0,1,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword8_a.toString() +
            "\nExpected Output: " + expected_output8 + 
            "\nTest Output: " + longword8_output);
        if(!longword8_output.equals(expected_output8)) throw new Exception("not failed");
        else System.out.println("not successed");
        System.out.println("==== CASE 8 END ====\n");

        // case 9
        System.out.println("==== CASE 9 START ====");
        longword longword9_a = new longword(); longword9_a.set(0);
        longword9_a.setBit(0, new bit(1)); longword9_a.setBit(5, new bit(1));
        longword9_a.setBit(7, new bit(1)); longword9_a.setBit(9, new bit(1));
        longword9_a.setBit(10, new bit(1)); longword9_a.setBit(11, new bit(1));
        longword9_a.setBit(20, new bit(1)); longword9_a.setBit(23, new bit(1));
        longword9_a.setBit(24, new bit(1)); longword9_a.setBit(25, new bit(1));
        longword9_a.setBit(27, new bit(1)); longword9_a.setBit(28, new bit(1));
        longword9_a.setBit(31, new bit(1));
        String longword9_output = ALU.doOp(operation, longword9_a, new longword()).toString();
        String expected_output9 = "0,1,1,1,1,0,1,0,1,0,0,0,1,1,1,1,1,1,1,1,0,1,1,0,0,0,1,0,0,1,1,0";
        System.out.println(
            "Longword a: " + longword9_a.toString() +
            "\nExpected Output: " + expected_output9 + 
            "\nTest Output: " + longword9_output);
        if(!longword9_output.equals(expected_output9)) throw new Exception("not failed");
        else System.out.println("not successed");
        System.out.println("==== CASE 9 END ====\n");

        // case 10
        System.out.println("==== CASE 10 START ====");
        longword longword10_a = new longword(); longword10_a.set(0);
        longword10_a.setBit(1, new bit(1)); longword10_a.setBit(3, new bit(1));
        longword10_a.setBit(7, new bit(1)); longword10_a.setBit(8, new bit(1));
        longword10_a.setBit(9, new bit(1)); longword10_a.setBit(10, new bit(1));
        longword10_a.setBit(12, new bit(1)); longword10_a.setBit(13, new bit(1));
        longword10_a.setBit(17, new bit(1)); longword10_a.setBit(19, new bit(1));
        longword10_a.setBit(22, new bit(1)); longword10_a.setBit(25, new bit(1));
        longword10_a.setBit(26, new bit(1)); longword10_a.setBit(27, new bit(1));
        longword10_a.setBit(28, new bit(1)); longword10_a.setBit(31, new bit(1));
        String longword10_output = ALU.doOp(operation, longword10_a, new longword()).toString();
        String expected_output10 = "1,0,1,0,1,1,1,0,0,0,0,1,0,0,1,1,1,0,1,0,1,1,0,1,1,0,0,0,0,1,1,0";
        System.out.println(
            "Longword a: " + longword10_a.toString() +
            "\nExpected Output: " + expected_output10 + 
            "\nTest Output: " + longword10_output);
        if(!longword10_output.equals(expected_output10)) throw new Exception("not failed");
        else System.out.println("not successed");
        System.out.println("==== CASE 10 END ====\n");
        
        System.out.println("~~~~ TEST \"1011\" END ~~~~\n");
    }

    private static void test1100() throws Exception{ // test method for "left shift"
        System.out.println("~~~~ TEST \"1100\" START ~~~~\n");
        
        // bit operation
        bit[] operation = new bit[4];
        operation[0] = new bit(1);
        operation[1] = new bit(1);
        operation[2] = new bit(0);
        operation[3] = new bit(0);

        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_a = new longword(); longword1_a.set(0);
        longword1_a.setBit(1, new bit(1)); longword1_a.setBit(2, new bit(1));
        longword1_a.setBit(4, new bit(1)); longword1_a.setBit(5, new bit(1));
        longword1_a.setBit(6, new bit(1)); longword1_a.setBit(7, new bit(1));
        longword1_a.setBit(9, new bit(1)); longword1_a.setBit(11, new bit(1));
        longword1_a.setBit(12, new bit(1)); longword1_a.setBit(13, new bit(1));
        longword1_a.setBit(14, new bit(1)); longword1_a.setBit(19, new bit(1));
        longword1_a.setBit(20, new bit(1)); longword1_a.setBit(24, new bit(1));
        longword1_a.setBit(25, new bit(1)); longword1_a.setBit(26, new bit(1));
        longword1_a.setBit(27, new bit(1)); longword1_a.setBit(30, new bit(1));
        longword longword1_b = new longword(); longword1_b.set(0);
        longword1_b.setBit(1, new bit(1)); longword1_b.setBit(4, new bit(1));
        longword1_b.setBit(5, new bit(1)); longword1_b.setBit(8, new bit(1));
        longword1_b.setBit(10, new bit(1)); longword1_b.setBit(12, new bit(1));
        longword1_b.setBit(13, new bit(1)); longword1_b.setBit(15, new bit(1));
        longword1_b.setBit(16, new bit(1)); longword1_b.setBit(19, new bit(1));
        longword1_b.setBit(20, new bit(1)); longword1_b.setBit(21, new bit(1));
        longword1_b.setBit(22, new bit(1)); longword1_b.setBit(24, new bit(1));
        longword1_b.setBit(25, new bit(1)); longword1_b.setBit(27, new bit(1));
        longword1_b.setBit(28, new bit(1)); longword1_b.setBit(31, new bit(1));
        String longword1_output = ALU.doOp(operation, longword1_a, longword1_b).toString();
        String expected_output1 = "1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword1_a.toString() +
            "\nLongword b: " + longword1_b.toString() +
            "\nExpected Output: " + expected_output1 + 
            "\nTest Output: " + longword1_output);
        if(!longword1_output.equals(expected_output1)) throw new Exception("left shift failed");
        else System.out.println("left shift successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2_a = new longword(); longword2_a.set(0);
        longword2_a.setBit(0, new bit(1)); longword2_a.setBit(1, new bit(1));
        longword2_a.setBit(2, new bit(1)); longword2_a.setBit(3, new bit(1));
        longword2_a.setBit(4, new bit(1)); longword2_a.setBit(5, new bit(1));
        longword2_a.setBit(8, new bit(1)); longword2_a.setBit(10, new bit(1));
        longword2_a.setBit(13, new bit(1)); longword2_a.setBit(14, new bit(1));
        longword2_a.setBit(15, new bit(1)); longword2_a.setBit(19, new bit(1));
        longword2_a.setBit(21, new bit(1)); longword2_a.setBit(24, new bit(1));
        longword2_a.setBit(25, new bit(1)); longword2_a.setBit(26, new bit(1));
        longword2_a.setBit(27, new bit(1)); longword2_a.setBit(28, new bit(1));
        longword2_a.setBit(30, new bit(1));
        longword longword2_b = new longword(); longword2_b.set(0);
        longword2_b.setBit(1, new bit(1)); longword2_b.setBit(2, new bit(1));
        longword2_b.setBit(3, new bit(1)); longword2_b.setBit(4, new bit(1));
        longword2_b.setBit(6, new bit(1)); longword2_b.setBit(8, new bit(1));
        longword2_b.setBit(9, new bit(1)); longword2_b.setBit(10, new bit(1));
        longword2_b.setBit(13, new bit(1)); longword2_b.setBit(17, new bit(1));
        longword2_b.setBit(18, new bit(1)); longword2_b.setBit(20, new bit(1));
        longword2_b.setBit(24, new bit(1)); longword2_b.setBit(25, new bit(1));
        longword2_b.setBit(29, new bit(1)); longword2_b.setBit(30, new bit(1));
        longword2_b.setBit(31, new bit(1));
        String longword2_output = ALU.doOp(operation, longword2_a, longword2_b).toString();
        String expected_output2 = "0,1,0,1,0,0,1,1,1,0,0,0,1,0,1,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword2_a.toString() +
            "\nLongword b: " + longword2_b.toString() +
            "\nExpected Output: " + expected_output2 + 
            "\nTest Output: " + longword2_output);
        if(!longword2_output.equals(expected_output2)) throw new Exception("left shift failed");
        else System.out.println("left shift successed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3_a = new longword(); longword3_a.set(0);
        longword3_a.setBit(0, new bit(1)); longword3_a.setBit(1, new bit(1));
        longword3_a.setBit(5, new bit(1)); longword3_a.setBit(7, new bit(1));
        longword3_a.setBit(9, new bit(1)); longword3_a.setBit(12, new bit(1));
        longword3_a.setBit(13, new bit(1)); longword3_a.setBit(14, new bit(1));
        longword3_a.setBit(15, new bit(1)); longword3_a.setBit(17, new bit(1));
        longword3_a.setBit(21, new bit(1)); longword3_a.setBit(25, new bit(1));
        longword3_a.setBit(26, new bit(1)); longword3_a.setBit(28, new bit(1));
        longword3_a.setBit(29, new bit(1)); longword3_a.setBit(30, new bit(1));
        longword longword3_b = new longword(); longword3_b.set(0);
        longword3_b.setBit(0, new bit(1)); longword3_b.setBit(2, new bit(1));
        longword3_b.setBit(3, new bit(1)); longword3_b.setBit(4, new bit(1));
        longword3_b.setBit(8, new bit(1)); longword3_b.setBit(10, new bit(1));
        longword3_b.setBit(11, new bit(1)); longword3_b.setBit(13, new bit(1));
        longword3_b.setBit(14, new bit(1)); longword3_b.setBit(18, new bit(1));
        longword3_b.setBit(20, new bit(1)); longword3_b.setBit(28, new bit(1));
        longword3_b.setBit(29, new bit(1)); longword3_b.setBit(31, new bit(1));
        String longword3_output = ALU.doOp(operation, longword3_a, longword3_b).toString();
        String expected_output3 = "1,1,1,0,1,0,0,0,1,0,0,0,1,1,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword3_a.toString() +
            "\nLongword b: " + longword3_b.toString() +
            "\nExpected Output: " + expected_output3 + 
            "\nTest Output: " + longword3_output);
        if(!longword3_output.equals(expected_output3)) throw new Exception("left shift failed");
        else System.out.println("left shift successed");
        System.out.println("==== CASE 3 END ====\n");
        
        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4_a = new longword(); longword4_a.set(0);
        longword4_a.setBit(0, new bit(1)); longword4_a.setBit(5, new bit(1));
        longword4_a.setBit(6, new bit(1)); longword4_a.setBit(7, new bit(1));
        longword4_a.setBit(9, new bit(1)); longword4_a.setBit(11, new bit(1));
        longword4_a.setBit(12, new bit(1)); longword4_a.setBit(13, new bit(1));
        longword4_a.setBit(15, new bit(1)); longword4_a.setBit(21, new bit(1));
        longword4_a.setBit(22, new bit(1)); longword4_a.setBit(25, new bit(1));
        longword4_a.setBit(26, new bit(1)); longword4_a.setBit(27, new bit(1));
        longword4_a.setBit(28, new bit(1)); longword4_a.setBit(29, new bit(1));
        longword4_a.setBit(30, new bit(1));
        longword longword4_b = new longword(); longword4_b.set(0);
        longword4_b.setBit(7, new bit(1)); longword4_b.setBit(10, new bit(1));
        longword4_b.setBit(15, new bit(1)); longword4_b.setBit(16, new bit(1));
        longword4_b.setBit(18, new bit(1)); longword4_b.setBit(20, new bit(1));
        longword4_b.setBit(21, new bit(1)); longword4_b.setBit(22, new bit(1));
        longword4_b.setBit(24, new bit(1)); longword4_b.setBit(25, new bit(1));
        longword4_b.setBit(26, new bit(1)); longword4_b.setBit(27, new bit(1));
        longword4_b.setBit(30, new bit(1)); longword4_b.setBit(31, new bit(1));
        String longword4_output = ALU.doOp(operation, longword4_a, longword4_b).toString();
        String expected_output4 = "0,0,1,1,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword4_a.toString() +
            "\nLongword b: " + longword4_b.toString() +
            "\nExpected Output: " + expected_output4 + 
            "\nTest Output: " + longword4_output);
        if(!longword4_output.equals(expected_output4)) throw new Exception("left shift failed");
        else System.out.println("left shift successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5_a = new longword(); longword5_a.set(0);
        longword5_a.setBit(2, new bit(1)); longword5_a.setBit(5, new bit(1));
        longword5_a.setBit(7, new bit(1)); longword5_a.setBit(11, new bit(1));
        longword5_a.setBit(12, new bit(1)); longword5_a.setBit(13, new bit(1));
        longword5_a.setBit(14, new bit(1)); longword5_a.setBit(16, new bit(1));
        longword5_a.setBit(18, new bit(1)); longword5_a.setBit(23, new bit(1));
        longword5_a.setBit(25, new bit(1)); longword5_a.setBit(26, new bit(1));
        longword5_a.setBit(27, new bit(1)); longword5_a.setBit(28, new bit(1));
        longword5_a.setBit(31, new bit(1));
        longword longword5_b = new longword(); longword5_b.set(0);
        longword5_b.setBit(0, new bit(1)); longword5_b.setBit(1, new bit(1));
        longword5_b.setBit(6, new bit(1)); longword5_b.setBit(8, new bit(1));
        longword5_b.setBit(9, new bit(1)); longword5_b.setBit(10, new bit(1));
        longword5_b.setBit(13, new bit(1)); longword5_b.setBit(14, new bit(1));
        longword5_b.setBit(15, new bit(1)); longword5_b.setBit(17, new bit(1));
        longword5_b.setBit(18, new bit(1)); longword5_b.setBit(20, new bit(1));
        longword5_b.setBit(24, new bit(1)); longword5_b.setBit(26, new bit(1));
        longword5_b.setBit(29, new bit(1)); longword5_b.setBit(30, new bit(1));
        longword5_b.setBit(31, new bit(1));
        String longword5_output = ALU.doOp(operation, longword5_a, longword5_b).toString();
        String expected_output5 = "1,0,0,0,1,1,1,1,0,1,0,1,0,0,0,0,1,0,1,1,1,1,0,0,1,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword5_a.toString() +
            "\nLongword b: " + longword5_b.toString() +
            "\nExpected Output: " + expected_output5 + 
            "\nTest Output: " + longword5_output);
        if(!longword5_output.equals(expected_output5)) throw new Exception("left shift failed");
        else System.out.println("left shift successed");
        System.out.println("==== CASE 5 END ====\n");
        
        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6_a = new longword(); longword6_a.set(0);
        longword6_a.setBit(2, new bit(1)); longword6_a.setBit(5, new bit(1));
        longword6_a.setBit(8, new bit(1)); longword6_a.setBit(11, new bit(1));
        longword6_a.setBit(12, new bit(1)); longword6_a.setBit(15, new bit(1));
        longword6_a.setBit(19, new bit(1)); longword6_a.setBit(21, new bit(1));
        longword6_a.setBit(26, new bit(1)); longword6_a.setBit(28, new bit(1));
        longword6_a.setBit(29, new bit(1));
        longword longword6_b = new longword(); longword6_b.set(0);
        longword6_b.setBit(1, new bit(1)); longword6_b.setBit(7, new bit(1));
        longword6_b.setBit(8, new bit(1)); longword6_b.setBit(9, new bit(1));
        longword6_b.setBit(10, new bit(1)); longword6_b.setBit(11, new bit(1));
        longword6_b.setBit(13, new bit(1)); longword6_b.setBit(14, new bit(1));
        longword6_b.setBit(15, new bit(1)); longword6_b.setBit(17, new bit(1));
        longword6_b.setBit(19, new bit(1)); longword6_b.setBit(23, new bit(1));
        longword6_b.setBit(24, new bit(1)); longword6_b.setBit(26, new bit(1));
        longword6_b.setBit(27, new bit(1)); longword6_b.setBit(28, new bit(1));
        longword6_b.setBit(29, new bit(1)); longword6_b.setBit(30, new bit(1));
        longword6_b.setBit(31, new bit(1));
        String longword6_output = ALU.doOp(operation, longword6_a, longword6_b).toString();
        String expected_output6 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword6_a.toString() +
            "\nLongword b: " + longword6_b.toString() +
            "\nExpected Output: " + expected_output6 + 
            "\nTest Output: " + longword6_output);
        if(!longword6_output.equals(expected_output6)) throw new Exception("left shift failed");
        else System.out.println("left shift successed");
        System.out.println("==== CASE 6 END ====\n");

        // case 7
        System.out.println("==== CASE 7 START ====");
        longword longword7_a = new longword(); longword7_a.set(0);
        longword7_a.setBit(2, new bit(1)); longword7_a.setBit(6, new bit(1));
        longword7_a.setBit(7, new bit(1)); longword7_a.setBit(9, new bit(1));
        longword7_a.setBit(11, new bit(1)); longword7_a.setBit(14, new bit(1));
        longword7_a.setBit(16, new bit(1)); longword7_a.setBit(19, new bit(1));
        longword7_a.setBit(21, new bit(1)); longword7_a.setBit(22, new bit(1));
        longword7_a.setBit(23, new bit(1)); longword7_a.setBit(24, new bit(1));
        longword7_a.setBit(26, new bit(1)); longword7_a.setBit(27, new bit(1));
        longword7_a.setBit(28, new bit(1)); longword7_a.setBit(29, new bit(1));
        longword longword7_b = new longword(); longword7_b.set(0);
        longword7_b.setBit(1, new bit(1)); longword7_b.setBit(2, new bit(1));
        longword7_b.setBit(4, new bit(1)); longword7_b.setBit(7, new bit(1));
        longword7_b.setBit(10, new bit(1)); longword7_b.setBit(11, new bit(1));
        longword7_b.setBit(12, new bit(1)); longword7_b.setBit(16, new bit(1));
        longword7_b.setBit(19, new bit(1)); longword7_b.setBit(20, new bit(1));
        longword7_b.setBit(21, new bit(1)); longword7_b.setBit(23, new bit(1));
        longword7_b.setBit(25, new bit(1)); longword7_b.setBit(26, new bit(1));
        longword7_b.setBit(27, new bit(1)); longword7_b.setBit(28, new bit(1));
        longword7_b.setBit(30, new bit(1)); longword7_b.setBit(31, new bit(1));
        String longword7_output = ALU.doOp(operation, longword7_a, longword7_b).toString();
        String expected_output7 = "1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword7_a.toString() +
            "\nLongword b: " + longword7_b.toString() +
            "\nExpected Output: " + expected_output7 + 
            "\nTest Output: " + longword7_output);
        if(!longword7_output.equals(expected_output7)) throw new Exception("left shift failed");
        else System.out.println("left shift successed");
        System.out.println("==== CASE 7 END ====\n");
        
        // case 8
        System.out.println("==== CASE 8 START ====");
        longword longword8_a = new longword(); longword8_a.set(0);
        longword8_a.setBit(4, new bit(1)); longword8_a.setBit(6, new bit(1));
        longword8_a.setBit(7, new bit(1)); longword8_a.setBit(13, new bit(1));
        longword8_a.setBit(15, new bit(1)); longword8_a.setBit(25, new bit(1));
        longword8_a.setBit(27, new bit(1)); longword8_a.setBit(28, new bit(1));
        longword8_a.setBit(31, new bit(1));
        longword longword8_b = new longword(); longword8_b.set(0);
        longword8_b.setBit(0, new bit(1)); longword8_b.setBit(3, new bit(1));
        longword8_b.setBit(4, new bit(1)); longword8_b.setBit(6, new bit(1));
        longword8_b.setBit(7, new bit(1)); longword8_b.setBit(10, new bit(1));
        longword8_b.setBit(11, new bit(1)); longword8_b.setBit(13, new bit(1));
        longword8_b.setBit(14, new bit(1)); longword8_b.setBit(18, new bit(1));
        longword8_b.setBit(19, new bit(1)); longword8_b.setBit(20, new bit(1));
        longword8_b.setBit(21, new bit(1)); longword8_b.setBit(22, new bit(1));
        longword8_b.setBit(23, new bit(1)); longword8_b.setBit(30, new bit(1));
        longword8_b.setBit(31, new bit(1));
        String longword8_output = ALU.doOp(operation, longword8_a, longword8_b).toString();
        String expected_output8 = "0,1,0,1,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,1,0,0,1,0,0,0";
        System.out.println(
            "Longword a: " + longword8_a.toString() +
            "\nLongword b: " + longword8_b.toString() +
            "\nExpected Output: " + expected_output8 + 
            "\nTest Output: " + longword8_output);
        if(!longword8_output.equals(expected_output8)) throw new Exception("left shift failed");
        else System.out.println("left shift successed");
        System.out.println("==== CASE 8 END ====\n");
        
        // case 9
        System.out.println("==== CASE 9 START ====");
        longword longword9_a = new longword(); longword9_a.set(0);
        longword9_a.setBit(0, new bit(1)); longword9_a.setBit(1, new bit(1));
        longword9_a.setBit(2, new bit(1)); longword9_a.setBit(3, new bit(1));
        longword9_a.setBit(4, new bit(1)); longword9_a.setBit(5, new bit(1));
        longword9_a.setBit(6, new bit(1)); longword9_a.setBit(11, new bit(1));
        longword9_a.setBit(12, new bit(1)); longword9_a.setBit(13, new bit(1));
        longword9_a.setBit(14, new bit(1)); longword9_a.setBit(18, new bit(1));
        longword9_a.setBit(20, new bit(1)); longword9_a.setBit(23, new bit(1));
        longword9_a.setBit(26, new bit(1)); longword9_a.setBit(30, new bit(1));
        longword9_a.setBit(31, new bit(1));
        longword longword9_b = new longword(); longword9_b.set(0);
        longword9_b.setBit(9, new bit(1)); longword9_b.setBit(13, new bit(1));
        longword9_b.setBit(14, new bit(1)); longword9_b.setBit(15, new bit(1));
        longword9_b.setBit(16, new bit(1)); longword9_b.setBit(17, new bit(1));
        longword9_b.setBit(19, new bit(1)); longword9_b.setBit(23, new bit(1));
        longword9_b.setBit(25, new bit(1)); longword9_b.setBit(27, new bit(1));
        longword9_b.setBit(29, new bit(1)); longword9_b.setBit(30, new bit(1));
        String longword9_output = ALU.doOp(operation, longword9_a, longword9_b).toString();
        String expected_output9 = "0,1,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword9_a.toString() +
            "\nLongword b: " + longword9_b.toString() +
            "\nExpected Output: " + expected_output9 + 
            "\nTest Output: " + longword9_output);
        if(!longword9_output.equals(expected_output9)) throw new Exception("left shift failed");
        else System.out.println("left shift successed");
        System.out.println("==== CASE 9 END ====\n");

        // case 10
        System.out.println("==== CASE 10 START ====");
        longword longword10_a = new longword(); longword10_a.set(0);
        longword10_a.setBit(3, new bit(1)); longword10_a.setBit(5, new bit(1));
        longword10_a.setBit(6, new bit(1)); longword10_a.setBit(7, new bit(1));
        longword10_a.setBit(8, new bit(1)); longword10_a.setBit(9, new bit(1));
        longword10_a.setBit(11, new bit(1)); longword10_a.setBit(13, new bit(1));
        longword10_a.setBit(14, new bit(1)); longword10_a.setBit(18, new bit(1));
        longword10_a.setBit(19, new bit(1)); longword10_a.setBit(20, new bit(1));
        longword10_a.setBit(21, new bit(1)); longword10_a.setBit(23, new bit(1));
        longword10_a.setBit(24, new bit(1)); longword10_a.setBit(25, new bit(1));
        longword10_a.setBit(27, new bit(1));
        longword longword10_b = new longword(); longword10_b.set(0);
        longword10_b.setBit(0, new bit(1)); longword10_b.setBit(1, new bit(1));
        longword10_b.setBit(2, new bit(1)); longword10_b.setBit(3, new bit(1));
        longword10_b.setBit(5, new bit(1)); longword10_b.setBit(6, new bit(1));
        longword10_b.setBit(9, new bit(1)); longword10_b.setBit(11, new bit(1));
        longword10_b.setBit(12, new bit(1)); longword10_b.setBit(14, new bit(1));
        longword10_b.setBit(15, new bit(1)); longword10_b.setBit(16, new bit(1));
        longword10_b.setBit(17, new bit(1)); longword10_b.setBit(19, new bit(1));
        longword10_b.setBit(22, new bit(1)); longword10_b.setBit(24, new bit(1));
        longword10_b.setBit(26, new bit(1)); longword10_b.setBit(28, new bit(1));
        longword10_b.setBit(29, new bit(1)); longword10_b.setBit(30, new bit(1));
        String longword10_output = ALU.doOp(operation, longword10_a, longword10_b).toString();
        String expected_output10 = "1,0,0,0,1,1,1,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword10_a.toString() +
            "\nLongword b: " + longword10_b.toString() +
            "\nExpected Output: " + expected_output10 + 
            "\nTest Output: " + longword10_output);
        if(!longword10_output.equals(expected_output10)) throw new Exception("left shift failed");
        else System.out.println("left shift successed");
        System.out.println("==== CASE 10 END ====\n");
        
        System.out.println("~~~~ TEST \"1100\" END ~~~~\n");
    }

    private static void test1101() throws Exception{ // test method for "right shift"
        System.out.println("~~~~ TEST \"1101\" START ~~~~\n");
        
        // bit operation
        bit[] operation = new bit[4];
        operation[0] = new bit(1);
        operation[1] = new bit(1);
        operation[2] = new bit(0);
        operation[3] = new bit(1);

        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_a = new longword(); longword1_a.set(0);
        longword1_a.setBit(0, new bit(1)); longword1_a.setBit(1, new bit(1));
        longword1_a.setBit(2, new bit(1)); longword1_a.setBit(9, new bit(1));
        longword1_a.setBit(11, new bit(1)); longword1_a.setBit(12, new bit(1));
        longword1_a.setBit(15, new bit(1)); longword1_a.setBit(16, new bit(1));
        longword1_a.setBit(21, new bit(1)); longword1_a.setBit(23, new bit(1));
        longword1_a.setBit(25, new bit(1)); longword1_a.setBit(26, new bit(1));
        longword1_a.setBit(27, new bit(1)); longword1_a.setBit(28, new bit(1));
        longword1_a.setBit(30, new bit(1));
        longword longword1_b = new longword(); longword1_b.set(0);
        longword1_b.setBit(4, new bit(1)); longword1_b.setBit(10, new bit(1));
        longword1_b.setBit(16, new bit(1)); longword1_b.setBit(17, new bit(1));
        longword1_b.setBit(21, new bit(1)); longword1_b.setBit(22, new bit(1));
        longword1_b.setBit(25, new bit(1)); longword1_b.setBit(27, new bit(1));
        longword1_b.setBit(30, new bit(1)); longword1_b.setBit(31, new bit(1));
        String longword1_output = ALU.doOp(operation, longword1_a, longword1_b).toString();
        String expected_output1 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,1,0,1,1";
        System.out.println(
            "Longword a: " + longword1_a.toString() +
            "\nLongword b: " + longword1_b.toString() +
            "\nExpected Output: " + expected_output1 + 
            "\nTest Output: " + longword1_output);
        if(!longword1_output.equals(expected_output1)) throw new Exception("right shift failed");
        else System.out.println("right shift successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2_a = new longword(); longword2_a.set(0);
        longword2_a.setBit(2, new bit(1)); longword2_a.setBit(9, new bit(1));
        longword2_a.setBit(10, new bit(1)); longword2_a.setBit(11, new bit(1));
        longword2_a.setBit(12, new bit(1)); longword2_a.setBit(13, new bit(1));
        longword2_a.setBit(14, new bit(1)); longword2_a.setBit(15, new bit(1));
        longword2_a.setBit(16, new bit(1)); longword2_a.setBit(17, new bit(1));
        longword2_a.setBit(22, new bit(1)); longword2_a.setBit(23, new bit(1));
        longword2_a.setBit(25, new bit(1)); longword2_a.setBit(26, new bit(1));
        longword2_a.setBit(27, new bit(1));
        longword longword2_b = new longword(); longword2_b.set(0);
        longword2_b.setBit(0, new bit(1)); longword2_b.setBit(3, new bit(1));
        longword2_b.setBit(4, new bit(1)); longword2_b.setBit(6, new bit(1));
        longword2_b.setBit(10, new bit(1)); longword2_b.setBit(11, new bit(1));
        longword2_b.setBit(13, new bit(1)); longword2_b.setBit(17, new bit(1));
        longword2_b.setBit(18, new bit(1)); longword2_b.setBit(19, new bit(1));
        longword2_b.setBit(21, new bit(1)); longword2_b.setBit(24, new bit(1));
        longword2_b.setBit(25, new bit(1)); longword2_b.setBit(28, new bit(1));
        longword2_b.setBit(29, new bit(1));
        String longword2_output =ALU.doOp(operation, longword2_a, longword2_b).toString();
        String expected_output2 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0";
        System.out.println(
            "Longword a: " + longword2_a.toString() +
            "\nLongword b: " + longword2_b.toString() +
            "\nExpected Output: " + expected_output2 + 
            "\nTest Output: " + longword2_output);
        if(!longword2_output.equals(expected_output2)) throw new Exception("right shift failed");
        else System.out.println("right shift successed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3_a = new longword(); longword3_a.set(0);
        longword3_a.setBit(0, new bit(1)); longword3_a.setBit(1, new bit(1));
        longword3_a.setBit(3, new bit(1)); longword3_a.setBit(7, new bit(1));
        longword3_a.setBit(8, new bit(1)); longword3_a.setBit(11, new bit(1));
        longword3_a.setBit(12, new bit(1)); longword3_a.setBit(17, new bit(1));
        longword3_a.setBit(24, new bit(1)); longword3_a.setBit(25, new bit(1));
        longword3_a.setBit(26, new bit(1)); longword3_a.setBit(27, new bit(1));
        longword longword3_b = new longword(); longword3_b.set(0);
        longword3_b.setBit(2, new bit(1)); longword3_b.setBit(4, new bit(1));
        longword3_b.setBit(5, new bit(1)); longword3_b.setBit(8, new bit(1));
        longword3_b.setBit(9, new bit(1)); longword3_b.setBit(16, new bit(1));
        longword3_b.setBit(17, new bit(1)); longword3_b.setBit(21, new bit(1));
        longword3_b.setBit(27, new bit(1)); longword3_b.setBit(29, new bit(1));
        String longword3_output =ALU.doOp(operation, longword3_a, longword3_b).toString();
        String expected_output3 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,1,1,0,0,1";
        System.out.println(
            "Longword a: " + longword3_a.toString() +
            "\nLongword b: " + longword3_b.toString() +
            "\nExpected Output: " + expected_output3 + 
            "\nTest Output: " + longword3_output);
        if(!longword3_output.equals(expected_output3)) throw new Exception("right shift failed");
        else System.out.println("right shift successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4_a = new longword(); longword4_a.set(0);
        longword4_a.setBit(1, new bit(1)); longword4_a.setBit(2, new bit(1));
        longword4_a.setBit(3, new bit(1)); longword4_a.setBit(4, new bit(1));
        longword4_a.setBit(5, new bit(1)); longword4_a.setBit(7, new bit(1));
        longword4_a.setBit(9, new bit(1)); longword4_a.setBit(10, new bit(1));
        longword4_a.setBit(11, new bit(1)); longword4_a.setBit(12, new bit(1));
        longword4_a.setBit(16, new bit(1)); longword4_a.setBit(17, new bit(1));
        longword4_a.setBit(18, new bit(1)); longword4_a.setBit(20, new bit(1));
        longword4_a.setBit(21, new bit(1)); longword4_a.setBit(22, new bit(1));
        longword4_a.setBit(24, new bit(1)); longword4_a.setBit(25, new bit(1));
        longword4_a.setBit(26, new bit(1)); longword4_a.setBit(29, new bit(1));
        longword4_a.setBit(30, new bit(1));
        longword longword4_b = new longword(); longword4_b.set(0);
        longword4_b.setBit(1, new bit(1)); longword4_b.setBit(3, new bit(1));
        longword4_b.setBit(4, new bit(1)); longword4_b.setBit(6, new bit(1));
        longword4_b.setBit(7, new bit(1)); longword4_b.setBit(8, new bit(1));
        longword4_b.setBit(11, new bit(1)); longword4_b.setBit(17, new bit(1));
        longword4_b.setBit(22, new bit(1)); longword4_b.setBit(23, new bit(1));
        longword4_b.setBit(24, new bit(1)); longword4_b.setBit(26, new bit(1));
        longword4_b.setBit(28, new bit(1)); longword4_b.setBit(29, new bit(1));
        String longword4_output =ALU.doOp(operation, longword4_a, longword4_b).toString();
        String expected_output4 = "0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,1,1,1,0,0,0,1,1,1,0";
        System.out.println(
            "Longword a: " + longword4_a.toString() +
            "\nLongword b: " + longword4_b.toString() +
            "\nExpected Output: " + expected_output4 + 
            "\nTest Output: " + longword4_output);
        if(!longword4_output.equals(expected_output4)) throw new Exception("right shift failed");
        else System.out.println("right shift successed");
        System.out.println("==== CASE 4 END ====\n");
        
        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5_a = new longword(); longword5_a.set(0);
        longword5_a.setBit(1, new bit(1)); longword5_a.setBit(4, new bit(1));
        longword5_a.setBit(5, new bit(1)); longword5_a.setBit(6, new bit(1));
        longword5_a.setBit(8, new bit(1)); longword5_a.setBit(11, new bit(1));
        longword5_a.setBit(12, new bit(1)); longword5_a.setBit(13, new bit(1));
        longword5_a.setBit(14, new bit(1)); longword5_a.setBit(15, new bit(1));
        longword5_a.setBit(18, new bit(1)); longword5_a.setBit(21, new bit(1));
        longword5_a.setBit(22, new bit(1)); longword5_a.setBit(28, new bit(1));
        longword5_a.setBit(29, new bit(1)); longword5_a.setBit(30, new bit(1));
        longword5_a.setBit(31, new bit(1));
        longword longword5_b = new longword(); longword5_b.set(0);
        longword5_b.setBit(2, new bit(1)); longword5_b.setBit(3, new bit(1));
        longword5_b.setBit(4, new bit(1)); longword5_b.setBit(8, new bit(1));
        longword5_b.setBit(9, new bit(1)); longword5_b.setBit(10, new bit(1));
        longword5_b.setBit(11, new bit(1)); longword5_b.setBit(13, new bit(1));
        longword5_b.setBit(17, new bit(1)); longword5_b.setBit(18, new bit(1));
        longword5_b.setBit(22, new bit(1)); longword5_b.setBit(23, new bit(1));
        longword5_b.setBit(25, new bit(1)); longword5_b.setBit(26, new bit(1));
        longword5_b.setBit(27, new bit(1)); longword5_b.setBit(28, new bit(1));
        longword5_b.setBit(30, new bit(1));
        String longword5_output =ALU.doOp(operation, longword5_a, longword5_b).toString();
        String expected_output5 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1";
        System.out.println(
            "Longword a: " + longword5_a.toString() +
            "\nLongword b: " + longword5_b.toString() +
            "\nExpected Output: " + expected_output5 + 
            "\nTest Output: " + longword5_output);
        if(!longword5_output.equals(expected_output5)) throw new Exception("right shift failed");
        else System.out.println("right shift successed");
        System.out.println("==== CASE 5 END ====\n");
        
        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6_a = new longword(); longword6_a.set(0);
        longword6_a.setBit(0, new bit(1)); longword6_a.setBit(4, new bit(1));
        longword6_a.setBit(5, new bit(1)); longword6_a.setBit(6, new bit(1));
        longword6_a.setBit(7, new bit(1)); longword6_a.setBit(8, new bit(1));
        longword6_a.setBit(11, new bit(1)); longword6_a.setBit(13, new bit(1));
        longword6_a.setBit(14, new bit(1)); longword6_a.setBit(15, new bit(1));
        longword6_a.setBit(16, new bit(1)); longword6_a.setBit(18, new bit(1));
        longword6_a.setBit(19, new bit(1)); longword6_a.setBit(21, new bit(1));
        longword6_a.setBit(22, new bit(1)); longword6_a.setBit(23, new bit(1));
        longword6_a.setBit(27, new bit(1)); longword6_a.setBit(28, new bit(1));
        longword6_a.setBit(29, new bit(1));
        longword longword6_b = new longword(); longword6_b.set(0);
        longword6_b.setBit(0, new bit(1)); longword6_b.setBit(1, new bit(1));
        longword6_b.setBit(3, new bit(1)); longword6_b.setBit(4, new bit(1));
        longword6_b.setBit(5, new bit(1)); longword6_b.setBit(6, new bit(1));
        longword6_b.setBit(8, new bit(1)); longword6_b.setBit(10, new bit(1));
        longword6_b.setBit(11, new bit(1)); longword6_b.setBit(12, new bit(1));
        longword6_b.setBit(19, new bit(1)); longword6_b.setBit(23, new bit(1));
        longword6_b.setBit(25, new bit(1)); longword6_b.setBit(27, new bit(1));
        longword6_b.setBit(28, new bit(1)); longword6_b.setBit(31, new bit(1));
        String longword6_output =ALU.doOp(operation, longword6_a, longword6_b).toString();
        String expected_output6 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,1,1";
        System.out.println(
            "Longword a: " + longword6_a.toString() +
            "\nLongword b: " + longword6_b.toString() +
            "\nExpected Output: " + expected_output6 + 
            "\nTest Output: " + longword6_output);
        if(!longword6_output.equals(expected_output6)) throw new Exception("right shift failed");
        else System.out.println("right shift successed");
        System.out.println("==== CASE 6 END ====\n");

        // case 7
        System.out.println("==== CASE 7 START ====");
        longword longword7_a = new longword(); longword7_a.set(0);
        longword7_a.setBit(0, new bit(1)); longword7_a.setBit(1, new bit(1));
        longword7_a.setBit(5, new bit(1)); longword7_a.setBit(6, new bit(1));
        longword7_a.setBit(7, new bit(1)); longword7_a.setBit(8, new bit(1));
        longword7_a.setBit(11, new bit(1)); longword7_a.setBit(13, new bit(1));
        longword7_a.setBit(15, new bit(1)); longword7_a.setBit(16, new bit(1));
        longword7_a.setBit(18, new bit(1)); longword7_a.setBit(20, new bit(1));
        longword7_a.setBit(21, new bit(1)); longword7_a.setBit(22, new bit(1));
        longword7_a.setBit(24, new bit(1)); longword7_a.setBit(25, new bit(1));
        longword7_a.setBit(28, new bit(1)); longword7_a.setBit(29, new bit(1));
        longword7_a.setBit(30, new bit(1));
        longword longword7_b = new longword(); longword7_b.set(0);
        longword7_b.setBit(0, new bit(1)); longword7_b.setBit(2, new bit(1));
        longword7_b.setBit(3, new bit(1)); longword7_b.setBit(8, new bit(1));
        longword7_b.setBit(10, new bit(1)); longword7_b.setBit(11, new bit(1));
        longword7_b.setBit(14, new bit(1)); longword7_b.setBit(16, new bit(1));
        longword7_b.setBit(20, new bit(1)); longword7_b.setBit(23, new bit(1));
        longword7_b.setBit(24, new bit(1)); longword7_b.setBit(25, new bit(1));
        longword7_b.setBit(27, new bit(1)); longword7_b.setBit(30, new bit(1));
        longword7_b.setBit(31, new bit(1));
        String longword7_output =ALU.doOp(operation, longword7_a, longword7_b).toString();
        String expected_output7 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,1,1,1,1,0,0,1,0";
        System.out.println(
            "Longword a: " + longword7_a.toString() +
            "\nLongword b: " + longword7_b.toString() +
            "\nExpected Output: " + expected_output7 + 
            "\nTest Output: " + longword7_output);
        if(!longword7_output.equals(expected_output7)) throw new Exception("right shift failed");
        else System.out.println("right shift successed");
        System.out.println("==== CASE 7 END ====\n");

        // case 8
        System.out.println("==== CASE 8 START ====");
        longword longword8_a = new longword(); longword8_a.set(0);
        longword8_a.setBit(0, new bit(1)); longword8_a.setBit(5, new bit(1));
        longword8_a.setBit(6, new bit(1)); longword8_a.setBit(8, new bit(1));
        longword8_a.setBit(12, new bit(1)); longword8_a.setBit(13, new bit(1));
        longword8_a.setBit(16, new bit(1)); longword8_a.setBit(18, new bit(1));
        longword8_a.setBit(19, new bit(1)); longword8_a.setBit(20, new bit(1));
        longword8_a.setBit(21, new bit(1)); longword8_a.setBit(22, new bit(1));
        longword8_a.setBit(23, new bit(1)); longword8_a.setBit(25, new bit(1));
        longword8_a.setBit(26, new bit(1));
        longword longword8_b = new longword(); longword8_b.set(0);
        longword8_b.setBit(0, new bit(1)); longword8_b.setBit(3, new bit(1));
        longword8_b.setBit(4, new bit(1)); longword8_b.setBit(8, new bit(1));
        longword8_b.setBit(9, new bit(1)); longword8_b.setBit(10, new bit(1));
        longword8_b.setBit(12, new bit(1)); longword8_b.setBit(13, new bit(1));
        longword8_b.setBit(14, new bit(1)); longword8_b.setBit(15, new bit(1));
        longword8_b.setBit(18, new bit(1)); longword8_b.setBit(19, new bit(1));
        longword8_b.setBit(27, new bit(1)); longword8_b.setBit(30, new bit(1));
        longword8_b.setBit(31, new bit(1));
        String longword8_output =ALU.doOp(operation, longword8_a, longword8_b).toString();
        String expected_output8 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,0,1,0,0,0,1";
        System.out.println(
            "Longword a: " + longword8_a.toString() +
            "\nLongword b: " + longword8_b.toString() +
            "\nExpected Output: " + expected_output8 + 
            "\nTest Output: " + longword8_output);
        if(!longword8_output.equals(expected_output8)) throw new Exception("right shift failed");
        else System.out.println("right shift successed");
        System.out.println("==== CASE 8 END ====\n");

        // case 9
        System.out.println("==== CASE 9 START ====");
        longword longword9_a = new longword(); longword9_a.set(0);
        longword9_a.setBit(0, new bit(1)); longword9_a.setBit(1, new bit(1));
        longword9_a.setBit(4, new bit(1)); longword9_a.setBit(5, new bit(1));
        longword9_a.setBit(6, new bit(1)); longword9_a.setBit(12, new bit(1));
        longword9_a.setBit(19, new bit(1)); longword9_a.setBit(20, new bit(1));
        longword9_a.setBit(22, new bit(1)); longword9_a.setBit(23, new bit(1));
        longword9_a.setBit(24, new bit(1)); longword9_a.setBit(27, new bit(1));
        longword9_a.setBit(28, new bit(1)); longword9_a.setBit(30, new bit(1));
        longword9_a.setBit(31, new bit(1));
        longword longword9_b = new longword(); longword9_b.set(0);
        longword9_b.setBit(4, new bit(1)); longword9_b.setBit(5, new bit(1));
        longword9_b.setBit(6, new bit(1)); longword9_b.setBit(11, new bit(1));
        longword9_b.setBit(12, new bit(1)); longword9_b.setBit(16, new bit(1));
        longword9_b.setBit(19, new bit(1)); longword9_b.setBit(20, new bit(1));
        longword9_b.setBit(21, new bit(1)); longword9_b.setBit(25, new bit(1));
        longword9_b.setBit(30, new bit(1));
        String longword9_output =ALU.doOp(operation, longword9_a, longword9_b).toString();
        String expected_output9 = "0,0,1,1,0,0,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,1,1,0,1,1,1,0,0,1,1,0";
        System.out.println(
            "Longword a: " + longword9_a.toString() +
            "\nLongword b: " + longword9_b.toString() +
            "\nExpected Output: " + expected_output9 + 
            "\nTest Output: " + longword9_output);
        if(!longword9_output.equals(expected_output9)) throw new Exception("right shift failed");
        else System.out.println("right shift successed");
        System.out.println("==== CASE 9 END ====\n");

        // case 10
        System.out.println("==== CASE 10 START ====");
        longword longword10_a = new longword(); longword10_a.set(0);
        longword10_a.setBit(0, new bit(1)); longword10_a.setBit(8, new bit(1));
        longword10_a.setBit(9, new bit(1)); longword10_a.setBit(16, new bit(1));
        longword10_a.setBit(17, new bit(1)); longword10_a.setBit(18, new bit(1));
        longword10_a.setBit(21, new bit(1)); longword10_a.setBit(24, new bit(1));
        longword10_a.setBit(25, new bit(1)); longword10_a.setBit(28, new bit(1));
        longword10_a.setBit(29, new bit(1));
        longword longword10_b = new longword(); longword10_b.set(0);
        longword10_b.setBit(1, new bit(1)); longword10_b.setBit(2, new bit(1));
        longword10_b.setBit(3, new bit(1)); longword10_b.setBit(4, new bit(1));
        longword10_b.setBit(6, new bit(1)); longword10_b.setBit(7, new bit(1));
        longword10_b.setBit(8, new bit(1)); longword10_b.setBit(9, new bit(1));
        longword10_b.setBit(11, new bit(1)); longword10_b.setBit(13, new bit(1));
        longword10_b.setBit(14, new bit(1)); longword10_b.setBit(16, new bit(1));
        longword10_b.setBit(19, new bit(1)); longword10_b.setBit(22, new bit(1));
        longword10_b.setBit(23, new bit(1)); longword10_b.setBit(24, new bit(1));
        longword10_b.setBit(25, new bit(1));
        String longword10_output = ALU.doOp(operation, longword10_a, longword10_b).toString();
        String expected_output10 = "1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,1,0,0,1,0,0,1,1,0,0,1,1,0,0";
        System.out.println(
            "Longword a: " + longword10_a.toString() +
            "\nLongword b: " + longword10_b.toString() +
            "\nExpected Output: " + expected_output10 + 
            "\nTest Output: " + longword10_output);
        if(!longword10_output.equals(expected_output10)) throw new Exception("right shift failed");
        else System.out.println("right shift successed");
        System.out.println("==== CASE 10 END ====\n");
        
        System.out.println("~~~~ TEST \"1101\" END ~~~~\n");
    }

    private static void test1110() throws Exception{ // test method for "add"
        System.out.println("~~~~ TEST \"1110\" START ~~~~\n");
        
        // bit operation
        bit[] operation = new bit[4];
        operation[0] = new bit(1);
        operation[1] = new bit(1);
        operation[2] = new bit(1);
        operation[3] = new bit(0);

        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_a = new longword(); longword1_a.set(0);
        longword1_a.setBit(3, new bit(1)); longword1_a.setBit(6, new bit(1));
        longword1_a.setBit(8, new bit(1)); longword1_a.setBit(9, new bit(1));
        longword1_a.setBit(11, new bit(1)); longword1_a.setBit(14, new bit(1));
        longword1_a.setBit(19, new bit(1)); longword1_a.setBit(22, new bit(1));
        longword1_a.setBit(23, new bit(1)); longword1_a.setBit(24, new bit(1));
        longword1_a.setBit(27, new bit(1)); longword1_a.setBit(28, new bit(1));
        longword1_a.setBit(29, new bit(1)); longword1_a.setBit(31, new bit(1));
        longword longword1_b = new longword(); longword1_b.set(0);
        longword1_b.setBit(0, new bit(1)); longword1_b.setBit(2, new bit(1));
        longword1_b.setBit(7, new bit(1)); longword1_b.setBit(10, new bit(1));
        longword1_b.setBit(11, new bit(1)); longword1_b.setBit(12, new bit(1));
        longword1_b.setBit(14, new bit(1)); longword1_b.setBit(15, new bit(1));
        longword1_b.setBit(17, new bit(1)); longword1_b.setBit(20, new bit(1));
        longword1_b.setBit(21, new bit(1)); longword1_b.setBit(23, new bit(1));
        longword1_b.setBit(28, new bit(1)); longword1_b.setBit(30, new bit(1));
        String longword1_output = ALU.doOp(operation, longword1_a, longword1_b).toString();
        String expected_output1 = "1,0,1,1,0,1,0,0,0,0,0,0,1,1,0,1,0,1,1,0,0,0,0,0,1,0,1,0,0,1,1,1";
        System.out.println(
            "Longword a: " + longword1_a.toString() +
            "\nLongword b: " + longword1_b.toString() +
            "\nExpected Output: " + expected_output1 + 
            "\nTest Output: " + longword1_output);
        if(!longword1_output.equals(expected_output1)) throw new Exception("add failed");
        else System.out.println("add successed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2_a = new longword(); longword2_a.set(0);
        longword2_a.setBit(0, new bit(1)); longword2_a.setBit(3, new bit(1));
        longword2_a.setBit(5, new bit(1)); longword2_a.setBit(7, new bit(1));
        longword2_a.setBit(9, new bit(1)); longword2_a.setBit(11, new bit(1));
        longword2_a.setBit(13, new bit(1)); longword2_a.setBit(17, new bit(1));
        longword2_a.setBit(19, new bit(1)); longword2_a.setBit(21, new bit(1));
        longword2_a.setBit(28, new bit(1)); longword2_a.setBit(30, new bit(1));
        longword2_a.setBit(31, new bit(1));
        longword longword2_b = new longword(); longword2_b.set(0);
        longword2_b.setBit(1, new bit(1)); longword2_b.setBit(3, new bit(1));
        longword2_b.setBit(4, new bit(1)); longword2_b.setBit(9, new bit(1));
        longword2_b.setBit(10, new bit(1)); longword2_b.setBit(11, new bit(1));
        longword2_b.setBit(12, new bit(1)); longword2_b.setBit(22, new bit(1));
        longword2_b.setBit(24, new bit(1)); longword2_b.setBit(26, new bit(1));
        longword2_b.setBit(27, new bit(1)); longword2_b.setBit(29, new bit(1));
        longword2_b.setBit(30, new bit(1));
        String longword2_output = ALU.doOp(operation, longword2_a, longword2_b).toString();
        String expected_output2 = "1,1,1,0,1,1,0,1,1,1,0,0,1,1,0,0,0,1,0,1,0,1,1,0,1,1,0,0,0,0,0,1";
        System.out.println(
            "Longword a: " + longword2_a.toString() +
            "\nLongword b: " + longword2_b.toString() +
            "\nExpected Output: " + expected_output2 + 
            "\nTest Output: " + longword2_output);
        if(!longword2_output.equals(expected_output2)) throw new Exception("add failed");
        else System.out.println("add successed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3_a = new longword(); longword3_a.set(0);
        longword3_a.setBit(0, new bit(1)); longword3_a.setBit(1, new bit(1));
        longword3_a.setBit(2, new bit(1)); longword3_a.setBit(3, new bit(1));
        longword3_a.setBit(4, new bit(1)); longword3_a.setBit(10, new bit(1));
        longword3_a.setBit(13, new bit(1)); longword3_a.setBit(14, new bit(1));
        longword3_a.setBit(16, new bit(1)); longword3_a.setBit(21, new bit(1));
        longword3_a.setBit(23, new bit(1)); longword3_a.setBit(25, new bit(1));
        longword3_a.setBit(28, new bit(1)); longword3_a.setBit(31, new bit(1));
        longword longword3_b = new longword(); longword3_b.set(0);
        longword3_b.setBit(0, new bit(1)); longword3_b.setBit(1, new bit(1));
        longword3_b.setBit(2, new bit(1)); longword3_b.setBit(3, new bit(1));
        longword3_b.setBit(6, new bit(1)); longword3_b.setBit(7, new bit(1));
        longword3_b.setBit(10, new bit(1)); longword3_b.setBit(11, new bit(1));
        longword3_b.setBit(12, new bit(1)); longword3_b.setBit(13, new bit(1));
        longword3_b.setBit(14, new bit(1)); longword3_b.setBit(15, new bit(1));
        longword3_b.setBit(16, new bit(1)); longword3_b.setBit(20, new bit(1));
        longword3_b.setBit(22, new bit(1)); longword3_b.setBit(23, new bit(1));
        longword3_b.setBit(24, new bit(1)); longword3_b.setBit(28, new bit(1));
        longword3_b.setBit(31, new bit(1));
        String longword3_output = ALU.doOp(operation, longword3_a, longword3_b).toString();
        String expected_output3 = "1,1,1,0,1,0,1,1,0,1,1,0,0,1,1,0,0,0,0,1,0,0,0,0,1,1,0,1,0,0,1,0";
        System.out.println(
            "Longword a: " + longword3_a.toString() +
            "\nLongword b: " + longword3_b.toString() +
            "\nExpected Output: " + expected_output3 + 
            "\nTest Output: " + longword3_output);
        if(!longword3_output.equals(expected_output3)) throw new Exception("add failed");
        else System.out.println("add successed");
        System.out.println("==== CASE 3 END ====\n");
        
        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4_a = new longword(); longword4_a.set(0);
        longword4_a.setBit(3, new bit(1)); longword4_a.setBit(5, new bit(1));
        longword4_a.setBit(6, new bit(1)); longword4_a.setBit(8, new bit(1));
        longword4_a.setBit(11, new bit(1)); longword4_a.setBit(13, new bit(1));
        longword4_a.setBit(14, new bit(1)); longword4_a.setBit(16, new bit(1));
        longword4_a.setBit(18, new bit(1)); longword4_a.setBit(20, new bit(1));
        longword4_a.setBit(22, new bit(1)); longword4_a.setBit(23, new bit(1));
        longword4_a.setBit(24, new bit(1)); longword4_a.setBit(25, new bit(1));
        longword4_a.setBit(26, new bit(1)); longword4_a.setBit(27, new bit(1));
        longword4_a.setBit(30, new bit(1)); longword4_a.setBit(31, new bit(1));
        longword longword4_b = new longword(); longword4_b.set(0);
        longword4_b.setBit(2, new bit(1)); longword4_b.setBit(4, new bit(1));
        longword4_b.setBit(5, new bit(1)); longword4_b.setBit(8, new bit(1));
        longword4_b.setBit(10, new bit(1)); longword4_b.setBit(12, new bit(1));
        longword4_b.setBit(13, new bit(1)); longword4_b.setBit(16, new bit(1));
        longword4_b.setBit(18, new bit(1)); longword4_b.setBit(22, new bit(1));
        longword4_b.setBit(27, new bit(1));
        String longword4_output = ALU.doOp(operation, longword4_a, longword4_b).toString();
        String expected_output4 = "0,1,0,0,0,0,1,1,0,1,0,0,0,0,1,1,0,1,0,0,1,1,1,0,0,0,0,0,0,0,1,1";
        System.out.println(
            "Longword a: " + longword4_a.toString() +
            "\nLongword b: " + longword4_b.toString() +
            "\nExpected Output: " + expected_output4 + 
            "\nTest Output: " + longword4_output);
        if(!longword4_output.equals(expected_output4)) throw new Exception("add failed");
        else System.out.println("add successed");
        System.out.println("==== CASE 4 END ====\n");
        
        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5_a = new longword(); longword5_a.set(0);
        longword5_a.setBit(0, new bit(1)); longword5_a.setBit(1, new bit(1));
        longword5_a.setBit(3, new bit(1)); longword5_a.setBit(4, new bit(1));
        longword5_a.setBit(7, new bit(1)); longword5_a.setBit(8, new bit(1));
        longword5_a.setBit(10, new bit(1)); longword5_a.setBit(11, new bit(1));
        longword5_a.setBit(13, new bit(1)); longword5_a.setBit(14, new bit(1));
        longword5_a.setBit(17, new bit(1)); longword5_a.setBit(20, new bit(1));
        longword5_a.setBit(24, new bit(1)); longword5_a.setBit(26, new bit(1));
        longword5_a.setBit(28, new bit(1)); longword5_a.setBit(31, new bit(1));
        longword longword5_b = new longword(); longword5_b.set(0);
        longword5_b.setBit(0, new bit(1)); longword5_b.setBit(1, new bit(1));
        longword5_b.setBit(3, new bit(1)); longword5_b.setBit(5, new bit(1));
        longword5_b.setBit(7, new bit(1)); longword5_b.setBit(10, new bit(1));
        longword5_b.setBit(12, new bit(1)); longword5_b.setBit(13, new bit(1));
        longword5_b.setBit(15, new bit(1)); longword5_b.setBit(19, new bit(1));
        longword5_b.setBit(20, new bit(1)); longword5_b.setBit(23, new bit(1));
        longword5_b.setBit(24, new bit(1)); longword5_b.setBit(25, new bit(1));
        longword5_b.setBit(26, new bit(1)); longword5_b.setBit(30, new bit(1));
        longword5_b.setBit(31, new bit(1));
        String longword5_output = ALU.doOp(operation, longword5_a, longword5_b).toString();
        String expected_output5 = "1,0,1,0,1,1,1,0,1,1,1,0,0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,0,1,1,0,0";
        System.out.println(
            "Longword a: " + longword5_a.toString() +
            "\nLongword b: " + longword5_b.toString() +
            "\nExpected Output: " + expected_output5 + 
            "\nTest Output: " + longword5_output);
        if(!longword5_output.equals(expected_output5)) throw new Exception("add failed");
        else System.out.println("add successed");
        System.out.println("==== CASE 5 END ====\n");

        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6_a = new longword(); longword6_a.set(0);
        longword6_a.setBit(0, new bit(1)); longword6_a.setBit(2, new bit(1));
        longword6_a.setBit(3, new bit(1)); longword6_a.setBit(4, new bit(1));
        longword6_a.setBit(10, new bit(1)); longword6_a.setBit(11, new bit(1));
        longword6_a.setBit(12, new bit(1)); longword6_a.setBit(13, new bit(1));
        longword6_a.setBit(17, new bit(1)); longword6_a.setBit(18, new bit(1));
        longword6_a.setBit(22, new bit(1)); longword6_a.setBit(24, new bit(1));
        longword6_a.setBit(25, new bit(1)); longword6_a.setBit(26, new bit(1));
        longword6_a.setBit(27, new bit(1)); longword6_a.setBit(28, new bit(1));
        longword longword6_b = new longword(); longword6_b.set(0);
        longword6_b.setBit(0, new bit(1)); longword6_b.setBit(2, new bit(1));
        longword6_b.setBit(11, new bit(1)); longword6_b.setBit(16, new bit(1));
        longword6_b.setBit(17, new bit(1)); longword6_b.setBit(18, new bit(1));
        longword6_b.setBit(19, new bit(1)); longword6_b.setBit(23, new bit(1));
        longword6_b.setBit(25, new bit(1)); longword6_b.setBit(26, new bit(1));
        longword6_b.setBit(27, new bit(1)); longword6_b.setBit(30, new bit(1));
        longword6_b.setBit(31, new bit(1));
        String longword6_output = ALU.doOp(operation, longword6_a, longword6_b).toString();
        String expected_output6 = "0,1,0,1,1,0,0,0,0,1,0,0,1,1,0,1,0,1,0,1,0,1,0,0,0,1,1,0,1,0,1,1";
        System.out.println(
            "Longword a: " + longword6_a.toString() +
            "\nLongword b: " + longword6_b.toString() +
            "\nExpected Output: " + expected_output6 + 
            "\nTest Output: " + longword6_output);
        if(!longword6_output.equals(expected_output6)) throw new Exception("add failed");
        else System.out.println("add successed");
        System.out.println("==== CASE 6 END ====\n");

        // case 7
        System.out.println("==== CASE 7 START ====");
        longword longword7_a = new longword(); longword7_a.set(0);
        longword7_a.setBit(3, new bit(1)); longword7_a.setBit(4, new bit(1));
        longword7_a.setBit(6, new bit(1)); longword7_a.setBit(7, new bit(1));
        longword7_a.setBit(9, new bit(1)); longword7_a.setBit(10, new bit(1));
        longword7_a.setBit(13, new bit(1)); longword7_a.setBit(14, new bit(1));
        longword7_a.setBit(15, new bit(1)); longword7_a.setBit(16, new bit(1));
        longword7_a.setBit(18, new bit(1)); longword7_a.setBit(20, new bit(1));
        longword7_a.setBit(21, new bit(1)); longword7_a.setBit(25, new bit(1));
        longword7_a.setBit(28, new bit(1)); longword7_a.setBit(31, new bit(1));
        longword longword7_b = new longword(); longword7_b.set(0);
        longword7_b.setBit(1, new bit(1)); longword7_b.setBit(3, new bit(1));
        longword7_b.setBit(4, new bit(1)); longword7_b.setBit(6, new bit(1));
        longword7_b.setBit(7, new bit(1)); longword7_b.setBit(8, new bit(1));
        longword7_b.setBit(9, new bit(1)); longword7_b.setBit(18, new bit(1));
        longword7_b.setBit(19, new bit(1)); longword7_b.setBit(21, new bit(1));
        longword7_b.setBit(22, new bit(1)); longword7_b.setBit(26, new bit(1));
        longword7_b.setBit(27, new bit(1)); longword7_b.setBit(28, new bit(1));
        longword7_b.setBit(31, new bit(1));
        String longword7_output = ALU.doOp(operation, longword7_a, longword7_b).toString();
        String expected_output7 = "0,1,1,1,0,1,1,1,0,0,1,0,0,1,1,1,1,1,1,0,0,0,1,0,1,0,0,0,0,0,1,0";
        System.out.println(
            "Longword a: " + longword7_a.toString() +
            "\nLongword b: " + longword7_b.toString() +
            "\nExpected Output: " + expected_output7 + 
            "\nTest Output: " + longword7_output);
        if(!longword7_output.equals(expected_output7)) throw new Exception("add failed");
        else System.out.println("add successed");
        System.out.println("==== CASE 7 END ====\n");

        // case 8
        System.out.println("==== CASE 8 START ====");
        longword longword8_a = new longword(); longword8_a.set(0);
        longword8_a.setBit(1, new bit(1)); longword8_a.setBit(3, new bit(1));
        longword8_a.setBit(4, new bit(1)); longword8_a.setBit(11, new bit(1));
        longword8_a.setBit(12, new bit(1)); longword8_a.setBit(13, new bit(1));
        longword8_a.setBit(16, new bit(1)); longword8_a.setBit(17, new bit(1));
        longword8_a.setBit(18, new bit(1)); longword8_a.setBit(20, new bit(1));
        longword8_a.setBit(21, new bit(1)); longword8_a.setBit(22, new bit(1));
        longword8_a.setBit(23, new bit(1)); longword8_a.setBit(24, new bit(1));
        longword8_a.setBit(26, new bit(1)); longword8_a.setBit(27, new bit(1));
        longword8_a.setBit(31, new bit(1));
        longword longword8_b = new longword(); longword8_b.set(0);
        longword8_b.setBit(4, new bit(1)); longword8_b.setBit(6, new bit(1));
        longword8_b.setBit(7, new bit(1)); longword8_b.setBit(10, new bit(1));
        longword8_b.setBit(12, new bit(1)); longword8_b.setBit(17, new bit(1));
        longword8_b.setBit(20, new bit(1)); longword8_b.setBit(21, new bit(1));
        longword8_b.setBit(22, new bit(1)); longword8_b.setBit(26, new bit(1));
        longword8_b.setBit(28, new bit(1)); longword8_b.setBit(30, new bit(1));
        String longword8_output = ALU.doOp(operation, longword8_a, longword8_b).toString();
        String expected_output8 = "0,1,1,0,0,0,1,1,0,1,0,0,0,1,0,1,0,0,1,1,1,1,0,1,1,1,0,1,1,0,1,1";
        System.out.println(
            "Longword a: " + longword8_a.toString() +
            "\nLongword b: " + longword8_b.toString() +
            "\nExpected Output: " + expected_output8 + 
            "\nTest Output: " + longword8_output);
        if(!longword8_output.equals(expected_output8)) throw new Exception("add failed");
        else System.out.println("add successed");
        System.out.println("==== CASE 8 END ====\n");

        // case 9
        System.out.println("==== CASE 9 START ====");
        longword longword9_a = new longword(); longword9_a.set(0);
        longword9_a.setBit(0, new bit(1)); longword9_a.setBit(1, new bit(1));
        longword9_a.setBit(2, new bit(1)); longword9_a.setBit(6, new bit(1));
        longword9_a.setBit(10, new bit(1)); longword9_a.setBit(12, new bit(1));
        longword9_a.setBit(14, new bit(1)); longword9_a.setBit(16, new bit(1));
        longword9_a.setBit(17, new bit(1)); longword9_a.setBit(18, new bit(1));
        longword9_a.setBit(19, new bit(1)); longword9_a.setBit(22, new bit(1));
        longword9_a.setBit(23, new bit(1)); longword9_a.setBit(24, new bit(1));
        longword9_a.setBit(25, new bit(1)); longword9_a.setBit(26, new bit(1));
        longword9_a.setBit(27, new bit(1)); longword9_a.setBit(28, new bit(1));
        longword9_a.setBit(30, new bit(1)); longword9_a.setBit(31, new bit(1));
        longword longword9_b = new longword(); longword9_b.set(0);
        longword9_b.setBit(0, new bit(1)); longword9_b.setBit(1, new bit(1));
        longword9_b.setBit(3, new bit(1)); longword9_b.setBit(6, new bit(1));
        longword9_b.setBit(7, new bit(1)); longword9_b.setBit(9, new bit(1));
        longword9_b.setBit(12, new bit(1)); longword9_b.setBit(13, new bit(1));
        longword9_b.setBit(14, new bit(1)); longword9_b.setBit(17, new bit(1));
        longword9_b.setBit(18, new bit(1)); longword9_b.setBit(21, new bit(1));
        longword9_b.setBit(23, new bit(1)); longword9_b.setBit(24, new bit(1));
        longword9_b.setBit(28, new bit(1)); longword9_b.setBit(30, new bit(1));
        String longword9_output = ALU.doOp(operation, longword9_a, longword9_b).toString();
        String expected_output9 = "1,0,1,1,0,1,0,1,0,1,1,1,1,0,0,1,0,1,0,1,1,0,0,1,1,0,0,0,0,1,0,1";
        System.out.println(
            "Longword a: " + longword9_a.toString() +
            "\nLongword b: " + longword9_b.toString() +
            "\nExpected Output: " + expected_output9 + 
            "\nTest Output: " + longword9_output);
        if(!longword9_output.equals(expected_output9)) throw new Exception("add failed");
        else System.out.println("add successed");
        System.out.println("==== CASE 9 END ====\n");

        // case 10
        System.out.println("==== CASE 10 START ====");
        longword longword10_a = new longword(); longword10_a.set(0);
        longword10_a.setBit(1, new bit(1)); longword10_a.setBit(2, new bit(1));
        longword10_a.setBit(4, new bit(1)); longword10_a.setBit(5, new bit(1));
        longword10_a.setBit(6, new bit(1)); longword10_a.setBit(9, new bit(1));
        longword10_a.setBit(10, new bit(1)); longword10_a.setBit(12, new bit(1));
        longword10_a.setBit(14, new bit(1)); longword10_a.setBit(15, new bit(1));
        longword10_a.setBit(19, new bit(1)); longword10_a.setBit(21, new bit(1));
        longword10_a.setBit(22, new bit(1)); longword10_a.setBit(23, new bit(1));
        longword10_a.setBit(25, new bit(1)); longword10_a.setBit(27, new bit(1));
        longword10_a.setBit(29, new bit(1));
        longword longword10_b = new longword(); longword10_b.set(0);
        longword10_b.setBit(0, new bit(1)); longword10_b.setBit(1, new bit(1));
        longword10_b.setBit(3, new bit(1)); longword10_b.setBit(5, new bit(1));
        longword10_b.setBit(6, new bit(1)); longword10_b.setBit(7, new bit(1));
        longword10_b.setBit(8, new bit(1)); longword10_b.setBit(9, new bit(1));
        longword10_b.setBit(10, new bit(1)); longword10_b.setBit(13, new bit(1));
        longword10_b.setBit(14, new bit(1)); longword10_b.setBit(15, new bit(1));
        longword10_b.setBit(16, new bit(1)); longword10_b.setBit(17, new bit(1));
        longword10_b.setBit(18, new bit(1)); longword10_b.setBit(19, new bit(1));
        longword10_b.setBit(24, new bit(1)); longword10_b.setBit(26, new bit(1));
        longword10_b.setBit(30, new bit(1));
        String longword10_output = ALU.doOp(operation, longword10_a, longword10_b).toString();
        String expected_output10 = "0,1,0,0,0,1,1,0,0,1,0,1,0,0,1,1,0,0,0,0,0,1,1,1,1,1,1,1,0,1,1,0";
        System.out.println(
            "Longword a: " + longword10_a.toString() +
            "\nLongword b: " + longword10_b.toString() +
            "\nExpected Output: " + expected_output10 + 
            "\nTest Output: " + longword10_output);
        if(!longword10_output.equals(expected_output10)) throw new Exception("add failed");
        else System.out.println("add successed");
        System.out.println("==== CASE 10 END ====\n");
        
        System.out.println("~~~~ TEST \"1110\" END ~~~~\n");
    }

    private static void test1111() throws Exception{ // test method for "subtract"
        System.out.println("~~~~ TEST \"1111\" START ~~~~\n");
        
        // bit operation
        bit[] operation = new bit[4];
        operation[0] = new bit(1);
        operation[1] = new bit(1);
        operation[2] = new bit(1);
        operation[3] = new bit(1);

        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_a = new longword(); longword1_a.set(0);
        longword1_a.setBit(0, new bit(1)); longword1_a.setBit(5, new bit(1));
        longword1_a.setBit(6, new bit(1)); longword1_a.setBit(10, new bit(1));
        longword1_a.setBit(11, new bit(1)); longword1_a.setBit(12, new bit(1));
        longword1_a.setBit(14, new bit(1)); longword1_a.setBit(18, new bit(1));
        longword1_a.setBit(19, new bit(1)); longword1_a.setBit(25, new bit(1));
        longword1_a.setBit(26, new bit(1)); longword1_a.setBit(28, new bit(1));
        longword1_a.setBit(29, new bit(1));
        longword longword1_b = new longword(); longword1_b.set(0);
        longword1_b.setBit(0, new bit(1)); longword1_b.setBit(1, new bit(1));
        longword1_b.setBit(6, new bit(1)); longword1_b.setBit(7, new bit(1));
        longword1_b.setBit(12, new bit(1)); longword1_b.setBit(14, new bit(1));
        longword1_b.setBit(16, new bit(1)); longword1_b.setBit(21, new bit(1));
        longword1_b.setBit(22, new bit(1)); longword1_b.setBit(24, new bit(1));
        longword1_b.setBit(27, new bit(1)); longword1_b.setBit(29, new bit(1));
        longword1_b.setBit(30, new bit(1));
        String longword1_output = ALU.doOp(operation, longword1_a, longword1_b).toString();
        String expected_output1 = "1,1,0,0,0,0,1,1,0,0,1,0,1,1,1,1,1,0,1,0,1,0,0,1,1,1,0,1,0,1,1,0";
        System.out.println(
            "Longword a: " + longword1_a.toString() +
            "\nLongword b: " + longword1_b.toString() +
            "\nExpected Output: " + expected_output1 + 
            "\nTest Output: " + longword1_output);
        if(!longword1_output.equals(expected_output1)) throw new Exception("subtract failed");
        else System.out.println("subtract successed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2_a = new longword(); longword2_a.set(0);
        longword2_a.setBit(2, new bit(1)); longword2_a.setBit(3, new bit(1));
        longword2_a.setBit(5, new bit(1)); longword2_a.setBit(8, new bit(1));
        longword2_a.setBit(9, new bit(1)); longword2_a.setBit(10, new bit(1));
        longword2_a.setBit(12, new bit(1)); longword2_a.setBit(13, new bit(1));
        longword2_a.setBit(14, new bit(1)); longword2_a.setBit(18, new bit(1));
        longword2_a.setBit(20, new bit(1)); longword2_a.setBit(24, new bit(1));
        longword2_a.setBit(26, new bit(1)); longword2_a.setBit(28, new bit(1));
        longword longword2_b = new longword(); longword2_b.set(0);
        longword2_b.setBit(0, new bit(1)); longword2_b.setBit(1, new bit(1));
        longword2_b.setBit(2, new bit(1)); longword2_b.setBit(3, new bit(1));
        longword2_b.setBit(7, new bit(1)); longword2_b.setBit(8, new bit(1));
        longword2_b.setBit(10, new bit(1)); longword2_b.setBit(11, new bit(1));
        longword2_b.setBit(13, new bit(1)); longword2_b.setBit(17, new bit(1));
        longword2_b.setBit(21, new bit(1)); longword2_b.setBit(22, new bit(1));
        longword2_b.setBit(25, new bit(1)); longword2_b.setBit(29, new bit(1));
        longword2_b.setBit(30, new bit(1)); longword2_b.setBit(31, new bit(1));
        String longword2_output = ALU.doOp(operation, longword2_a, longword2_b).toString();
        String expected_output2 = "0,1,0,0,0,0,1,1,0,0,1,1,1,0,0,1,1,1,1,0,0,0,1,0,0,1,1,0,0,0,0,1";
        System.out.println(
            "Longword a: " + longword2_a.toString() +
            "\nLongword b: " + longword2_b.toString() +
            "\nExpected Output: " + expected_output2 + 
            "\nTest Output: " + longword2_output);
        if(!longword2_output.equals(expected_output2)) throw new Exception("subtract failed");
        else System.out.println("subtract successed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3_a = new longword(); longword3_a.set(0);
        longword3_a.setBit(2, new bit(1)); longword3_a.setBit(3, new bit(1));
        longword3_a.setBit(4, new bit(1)); longword3_a.setBit(5, new bit(1));
        longword3_a.setBit(8, new bit(1)); longword3_a.setBit(12, new bit(1));
        longword3_a.setBit(15, new bit(1)); longword3_a.setBit(16, new bit(1));
        longword3_a.setBit(17, new bit(1)); longword3_a.setBit(19, new bit(1));
        longword3_a.setBit(22, new bit(1)); longword3_a.setBit(23, new bit(1));
        longword3_a.setBit(24, new bit(1)); longword3_a.setBit(25, new bit(1));
        longword3_a.setBit(27, new bit(1));
        longword longword3_b = new longword(); longword3_b.set(0);
        longword3_b.setBit(1, new bit(1)); longword3_b.setBit(2, new bit(1));
        longword3_b.setBit(4, new bit(1)); longword3_b.setBit(5, new bit(1));
        longword3_b.setBit(8, new bit(1)); longword3_b.setBit(9, new bit(1));
        longword3_b.setBit(14, new bit(1)); longword3_b.setBit(15, new bit(1));
        longword3_b.setBit(17, new bit(1)); longword3_b.setBit(20, new bit(1));
        longword3_b.setBit(27, new bit(1)); longword3_b.setBit(28, new bit(1));
        String longword3_output = ALU.doOp(operation, longword3_a, longword3_b).toString();
        String expected_output3 = "1,1,0,0,1,1,1,1,1,1,0,0,0,1,1,0,1,0,0,0,1,0,1,1,1,0,1,1,1,0,0,0";
        System.out.println(
            "Longword a: " + longword3_a.toString() +
            "\nLongword b: " + longword3_b.toString() +
            "\nExpected Output: " + expected_output3 + 
            "\nTest Output: " + longword3_output);
        if(!longword3_output.equals(expected_output3)) throw new Exception("subtract failed");
        else System.out.println("subtract successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4_a = new longword(); longword4_a.set(0);
        longword4_a.setBit(0, new bit(1)); longword4_a.setBit(2, new bit(1));
        longword4_a.setBit(3, new bit(1)); longword4_a.setBit(4, new bit(1));
        longword4_a.setBit(6, new bit(1)); longword4_a.setBit(7, new bit(1));
        longword4_a.setBit(8, new bit(1)); longword4_a.setBit(9, new bit(1));
        longword4_a.setBit(12, new bit(1)); longword4_a.setBit(14, new bit(1));
        longword4_a.setBit(17, new bit(1)); longword4_a.setBit(18, new bit(1));
        longword4_a.setBit(23, new bit(1)); longword4_a.setBit(25, new bit(1));
        longword4_a.setBit(28, new bit(1));
        longword longword4_b = new longword(); longword4_b.set(0);
        longword4_b.setBit(0, new bit(1)); longword4_b.setBit(1, new bit(1));
        longword4_b.setBit(2, new bit(1)); longword4_b.setBit(4, new bit(1));
        longword4_b.setBit(9, new bit(1)); longword4_b.setBit(14, new bit(1));
        longword4_b.setBit(16, new bit(1)); longword4_b.setBit(17, new bit(1));
        longword4_b.setBit(19, new bit(1)); longword4_b.setBit(30, new bit(1));
        String longword4_output = ALU.doOp(operation, longword4_a, longword4_b).toString();
        String expected_output4 = "1,1,0,1,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,1,0,0,0,1,0,1,0,0,0,1,1,0";
        System.out.println(
            "Longword a: " + longword4_a.toString() +
            "\nLongword b: " + longword4_b.toString() +
            "\nExpected Output: " + expected_output4 + 
            "\nTest Output: " + longword4_output);
        if(!longword4_output.equals(expected_output4)) throw new Exception("subtract failed");
        else System.out.println("subtract successed");
        System.out.println("==== CASE 4 END ====\n");
        
        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5_a = new longword(); longword5_a.set(0);
        longword5_a.setBit(0, new bit(1)); longword5_a.setBit(2, new bit(1));
        longword5_a.setBit(10, new bit(1)); longword5_a.setBit(11, new bit(1));
        longword5_a.setBit(13, new bit(1)); longword5_a.setBit(16, new bit(1));
        longword5_a.setBit(19, new bit(1)); longword5_a.setBit(20, new bit(1));
        longword5_a.setBit(22, new bit(1)); longword5_a.setBit(23, new bit(1));
        longword5_a.setBit(24, new bit(1)); longword5_a.setBit(25, new bit(1));
        longword5_a.setBit(26, new bit(1)); longword5_a.setBit(27, new bit(1));
        longword5_a.setBit(28, new bit(1)); longword5_a.setBit(30, new bit(1));
        longword longword5_b = new longword(); longword5_b.set(0);
        longword5_b.setBit(0, new bit(1)); longword5_b.setBit(1, new bit(1));
        longword5_b.setBit(2, new bit(1)); longword5_b.setBit(4, new bit(1));
        longword5_b.setBit(5, new bit(1)); longword5_b.setBit(6, new bit(1));
        longword5_b.setBit(7, new bit(1)); longword5_b.setBit(10, new bit(1));
        longword5_b.setBit(11, new bit(1)); longword5_b.setBit(14, new bit(1));
        longword5_b.setBit(15, new bit(1)); longword5_b.setBit(21, new bit(1));
        longword5_b.setBit(26, new bit(1)); longword5_b.setBit(29, new bit(1));
        longword5_b.setBit(30, new bit(1)); longword5_b.setBit(31, new bit(1));
        String longword5_output = ALU.doOp(operation, longword5_a, longword5_b).toString();
        String expected_output5 = "1,0,1,1,0,0,0,1,0,0,0,0,0,0,0,1,1,0,0,1,0,1,1,1,1,1,0,1,0,0,1,1";
        System.out.println(
            "Longword a: " + longword5_a.toString() +
            "\nLongword b: " + longword5_b.toString() +
            "\nExpected Output: " + expected_output5 + 
            "\nTest Output: " + longword5_output);
        if(!longword5_output.equals(expected_output5)) throw new Exception("subtract failed");
        else System.out.println("subtract successed");
        System.out.println("==== CASE 5 END ====\n");

        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6_a = new longword(); longword6_a.set(0);
        longword6_a.setBit(0, new bit(1)); longword6_a.setBit(1, new bit(1));
        longword6_a.setBit(3, new bit(1)); longword6_a.setBit(4, new bit(1));
        longword6_a.setBit(8, new bit(1)); longword6_a.setBit(9, new bit(1));
        longword6_a.setBit(10, new bit(1)); longword6_a.setBit(11, new bit(1));
        longword6_a.setBit(12, new bit(1)); longword6_a.setBit(14, new bit(1));
        longword6_a.setBit(16, new bit(1)); longword6_a.setBit(18, new bit(1));
        longword6_a.setBit(21, new bit(1)); longword6_a.setBit(24, new bit(1));
        longword6_a.setBit(26, new bit(1)); longword6_a.setBit(29, new bit(1));
        longword longword6_b = new longword(); longword6_b.set(0);
        longword6_b.setBit(1, new bit(1)); longword6_b.setBit(2, new bit(1));
        longword6_b.setBit(3, new bit(1)); longword6_b.setBit(4, new bit(1));
        longword6_b.setBit(6, new bit(1)); longword6_b.setBit(11, new bit(1));
        longword6_b.setBit(12, new bit(1)); longword6_b.setBit(14, new bit(1));
        longword6_b.setBit(15, new bit(1)); longword6_b.setBit(16, new bit(1));
        longword6_b.setBit(17, new bit(1)); longword6_b.setBit(18, new bit(1));
        longword6_b.setBit(22, new bit(1)); longword6_b.setBit(24, new bit(1));
        longword6_b.setBit(26, new bit(1));
        String longword6_output = ALU.doOp(operation, longword6_a, longword6_b).toString();
        String expected_output6 = "0,1,0,1,1,1,1,0,1,1,0,1,1,1,1,0,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0";
        System.out.println(
            "Longword a: " + longword6_a.toString() +
            "\nLongword b: " + longword6_b.toString() +
            "\nExpected Output: " + expected_output6 + 
            "\nTest Output: " + longword6_output);
        if(!longword6_output.equals(expected_output6)) throw new Exception("subtract failed");
        else System.out.println("subtract successed");
        System.out.println("==== CASE 6 END ====\n");

        // case 7
        System.out.println("==== CASE 7 START ====");
        longword longword7_a = new longword(); longword7_a.set(0);
        longword7_a.setBit(0, new bit(1)); longword7_a.setBit(2, new bit(1));
        longword7_a.setBit(4, new bit(1)); longword7_a.setBit(5, new bit(1));
        longword7_a.setBit(6, new bit(1)); longword7_a.setBit(8, new bit(1));
        longword7_a.setBit(11, new bit(1)); longword7_a.setBit(14, new bit(1));
        longword7_a.setBit(15, new bit(1)); longword7_a.setBit(16, new bit(1));
        longword7_a.setBit(17, new bit(1)); longword7_a.setBit(21, new bit(1));
        longword7_a.setBit(26, new bit(1)); longword7_a.setBit(27, new bit(1));
        longword7_a.setBit(31, new bit(1));
        longword longword7_b = new longword(); longword7_b.set(0);
        longword7_b.setBit(9, new bit(1)); longword7_b.setBit(11, new bit(1));
        longword7_b.setBit(12, new bit(1)); longword7_b.setBit(13, new bit(1));
        longword7_b.setBit(17, new bit(1)); longword7_b.setBit(18, new bit(1));
        longword7_b.setBit(19, new bit(1)); longword7_b.setBit(21, new bit(1));
        longword7_b.setBit(22, new bit(1)); longword7_b.setBit(23, new bit(1));
        longword7_b.setBit(24, new bit(1)); longword7_b.setBit(25, new bit(1));
        longword7_b.setBit(26, new bit(1)); longword7_b.setBit(30, new bit(1));
        String longword7_output = ALU.doOp(operation, longword7_a, longword7_b).toString();
        String expected_output7 = "1,0,1,0,1,1,1,0,0,0,1,1,0,1,1,1,0,1,0,0,1,1,0,0,0,1,0,0,1,1,1,1";
        System.out.println(
            "Longword a: " + longword7_a.toString() +
            "\nLongword b: " + longword7_b.toString() +
            "\nExpected Output: " + expected_output7 + 
            "\nTest Output: " + longword7_output);
        if(!longword7_output.equals(expected_output7)) throw new Exception("subtract failed");
        else System.out.println("subtract successed");
        System.out.println("==== CASE 7 END ====\n");

        // case 8
        System.out.println("==== CASE 8 START ====");
        longword longword8_a = new longword(); longword8_a.set(0);
        longword8_a.setBit(1, new bit(1)); longword8_a.setBit(4, new bit(1));
        longword8_a.setBit(7, new bit(1)); longword8_a.setBit(9, new bit(1));
        longword8_a.setBit(10, new bit(1)); longword8_a.setBit(11, new bit(1));
        longword8_a.setBit(12, new bit(1)); longword8_a.setBit(13, new bit(1));
        longword8_a.setBit(16, new bit(1)); longword8_a.setBit(17, new bit(1));
        longword8_a.setBit(18, new bit(1)); longword8_a.setBit(20, new bit(1));
        longword8_a.setBit(22, new bit(1)); longword8_a.setBit(23, new bit(1));
        longword8_a.setBit(24, new bit(1)); longword8_a.setBit(30, new bit(1));
        longword longword8_b = new longword(); longword8_b.set(0);
        longword8_b.setBit(0, new bit(1)); longword8_b.setBit(1, new bit(1));
        longword8_b.setBit(2, new bit(1)); longword8_b.setBit(3, new bit(1));
        longword8_b.setBit(4, new bit(1)); longword8_b.setBit(5, new bit(1));
        longword8_b.setBit(6, new bit(1)); longword8_b.setBit(8, new bit(1));
        longword8_b.setBit(10, new bit(1)); longword8_b.setBit(11, new bit(1));
        longword8_b.setBit(12, new bit(1)); longword8_b.setBit(16, new bit(1));
        longword8_b.setBit(17, new bit(1)); longword8_b.setBit(18, new bit(1));
        longword8_b.setBit(21, new bit(1)); longword8_b.setBit(23, new bit(1));
        longword8_b.setBit(24, new bit(1)); longword8_b.setBit(26, new bit(1));
        longword8_b.setBit(27, new bit(1)); longword8_b.setBit(28, new bit(1));
        longword8_b.setBit(29, new bit(1)); longword8_b.setBit(31, new bit(1));
        String longword8_output = ALU.doOp(operation, longword8_a, longword8_b).toString();
        String expected_output8 = "0,1,0,0,1,0,1,0,1,1,0,0,0,1,0,0,0,0,0,0,0,1,0,1,1,1,0,0,0,1,0,1";
        System.out.println(
            "Longword a: " + longword8_a.toString() +
            "\nLongword b: " + longword8_b.toString() +
            "\nExpected Output: " + expected_output8 + 
            "\nTest Output: " + longword8_output);
        if(!longword8_output.equals(expected_output8)) throw new Exception("subtract failed");
        else System.out.println("subtract successed");
        System.out.println("==== CASE 8 END ====\n");

        // case 9
        System.out.println("==== CASE 9 START ====");
        longword longword9_a = new longword(); longword9_a.set(0);
        longword9_a.setBit(0, new bit(1)); longword9_a.setBit(3, new bit(1));
        longword9_a.setBit(6, new bit(1)); longword9_a.setBit(8, new bit(1));
        longword9_a.setBit(10, new bit(1)); longword9_a.setBit(11, new bit(1));
        longword9_a.setBit(14, new bit(1)); longword9_a.setBit(15, new bit(1));
        longword9_a.setBit(17, new bit(1)); longword9_a.setBit(18, new bit(1));
        longword9_a.setBit(19, new bit(1)); longword9_a.setBit(21, new bit(1));
        longword9_a.setBit(24, new bit(1)); longword9_a.setBit(26, new bit(1));
        longword9_a.setBit(27, new bit(1)); longword9_a.setBit(28, new bit(1));
        longword longword9_b = new longword(); longword9_b.set(0);
        longword9_b.setBit(0, new bit(1)); longword9_b.setBit(1, new bit(1));
        longword9_b.setBit(5, new bit(1)); longword9_b.setBit(6, new bit(1));
        longword9_b.setBit(15, new bit(1)); longword9_b.setBit(17, new bit(1));
        longword9_b.setBit(22, new bit(1)); longword9_b.setBit(23, new bit(1));
        longword9_b.setBit(24, new bit(1)); longword9_b.setBit(25, new bit(1));
        longword9_b.setBit(27, new bit(1)); longword9_b.setBit(30, new bit(1));
        longword9_b.setBit(31, new bit(1));
        String longword9_output = ALU.doOp(operation, longword9_a, longword9_b).toString();
        String expected_output9 = "1,1,0,0,1,1,0,0,1,0,1,1,0,0,1,0,0,0,1,1,0,0,0,0,1,1,1,0,0,1,0,1";
        System.out.println(
            "Longword a: " + longword9_a.toString() +
            "\nLongword b: " + longword9_b.toString() +
            "\nExpected Output: " + expected_output9 + 
            "\nTest Output: " + longword9_output);
        if(!longword9_output.equals(expected_output9)) throw new Exception("subtract failed");
        else System.out.println("subtract successed");
        System.out.println("==== CASE 9 END ====\n");

        // case 10
        System.out.println("==== CASE 10 START ====");
        longword longword10_a = new longword(); longword10_a.set(0);
        longword10_a.setBit(0, new bit(1)); longword10_a.setBit(4, new bit(1));
        longword10_a.setBit(5, new bit(1)); longword10_a.setBit(11, new bit(1));
        longword10_a.setBit(12, new bit(1)); longword10_a.setBit(13, new bit(1));
        longword10_a.setBit(14, new bit(1)); longword10_a.setBit(16, new bit(1));
        longword10_a.setBit(17, new bit(1)); longword10_a.setBit(22, new bit(1));
        longword10_a.setBit(23, new bit(1)); longword10_a.setBit(26, new bit(1));
        longword10_a.setBit(27, new bit(1)); longword10_a.setBit(28, new bit(1));
        longword10_a.setBit(31, new bit(1));
        longword longword10_b = new longword(); longword10_b.set(0);
        longword10_b.setBit(1, new bit(1)); longword10_b.setBit(2, new bit(1));
        longword10_b.setBit(5, new bit(1)); longword10_b.setBit(6, new bit(1));
        longword10_b.setBit(8, new bit(1)); longword10_b.setBit(9, new bit(1));
        longword10_b.setBit(14, new bit(1)); longword10_b.setBit(18, new bit(1));
        longword10_b.setBit(19, new bit(1)); longword10_b.setBit(23, new bit(1));
        longword10_b.setBit(26, new bit(1)); longword10_b.setBit(28, new bit(1));
        longword10_b.setBit(29, new bit(1));
        String longword10_output = ALU.doOp(operation, longword10_a, longword10_b).toString();
        String expected_output10 = "0,0,1,0,0,1,0,1,0,1,0,1,1,1,0,0,1,0,0,1,0,0,1,0,0,0,0,0,1,1,0,1";
        System.out.println(
            "Longword a: " + longword10_a.toString() +
            "\nLongword b: " + longword10_b.toString() +
            "\nExpected Output: " + expected_output10 + 
            "\nTest Output: " + longword10_output);
        if(!longword10_output.equals(expected_output10)) throw new Exception("subtract failed");
        else System.out.println("subtract successed");
        System.out.println("==== CASE 10 END ====\n");
        
        System.out.println("~~~~ TEST \"1111\" END ~~~~\n");
    }

    private static void test0111() throws Exception{ // test method for "multiply"
        System.out.println("~~~~ TEST \"0111\" START ~~~~\n");
        
        // bit operation
        bit[] operation = new bit[4];
        operation[0] = new bit(0);
        operation[1] = new bit(1);
        operation[2] = new bit(1);
        operation[3] = new bit(1);

        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_a = new longword(); longword1_a.set(0);
        longword1_a.setBit(2, new bit(1)); longword1_a.setBit(3, new bit(1));
        longword1_a.setBit(5, new bit(1)); longword1_a.setBit(9, new bit(1));
        longword1_a.setBit(10, new bit(1)); longword1_a.setBit(12, new bit(1));
        longword1_a.setBit(13, new bit(1)); longword1_a.setBit(14, new bit(1));
        longword1_a.setBit(19, new bit(1)); longword1_a.setBit(23, new bit(1));
        longword1_a.setBit(25, new bit(1)); longword1_a.setBit(27, new bit(1));
        longword1_a.setBit(28, new bit(1)); longword1_a.setBit(31, new bit(1));
        longword longword1_b = new longword(); longword1_b.set(0);
        longword1_b.setBit(0, new bit(1)); longword1_b.setBit(1, new bit(1));
        longword1_b.setBit(5, new bit(1)); longword1_b.setBit(6, new bit(1));
        longword1_b.setBit(8, new bit(1)); longword1_b.setBit(11, new bit(1));
        longword1_b.setBit(12, new bit(1)); longword1_b.setBit(15, new bit(1));
        longword1_b.setBit(17, new bit(1)); longword1_b.setBit(18, new bit(1));
        longword1_b.setBit(20, new bit(1)); longword1_b.setBit(22, new bit(1));
        longword1_b.setBit(23, new bit(1)); longword1_b.setBit(24, new bit(1));
        longword1_b.setBit(25, new bit(1)); longword1_b.setBit(26, new bit(1));
        longword1_b.setBit(27, new bit(1)); longword1_b.setBit(29, new bit(1));
        longword1_b.setBit(31, new bit(1));
        String longword1_output = ALU.doOp(operation, longword1_a ,longword1_b).toString();
        String expected_output1 = "0,1,1,0,0,0,1,0,1,1,0,0,0,1,1,1,1,1,0,0,1,1,0,1,0,0,1,0,1,1,0,1";
        System.out.println(
            "Longword a: " + longword1_a.toString() +
            "\nLongword b: " + longword1_b.toString() +
            "\nExpected Output: " + expected_output1 + 
            "\nTest Output: " + longword1_output);
        if(!longword1_output.equals(expected_output1)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2_a = new longword(); longword2_a.set(0);
        longword2_a.setBit(0, new bit(1)); longword2_a.setBit(1, new bit(1));
        longword2_a.setBit(11, new bit(1)); longword2_a.setBit(18, new bit(1));
        longword2_a.setBit(19, new bit(1)); longword2_a.setBit(21, new bit(1));
        longword2_a.setBit(23, new bit(1)); longword2_a.setBit(25, new bit(1));
        longword2_a.setBit(31, new bit(1));
        longword longword2_b = new longword(); longword2_b.set(0);
        longword2_b.setBit(1, new bit(1)); longword2_b.setBit(3, new bit(1));
        longword2_b.setBit(4, new bit(1)); longword2_b.setBit(6, new bit(1));
        longword2_b.setBit(7, new bit(1)); longword2_b.setBit(8, new bit(1));
        longword2_b.setBit(10, new bit(1)); longword2_b.setBit(15, new bit(1));
        longword2_b.setBit(20, new bit(1)); longword2_b.setBit(21, new bit(1));
        longword2_b.setBit(22, new bit(1)); longword2_b.setBit(24, new bit(1));
        longword2_b.setBit(25, new bit(1)); longword2_b.setBit(26, new bit(1));
        longword2_b.setBit(29, new bit(1)); longword2_b.setBit(30, new bit(1));
        String longword2_output = ALU.doOp(operation, longword2_a ,longword2_b).toString();
        String expected_output2 = "0,0,0,0,1,0,1,0,0,1,0,1,1,0,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0";
        System.out.println(
            "Longword a: " + longword2_a.toString() +
            "\nLongword b: " + longword2_b.toString() +
            "\nExpected Output: " + expected_output2 + 
            "\nTest Output: " + longword2_output);
        if(!longword2_output.equals(expected_output2)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3_a = new longword(); longword3_a.set(0);
        longword3_a.setBit(0, new bit(1)); longword3_a.setBit(1, new bit(1));
        longword3_a.setBit(4, new bit(1)); longword3_a.setBit(7, new bit(1));
        longword3_a.setBit(9, new bit(1)); longword3_a.setBit(11, new bit(1));
        longword3_a.setBit(12, new bit(1)); longword3_a.setBit(13, new bit(1));
        longword3_a.setBit(14, new bit(1)); longword3_a.setBit(15, new bit(1));
        longword3_a.setBit(17, new bit(1)); longword3_a.setBit(21, new bit(1));
        longword3_a.setBit(22, new bit(1)); longword3_a.setBit(23, new bit(1));
        longword3_a.setBit(24, new bit(1)); longword3_a.setBit(26, new bit(1));
        longword3_a.setBit(27, new bit(1)); longword3_a.setBit(28, new bit(1));
        longword3_a.setBit(29, new bit(1)); longword3_a.setBit(31, new bit(1));
        longword longword3_b = new longword(); longword3_b.set(0);
        longword3_b.setBit(1, new bit(1)); longword3_b.setBit(3, new bit(1));
        longword3_b.setBit(5, new bit(1)); longword3_b.setBit(6, new bit(1));
        longword3_b.setBit(9, new bit(1)); longword3_b.setBit(10, new bit(1));
        longword3_b.setBit(16, new bit(1)); longword3_b.setBit(17, new bit(1));
        longword3_b.setBit(20, new bit(1)); longword3_b.setBit(23, new bit(1));
        longword3_b.setBit(25, new bit(1)); longword3_b.setBit(28, new bit(1));
        String longword3_output = ALU.doOp(operation, longword3_a ,longword3_b).toString();
        String expected_output3 = "1,1,0,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,0,1,0,0,1,0,0,0,1,0,1,0,0,0";
        System.out.println(
            "Longword a: " + longword3_a.toString() +
            "\nLongword b: " + longword3_b.toString() +
            "\nExpected Output: " + expected_output3 + 
            "\nTest Output: " + longword3_output);
        if(!longword3_output.equals(expected_output3)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4_a = new longword(); longword4_a.set(0);
        longword4_a.setBit(0, new bit(1)); longword4_a.setBit(1, new bit(1));
        longword4_a.setBit(2, new bit(1)); longword4_a.setBit(3, new bit(1));
        longword4_a.setBit(7, new bit(1)); longword4_a.setBit(9, new bit(1));
        longword4_a.setBit(12, new bit(1)); longword4_a.setBit(14, new bit(1));
        longword4_a.setBit(16, new bit(1)); longword4_a.setBit(19, new bit(1));
        longword4_a.setBit(21, new bit(1)); longword4_a.setBit(24, new bit(1));
        longword4_a.setBit(29, new bit(1));
        longword longword4_b = new longword(); longword4_b.set(0);
        longword4_b.setBit(0, new bit(1)); longword4_b.setBit(2, new bit(1));
        longword4_b.setBit(3, new bit(1)); longword4_b.setBit(4, new bit(1));
        longword4_b.setBit(6, new bit(1)); longword4_b.setBit(9, new bit(1));
        longword4_b.setBit(13, new bit(1)); longword4_b.setBit(15, new bit(1));
        longword4_b.setBit(17, new bit(1)); longword4_b.setBit(19, new bit(1));
        longword4_b.setBit(20, new bit(1)); longword4_b.setBit(21, new bit(1));
        longword4_b.setBit(22, new bit(1)); longword4_b.setBit(23, new bit(1));
        longword4_b.setBit(26, new bit(1)); longword4_b.setBit(27, new bit(1));
        longword4_b.setBit(29, new bit(1)); longword4_b.setBit(30, new bit(1));
        String longword4_output = ALU.doOp(operation, longword4_a ,longword4_b).toString();
        String expected_output4 = "1,0,0,0,0,0,1,0,0,1,1,0,1,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,0,0,0";
        System.out.println(
            "Longword a: " + longword4_a.toString() +
            "\nLongword b: " + longword4_b.toString() +
            "\nExpected Output: " + expected_output4 + 
            "\nTest Output: " + longword4_output);
        if(!longword4_output.equals(expected_output4)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5_a = new longword(); longword5_a.set(0);
        longword5_a.setBit(1, new bit(1)); longword5_a.setBit(2, new bit(1));
        longword5_a.setBit(4, new bit(1)); longword5_a.setBit(9, new bit(1));
        longword5_a.setBit(10, new bit(1)); longword5_a.setBit(12, new bit(1));
        longword5_a.setBit(14, new bit(1)); longword5_a.setBit(15, new bit(1));
        longword5_a.setBit(17, new bit(1)); longword5_a.setBit(18, new bit(1));
        longword5_a.setBit(20, new bit(1)); longword5_a.setBit(21, new bit(1));
        longword5_a.setBit(25, new bit(1));
        longword5_a.setBit(26, new bit(1));
        longword5_a.setBit(27, new bit(1)); longword5_a.setBit(31, new bit(1));
        longword longword5_b = new longword(); longword5_b.set(0);
        longword5_b.setBit(0, new bit(1)); longword5_b.setBit(2, new bit(1));
        longword5_b.setBit(5, new bit(1)); longword5_b.setBit(6, new bit(1));
        longword5_b.setBit(7, new bit(1)); longword5_b.setBit(8, new bit(1));
        longword5_b.setBit(9, new bit(1)); longword5_b.setBit(11, new bit(1));
        longword5_b.setBit(13, new bit(1)); longword5_b.setBit(14, new bit(1));
        longword5_b.setBit(16, new bit(1)); longword5_b.setBit(17, new bit(1));
        longword5_b.setBit(18, new bit(1)); longword5_b.setBit(20, new bit(1));
        longword5_b.setBit(21, new bit(1)); longword5_b.setBit(22, new bit(1));
        longword5_b.setBit(24, new bit(1)); longword5_b.setBit(28, new bit(1));
        longword5_b.setBit(30, new bit(1));
        String longword5_output = ALU.doOp(operation, longword5_a ,longword5_b).toString();
        String expected_output5 = "1,0,0,0,0,1,1,0,0,0,1,0,1,1,1,1,1,0,0,0,0,0,1,0,1,1,1,0,1,0,1,0";
        System.out.println(
            "Longword a: " + longword5_a.toString() +
            "\nLongword b: " + longword5_b.toString() +
            "\nExpected Output: " + expected_output5 + 
            "\nTest Output: " + longword5_output);
        if(!longword5_output.equals(expected_output5)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 5 END ====\n");

        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6_a = new longword(); longword6_a.set(0);
        longword6_a.setBit(5, new bit(1)); longword6_a.setBit(6, new bit(1));
        longword6_a.setBit(7, new bit(1)); longword6_a.setBit(8, new bit(1));
        longword6_a.setBit(9, new bit(1)); longword6_a.setBit(10, new bit(1));
        longword6_a.setBit(12, new bit(1)); longword6_a.setBit(15, new bit(1));
        longword6_a.setBit(16, new bit(1)); longword6_a.setBit(17, new bit(1));
        longword6_a.setBit(19, new bit(1)); longword6_a.setBit(21, new bit(1));
        longword6_a.setBit(25, new bit(1)); longword6_a.setBit(27, new bit(1));
        longword6_a.setBit(29, new bit(1)); longword6_a.setBit(31, new bit(1));
        longword longword6_b = new longword(); longword6_b.set(0);
        longword6_b.setBit(1, new bit(1)); longword6_b.setBit(5, new bit(1));
        longword6_b.setBit(6, new bit(1)); longword6_b.setBit(7, new bit(1));
        longword6_b.setBit(9, new bit(1)); longword6_b.setBit(10, new bit(1));
        longword6_b.setBit(11, new bit(1)); longword6_b.setBit(14, new bit(1));
        longword6_b.setBit(16, new bit(1)); longword6_b.setBit(21, new bit(1));
        longword6_b.setBit(25, new bit(1)); longword6_b.setBit(30, new bit(1));
        String longword6_output = ALU.doOp(operation, longword6_a ,longword6_b).toString();
        String expected_output6 = "1,0,1,1,1,1,0,0,1,0,0,1,1,1,1,0,1,0,0,1,0,0,0,1,1,1,1,0,1,0,1,0";
        System.out.println(
            "Longword a: " + longword6_a.toString() +
            "\nLongword b: " + longword6_b.toString() +
            "\nExpected Output: " + expected_output6 + 
            "\nTest Output: " + longword6_output);
        if(!longword6_output.equals(expected_output6)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 6 END ====\n");

        // case 7
        System.out.println("==== CASE 7 START ====");
        longword longword7_a = new longword(); longword7_a.set(0);
        longword7_a.setBit(0, new bit(1)); longword7_a.setBit(1, new bit(1));
        longword7_a.setBit(2, new bit(1)); longword7_a.setBit(3, new bit(1));
        longword7_a.setBit(6, new bit(1)); longword7_a.setBit(10, new bit(1));
        longword7_a.setBit(11, new bit(1)); longword7_a.setBit(12, new bit(1));
        longword7_a.setBit(13, new bit(1)); longword7_a.setBit(14, new bit(1));
        longword7_a.setBit(16, new bit(1)); longword7_a.setBit(17, new bit(1));
        longword7_a.setBit(19, new bit(1)); longword7_a.setBit(21, new bit(1));
        longword7_a.setBit(23, new bit(1)); longword7_a.setBit(24, new bit(1));
        longword7_a.setBit(25, new bit(1)); longword7_a.setBit(26, new bit(1));
        longword7_a.setBit(28, new bit(1)); longword7_a.setBit(29, new bit(1));
        longword7_a.setBit(31, new bit(1));
        longword longword7_b = new longword(); longword7_b.set(0);
        longword7_b.setBit(0, new bit(1)); longword7_b.setBit(1, new bit(1));
        longword7_b.setBit(2, new bit(1)); longword7_b.setBit(3, new bit(1));
        longword7_b.setBit(4, new bit(1)); longword7_b.setBit(6, new bit(1));
        longword7_b.setBit(9, new bit(1)); longword7_b.setBit(10, new bit(1));
        longword7_b.setBit(12, new bit(1)); longword7_b.setBit(13, new bit(1));
        longword7_b.setBit(14, new bit(1)); longword7_b.setBit(18, new bit(1));
        longword7_b.setBit(20, new bit(1)); longword7_b.setBit(23, new bit(1));
        longword7_b.setBit(24, new bit(1)); longword7_b.setBit(26, new bit(1));
        longword7_b.setBit(29, new bit(1)); longword7_b.setBit(30, new bit(1));
        String longword7_output = ALU.doOp(operation, longword7_a ,longword7_b).toString();
        String expected_output7 = "1,0,0,0,0,0,1,0,1,1,0,1,0,1,1,1,1,0,1,0,1,1,0,0,1,0,1,0,1,1,1,0";
        System.out.println(
            "Longword a: " + longword7_a.toString() +
            "\nLongword b: " + longword7_b.toString() +
            "\nExpected Output: " + expected_output7 + 
            "\nTest Output: " + longword7_output);
        if(!longword7_output.equals(expected_output7)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 7 END ====\n");

        // case 8
        System.out.println("==== CASE 8 START ====");
        longword longword8_a = new longword(); longword8_a.set(0);
        longword8_a.setBit(1, new bit(1)); longword8_a.setBit(2, new bit(1));
        longword8_a.setBit(4, new bit(1)); longword8_a.setBit(7, new bit(1));
        longword8_a.setBit(9, new bit(1)); longword8_a.setBit(10, new bit(1));
        longword8_a.setBit(11, new bit(1)); longword8_a.setBit(12, new bit(1));
        longword8_a.setBit(13, new bit(1)); longword8_a.setBit(15, new bit(1));
        longword8_a.setBit(20, new bit(1)); longword8_a.setBit(21, new bit(1));
        longword8_a.setBit(24, new bit(1)); longword8_a.setBit(26, new bit(1));
        longword8_a.setBit(27, new bit(1)); longword8_a.setBit(30, new bit(1));
        longword8_a.setBit(31, new bit(1));
        longword longword8_b = new longword(); longword8_b.set(0);
        longword8_b.setBit(4, new bit(1)); longword8_b.setBit(6, new bit(1));
        longword8_b.setBit(13, new bit(1)); longword8_b.setBit(14, new bit(1));
        longword8_b.setBit(15, new bit(1)); longword8_b.setBit(19, new bit(1));
        longword8_b.setBit(20, new bit(1)); longword8_b.setBit(21, new bit(1));
        longword8_b.setBit(22, new bit(1)); longword8_b.setBit(23, new bit(1));
        longword8_b.setBit(24, new bit(1)); longword8_b.setBit(28, new bit(1));
        longword8_b.setBit(29, new bit(1)); longword8_b.setBit(30, new bit(1));
        longword8_b.setBit(31, new bit(1));
        String longword8_output = ALU.doOp(operation, longword8_a ,longword8_b).toString();
        String expected_output8 = "0,1,1,0,1,0,0,0,0,1,0,0,1,0,0,0,1,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1";
        System.out.println(
            "Longword a: " + longword8_a.toString() +
            "\nLongword b: " + longword8_b.toString() +
            "\nExpected Output: " + expected_output8 + 
            "\nTest Output: " + longword8_output);
        if(!longword8_output.equals(expected_output8)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 8 END ====\n");

        // case 9
        System.out.println("==== CASE 9 START ====");
        longword longword9_a = new longword(); longword9_a.set(0);
        longword9_a.setBit(0, new bit(1)); longword9_a.setBit(1, new bit(1));
        longword9_a.setBit(2, new bit(1)); longword9_a.setBit(3, new bit(1));
        longword9_a.setBit(8, new bit(1)); longword9_a.setBit(9, new bit(1));
        longword9_a.setBit(10, new bit(1)); longword9_a.setBit(13, new bit(1));
        longword9_a.setBit(14, new bit(1)); longword9_a.setBit(15, new bit(1));
        longword9_a.setBit(16, new bit(1)); longword9_a.setBit(18, new bit(1));
        longword9_a.setBit(19, new bit(1)); longword9_a.setBit(20, new bit(1));
        longword9_a.setBit(21, new bit(1)); longword9_a.setBit(22, new bit(1));
        longword9_a.setBit(24, new bit(1)); longword9_a.setBit(27, new bit(1));
        longword9_a.setBit(31, new bit(1));
        longword longword9_b = new longword(); longword9_b.set(0);
        longword9_b.setBit(0, new bit(1)); longword9_b.setBit(1, new bit(1));
        longword9_b.setBit(3, new bit(1)); longword9_b.setBit(4, new bit(1));
        longword9_b.setBit(5, new bit(1)); longword9_b.setBit(6, new bit(1));
        longword9_b.setBit(7, new bit(1)); longword9_b.setBit(9, new bit(1));
        longword9_b.setBit(11, new bit(1)); longword9_b.setBit(12, new bit(1));
        longword9_b.setBit(14, new bit(1)); longword9_b.setBit(15, new bit(1));
        longword9_b.setBit(19, new bit(1)); longword9_b.setBit(20, new bit(1));
        longword9_b.setBit(21, new bit(1)); longword9_b.setBit(22, new bit(1));
        longword9_b.setBit(24, new bit(1)); longword9_b.setBit(26, new bit(1));
        longword9_b.setBit(27, new bit(1)); longword9_b.setBit(29, new bit(1));
        String longword9_output = ALU.doOp(operation, longword9_a ,longword9_b).toString();
        String expected_output9 = "1,0,0,1,0,1,1,1,1,1,0,1,0,0,0,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,0,0";
        System.out.println(
            "Longword a: " + longword9_a.toString() +
            "\nLongword b: " + longword9_b.toString() +
            "\nExpected Output: " + expected_output9 + 
            "\nTest Output: " + longword9_output);
        if(!longword9_output.equals(expected_output9)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 9 END ====\n");

        // case 10
        System.out.println("==== CASE 10 START ====");
        longword longword10_a = new longword(); longword10_a.set(0);
        longword10_a.setBit(0, new bit(1)); longword10_a.setBit(2, new bit(1));
        longword10_a.setBit(3, new bit(1)); longword10_a.setBit(4, new bit(1));
        longword10_a.setBit(6, new bit(1)); longword10_a.setBit(12, new bit(1));
        longword10_a.setBit(13, new bit(1)); longword10_a.setBit(15, new bit(1));
        longword10_a.setBit(18, new bit(1)); longword10_a.setBit(19, new bit(1));
        longword10_a.setBit(23, new bit(1)); longword10_a.setBit(25, new bit(1));
        longword10_a.setBit(27, new bit(1)); longword10_a.setBit(28, new bit(1));
        longword10_a.setBit(30, new bit(1));
        longword longword10_b = new longword(); longword10_b.set(0);
        longword10_b.setBit(0, new bit(1)); longword10_b.setBit(3, new bit(1));
        longword10_b.setBit(6, new bit(1)); longword10_b.setBit(7, new bit(1));
        longword10_b.setBit(9, new bit(1)); longword10_b.setBit(12, new bit(1));
        longword10_b.setBit(16, new bit(1)); longword10_b.setBit(18, new bit(1));
        longword10_b.setBit(20, new bit(1)); longword10_b.setBit(21, new bit(1));
        longword10_b.setBit(23, new bit(1)); longword10_b.setBit(29, new bit(1));
        String longword10_output = ALU.doOp(operation, longword10_a ,longword10_b).toString();
        String expected_output10 = "0,1,1,0,0,0,0,1,1,1,0,1,1,1,1,0,1,0,0,1,0,1,1,1,0,1,1,0,1,0,0,0";
        System.out.println(
            "Longword a: " + longword10_a.toString() +
            "\nLongword b: " + longword10_b.toString() +
            "\nExpected Output: " + expected_output10 + 
            "\nTest Output: " + longword10_output);
        if(!longword10_output.equals(expected_output10)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 10 END ====\n");
        
        System.out.println("~~~~ TEST \"0111\" END ~~~~\n");
    }

    public static void runTest() throws Exception{ // test execution method
        // executes all test methods
        test1000(); // "and" test
        test1001(); // "or" test
        test1010(); // "xor" test
        test1011(); // "not" test
        test1100(); // "left shift" test
        test1101(); // "right shift" test
        test1110(); // "add" test
        test1111(); // "subtract" test
        test0111(); // "multiply" test
    }
    
    public static void main(String[] args) throws Exception{ // main method
        runTest(); // executes tests
    }    
}
