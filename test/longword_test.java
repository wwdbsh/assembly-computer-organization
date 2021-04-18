public class longword_test {
    
    private static void testGetBit(int i) throws Exception{ // test method for getBit
        System.out.println("~~~~ TEST \"getBit\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword = generateLongwordWithRandomValue();
        System.out.println(
            "Sample Longword: " + longword.toString() +
            "\nTest Output: " + longword.getBit(i).getValue() +
            "\ngetBit with index " + i + " successed"
        );
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2 = generateLongwordWithRandomValue();
        System.out.println(
            "Sample Longword: " + longword2.toString() +
            "\nTest Output: " + longword2.getBit(i).getValue() +
            "\ngetBit with index " + i + " successed"
        );
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3 = generateLongwordWithRandomValue();
        System.out.println(
            "Sample Longword: " + longword3.toString() +
            "\nTest Output: " + longword3.getBit(i).getValue() +
            "\ngetBit with index " + i + " successed"
        );
        System.out.println("==== CASE 3 END ====\n");
        
        System.out.println("~~~~ TEST \"getBit\" END ~~~~\n");
    }

    private static void testSetBit(int i, bit value, int longword_initial_value) throws Exception{ // test method for setBit
        System.out.println("~~~~ TEST \"setBit\" START ~~~~\n");
        
        // case
        System.out.println("==== CASE START ====");
        longword longword1 = new longword();
        longword1.set(longword_initial_value); longword1.setBit(i, value);
        System.out.println("Test Output: " + longword1.toString());
        System.out.println("setBit successed");
        System.out.println("==== CASE END ====\n");
        
        System.out.println("~~~~ TEST \"setBit\" END ~~~~\n");
    }

    private static void testAnd() throws Exception{ // test method for and operaton
        System.out.println("~~~~ TEST \"and\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_1 = new longword(); longword1_1.set(1);
        longword longword1_2 = new longword(); longword1_2.set(1);
        String expected_output1 = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        String test_output1 = longword1_1.and(longword1_2).toString();
        System.out.println(
            "Expected Output: " + expected_output1 + "\n" +
            "Test Output: " + test_output1
        );
        if(!test_output1.equals(expected_output1)){
            throw new Exception(
                "11111111111111111111111111111111" +
                " and " + 
                "11111111111111111111111111111111"+
                " failed"
            );
        }else{
            System.out.println(
                "11111111111111111111111111111111" +
                " and " + 
                "11111111111111111111111111111111"+
                " successed"
            );
        }
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2_1 = new longword(); longword2_1.set(0);
        longword longword2_2 = new longword(); longword2_2.set(0);
        String expected_output2 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        String test_output2 = longword2_1.and(longword2_2).toString();
        System.out.println(
            "Expected Output: " + expected_output2 + "\n" +
            "Test Output: " + test_output2
        );
        if(!test_output2.equals(expected_output2)){
            throw new Exception(
                "00000000000000000000000000000000" +
                " and " + 
                "00000000000000000000000000000000"+
                " failed"
            );
        }else{
            System.out.println(
                "00000000000000000000000000000000" +
                " and " + 
                "00000000000000000000000000000000"+
                " successed"
            );
        }
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3_1 = new longword(); longword3_1.set(0);
        longword longword3_2 = new longword(); longword3_2.set(1);
        String expected_output3 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        String test_output3 = longword3_1.and(longword3_2).toString();
        System.out.println(
            "Expected Output: " + expected_output3 + "\n" +
            "Test Output: " + test_output3
        );
        if(!test_output3.equals(expected_output3)){
            throw new Exception(
                "00000000000000000000000000000000" +
                " and " + 
                "11111111111111111111111111111111"+
                " failed"
            );
        }else{
            System.out.println(
                "00000000000000000000000000000000" +
                " and " + 
                "11111111111111111111111111111111"+
                " successed"
            );
        }
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4_1 = new longword(); longword4_1.set(0);
        longword4_1.setBit(0, new bit(1)); longword4_1.setBit(30, new bit(1));longword4_1.setBit(31, new bit(1));
        longword longword4_2 = new longword(); longword4_2.set(1);
        longword4_2.setBit(5, new bit(0)); longword4_2.setBit(17, new bit(0));longword4_2.setBit(28, new bit(0));
        String expected_output4 = "1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1";
        String test_output4 = longword4_1.and(longword4_2).toString();
        System.out.println(
            "Expected Output: " + expected_output4 + "\n" +
            "Test Output: " + test_output4
        );
        if(!test_output4.equals(expected_output4)){
            throw new Exception(
                "10000000000000000000000000000011" +
                " and " + 
                "11111111111111111111111111111111"+
                " failed"
            );
        }else{
            System.out.println(
                "10000000000000000000000000000011" +
                " and " + 
                "11111111111111111111111111111111"+
                " successed"
            );
        }
        System.out.println("==== CASE 4 END ====\n");
        
        System.out.println("~~~~ TEST \"and\" END ~~~~\n");
    } 

    private static void testOr() throws Exception{ // test method for or operation
        System.out.println("~~~~ TEST \"or\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_1 = new longword(); longword1_1.set(1);
        longword longword1_2 = new longword(); longword1_2.set(1);
        String expected_output1 = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        String test_output1 = longword1_1.or(longword1_2).toString();
        System.out.println(
            "Expected Output: " + expected_output1 + "\n" +
            "Test Output: " + test_output1
        );
        if(!test_output1.equals(expected_output1)){
            throw new Exception(
                "11111111111111111111111111111111" +
                " or " + 
                "11111111111111111111111111111111"+
                " failed"
            );
        }else{
            System.out.println(
                "11111111111111111111111111111111" +
                " or " + 
                "11111111111111111111111111111111"+
                " successed"
            );
        }
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2_1 = new longword(); longword2_1.set(0);
        longword longword2_2 = new longword(); longword2_2.set(0);
        String expected_output2 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        String test_output2 = longword2_1.or(longword2_2).toString();
        System.out.println(
            "Expected Output: " + expected_output2 + "\n" +
            "Test Output: " + test_output2
        );
        if(!test_output2.equals(expected_output2)){
            throw new Exception(
                "00000000000000000000000000000000" +
                " or " + 
                "00000000000000000000000000000000"+
                " failed"
            );
        }else{
            System.out.println(
                "00000000000000000000000000000000" +
                " or " + 
                "00000000000000000000000000000000"+
                " successed"
            );
        }
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3_1 = new longword(); longword3_1.set(0);
        longword longword3_2 = new longword(); longword3_2.set(1);
        String expected_output3 = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        String test_output3 = longword3_1.or(longword3_2).toString();
        System.out.println(
            "Expected Output: " + expected_output3 + "\n" +
            "Test Output: " + test_output3
        );
        if(!test_output3.equals(expected_output3)){
            throw new Exception(
                "00000000000000000000000000000000" +
                " or " + 
                "11111111111111111111111111111111"+
                " failed"
            );
        }else{
            System.out.println(
                "00000000000000000000000000000000" +
                " or " + 
                "11111111111111111111111111111111"+
                " successed"
            );
        }
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4_1 = new longword(); longword4_1.set(0);
        longword4_1.setBit(0, new bit(1)); longword4_1.setBit(30, new bit(1));longword4_1.setBit(31, new bit(1));
        longword longword4_2 = new longword(); longword4_2.set(1);
        longword4_2.setBit(5, new bit(0)); longword4_2.setBit(17, new bit(0));longword4_2.setBit(28, new bit(0));
        String expected_output4 = "1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1";
        String test_output4 = longword4_1.or(longword4_2).toString();
        System.out.println(
            "Expected Output: " + expected_output4 + "\n" +
            "Test Output: " + test_output4
        );
        if(!test_output4.equals(expected_output4)){
            throw new Exception(
                "10000000000000000000000000000011" +
                " or " + 
                "11111111111111111111111111111111"+
                " failed"
            );
        }else{
            System.out.println(
                "10000000000000000000000000000011" +
                " or " + 
                "11111111111111111111111111111111"+
                " successed"
            );
        }
        System.out.println("==== CASE 4 END ====\n");
        
        System.out.println("~~~~ TEST \"or\" END ~~~~\n");
    } 

    private static void testXor() throws Exception{ // test method for xor operation
        System.out.println("~~~~ TEST \"xor\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1_1 = new longword(); longword1_1.set(1);
        longword longword1_2 = new longword(); longword1_2.set(1);
        String expected_output1 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        String test_output1 = longword1_1.xor(longword1_2).toString();
        System.out.println(
            "Expected Output: " + expected_output1 + "\n" +
            "Test Output: " + test_output1
        );
        if(!test_output1.equals(expected_output1)){
            throw new Exception(
                "11111111111111111111111111111111" +
                " xor " + 
                "11111111111111111111111111111111"+
                " failed"
            );
        }else{
            System.out.println(
                "11111111111111111111111111111111" +
                " xor " + 
                "11111111111111111111111111111111"+
                " successed"
            );
        }
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2_1 = new longword(); longword2_1.set(0);
        longword longword2_2 = new longword(); longword2_2.set(0);
        String expected_output2 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        String test_output2 = longword2_1.xor(longword2_2).toString();
        System.out.println(
            "Expected Output: " + expected_output2 + "\n" +
            "Test Output: " + test_output2
        );
        if(!test_output2.equals(expected_output2)){
            throw new Exception(
                "00000000000000000000000000000000" +
                " xor " + 
                "00000000000000000000000000000000"+
                " failed"
            );
        }else{
            System.out.println(
                "00000000000000000000000000000000" +
                " xor " + 
                "00000000000000000000000000000000"+
                " successed"
            );
        }
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3_1 = new longword(); longword3_1.set(0);
        longword longword3_2 = new longword(); longword3_2.set(1);
        String expected_output3 = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        String test_output3 = longword3_1.xor(longword3_2).toString();
        System.out.println(
            "Expected Output: " + expected_output3 + "\n" +
            "Test Output: " + test_output3
        );
        if(!test_output3.equals(expected_output3)){
            throw new Exception(
                "00000000000000000000000000000000" +
                " xor " + 
                "11111111111111111111111111111111"+
                " failed"
            );
        }else{
            System.out.println(
                "00000000000000000000000000000000" +
                " xor " + 
                "11111111111111111111111111111111"+
                " successed"
            );
        }
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4_1 = new longword(); longword4_1.set(0);
        longword4_1.setBit(0, new bit(1)); longword4_1.setBit(30, new bit(1));longword4_1.setBit(31, new bit(1));
        longword longword4_2 = new longword(); longword4_2.set(1);
        String expected_output4 = "0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0";
        String test_output4 = longword4_1.xor(longword4_2).toString();
        System.out.println(
            "Expected Output: " + expected_output4 + "\n" +
            "Test Output: " + test_output4
        );
        if(!test_output4.equals(expected_output4)){
            throw new Exception(
                "10000000000000000000000000000011" +
                " xor " + 
                "11111111111111111111111111111111"+
                " failed"
            );
        }else{
            System.out.println(
                "10000000000000000000000000000011" +
                " xor " + 
                "11111111111111111111111111111111"+
                " successed"
            );
        }
        System.out.println("==== CASE 4 END ====\n");
        
        System.out.println("~~~~ TEST \"xor\" END ~~~~\n");
    }

    private static void testNot() throws Exception{ // test method for not operation
        System.out.println("~~~~ TEST \"not\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1 = new longword(); longword1.set(1);
        String expected_output1 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        String test_output1 = longword1.not().toString();
        System.out.println(
            "Expected Output: " + expected_output1 + "\n" +
            "Test Output: " + test_output1
        );
        if(!test_output1.equals(expected_output1)) throw new Exception("11111111111111111111111111111111 not failed");
        else System.out.println("11111111111111111111111111111111 not successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2 = new longword(); longword2.set(0);
        String expected_output2 = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        String test_output2 = longword2.not().toString();
        System.out.println(
            "Expected Output: " + expected_output2 + "\n" +
            "Test Output: " + test_output2
        );
        if(!test_output2.equals(expected_output2)) throw new Exception("00000000000000000000000000000000 not failed");
        else System.out.println("00000000000000000000000000000000 not successed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3 = new longword();
        longword3.setBit(0, new bit(1)); longword3.setBit(31, new bit(1));
        longword3.setBit(28, new bit(1)); longword3.setBit(27, new bit(1));
        String expected_output3 = "0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0";
        String test_output3 = longword3.not().toString();
        System.out.println(
            "Expected Output: " + expected_output3 + "\n" +
            "Test Output: " + test_output3
        );
        if(!test_output3.equals(expected_output3)) throw new Exception("10000000000000000000000000011001 not failed");
        else System.out.println("10000000000000000000000000011001 not successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4 = new longword(); longword4.set(1);
        longword4.setBit(0, new bit(0));
        String expected_output4 = "1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        String test_output4 = longword4.not().toString();
        System.out.println(
            "Expected Output: " + expected_output4 + "\n" +
            "Test Output: " + test_output4
        );
        if(!test_output4.equals(expected_output4)) throw new Exception("01111111111111111111111111111111 not failed");
        else System.out.println("01111111111111111111111111111111 not successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5 = new longword(); longword5.set(0);
        longword5.setBit(0, new bit(1)); longword5.setBit(30, new bit(1));longword5.setBit(31, new bit(1));
        String expected_output5 = "0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0";
        String test_output5 = longword5.not().toString();
        System.out.println(
            "Expected Output: " + expected_output5 + "\n" +
            "Test Output: " + test_output5
        );
        if(!test_output5.equals(expected_output5)) throw new Exception("10000000000000000000000000000011 not failed");
        else System.out.println("10000000000000000000000000000011 not successed");
        System.out.println("==== CASE 5 END ====\n");

        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6 = new longword(); longword6.set(0);
        longword6.setBit(1, new bit(1)); longword6.setBit(2, new bit(1));
        longword6.setBit(5, new bit(1)); longword6.setBit(6, new bit(1));
        longword6.setBit(10, new bit(1)); longword6.setBit(11, new bit(1));
        longword6.setBit(13, new bit(1)); longword6.setBit(14, new bit(1));
        longword6.setBit(15, new bit(1)); longword6.setBit(16, new bit(1));
        longword6.setBit(19, new bit(1)); longword6.setBit(20, new bit(1));
        longword6.setBit(21, new bit(1)); longword6.setBit(23, new bit(1));
        longword6.setBit(24, new bit(1)); longword6.setBit(26, new bit(1));
        longword6.setBit(28, new bit(1)); longword6.setBit(29, new bit(1));
        longword6.setBit(30, new bit(1)); longword6.setBit(31, new bit(1));
        String expected_output6 = "1,0,0,1,1,0,0,1,1,1,0,0,1,0,0,0,0,1,1,0,0,0,1,0,0,1,0,1,0,0,0,0";
        String test_output6 = longword6.not().toString();
        System.out.println(
            "Expected Output: " + expected_output6 + "\n" +
            "Test Output: " + test_output6
        );
        if(!test_output6.equals(expected_output6)) throw new Exception("01100110001101111001110110101111 not failed");
        else System.out.println("01100110001101111001110110101111 not successed");
        System.out.println("==== CASE 6 END ====\n");
        
        System.out.println("~~~~ TEST \"not\" END ~~~~\n");
    }

    private static void testRightShift() throws Exception{ // test method for right shfit operation
        System.out.println("~~~~ TEST \"rightShift\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1 = new longword(); longword1.set(1);
        longword test_output1 = longword1.rightShift(100);
        System.out.println("Sample Longword: " + longword1.toString());
        System.out.println("Expected Output: 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 \nTest Output: " + test_output1.toString());
        if(!test_output1.toString().equals("0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0")) throw new Exception("rightShift 100 failed");
        else System.out.println("rightShift 100 successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2 = new longword(); longword2.set(1);
        longword test_output2 = longword2.rightShift(1);
        System.out.println("Sample Longword: " + longword2.toString());
        System.out.println("Expected Output: 0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 \nTest Output: " + test_output2.toString());
        if(!test_output2.toString().equals("0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1")) throw new Exception("rightShift 1 failed");
        else System.out.println("rightShift 1 successed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3 = new longword(); longword3.set(1);
        longword test_output3 = longword3.rightShift(10);
        System.out.println("Sample Longword: " + longword3.toString());
        System.out.println("Expected Output: 0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1\nTest Output: " + test_output3.toString());
        if(!test_output3.toString().equals("0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1")) throw new Exception("rightShift 10 failed");
        else System.out.println("rightShift 10 successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4 = new longword(); longword4.set(1);
        longword test_output4 = longword4.rightShift(25);
        System.out.println("Sample Longword: " + longword4.toString());
        System.out.println("Expected Output: 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1 \nTest Output: " + test_output4.toString());
        if(!test_output4.toString().equals("0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1")) throw new Exception("rightShift 25 failed");
        else System.out.println("rightShift 25 successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5 = new longword(); longword5.set(1);
        longword test_output5 = longword5.rightShift(0);
        System.out.println("Sample Longword: " + longword5.toString());
        System.out.println("Expected Output: 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 \nTest Output: " + test_output5.toString());
        if(!test_output5.toString().equals("1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1")) throw new Exception("rightShift 0 failed");
        else System.out.println("rightShift 0 successed");
        System.out.println("==== CASE 5 END ====\n");
        
        System.out.println("~~~~ TEST \"rightShift\" END ~~~~\n");
    }

    private static void testLeftShift() throws Exception{ // test method for left shift operation
        System.out.println("~~~~ TEST \"leftShift\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1 = new longword(); longword1.set(1);
        longword test_output1 = longword1.leftShift(100);
        System.out.println("Sample Longword: " + longword1.toString());
        System.out.println("Expected Output: 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 \nTest Output: " + test_output1.toString());
        if(!test_output1.toString().equals("0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0")) throw new Exception("leftShift 100 failed");
        else System.out.println("leftShift 100 successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2 = new longword(); longword2.set(1);
        longword test_output2 = longword2.leftShift(1);
        System.out.println("Sample Longword: " + longword2.toString());
        System.out.println("Expected Output: 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0 \nTest Output: " + test_output2.toString());
        if(!test_output2.toString().equals("1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0")) throw new Exception("leftShift 1 failed");
        else System.out.println("leftShift 1 successed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3 = new longword(); longword3.set(1);
        longword test_output3 = longword3.leftShift(10);
        System.out.println("Sample Longword: " + longword3.toString());
        System.out.println("Expected Output: 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0 \nTest Output: " + test_output3.toString());
        if(!test_output3.toString().equals("1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0")) throw new Exception("leftShift 10 failed");
        else System.out.println("leftShift 10 successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4 = new longword(); longword4.set(1);
        longword test_output4 = longword4.leftShift(25);
        System.out.println("Sample Longword: " + longword4.toString());
        System.out.println("Expected Output: 1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 \nTest Output: " + test_output4.toString());
        if(!test_output4.toString().equals("1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0")) throw new Exception("leftShift 25 failed");
        else System.out.println("leftShift 25 successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5 = new longword(); longword5.set(1);
        longword test_output5 = longword5.leftShift(0);
        System.out.println("Sample Longword: " + longword5.toString());
        System.out.println("Expected Output: 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 \nTest Output: " + test_output5.toString());
        if(!test_output5.toString().equals("1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1")) throw new Exception("leftShift 0 failed");
        else System.out.println("leftShift 0 successed");
        System.out.println("==== CASE 5 END ====\n");
        
        System.out.println("~~~~ TEST \"leftShift\" END ~~~~\n");
    }

    private static void testToString() throws Exception{ // test method for toString
        System.out.println("~~~~ TEST \"toString\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1 = new longword(); longword1.set(1);
        String expected_output1 = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        String test_output1 = longword1.toString();
        System.out.println(
            "Expected Output: " + expected_output1 + "\n" +
            "Test Output: " + test_output1
        );
        if(!test_output1.equals(expected_output1)) throw new Exception("11111111111111111111111111111111 toString failed");
        else System.out.println("11111111111111111111111111111111 toString successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2 = new longword(); longword2.set(0);
        String expected_output2 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        String test_output2 = longword2.toString();
        System.out.println(
            "Expected Output: " + expected_output2 + " \n" + 
            "Test Output: " + test_output2);
        if(!test_output2.equals(expected_output2)) throw new Exception("00000000000000000000000000000000 toString failed");
        else System.out.println("00000000000000000000000000000000 toString successed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3 = new longword();
        longword3.setBit(0, new bit(1)); longword3.setBit(31, new bit(1));
        longword3.setBit(28, new bit(1)); longword3.setBit(27, new bit(1));
        String expected_output3 = "1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1";
        String test_output3 = longword3.toString();
        System.out.println(
            "Expected Output: " + expected_output3 + " \n" + 
            "Test Output: " + test_output3);
        if(!test_output3.equals(expected_output3)) throw new Exception("10000000000000000000000000011001 toString failed");
        else System.out.println("10000000000000000000000000011001 toString successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4 = new longword(); longword4.set(1);
        longword4.setBit(0, new bit(0));
        String expected_output4 = "0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        String test_output4 = longword4.toString();
        System.out.println(
            "Expected Output: " + expected_output4 + " \n" + 
            "Test Output: " + test_output4);
        if(!test_output4.equals(expected_output4)) throw new Exception("01111111111111111111111111111111 toString failed");
        else System.out.println("01111111111111111111111111111111 toString successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5 = new longword(); longword5.set(0);
        longword5.setBit(0, new bit(1)); longword5.setBit(30, new bit(1));longword5.setBit(31, new bit(1));
        String expected_output5 = "1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1";
        String test_output5 = longword5.toString();
        System.out.println(
            "Expected Output: " + expected_output5 + " \n" + 
            "Test Output: " + test_output5);
        if(!test_output5.equals(expected_output5)) throw new Exception("10000000000000000000000000000011 toString failed");
        else System.out.println("10000000000000000000000000000011 toString successed");
        System.out.println("==== CASE 5 END ====\n");

        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6 = new longword(); longword6.set(0);
        longword6.setBit(1, new bit(1)); longword6.setBit(2, new bit(1));
        longword6.setBit(5, new bit(1)); longword6.setBit(6, new bit(1));
        longword6.setBit(10, new bit(1)); longword6.setBit(11, new bit(1));
        longword6.setBit(13, new bit(1)); longword6.setBit(14, new bit(1));
        longword6.setBit(15, new bit(1)); longword6.setBit(16, new bit(1));
        longword6.setBit(19, new bit(1)); longword6.setBit(20, new bit(1));
        longword6.setBit(21, new bit(1)); longword6.setBit(23, new bit(1));
        longword6.setBit(24, new bit(1)); longword6.setBit(26, new bit(1));
        longword6.setBit(28, new bit(1)); longword6.setBit(29, new bit(1));
        longword6.setBit(30, new bit(1)); longword6.setBit(31, new bit(1));
        String expected_output6 = "0,1,1,0,0,1,1,0,0,0,1,1,0,1,1,1,1,0,0,1,1,1,0,1,1,0,1,0,1,1,1,1";
        String test_output6 = longword6.toString();
        System.out.println(
            "Expected Output: " + expected_output6 + " \n" + 
            "Test Output: " + test_output6);
        if(!test_output6.equals(expected_output6)) throw new Exception("01100110001101111001110110101111 toString failed");
        else System.out.println("01100110001101111001110110101111 toString successed");
        System.out.println("==== CASE 6 END ====\n");
        
        System.out.println("~~~~ TEST \"toString\" END ~~~~\n");
    }

    private static void testGetUnsigned() throws Exception{ // test method for getUnsigned
        System.out.println("~~~~ TEST \"getUnsigned\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1 = new longword(); longword1.set(1);
        long test_output1 = longword1.getUnsigned();
        System.out.println("Expected Output: 4294967295 \nTest Output: " + test_output1);
        if(test_output1 != 4294967295L) throw new Exception("11111111111111111111111111111111 getUnsigned failed");
        else System.out.println("11111111111111111111111111111111 getUnsigned successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2 = new longword(); longword2.set(0);
        long test_output2 = longword2.getUnsigned();
        System.out.println("Expected Output: 0 \nTest Output: " + test_output2);
        if(test_output2 != 0L) throw new Exception("00000000000000000000000000000000 getUnsigned failed");
        else System.out.println("00000000000000000000000000000000 getUnsigned successed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3 = new longword();
        longword3.setBit(0, new bit(1)); longword3.setBit(31, new bit(1));
        longword3.setBit(28, new bit(1)); longword3.setBit(27, new bit(1));
        long test_output3 = longword3.getUnsigned();
        System.out.println("Expected Output: 2147483673 \nTest Output: " + test_output3);
        if(test_output3 != 2147483673L) throw new Exception("10000000000000000000000000011001 getUnsigned failed");
        else System.out.println("10000000000000000000000000011001 getUnsigned successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4 = new longword(); longword4.set(1);
        longword4.setBit(0, new bit(0));
        long test_output4 = longword4.getUnsigned();
        System.out.println("Expected Output: 2147483647 \nTest Output: " + test_output4);
        if(test_output4 != 2147483647L) throw new Exception("01111111111111111111111111111111 getUnsigned failed");
        else System.out.println("01111111111111111111111111111111 getUnsigned successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5 = new longword(); longword5.set(0);
        longword5.setBit(0, new bit(1)); longword5.setBit(30, new bit(1));longword5.setBit(31, new bit(1));
        long test_output5 = longword5.getUnsigned();
        System.out.println("Expected Output: 2147483651 \nTest Output: " + test_output5);
        if(test_output5 != 2147483651L) throw new Exception("10000000000000000000000000000011 getUnsigned failed");
        else System.out.println("10000000000000000000000000000011 getUnsigned successed");
        System.out.println("==== CASE 5 END ====\n");

        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6 = new longword(); longword6.set(0);
        longword6.setBit(1, new bit(1)); longword6.setBit(2, new bit(1));
        longword6.setBit(5, new bit(1)); longword6.setBit(6, new bit(1));
        longword6.setBit(10, new bit(1)); longword6.setBit(11, new bit(1));
        longword6.setBit(13, new bit(1)); longword6.setBit(14, new bit(1));
        longword6.setBit(15, new bit(1)); longword6.setBit(16, new bit(1));
        longword6.setBit(19, new bit(1)); longword6.setBit(20, new bit(1));
        longword6.setBit(21, new bit(1)); longword6.setBit(23, new bit(1));
        longword6.setBit(24, new bit(1)); longword6.setBit(26, new bit(1));
        longword6.setBit(28, new bit(1)); longword6.setBit(29, new bit(1));
        longword6.setBit(30, new bit(1)); longword6.setBit(31, new bit(1));
        long test_output6 = longword6.getUnsigned();
        System.out.println("Expected Output: 1714920879 \nTest Output: " + test_output6);
        if(test_output6 != 1714920879L) throw new Exception("01100110001101111001110110101111 getUnsigned failed");
        else System.out.println("01100110001101111001110110101111 getUnsigned successed");
        System.out.println("==== CASE 6 END ====\n");
        
        System.out.println("~~~~ TEST \"getUnsigned\" END ~~~~\n");
    }

    private static void testGetSigned() throws Exception{ // test method for getSigned
        System.out.println("~~~~ TEST \"getSigned\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        longword longword1 = new longword(); longword1.set(1);
        int test_output1 = longword1.getSigned();
        System.out.println("Expected Output: -1 \nTest Output: " + test_output1);
        if(test_output1 != -1) throw new Exception("11111111111111111111111111111111 getSigned failed");
        else System.out.println("11111111111111111111111111111111 getSigned successed");
        System.out.println("==== CASE 1 END ====\n");

        // case 2
        System.out.println("==== CASE 2 START ====");
        longword longword2 = new longword(); longword2.set(0);
        int test_output2 = longword2.getSigned();
        System.out.println("Expected Output: 0 \nTest Output: " + test_output2);
        if(test_output2 != 0) throw new Exception("00000000000000000000000000000000 getSigned failed");
        else System.out.println("00000000000000000000000000000000 getSigned successed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        longword longword3 = new longword();
        longword3.setBit(0, new bit(1)); longword3.setBit(31, new bit(1));
        longword3.setBit(28, new bit(1)); longword3.setBit(27, new bit(1));
        int test_output3 = longword3.getSigned();
        System.out.println("Expected Output: -2147483623 \nTest Output: " + test_output3);
        if(test_output3 != -2147483623) throw new Exception("10000000000000000000000000011001 getSigned failed");
        else System.out.println("10000000000000000000000000011001 getSigned successed");
        System.out.println("==== CASE 3 END ====\n");

        // case 4
        System.out.println("==== CASE 4 START ====");
        longword longword4 = new longword(); longword4.set(1);
        longword4.setBit(0, new bit(0));
        int test_output4 = longword4.getSigned();
        System.out.println("Expected Output: 2147483647 \nTest Output: " + test_output4);
        if(test_output4 != 2147483647) throw new Exception("01111111111111111111111111111111 getSigned failed");
        else System.out.println("01111111111111111111111111111111 getSigned successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        longword longword5 = new longword(); longword5.set(0);
        longword5.setBit(0, new bit(1));
        int test_output5 = longword5.getSigned();
        System.out.println("Expected Output: -2147483648 \nTest Output: " + test_output5);
        if(test_output5 != -2147483648) throw new Exception("10000000000000000000000000000000 getSigned failed");
        else System.out.println("10000000000000000000000000000000 getSigned successed");
        System.out.println("==== CASE 5 END ====\n");

        // case 6
        System.out.println("==== CASE 6 START ====");
        longword longword6 = new longword(); longword6.set(0);
        longword6.setBit(1, new bit(1)); longword6.setBit(2, new bit(1));
        longword6.setBit(5, new bit(1)); longword6.setBit(6, new bit(1));
        longword6.setBit(10, new bit(1)); longword6.setBit(11, new bit(1));
        longword6.setBit(13, new bit(1)); longword6.setBit(14, new bit(1));
        longword6.setBit(15, new bit(1)); longword6.setBit(16, new bit(1));
        longword6.setBit(19, new bit(1)); longword6.setBit(20, new bit(1));
        longword6.setBit(24, new bit(1)); longword6.setBit(26, new bit(1));
        longword6.setBit(28, new bit(1)); longword6.setBit(29, new bit(1));
        longword6.setBit(30, new bit(1)); longword6.setBit(31, new bit(1));
        int test_output6 = longword6.getSigned();
        System.out.println("Expected Output: 1714919599 \nTest Output: " + test_output6);
        if(test_output6 != 1714919599) throw new Exception("01100110001101111001100010101111 getSigned failed");
        else System.out.println("01100110001101111001100010101111 getSigned successed");
        System.out.println("==== CASE 6 END ====\n");
        
        System.out.println("~~~~ TEST \"getSigned\" END ~~~~\n");
    }

    private static void testCopy() throws Exception{ // test method for copy
        // this method copies longword randomly generated
        System.out.println("~~~~ TEST \"copy\" START ~~~~\n");
        
        // case
        System.out.println("==== CASE START ====");
        longword longword1 = new longword(); longword1.set(0);
        longword destination_longword = generateLongwordWithRandomValue(); // creates a random longword
        longword1.copy(destination_longword);
        String expected_output1 = destination_longword.toString();
        String test_output1 = longword1.toString();
        System.out.println("Sample Longword: " + expected_output1);
        System.out.println("Expected Output: " + expected_output1 + "\nTest Output: " + test_output1);
        if(test_output1.compareTo(expected_output1) != 0) throw new Exception("copy failed");
        else System.out.println("copy successed");
        System.out.println("==== CASE END ====\n");
        
        System.out.println("~~~~ TEST \"copy\" END ~~~~\n");
    }

    private static void testSet(int value) throws Exception{ // test method for set
        System.out.println("~~~~ TEST \"set\" with " + value + " START ~~~~\n");
        
        // case
        System.out.println("==== CASE START ====");
        longword longword1 = new longword(); longword1.set(value);
        String expected_output1 = getExpectedOutputForTestSet(value);
        String test_output1 = longword1.toString();
        System.out.println("Expected Output: " + expected_output1 + "\nTest Output: " + test_output1);
        if(test_output1.compareTo(expected_output1) != 0) throw new Exception("set failed");
        else System.out.println("set successed");
        System.out.println("==== CASE END ====\n");
        
        System.out.println("~~~~ TEST \"set\" with " + value + " END ~~~~\n");
    }
    
    private static String getExpectedOutputForTestSet(int value){ // method for getting expected output of testSet
        StringBuilder stringBuilder = new StringBuilder();
        for(int index = 0; index < 32; index++){
            stringBuilder.append(value);
            if(index != 31) stringBuilder.append(",");
        }
        return stringBuilder.toString();
    }

    private static longword generateLongwordWithRandomValue() throws Exception{ // method for generating longword set with random value
        longword longword = new longword();
        for(int index = 0; index < 32; index++){
            int random_value = (int)(Math.random()*2); // randomly generates value (0 or 1)
            bit bit = new bit(random_value);
            longword.setBit(index, bit);
        }
        return longword;
    }

    public static void runTest() throws Exception{ // test execution method
        // executes all test methods

        // ////////////// TEST toString SECTION //////////////
        testToString();
        // ////////////// TEST getBit SECTION ////////////// 
        testGetBit(0); testGetBit(2); // error cases // testGetBit(-1); testGetBit(32);
        testGetBit(18); testGetBit(30);
        ////////////// TEST setBit SECTION //////////////
        testSetBit(0, new bit(1), 0); testSetBit(25, new bit(0), 1);  // error cases // testSetBit(-1, new bit(1), 0); testSetBit(32, new bit(0), 1); testSetBit(33, new bit(4), 0); testSetBit(25, new bit(6)), 1;
        testSetBit(13, new bit(1), 0); testSetBit(31, new bit(0), 1);
        ////////////// TEST and SECTION //////////////
        testAnd();
        ////////////// TEST or SECTION //////////////
        testOr();
        ////////////// TEST xor SECTION //////////////
        testXor();
        ////////////// TEST not SECTION //////////////
        testNot();
        ////////////// TEST rightShift SECTION //////////////
        testRightShift();
        ////////////// TEST leftShift SECTION //////////////
        testLeftShift();
        ////////////// TEST getUnsigned SECTION //////////////
        testGetUnsigned();
        ////////////// TEST getSigned SECTION //////////////
        testGetSigned();
        ////////////// TEST copy SECTION //////////////
        testCopy();
        ////////////// TEST set SECTION //////////////
        testSet(1); testSet(0); // error cases // testSet(2); testSet(-1); 
    }
    public static void main(String[] args) throws Exception{ // main method
        runTest(); // executes tests
    }
}
