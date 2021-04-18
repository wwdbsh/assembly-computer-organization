public class multiplier_test {

    private static void testMuliply() throws Exception{ // test method for multiply
        System.out.println("~~~~ TEST \"multiply\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_a = new longword(); longword1_a.set(0);
        longword longword1_b = new longword(); longword1_b.set(0);
        String longword1_output = multiplier.multiply(longword1_a, longword1_b).toString();
        String expected_output1 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
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
        longword longword2_b = new longword(); longword2_b.set(1);
        String longword2_output = multiplier.multiply(longword2_a, longword2_b).toString();
        String expected_output2 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
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
        longword longword3_a = new longword(); longword3_a.set(1);
        longword longword3_b = new longword(); longword3_b.set(1);
        String longword3_output = multiplier.multiply(longword3_a, longword3_b).toString();
        String expected_output3 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1";
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
        longword4_a.setBit(1, new bit(1)); longword4_a.setBit(3, new bit(1));
        longword4_a.setBit(5, new bit(1)); longword4_a.setBit(6, new bit(1));
        longword4_a.setBit(8, new bit(1)); longword4_a.setBit(9, new bit(1));
        longword4_a.setBit(12, new bit(1)); longword4_a.setBit(17, new bit(1));
        longword4_a.setBit(18, new bit(1)); longword4_a.setBit(19, new bit(1));
        longword4_a.setBit(21, new bit(1)); longword4_a.setBit(24, new bit(1));
        longword4_a.setBit(25, new bit(1)); longword4_a.setBit(26, new bit(1));
        longword4_a.setBit(27, new bit(1)); longword4_a.setBit(29, new bit(1));
        longword4_a.setBit(30, new bit(1));
        longword longword4_b = new longword(); longword4_b.set(0);
        longword4_b.setBit(1, new bit(1)); longword4_b.setBit(2, new bit(1));
        longword4_b.setBit(4, new bit(1)); longword4_b.setBit(5, new bit(1));
        longword4_b.setBit(6, new bit(1)); longword4_b.setBit(7, new bit(1));
        longword4_b.setBit(8, new bit(1)); longword4_b.setBit(9, new bit(1));
        longword4_b.setBit(12, new bit(1)); longword4_b.setBit(13, new bit(1));
        longword4_b.setBit(15, new bit(1)); longword4_b.setBit(16, new bit(1));
        longword4_b.setBit(17, new bit(1)); longword4_b.setBit(18, new bit(1));
        longword4_b.setBit(21, new bit(1)); longword4_b.setBit(23, new bit(1));
        longword4_b.setBit(24, new bit(1)); longword4_b.setBit(25, new bit(1));
        longword4_b.setBit(26, new bit(1)); longword4_b.setBit(27, new bit(1));
        longword4_b.setBit(30, new bit(1));
        String longword4_output = multiplier.multiply(longword4_a, longword4_b).toString();
        String expected_output4 = "1,0,1,0,1,1,0,1,0,0,0,1,1,1,0,0,1,0,0,1,1,1,1,0,1,0,0,0,1,1,0,0";
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
        longword5_a.setBit(2, new bit(1)); longword5_a.setBit(3, new bit(1));
        longword5_a.setBit(6, new bit(1)); longword5_a.setBit(7, new bit(1));
        longword5_a.setBit(8, new bit(1)); longword5_a.setBit(10, new bit(1));
        longword5_a.setBit(11, new bit(1)); longword5_a.setBit(12, new bit(1));
        longword5_a.setBit(13, new bit(1)); longword5_a.setBit(16, new bit(1));
        longword5_a.setBit(17, new bit(1)); longword5_a.setBit(18, new bit(1));
        longword5_a.setBit(19, new bit(1)); longword5_a.setBit(20, new bit(1));
        longword5_a.setBit(24, new bit(1)); longword5_a.setBit(25, new bit(1));
        longword5_a.setBit(26, new bit(1)); longword5_a.setBit(27, new bit(1));
        longword5_a.setBit(31, new bit(1));
        longword longword5_b = new longword(); longword5_b.set(0);
        longword5_b.setBit(0, new bit(1)); longword5_b.setBit(2, new bit(1));
        longword5_b.setBit(3, new bit(1)); longword5_b.setBit(7, new bit(1));
        longword5_b.setBit(8, new bit(1)); longword5_b.setBit(9, new bit(1));
        longword5_b.setBit(11, new bit(1)); longword5_b.setBit(17, new bit(1));
        longword5_b.setBit(19, new bit(1)); longword5_b.setBit(22, new bit(1));
        longword5_b.setBit(24, new bit(1)); longword5_b.setBit(28, new bit(1));
        longword5_b.setBit(29, new bit(1)); longword5_b.setBit(30, new bit(1));
        String longword5_output = multiplier.multiply(longword5_a, longword5_b).toString();
        String expected_output5 = "0,0,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,0,0,1,1,1,1,0,1,0,1,1,1,0";
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
        longword6_a.setBit(0, new bit(1)); longword6_a.setBit(3, new bit(1));
        longword6_a.setBit(5, new bit(1)); longword6_a.setBit(8, new bit(1));
        longword6_a.setBit(10, new bit(1)); longword6_a.setBit(13, new bit(1));
        longword6_a.setBit(15, new bit(1)); longword6_a.setBit(16, new bit(1));
        longword6_a.setBit(19, new bit(1)); longword6_a.setBit(21, new bit(1));
        longword6_a.setBit(23, new bit(1)); longword6_a.setBit(24, new bit(1));
        longword6_a.setBit(25, new bit(1)); longword6_a.setBit(28, new bit(1));
        longword6_a.setBit(30, new bit(1));
        longword longword6_b = new longword(); longword6_b.set(0);
        longword6_b.setBit(5, new bit(1)); longword6_b.setBit(6, new bit(1));
        longword6_b.setBit(8, new bit(1)); longword6_b.setBit(9, new bit(1));
        longword6_b.setBit(12, new bit(1)); longword6_b.setBit(13, new bit(1));
        longword6_b.setBit(15, new bit(1)); longword6_b.setBit(16, new bit(1));
        longword6_b.setBit(19, new bit(1)); longword6_b.setBit(21, new bit(1));
        longword6_b.setBit(22, new bit(1)); longword6_b.setBit(24, new bit(1));
        longword6_b.setBit(27, new bit(1)); longword6_b.setBit(28, new bit(1));
        longword6_b.setBit(29, new bit(1));
        String longword6_output = multiplier.multiply(longword6_a, longword6_b).toString();
        String expected_output6 = "0,1,0,0,1,0,0,1,0,1,1,0,1,1,0,1,1,0,1,0,0,0,1,1,0,0,0,1,1,0,0,0";
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
        longword7_a.setBit(5, new bit(1)); longword7_a.setBit(7, new bit(1));
        longword7_a.setBit(9, new bit(1)); longword7_a.setBit(13, new bit(1));
        longword7_a.setBit(16, new bit(1)); longword7_a.setBit(19, new bit(1));
        longword7_a.setBit(24, new bit(1)); longword7_a.setBit(25, new bit(1));
        longword7_a.setBit(27, new bit(1)); longword7_a.setBit(29, new bit(1));
        longword longword7_b = new longword(); longword7_b.set(0);
        longword7_b.setBit(2, new bit(1)); longword7_b.setBit(4, new bit(1));
        longword7_b.setBit(7, new bit(1)); longword7_b.setBit(8, new bit(1));
        longword7_b.setBit(11, new bit(1)); longword7_b.setBit(12, new bit(1));
        longword7_b.setBit(15, new bit(1)); longword7_b.setBit(16, new bit(1));
        longword7_b.setBit(18, new bit(1)); longword7_b.setBit(20, new bit(1));
        longword7_b.setBit(21, new bit(1)); longword7_b.setBit(22, new bit(1));
        longword7_b.setBit(25, new bit(1)); longword7_b.setBit(27, new bit(1));
        longword7_b.setBit(28, new bit(1)); longword7_b.setBit(31, new bit(1));
        String longword7_output = multiplier.multiply(longword7_a, longword7_b).toString();
        String expected_output7 = "1,1,1,1,0,0,0,1,1,1,1,1,1,0,1,0,0,1,1,1,0,0,0,1,1,0,1,1,0,1,0,0";
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
        longword8_a.setBit(0, new bit(1)); longword8_a.setBit(1, new bit(1));
        longword8_a.setBit(2, new bit(1)); longword8_a.setBit(4, new bit(1));
        longword8_a.setBit(6, new bit(1)); longword8_a.setBit(8, new bit(1));
        longword8_a.setBit(10, new bit(1)); longword8_a.setBit(11, new bit(1));
        longword8_a.setBit(12, new bit(1)); longword8_a.setBit(13, new bit(1));
        longword8_a.setBit(14, new bit(1)); longword8_a.setBit(15, new bit(1));
        longword8_a.setBit(16, new bit(1)); longword8_a.setBit(19, new bit(1));
        longword8_a.setBit(20, new bit(1)); longword8_a.setBit(23, new bit(1));
        longword8_a.setBit(26, new bit(1)); longword8_a.setBit(29, new bit(1));
        longword longword8_b = new longword(); longword8_b.set(0);
        longword8_b.setBit(0, new bit(1)); longword8_b.setBit(3, new bit(1));
        longword8_b.setBit(5, new bit(1)); longword8_b.setBit(9, new bit(1));
        longword8_b.setBit(10, new bit(1)); longword8_b.setBit(11, new bit(1));
        longword8_b.setBit(12, new bit(1)); longword8_b.setBit(13, new bit(1));
        longword8_b.setBit(15, new bit(1)); longword8_b.setBit(16, new bit(1));
        longword8_b.setBit(17, new bit(1)); longword8_b.setBit(18, new bit(1));
        longword8_b.setBit(19, new bit(1)); longword8_b.setBit(20, new bit(1));
        longword8_b.setBit(21, new bit(1)); longword8_b.setBit(23, new bit(1));
        longword8_b.setBit(26, new bit(1)); longword8_b.setBit(31, new bit(1));
        String longword8_output = multiplier.multiply(longword8_a, longword8_b).toString();
        String expected_output8 = "0,0,1,1,0,0,1,1,1,0,0,1,1,1,1,1,0,1,0,1,0,0,0,1,1,0,1,0,0,1,0,0";
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
        longword9_a.setBit(3, new bit(1)); longword9_a.setBit(7, new bit(1));
        longword9_a.setBit(10, new bit(1)); longword9_a.setBit(11, new bit(1));
        longword9_a.setBit(13, new bit(1)); longword9_a.setBit(15, new bit(1));
        longword9_a.setBit(17, new bit(1)); longword9_a.setBit(18, new bit(1));
        longword9_a.setBit(20, new bit(1)); longword9_a.setBit(21, new bit(1));
        longword9_a.setBit(22, new bit(1)); longword9_a.setBit(23, new bit(1));
        longword9_a.setBit(24, new bit(1)); longword9_a.setBit(29, new bit(1));
        longword9_a.setBit(31, new bit(1));
        longword longword9_b = new longword(); longword9_b.set(0);
        longword9_b.setBit(3, new bit(1)); longword9_b.setBit(4, new bit(1));
        longword9_b.setBit(5, new bit(1)); longword9_b.setBit(6, new bit(1));
        longword9_b.setBit(7, new bit(1)); longword9_b.setBit(10, new bit(1));
        longword9_b.setBit(12, new bit(1)); longword9_b.setBit(16, new bit(1));
        longword9_b.setBit(17, new bit(1)); longword9_b.setBit(18, new bit(1));
        longword9_b.setBit(20, new bit(1)); longword9_b.setBit(22, new bit(1));
        longword9_b.setBit(23, new bit(1)); longword9_b.setBit(27, new bit(1));
        longword9_b.setBit(28, new bit(1)); longword9_b.setBit(30, new bit(1));
        String longword9_output = multiplier.multiply(longword9_a, longword9_b).toString();
        String expected_output9 = "0,1,0,1,0,1,0,0,1,0,0,1,0,1,0,0,0,1,1,0,1,0,1,0,1,0,0,0,0,0,1,0";
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
        longword10_a.setBit(1, new bit(1)); longword10_a.setBit(2, new bit(1));
        longword10_a.setBit(5, new bit(1)); longword10_a.setBit(8, new bit(1));
        longword10_a.setBit(13, new bit(1)); longword10_a.setBit(18, new bit(1));
        longword10_a.setBit(22, new bit(1)); longword10_a.setBit(25, new bit(1));
        longword10_a.setBit(27, new bit(1)); longword10_a.setBit(29, new bit(1));
        longword10_a.setBit(31, new bit(1));
        longword longword10_b = new longword(); longword10_b.set(0);
        longword10_b.setBit(1, new bit(1)); longword10_b.setBit(2, new bit(1));
        longword10_b.setBit(3, new bit(1)); longword10_b.setBit(5, new bit(1));
        longword10_b.setBit(6, new bit(1)); longword10_b.setBit(8, new bit(1));
        longword10_b.setBit(10, new bit(1)); longword10_b.setBit(13, new bit(1));
        longword10_b.setBit(14, new bit(1)); longword10_b.setBit(16, new bit(1));
        longword10_b.setBit(18, new bit(1)); longword10_b.setBit(19, new bit(1));
        longword10_b.setBit(20, new bit(1)); longword10_b.setBit(22, new bit(1));
        longword10_b.setBit(23, new bit(1)); longword10_b.setBit(24, new bit(1));
        longword10_b.setBit(25, new bit(1)); longword10_b.setBit(31, new bit(1));
        String longword10_output = multiplier.multiply(longword10_a, longword10_b).toString();
        String expected_output10 = "1,0,1,1,1,1,0,1,1,1,0,0,1,1,1,1,1,1,1,1,1,0,0,1,0,0,0,1,0,1,0,1";
        System.out.println(
            "Longword a: " + longword10_a.toString() +
            "\nLongword b: " + longword10_b.toString() +
            "\nExpected Output: " + expected_output10 + 
            "\nTest Output: " + longword10_output);
        if(!longword10_output.equals(expected_output10)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 10 END ====\n");

        // case 11
        System.out.println("==== CASE 11 START ====");
        longword longword11_a = new longword(); longword11_a.set(0);
        longword11_a.setBit(2, new bit(1)); longword11_a.setBit(3, new bit(1));
        longword11_a.setBit(4, new bit(1)); longword11_a.setBit(5, new bit(1));
        longword11_a.setBit(6, new bit(1)); longword11_a.setBit(8, new bit(1));
        longword11_a.setBit(9, new bit(1)); longword11_a.setBit(11, new bit(1));
        longword11_a.setBit(12, new bit(1)); longword11_a.setBit(18, new bit(1));
        longword11_a.setBit(19, new bit(1)); longword11_a.setBit(20, new bit(1));
        longword11_a.setBit(21, new bit(1)); longword11_a.setBit(23, new bit(1));
        longword11_a.setBit(24, new bit(1)); longword11_a.setBit(26, new bit(1));
        longword11_a.setBit(28, new bit(1));
        longword longword11_b = new longword(); longword11_b.set(0);
        longword11_b.setBit(0, new bit(1)); longword11_b.setBit(1, new bit(1));
        longword11_b.setBit(3, new bit(1)); longword11_b.setBit(6, new bit(1));
        longword11_b.setBit(7, new bit(1)); longword11_b.setBit(10, new bit(1));
        longword11_b.setBit(11, new bit(1)); longword11_b.setBit(12, new bit(1));
        longword11_b.setBit(14, new bit(1)); longword11_b.setBit(15, new bit(1));
        longword11_b.setBit(19, new bit(1)); longword11_b.setBit(20, new bit(1));
        longword11_b.setBit(21, new bit(1)); longword11_b.setBit(22, new bit(1));
        longword11_b.setBit(23, new bit(1)); longword11_b.setBit(25, new bit(1));
        longword11_b.setBit(27, new bit(1)); longword11_b.setBit(28, new bit(1));
        longword11_b.setBit(30, new bit(1)); longword11_b.setBit(31, new bit(1));
        String longword11_output = multiplier.multiply(longword11_a, longword11_b).toString();
        String expected_output11 = "0,0,1,1,0,1,0,0,0,0,0,0,1,1,0,1,0,1,0,0,0,0,1,0,1,0,1,1,1,0,0,0";
        System.out.println(
            "Longword a: " + longword11_a.toString() +
            "\nLongword b: " + longword11_b.toString() +
            "\nExpected Output: " + expected_output11 + 
            "\nTest Output: " + longword11_output);
        if(!longword11_output.equals(expected_output11)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 11 END ====\n");
        
        // case 12
        System.out.println("==== CASE 12 START ====");
        longword longword12_a = new longword(); longword12_a.set(0);
        longword12_a.setBit(1, new bit(1)); longword12_a.setBit(3, new bit(1));
        longword12_a.setBit(5, new bit(1)); longword12_a.setBit(7, new bit(1));
        longword12_a.setBit(8, new bit(1)); longword12_a.setBit(9, new bit(1));
        longword12_a.setBit(13, new bit(1)); longword12_a.setBit(14, new bit(1));
        longword12_a.setBit(15, new bit(1)); longword12_a.setBit(19, new bit(1));
        longword12_a.setBit(20, new bit(1)); longword12_a.setBit(22, new bit(1));
        longword12_a.setBit(24, new bit(1)); longword12_a.setBit(25, new bit(1));
        longword12_a.setBit(27, new bit(1));
        longword longword12_b = new longword(); longword12_b.set(0);
        longword12_b.setBit(1, new bit(1)); longword12_b.setBit(2, new bit(1));
        longword12_b.setBit(5, new bit(1)); longword12_b.setBit(6, new bit(1));
        longword12_b.setBit(9, new bit(1)); longword12_b.setBit(12, new bit(1));
        longword12_b.setBit(15, new bit(1)); longword12_b.setBit(17, new bit(1));
        longword12_b.setBit(20, new bit(1)); longword12_b.setBit(22, new bit(1));
        longword12_b.setBit(26, new bit(1)); longword12_b.setBit(30, new bit(1));
        String longword12_output = multiplier.multiply(longword12_a, longword12_b).toString();
        String expected_output12 = "0,1,1,1,0,1,1,1,1,0,0,0,0,0,0,1,1,0,1,0,1,1,1,1,1,0,1,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword12_a.toString() +
            "\nLongword b: " + longword12_b.toString() +
            "\nExpected Output: " + expected_output12 + 
            "\nTest Output: " + longword12_output);
        if(!longword12_output.equals(expected_output12)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 12 END ====\n");
        
        // case 13
        System.out.println("==== CASE 13 START ====");
        longword longword13_a = new longword(); longword13_a.set(0);
        longword13_a.setBit(0, new bit(1)); longword13_a.setBit(1, new bit(1));
        longword13_a.setBit(2, new bit(1)); longword13_a.setBit(4, new bit(1));
        longword13_a.setBit(5, new bit(1)); longword13_a.setBit(8, new bit(1));
        longword13_a.setBit(10, new bit(1)); longword13_a.setBit(11, new bit(1));
        longword13_a.setBit(13, new bit(1)); longword13_a.setBit(14, new bit(1));
        longword13_a.setBit(16, new bit(1)); longword13_a.setBit(18, new bit(1));
        longword13_a.setBit(19, new bit(1)); longword13_a.setBit(21, new bit(1));
        longword13_a.setBit(22, new bit(1)); longword13_a.setBit(24, new bit(1));
        longword13_a.setBit(27, new bit(1)); longword13_a.setBit(28, new bit(1));
        longword13_a.setBit(29, new bit(1)); longword13_a.setBit(31, new bit(1));
        longword longword13_b = new longword(); longword13_b.set(0);
        longword13_b.setBit(2, new bit(1)); longword13_b.setBit(6, new bit(1));
        longword13_b.setBit(7, new bit(1)); longword13_b.setBit(9, new bit(1));
        longword13_b.setBit(11, new bit(1)); longword13_b.setBit(14, new bit(1));
        longword13_b.setBit(15, new bit(1)); longword13_b.setBit(16, new bit(1));
        longword13_b.setBit(17, new bit(1)); longword13_b.setBit(19, new bit(1));
        longword13_b.setBit(20, new bit(1)); longword13_b.setBit(22, new bit(1));
        longword13_b.setBit(23, new bit(1)); longword13_b.setBit(24, new bit(1));
        longword13_b.setBit(25, new bit(1)); longword13_b.setBit(26, new bit(1));
        longword13_b.setBit(31, new bit(1));
        String longword13_output = multiplier.multiply(longword13_a, longword13_b).toString();
        String expected_output13 = "0,0,0,0,0,1,1,0,1,0,1,1,0,1,0,1,1,1,0,0,1,1,1,0,1,1,1,1,1,1,0,1";
        System.out.println(
            "Longword a: " + longword13_a.toString() +
            "\nLongword b: " + longword13_b.toString() +
            "\nExpected Output: " + expected_output13 + 
            "\nTest Output: " + longword13_output);
        if(!longword13_output.equals(expected_output13)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 13 END ====\n");

        // case 14
        System.out.println("==== CASE 14 START ====");
        longword longword14_a = new longword(); longword14_a.set(0);
        longword14_a.setBit(3, new bit(1)); longword14_a.setBit(7, new bit(1));
        longword14_a.setBit(8, new bit(1)); longword14_a.setBit(9, new bit(1));
        longword14_a.setBit(11, new bit(1)); longword14_a.setBit(12, new bit(1));
        longword14_a.setBit(15, new bit(1)); longword14_a.setBit(16, new bit(1));
        longword14_a.setBit(17, new bit(1)); longword14_a.setBit(18, new bit(1));
        longword14_a.setBit(25, new bit(1)); longword14_a.setBit(28, new bit(1));
        longword14_a.setBit(31, new bit(1));
        longword longword14_b = new longword(); longword14_b.set(0);
        longword14_b.setBit(2, new bit(1)); longword14_b.setBit(3, new bit(1));
        longword14_b.setBit(4, new bit(1)); longword14_b.setBit(8, new bit(1));
        longword14_b.setBit(9, new bit(1)); longword14_b.setBit(11, new bit(1));
        longword14_b.setBit(13, new bit(1)); longword14_b.setBit(14, new bit(1));
        longword14_b.setBit(15, new bit(1)); longword14_b.setBit(19, new bit(1));
        longword14_b.setBit(22, new bit(1)); longword14_b.setBit(23, new bit(1));
        longword14_b.setBit(24, new bit(1)); longword14_b.setBit(25, new bit(1));
        longword14_b.setBit(28, new bit(1)); longword14_b.setBit(29, new bit(1));
        longword14_b.setBit(30, new bit(1)); longword14_b.setBit(31, new bit(1));
        String longword14_output = multiplier.multiply(longword14_a, longword14_b).toString();
        String expected_output14 = "1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,0,0,1,1,1";
        System.out.println(
            "Longword a: " + longword14_a.toString() +
            "\nLongword b: " + longword14_b.toString() +
            "\nExpected Output: " + expected_output14 + 
            "\nTest Output: " + longword14_output);
        if(!longword14_output.equals(expected_output14)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 14 END ====\n");

        // case 15
        System.out.println("==== CASE 15 START ====");
        longword longword15_a = new longword(); longword15_a.set(0);
        longword15_a.setBit(2, new bit(1)); longword15_a.setBit(3, new bit(1));
        longword15_a.setBit(5, new bit(1)); longword15_a.setBit(6, new bit(1));
        longword15_a.setBit(9, new bit(1)); longword15_a.setBit(15, new bit(1));
        longword15_a.setBit(18, new bit(1)); longword15_a.setBit(20, new bit(1));
        longword15_a.setBit(22, new bit(1)); longword15_a.setBit(24, new bit(1));
        longword15_a.setBit(26, new bit(1)); longword15_a.setBit(27, new bit(1));
        longword15_a.setBit(29, new bit(1)); longword15_a.setBit(30, new bit(1));
        longword longword15_b = new longword(); longword15_b.set(0);
        longword15_b.setBit(0, new bit(1)); longword15_b.setBit(2, new bit(1));
        longword15_b.setBit(4, new bit(1)); longword15_b.setBit(6, new bit(1));
        longword15_b.setBit(7, new bit(1)); longword15_b.setBit(10, new bit(1));
        longword15_b.setBit(11, new bit(1)); longword15_b.setBit(12, new bit(1));
        longword15_b.setBit(16, new bit(1)); longword15_b.setBit(17, new bit(1));
        longword15_b.setBit(18, new bit(1)); longword15_b.setBit(19, new bit(1));
        longword15_b.setBit(21, new bit(1)); longword15_b.setBit(23, new bit(1));
        longword15_b.setBit(24, new bit(1)); longword15_b.setBit(25, new bit(1));
        longword15_b.setBit(26, new bit(1)); longword15_b.setBit(28, new bit(1));
        longword15_b.setBit(30, new bit(1));
        String longword15_output = multiplier.multiply(longword15_a, longword15_b).toString();
        String expected_output15 = "1,1,0,1,1,1,1,1,0,1,0,0,0,0,0,1,0,0,1,1,1,0,0,0,0,1,0,1,1,1,0,0";
        System.out.println(
            "Longword a: " + longword15_a.toString() +
            "\nLongword b: " + longword15_b.toString() +
            "\nExpected Output: " + expected_output15 + 
            "\nTest Output: " + longword15_output);
        if(!longword15_output.equals(expected_output15)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 15 END ====\n");

        // case 16
        System.out.println("==== CASE 16 START ====");
        longword longword16_a = new longword(); longword16_a.set(0);
        longword16_a.setBit(0, new bit(1)); longword16_a.setBit(2, new bit(1));
        longword16_a.setBit(3, new bit(1)); longword16_a.setBit(4, new bit(1));
        longword16_a.setBit(6, new bit(1)); longword16_a.setBit(7, new bit(1));
        longword16_a.setBit(11, new bit(1)); longword16_a.setBit(13, new bit(1));
        longword16_a.setBit(15, new bit(1)); longword16_a.setBit(17, new bit(1));
        longword16_a.setBit(18, new bit(1)); longword16_a.setBit(19, new bit(1));
        longword16_a.setBit(21, new bit(1)); longword16_a.setBit(23, new bit(1));
        longword16_a.setBit(25, new bit(1)); longword16_a.setBit(26, new bit(1));
        longword16_a.setBit(27, new bit(1));
        longword longword16_b = new longword(); longword16_b.set(0);
        longword16_b.setBit(0, new bit(1)); longword16_b.setBit(3, new bit(1));
        longword16_b.setBit(4, new bit(1)); longword16_b.setBit(8, new bit(1));
        longword16_b.setBit(11, new bit(1)); longword16_b.setBit(12, new bit(1));
        longword16_b.setBit(15, new bit(1)); longword16_b.setBit(17, new bit(1));
        longword16_b.setBit(22, new bit(1)); longword16_b.setBit(24, new bit(1));
        longword16_b.setBit(26, new bit(1));
        String longword16_output = multiplier.multiply(longword16_a, longword16_b).toString();
        String expected_output16 = "0,0,1,0,0,1,0,1,1,0,1,0,0,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword16_a.toString() +
            "\nLongword b: " + longword16_b.toString() +
            "\nExpected Output: " + expected_output16 + 
            "\nTest Output: " + longword16_output);
        if(!longword16_output.equals(expected_output16)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 16 END ====\n");

        // case 17
        System.out.println("==== CASE 17 START ====");
        longword longword17_a = new longword(); longword17_a.set(0);
        longword17_a.setBit(0, new bit(1)); longword17_a.setBit(1, new bit(1));
        longword17_a.setBit(2, new bit(1)); longword17_a.setBit(6, new bit(1));
        longword17_a.setBit(7, new bit(1)); longword17_a.setBit(9, new bit(1));
        longword17_a.setBit(11, new bit(1)); longword17_a.setBit(13, new bit(1));
        longword17_a.setBit(15, new bit(1)); longword17_a.setBit(16, new bit(1));
        longword17_a.setBit(17, new bit(1)); longword17_a.setBit(18, new bit(1));
        longword17_a.setBit(19, new bit(1)); longword17_a.setBit(20, new bit(1));
        longword17_a.setBit(22, new bit(1)); longword17_a.setBit(25, new bit(1));
        longword17_a.setBit(27, new bit(1)); longword17_a.setBit(29, new bit(1));
        longword longword17_b = new longword(); longword17_b.set(0);
        longword17_b.setBit(8, new bit(1)); longword17_b.setBit(9, new bit(1));
        longword17_b.setBit(10, new bit(1)); longword17_b.setBit(11, new bit(1));
        longword17_b.setBit(13, new bit(1)); longword17_b.setBit(15, new bit(1));
        longword17_b.setBit(16, new bit(1)); longword17_b.setBit(19, new bit(1));
        longword17_b.setBit(20, new bit(1)); longword17_b.setBit(24, new bit(1));
        longword17_b.setBit(28, new bit(1)); longword17_b.setBit(31, new bit(1));
        String longword17_output = multiplier.multiply(longword17_a, longword17_b).toString();
        String expected_output17 = "0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,1,0,1,0,1,1,0,1,1,1,1,0,1,0,0";
        System.out.println(
            "Longword a: " + longword17_a.toString() +
            "\nLongword b: " + longword17_b.toString() +
            "\nExpected Output: " + expected_output17 + 
            "\nTest Output: " + longword17_output);
        if(!longword17_output.equals(expected_output17)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 17 END ====\n");
        
        // case 18
        System.out.println("==== CASE 18 START ====");
        longword longword18_a = new longword(); longword18_a.set(0);
        longword18_a.setBit(1, new bit(1)); longword18_a.setBit(3, new bit(1));
        longword18_a.setBit(4, new bit(1)); longword18_a.setBit(8, new bit(1));
        longword18_a.setBit(9, new bit(1)); longword18_a.setBit(10, new bit(1));
        longword18_a.setBit(12, new bit(1)); longword18_a.setBit(13, new bit(1));
        longword18_a.setBit(16, new bit(1)); longword18_a.setBit(21, new bit(1));
        longword18_a.setBit(22, new bit(1)); longword18_a.setBit(23, new bit(1));
        longword18_a.setBit(25, new bit(1)); longword18_a.setBit(27, new bit(1));
        longword18_a.setBit(29, new bit(1)); longword18_a.setBit(30, new bit(1));
        longword longword18_b = new longword(); longword18_b.set(0);
        longword18_b.setBit(1, new bit(1)); longword18_b.setBit(2, new bit(1));
        longword18_b.setBit(6, new bit(1)); longword18_b.setBit(9, new bit(1));
        longword18_b.setBit(11, new bit(1)); longword18_b.setBit(16, new bit(1));
        longword18_b.setBit(18, new bit(1)); longword18_b.setBit(20, new bit(1));
        longword18_b.setBit(21, new bit(1)); longword18_b.setBit(22, new bit(1));
        longword18_b.setBit(24, new bit(1)); longword18_b.setBit(25, new bit(1));
        String longword18_output = multiplier.multiply(longword18_a, longword18_b).toString();
        String expected_output18 = "1,0,1,0,1,1,0,0,0,1,0,0,0,0,0,1,1,1,1,1,0,1,0,0,1,0,0,0,0,0,0,0";
        System.out.println(
            "Longword a: " + longword18_a.toString() +
            "\nLongword b: " + longword18_b.toString() +
            "\nExpected Output: " + expected_output18 + 
            "\nTest Output: " + longword18_output);
        if(!longword18_output.equals(expected_output18)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 18 END ====\n");
        
        // case 19
        System.out.println("==== CASE 19 START ====");
        longword longword19_a = new longword(); longword19_a.set(0);
        longword19_a.setBit(2, new bit(1)); longword19_a.setBit(4, new bit(1));
        longword19_a.setBit(5, new bit(1)); longword19_a.setBit(7, new bit(1));
        longword19_a.setBit(8, new bit(1)); longword19_a.setBit(10, new bit(1));
        longword19_a.setBit(11, new bit(1)); longword19_a.setBit(14, new bit(1));
        longword19_a.setBit(16, new bit(1)); longword19_a.setBit(18, new bit(1));
        longword19_a.setBit(21, new bit(1)); longword19_a.setBit(23, new bit(1));
        longword19_a.setBit(24, new bit(1)); longword19_a.setBit(27, new bit(1));
        longword19_a.setBit(28, new bit(1)); longword19_a.setBit(29, new bit(1));
        longword19_a.setBit(31, new bit(1));
        longword longword19_b = new longword(); longword19_b.set(0);
        longword19_b.setBit(1, new bit(1)); longword19_b.setBit(2, new bit(1));
        longword19_b.setBit(6, new bit(1)); longword19_b.setBit(7, new bit(1));
        longword19_b.setBit(8, new bit(1)); longword19_b.setBit(9, new bit(1));
        longword19_b.setBit(10, new bit(1)); longword19_b.setBit(13, new bit(1));
        longword19_b.setBit(19, new bit(1)); longword19_b.setBit(21, new bit(1));
        longword19_b.setBit(23, new bit(1)); longword19_b.setBit(24, new bit(1));
        longword19_b.setBit(26, new bit(1)); longword19_b.setBit(29, new bit(1));
        longword19_b.setBit(30, new bit(1));
        String longword19_output = multiplier.multiply(longword19_a, longword19_b).toString();
        String expected_output19 = "1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,1,0,0,1,1,1,0";
        System.out.println(
            "Longword a: " + longword19_a.toString() +
            "\nLongword b: " + longword19_b.toString() +
            "\nExpected Output: " + expected_output19 + 
            "\nTest Output: " + longword19_output);
        if(!longword19_output.equals(expected_output19)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 19 END ====\n");
        
        // case 20
        System.out.println("==== CASE 20 START ====");
        longword longword20_a = new longword(); longword20_a.set(0);
        longword20_a.setBit(1, new bit(1)); longword20_a.setBit(3, new bit(1));
        longword20_a.setBit(7, new bit(1)); longword20_a.setBit(10, new bit(1));
        longword20_a.setBit(13, new bit(1)); longword20_a.setBit(14, new bit(1));
        longword20_a.setBit(15, new bit(1)); longword20_a.setBit(17, new bit(1));
        longword20_a.setBit(18, new bit(1)); longword20_a.setBit(19, new bit(1));
        longword20_a.setBit(22, new bit(1)); longword20_a.setBit(23, new bit(1));
        longword20_a.setBit(24, new bit(1)); longword20_a.setBit(26, new bit(1));
        longword20_a.setBit(27, new bit(1)); longword20_a.setBit(28, new bit(1));
        longword20_a.setBit(29, new bit(1)); longword20_a.setBit(30, new bit(1));
        longword longword20_b = new longword(); longword20_b.set(0);
        longword20_b.setBit(0, new bit(1)); longword20_b.setBit(2, new bit(1));
        longword20_b.setBit(3, new bit(1)); longword20_b.setBit(6, new bit(1));
        longword20_b.setBit(7, new bit(1)); longword20_b.setBit(9, new bit(1));
        longword20_b.setBit(15, new bit(1)); longword20_b.setBit(16, new bit(1));
        longword20_b.setBit(17, new bit(1)); longword20_b.setBit(20, new bit(1));
        longword20_b.setBit(22, new bit(1)); longword20_b.setBit(23, new bit(1));
        longword20_b.setBit(25, new bit(1)); longword20_b.setBit(29, new bit(1));
        String longword20_output = multiplier.multiply(longword20_a, longword20_b).toString();
        String expected_output20 = "0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,0,1,1,1,1,0,0,0";
        System.out.println(
            "Longword a: " + longword20_a.toString() +
            "\nLongword b: " + longword20_b.toString() +
            "\nExpected Output: " + expected_output20 + 
            "\nTest Output: " + longword20_output);
        if(!longword20_output.equals(expected_output20)) throw new Exception("multiply failed");
        else System.out.println("multiply successed");
        System.out.println("==== CASE 20 END ====\n");
        
        System.out.println("~~~~ TEST \"multiply\" END ~~~~\n");
    }

    public static void runTest() throws Exception{ // test execution method
        // executes all test methods
        testMuliply();
    }
    
    public static void main(String[] args) throws Exception{ // main method
        runTest(); // executes tests
    }    
}
