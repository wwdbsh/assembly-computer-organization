public class bit_test{

    private static void testGetValue() throws Exception{ // test method for getValue
        System.out.println("~~~~ TEST \"getValue\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        int output1 = new bit(0).getValue();
        System.out.println("Expected Output: 0\nTest Output: " + output1);
        if(output1 != 0) throw new Exception("0 getValue failed");
        else System.out.println("0 getValue successed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        int output2 = new bit(1).getValue();
        System.out.println("Expected Output: 1\nTest Output: " + output2);
        if(output2 != 1) throw new Exception("1 getValue failed");
        else System.out.println("1 getValue successed");
        System.out.println("==== CASE 2 END ====\n");
        
        System.out.println("~~~~ TEST \"getValue\" END ~~~~\n");
    }

    private static void testSetWithArg(int value) throws Exception{ // test method for set(with an argument)
        System.out.println("~~~~ TEST \"set with an arg\" START ~~~~\n");
        
        if(value < 0 || value > 1){ // throws Error if the argument is either less than 0 or greater than 1
            throw new Exception("the argument has to be either 0 or 1");
        }

        // case 1
        bit bit1 = new bit();
        System.out.println("==== CASE 1 START ====");
        bit1.set(value);
        System.out.println("Expected Output: " + value + "\nTest Output: " + bit1.getValue());
        if(bit1.getValue() != value) throw new Exception("set with the arg failed");
        else System.out.println("set with the arg successed");
        System.out.println("==== CASE 1 END ====\n");
        
        System.out.println("~~~~ TEST \"set with an arg\" END ~~~~\n");
    }

    private static void testSetWithoutArg() throws Exception{ // test method for set(without an argument)
        System.out.println("~~~~ TEST \"set without an arg\" START ~~~~\n");
        
        // case 1
        bit bit1 = new bit();
        System.out.println("==== CASE 1 START ====");
        bit1.set();
        System.out.println("Expected Output: 1\nTest Output: " + bit1.getValue());
        if(bit1.getValue() != 1) throw new Exception("set without an arg failed");
        else System.out.println("set without an arg successed");
        System.out.println("==== CASE 1 END ====\n");
        
        System.out.println("~~~~ TEST \"set without an arg\" END ~~~~\n");
    }

    private static void testClear() throws Exception{ // test method for clear
        System.out.println("~~~~ TEST \"clear\" START ~~~~\n");
        
        // case 1
        bit bit1 = new bit();
        System.out.println("==== CASE 1 START ====");
        bit1.clear();
        System.out.println("Expected Output: 0\nTest Output: " + bit1.getValue());
        if(bit1.getValue() != 0) throw new Exception("clear failed");
        else System.out.println("clear successed");
        System.out.println("==== CASE 1 END ====\n");
        
        System.out.println("~~~~ TEST \"clear\" END ~~~~\n");
    }

    private static void testToggle() throws Exception{ // test method for toggle
        System.out.println("~~~~ TEST \"toggle\" START ~~~~\n");
        
        // case 1
        bit bit1 = new bit();
        System.out.println("==== CASE 1 START ====");
        bit1.clear(); bit1.toggle();
        System.out.println("Expected Output: 1\nTest Output: " + bit1.getValue());
        if(bit1.getValue() != 1) throw new Exception("0 toggle failed");
        else System.out.println("0 toggle successed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        bit bit2 = new bit();
        System.out.println("==== CASE 2 START ====");
        bit2.set(); bit2.toggle();
        System.out.println("Expected Output: 0\nTest Output: " + bit2.getValue());
        if(bit2.getValue() != 0) throw new Exception("1 toggle failed");
        else System.out.println("1 toggle successed");
        System.out.println("==== CASE 2 END ====\n");
        
        System.out.println("~~~~ TEST \"toggle\" END ~~~~\n");
    }

    private static void testAND() throws Exception{ // test method for AND operation
        System.out.println("~~~~ TEST \"AND\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        int output1 = new bit(0).and(new bit(0)).getValue();
        System.out.println("Expected Output: 0\nTest Output: " + output1);
        if(output1 != 0) throw new Exception("0 AND 0 failed");
        else System.out.println("0 AND 0 successed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        int output2 = new bit(0).and(new bit(1)).getValue();
        System.out.println("Expected Output: 0\nTest Output: " + output2);
        if(output2 != 0) throw new Exception("0 AND 1 failed");
        else System.out.println("0 AND 1 successed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        int output3 = new bit(1).and(new bit(0)).getValue();
        System.out.println("Expected Output: 0\nTest Output: " + output3);
        if(output3 != 0) throw new Exception("1 AND 0 failed");
        else System.out.println("1 AND 0 successed");
        System.out.println("==== CASE 3 END ====\n");
        
        // case 4
        System.out.println("==== CASE 4 START ====");
        int output4 = new bit(1).and(new bit(1)).getValue();
        System.out.println("Expected Output: 1\nTest Output: " + output4);
        if(output4 != 1) throw new Exception("1 AND 1 failed");
        else System.out.println("1 AND 1 successed");
        System.out.println("==== CASE 4 END ====\n");
        
        System.out.println("~~~~ TEST \"AND\" END ~~~~\n");
    }

    private static void testOR() throws Exception{ // test method for OR operation
        System.out.println("~~~~ TEST \"OR\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        int output1 = new bit(0).or(new bit(0)).getValue();
        System.out.println("Expected Output: 0\nTest Output: " + output1);
        if(output1 != 0) throw new Exception("0 OR 0 failed");
        else System.out.println("0 OR 0 successed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        int output2 = new bit(0).or(new bit(1)).getValue();
        System.out.println("Expected Output: 1\nTest Output: " + output2);
        if(output2 != 1) throw new Exception("0 OR 1 failed");
        else System.out.println("0 OR 1 successed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        int output3 = new bit(1).or(new bit(0)).getValue();
        System.out.println("Expected Output: 1\nTest Output: " + output3);
        if(output3 != 1) throw new Exception("1 OR 0 failed");
        else System.out.println("1 OR 0 successed");
        System.out.println("==== CASE 3 END ====\n");
        
        // case 4
        System.out.println("==== CASE 4 START ====");
        int output4 = new bit(1).or(new bit(1)).getValue();
        System.out.println("Expected Output: 1\nTest Output: " + output4);
        if(output4 != 1) throw new Exception("1 OR 1 failed");
        else System.out.println("1 OR 1 successed");
        System.out.println("==== CASE 4 END ====\n");
        
        System.out.println("~~~~ TEST \"OR\" END ~~~~\n");
    }

    private static void testXOR() throws Exception{ // test method for XOR operation
        System.out.println("~~~~ TEST \"XOR\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        int output1 = new bit(0).xor(new bit(0)).getValue();
        System.out.println("Expected Output: 0\nTest Output: " + output1);
        if(output1 != 0) throw new Exception("0 XOR 0 failed");
        else System.out.println("0 XOR 0 successed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        int output2 = new bit(0).xor(new bit(1)).getValue();
        System.out.println("Expected Output: 1\nTest Output: " + output2);
        if(output2 != 1) throw new Exception("0 XOR 1 failed");
        else System.out.println("0 XOR 1 successed");
        System.out.println("==== CASE 2 END ====\n");
        
        // case 3
        System.out.println("==== CASE 3 START ====");
        int output3 = new bit(1).xor(new bit(0)).getValue();
        System.out.println("Expected Output: 1\nTest Output: " + output3);
        if(output3 != 1) throw new Exception("1 XOR 0 failed");
        else System.out.println("1 XOR 0 successed");
        System.out.println("==== CASE 3 END ====\n");
        
        // case 4
        System.out.println("==== CASE 4 START ====");
        int output4 = new bit(1).xor(new bit(1)).getValue();
        System.out.println("Expected Output: 0\nTest Output: " + output4);
        if(output4 != 0) throw new Exception("1 XOR 1 failed");
        else System.out.println("1 XOR 1 successed");
        System.out.println("==== CASE 4 END ====\n");
        
        System.out.println("~~~~ TEST \"XOR\" END ~~~~\n");
    }

    private static void testNOT() throws Exception{ // test method for NOT operation
        System.out.println("~~~~ TEST \"NOT\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        int output1 = new bit(0).not().getValue();
        System.out.println("Expected Output: 1\nTest Output: " + output1);
        if(output1 != 1) throw new Exception("0 NOT failed");
        else System.out.println("0 NOT successed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        int output2 = new bit(1).not().getValue();
        System.out.println("Expected Output: 0\nTest Output: " + output2);
        if(output2 != 0) throw new Exception("1 NOT failed");
        else System.out.println("1 NOT successed");
        System.out.println("==== CASE 2 END ====\n");
        
        System.out.println("~~~~ TEST \"NOT\" END ~~~~\n");
    }

    private static void testToString() throws Exception{ // test method for toString
        String strOutput;
        System.out.println("~~~~ TEST \"toString\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        strOutput = new bit(0).toString();
        System.out.println("Expected Output: \"0\"\nTest Output: \"" + strOutput + "\"");
        if(strOutput.compareTo("0") != 0) throw new Exception("0 toString failed");
        else System.out.println("0 toString successed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        strOutput = new bit(1).toString();
        System.out.println("Expected Output: \"1\"\nTest Output: \"" + strOutput + "\"");
        if(strOutput.compareTo("1") != 0) throw new Exception("1 toString failed");
        else System.out.println("1 toString successed");
        System.out.println("==== CASE 2 END ====\n");
        
        System.out.println("~~~~ TEST \"toString\" END ~~~~\n");
    }
    
    public static void runTest() throws Exception{ // test execution method
        testGetValue(); // executes all test methods
        testSetWithArg(0); // testSetWithArg(2) => case for resulting fail
        testSetWithArg(1);
        testSetWithoutArg();
        testClear();
        testToggle();
        testAND();
        testOR();
        testXOR();
        testNOT();
        testToString();
    }

    public static void main(String[] args) throws Exception{ // main method
        runTest(); // executes tests
    }
}