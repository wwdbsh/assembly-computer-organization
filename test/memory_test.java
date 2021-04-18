public class memory_test {

    private static void testRead() throws Exception{ // test method for read
        System.out.println("~~~~ TEST \"read\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        memory memory1 = new memory();
        longword address1 = new longword(); address1.set(0);
        longword value1 = new longword(); value1.set(0);
        memory1.write(address1, value1);
        String test_output1 = memory1.read(address1).toString();
        String expected_output1 = value1.toString();
        System.out.println(
            "Address: " + address1.getSigned()*8 +
            "\nValue: " + value1.toString() +
            "\nExpected Output: " + expected_output1 + 
            "\nTest Output: " + test_output1);
        if(!test_output1.equals(expected_output1)) throw new Exception("read failed");
        else System.out.println("read successed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        memory memory2 = new memory();
        longword address2 = new longword(); address2.set(0);
        address2.setBit(22, new bit(1)); address2.setBit(23, new bit(1));
        address2.setBit(24, new bit(1)); address2.setBit(28, new bit(1));
        address2.setBit(29, new bit(1)); address2.setBit(31, new bit(1));
        longword value2 = new longword(); value2.set(0);
        value2.setBit(1, new bit(1)); value2.setBit(3, new bit(1));
        value2.setBit(4, new bit(1)); value2.setBit(6, new bit(1));
        value2.setBit(7, new bit(1)); value2.setBit(12, new bit(1));
        value2.setBit(13, new bit(1)); value2.setBit(16, new bit(1));
        value2.setBit(17, new bit(1)); value2.setBit(21, new bit(1));
        value2.setBit(24, new bit(1)); value2.setBit(25, new bit(1));
        value2.setBit(26, new bit(1)); value2.setBit(27, new bit(1));
        value2.setBit(28, new bit(1)); value2.setBit(29, new bit(1));
        memory2.write(address2, value2);
        String test_output2 = memory2.read(address2).toString();
        String expected_output2 = value2.toString();
        System.out.println(
            "Address: " + address2.getSigned()*8 +
            "\nValue: " + value2.toString() +
            "\nExpected Output: " + expected_output2 + 
            "\nTest Output: " + test_output2);
        if(!test_output2.equals(expected_output2)) throw new Exception("read failed");
        else System.out.println("read successed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        memory memory3 = new memory();
        longword address3 = new longword(); address3.set(0);
        address3.setBit(23, new bit(1)); address3.setBit(27, new bit(1));
        address3.setBit(28, new bit(1)); address3.setBit(29, new bit(1));
        address3.setBit(30, new bit(1)); address3.setBit(31, new bit(1));
        longword value3 = new longword(); value3.set(0);
        value3.setBit(3, new bit(1)); value3.setBit(5, new bit(1));
        value3.setBit(9, new bit(1)); value3.setBit(11, new bit(1));
        value3.setBit(14, new bit(1)); value3.setBit(18, new bit(1));
        value3.setBit(20, new bit(1)); value3.setBit(21, new bit(1));
        value3.setBit(24, new bit(1)); value3.setBit(26, new bit(1));
        value3.setBit(27, new bit(1)); value3.setBit(28, new bit(1));
        value3.setBit(29, new bit(1)); value3.setBit(31, new bit(1));
        memory3.write(address3, value3);
        String test_output3 = memory3.read(address3).toString();
        String expected_output3 = value3.toString();
        System.out.println(
            "Address: " + address3.getSigned()*8 +
            "\nValue: " + value3.toString() +
            "\nExpected Output: " + expected_output3 + 
            "\nTest Output: " + test_output3);
        if(!test_output3.equals(expected_output3)) throw new Exception("read failed");
        else System.out.println("read successed");
        System.out.println("==== CASE 3 END ====\n");
        
        // case 4
        System.out.println("==== CASE 4 START ====");
        memory memory4 = new memory();
        longword address4 = new longword(); address4.set(0);
        address4.setBit(23, new bit(1)); address4.setBit(24, new bit(1));
        address4.setBit(25, new bit(1)); address4.setBit(26, new bit(1));
        address4.setBit(28, new bit(1)); address4.setBit(31, new bit(1));
        longword value4 = new longword(); value4.set(0);
        value4.setBit(1, new bit(1)); value4.setBit(3, new bit(1));
        value4.setBit(5, new bit(1)); value4.setBit(6, new bit(1));
        value4.setBit(8, new bit(1)); value4.setBit(9, new bit(1));
        value4.setBit(11, new bit(1)); value4.setBit(12, new bit(1));
        value4.setBit(16, new bit(1)); value4.setBit(19, new bit(1));
        value4.setBit(21, new bit(1)); value4.setBit(22, new bit(1));
        value4.setBit(23, new bit(1)); value4.setBit(25, new bit(1));
        value4.setBit(26, new bit(1)); value4.setBit(28, new bit(1));
        value4.setBit(29, new bit(1));
        memory4.write(address4, value4);
        String test_output4 = memory4.read(address4).toString();
        String expected_output4 = value4.toString();
        System.out.println(
            "Address: " + address4.getSigned()*8 +
            "\nValue: " + value4.toString() +
            "\nExpected Output: " + expected_output4 + 
            "\nTest Output: " + test_output4);
        if(!test_output4.equals(expected_output4)) throw new Exception("read failed");
        else System.out.println("read successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        memory memory5 = new memory();
        longword address5 = new longword(); address5.set(0);
        address5.setBit(26, new bit(1)); address5.setBit(29, new bit(1));
        address5.setBit(31, new bit(1));
        longword value5 = new longword(); value5.set(0);
        value5.setBit(1, new bit(1)); value5.setBit(5, new bit(1));
        value5.setBit(9, new bit(1)); value5.setBit(11, new bit(1));
        value5.setBit(14, new bit(1)); value5.setBit(17, new bit(1));
        value5.setBit(18, new bit(1)); value5.setBit(20, new bit(1));
        value5.setBit(23, new bit(1)); value5.setBit(25, new bit(1));
        value5.setBit(29, new bit(1));
        memory5.write(address5, value5);
        String test_output5 = memory5.read(address5).toString();
        String expected_output5 = value5.toString();
        System.out.println(
            "Address: " + address5.getSigned()*8 +
            "\nValue: " + value5.toString() +
            "\nExpected Output: " + expected_output5 + 
            "\nTest Output: " + test_output5);
        if(!test_output5.equals(expected_output5)) throw new Exception("read failed");
        else System.out.println("read successed");
        System.out.println("==== CASE 5 END ====\n");

        // case 6
        System.out.println("==== CASE 6 START ====");
        memory memory6 = new memory();
        longword address6 = new longword(); address6.set(0);
        address6.setBit(23, new bit(1)); address6.setBit(24, new bit(1));
        address6.setBit(25, new bit(1)); address6.setBit(26, new bit(1));
        address6.setBit(31, new bit(1));
        longword value6 = new longword(); value6.set(0);
        value6.setBit(0, new bit(1)); value6.setBit(2, new bit(1));
        value6.setBit(3, new bit(1)); value6.setBit(5, new bit(1));
        value6.setBit(8, new bit(1)); value6.setBit(9, new bit(1));
        value6.setBit(14, new bit(1)); value6.setBit(16, new bit(1));
        value6.setBit(18, new bit(1)); value6.setBit(19, new bit(1));
        value6.setBit(24, new bit(1)); value6.setBit(26, new bit(1));
        value6.setBit(27, new bit(1)); value6.setBit(28, new bit(1));
        memory6.write(address6, value6);
        String test_output6 = memory6.read(address6).toString();
        String expected_output6 = value6.toString();
        System.out.println(
            "Address: " + address6.getSigned()*8 +
            "\nValue: " + value6.toString() +
            "\nExpected Output: " + expected_output6 + 
            "\nTest Output: " + test_output6);
        if(!test_output6.equals(expected_output6)) throw new Exception("read failed");
        else System.out.println("read successed");
        System.out.println("==== CASE 6 END ====\n");

        // case 7
        System.out.println("==== CASE 7 START ====");
        memory memory7 = new memory();
        longword address7 = new longword(); address7.set(0);
        address7.setBit(26, new bit(1)); address7.setBit(28, new bit(1));
        address7.setBit(29, new bit(1)); address7.setBit(30, new bit(1));
        address7.setBit(31, new bit(1));
        longword value7 = new longword(); value7.set(0);
        value7.setBit(0, new bit(1)); value7.setBit(1, new bit(1));
        value7.setBit(3, new bit(1)); value7.setBit(8, new bit(1));
        value7.setBit(9, new bit(1)); value7.setBit(12, new bit(1));
        value7.setBit(13, new bit(1)); value7.setBit(16, new bit(1));
        value7.setBit(17, new bit(1)); value7.setBit(19, new bit(1));
        value7.setBit(22, new bit(1)); value7.setBit(25, new bit(1));
        value7.setBit(27, new bit(1)); value7.setBit(30, new bit(1));
        value7.setBit(31, new bit(1));
        memory7.write(address7, value7);
        String test_output7 = memory7.read(address7).toString();
        String expected_output7 = value7.toString();
        System.out.println(
            "Address: " + address7.getSigned()*8 +
            "\nValue: " + value7.toString() +
            "\nExpected Output: " + expected_output7 + 
            "\nTest Output: " + test_output7);
        if(!test_output7.equals(expected_output7)) throw new Exception("read failed");
        else System.out.println("read successed");
        System.out.println("==== CASE 7 END ====\n");

        // case 8
        System.out.println("==== CASE 8 START ====");
        memory memory8 = new memory();
        longword address8 = new longword(); address8.set(0);
        address8.setBit(22, new bit(1)); address8.setBit(23, new bit(1));
        address8.setBit(26, new bit(1)); address8.setBit(27, new bit(1));
        address8.setBit(28, new bit(1)); address8.setBit(30, new bit(1));
        longword value8 = new longword(); value8.set(0);
        value8.setBit(1, new bit(1)); value8.setBit(4, new bit(1));
        value8.setBit(5, new bit(1)); value8.setBit(10, new bit(1));
        value8.setBit(12, new bit(1)); value8.setBit(16, new bit(1));
        value8.setBit(17, new bit(1)); value8.setBit(18, new bit(1));
        value8.setBit(19, new bit(1)); value8.setBit(20, new bit(1));
        value8.setBit(23, new bit(1)); value8.setBit(26, new bit(1));
        value8.setBit(27, new bit(1)); value8.setBit(28, new bit(1));
        value8.setBit(29, new bit(1)); value8.setBit(31, new bit(1));
        memory8.write(address8, value8);
        String test_output8 = memory8.read(address8).toString();
        String expected_output8 = value8.toString();
        System.out.println(
            "Address: " + address8.getSigned()*8 +
            "\nValue: " + value8.toString() +
            "\nExpected Output: " + expected_output8 + 
            "\nTest Output: " + test_output8);
        if(!test_output8.equals(expected_output8)) throw new Exception("read failed");
        else System.out.println("read successed");
        System.out.println("==== CASE 8 END ====\n");

        // case 9
        System.out.println("==== CASE 9 START ====");
        memory memory9 = new memory();
        longword address9 = new longword(); address9.set(0);
        address9.setBit(22, new bit(1)); address9.setBit(25, new bit(1));
        address9.setBit(26, new bit(1)); address9.setBit(28, new bit(1));
        address9.setBit(30, new bit(1));
        longword value9 = new longword(); value9.set(0);
        value9.setBit(0, new bit(1)); value9.setBit(3, new bit(1));
        value9.setBit(4, new bit(1)); value9.setBit(6, new bit(1));
        value9.setBit(10, new bit(1)); value9.setBit(14, new bit(1));
        value9.setBit(15, new bit(1)); value9.setBit(16, new bit(1));
        value9.setBit(18, new bit(1)); value9.setBit(19, new bit(1));
        value9.setBit(20, new bit(1)); value9.setBit(22, new bit(1));
        value9.setBit(23, new bit(1)); value9.setBit(24, new bit(1));
        value9.setBit(26, new bit(1)); value9.setBit(27, new bit(1));
        value9.setBit(30, new bit(1)); value9.setBit(31, new bit(1));
        memory9.write(address9, value9);
        String test_output9 = memory9.read(address9).toString();
        String expected_output9 = value9.toString();
        System.out.println(
            "Address: " + address9.getSigned()*8 +
            "\nValue: " + value9.toString() +
            "\nExpected Output: " + expected_output9 + 
            "\nTest Output: " + test_output9);
        if(!test_output9.equals(expected_output9)) throw new Exception("read failed");
        else System.out.println("read successed");
        System.out.println("==== CASE 9 END ====\n");

        // case 10
        System.out.println("==== CASE 10 START ====");
        memory memory10 = new memory();
        longword address10 = new longword(); address10.set(0);
        address10.setBit(24, new bit(1)); address10.setBit(25, new bit(1));
        address10.setBit(26, new bit(1)); address10.setBit(30, new bit(1));
        longword value10 = new longword(); value10.set(0);
        value10.setBit(1, new bit(1)); value10.setBit(2, new bit(1));
        value10.setBit(3, new bit(1)); value10.setBit(4, new bit(1));
        value10.setBit(7, new bit(1)); value10.setBit(8, new bit(1));
        value10.setBit(10, new bit(1)); value10.setBit(14, new bit(1));
        value10.setBit(15, new bit(1)); value10.setBit(17, new bit(1));
        value10.setBit(20, new bit(1)); value10.setBit(21, new bit(1));
        value10.setBit(22, new bit(1)); value10.setBit(23, new bit(1));
        value10.setBit(24, new bit(1)); value10.setBit(25, new bit(1));
        value10.setBit(28, new bit(1)); value10.setBit(30, new bit(1));
        memory10.write(address10, value10);
        String test_output10 = memory10.read(address10).toString();
        String expected_output10 = value10.toString();
        System.out.println(
            "Address: " + address10.getSigned()*8 +
            "\nValue: " + value10.toString() +
            "\nExpected Output: " + expected_output10 + 
            "\nTest Output: " + test_output10);
        if(!test_output10.equals(expected_output10)) throw new Exception("read failed");
        else System.out.println("read successed");
        System.out.println("==== CASE 10 END ====\n");
        
        System.out.println("~~~~ TEST \"read\" END ~~~~\n");
    }

    private static void testWrite() throws Exception{ // test method for write
        System.out.println("~~~~ TEST \"write\" START ~~~~\n");
        
        // case 1
        System.out.println("==== CASE 1 START ====");
        memory memory1 = new memory();
        longword address1 = new longword(); address1.set(0);
        longword value1 = new longword(); value1.set(1);
        memory1.write(address1, value1);
        String test_output1 = memory1.read(address1).toString();
        String expected_output1 = value1.toString();
        System.out.println(
            "Address: " + address1.getSigned()*8 +
            "\nValue: " + value1.toString() +
            "\nExpected Output: " + expected_output1 + 
            "\nTest Output: " + test_output1);
        if(!test_output1.equals(expected_output1)) throw new Exception("write failed");
        else System.out.println("write successed");
        System.out.println("==== CASE 1 END ====\n");
        
        // case 2
        System.out.println("==== CASE 2 START ====");
        memory memory2 = new memory();
        longword address2 = new longword(); address2.set(0);
        address2.setBit(25, new bit(1)); address2.setBit(26, new bit(1));
        address2.setBit(28, new bit(1)); address2.setBit(29, new bit(1));
        address2.setBit(31, new bit(1));
        longword value2 = new longword(); value2.set(0);
        value2.setBit(1, new bit(1)); value2.setBit(3, new bit(1));
        value2.setBit(4, new bit(1)); value2.setBit(5, new bit(1));
        value2.setBit(6, new bit(1)); value2.setBit(11, new bit(1));
        value2.setBit(12, new bit(1)); value2.setBit(17, new bit(1));
        value2.setBit(21, new bit(1)); value2.setBit(24, new bit(1));
        value2.setBit(25, new bit(1)); value2.setBit(26, new bit(1));
        value2.setBit(29, new bit(1)); value2.setBit(30, new bit(1));
        value2.setBit(31, new bit(1));
        memory2.write(address2, value2);
        String test_output2 = memory2.read(address2).toString();
        String expected_output2 = value2.toString();
        System.out.println(
            "Address: " + address2.getSigned()*8 +
            "\nValue: " + value2.toString() +
            "\nExpected Output: " + expected_output2 + 
            "\nTest Output: " + test_output2);
        if(!test_output2.equals(expected_output2)) throw new Exception("write failed");
        else System.out.println("write successed");
        System.out.println("==== CASE 2 END ====\n");

        // case 3
        System.out.println("==== CASE 3 START ====");
        memory memory3 = new memory();
        longword address3 = new longword(); address3.set(0);
        address3.setBit(22, new bit(1)); address3.setBit(23, new bit(1));
        address3.setBit(24, new bit(1)); address3.setBit(27, new bit(1));
        address3.setBit(28, new bit(1)); address3.setBit(29, new bit(1));
        address3.setBit(30, new bit(1)); address3.setBit(31, new bit(1));
        longword value3 = new longword(); value3.set(0);
        value3.setBit(0, new bit(1)); value3.setBit(1, new bit(1));
        value3.setBit(2, new bit(1)); value3.setBit(5, new bit(1));
        value3.setBit(6, new bit(1)); value3.setBit(7, new bit(1));
        value3.setBit(11, new bit(1)); value3.setBit(12, new bit(1));
        value3.setBit(13, new bit(1)); value3.setBit(14, new bit(1));
        value3.setBit(15, new bit(1)); value3.setBit(16, new bit(1));
        value3.setBit(17, new bit(1)); value3.setBit(23, new bit(1));
        value3.setBit(25, new bit(1)); value3.setBit(26, new bit(1));
        value3.setBit(29, new bit(1));
        memory3.write(address3, value3);
        String test_output3 = memory3.read(address3).toString();
        String expected_output3 = value3.toString();
        System.out.println(
            "Address: " + address3.getSigned()*8 +
            "\nValue: " + value3.toString() +
            "\nExpected Output: " + expected_output3 + 
            "\nTest Output: " + test_output3);
        if(!test_output3.equals(expected_output3)) throw new Exception("write failed");
        else System.out.println("write successed");
        System.out.println("==== CASE 3 END ====\n");
        
        // case 4
        System.out.println("==== CASE 4 START ====");
        memory memory4 = new memory();
        longword address4 = new longword(); address4.set(0);
        address4.setBit(22, new bit(1)); address4.setBit(24, new bit(1));
        address4.setBit(25, new bit(1)); address4.setBit(27, new bit(1));
        address4.setBit(28, new bit(1)); address4.setBit(30, new bit(1));
        longword value4 = new longword(); value4.set(0);
        value4.setBit(0, new bit(1)); value4.setBit(1, new bit(1));
        value4.setBit(2, new bit(1)); value4.setBit(3, new bit(1));
        value4.setBit(5, new bit(1)); value4.setBit(7, new bit(1));
        value4.setBit(11, new bit(1)); value4.setBit(12, new bit(1));
        value4.setBit(13, new bit(1)); value4.setBit(14, new bit(1));
        value4.setBit(15, new bit(1)); value4.setBit(16, new bit(1));
        value4.setBit(18, new bit(1)); value4.setBit(19, new bit(1));
        value4.setBit(25, new bit(1)); value4.setBit(29, new bit(1));
        value4.setBit(31, new bit(1));
        memory4.write(address4, value4);
        String test_output4 = memory4.read(address4).toString();
        String expected_output4 = value4.toString();
        System.out.println(
            "Address: " + address4.getSigned()*8 +
            "\nValue: " + value4.toString() +
            "\nExpected Output: " + expected_output4 + 
            "\nTest Output: " + test_output4);
        if(!test_output4.equals(expected_output4)) throw new Exception("write failed");
        else System.out.println("write successed");
        System.out.println("==== CASE 4 END ====\n");

        // case 5
        System.out.println("==== CASE 5 START ====");
        memory memory5 = new memory();
        longword address5 = new longword(); address5.set(0);
        address5.setBit(22, new bit(1)); address5.setBit(23, new bit(1));
        address5.setBit(24, new bit(1)); address5.setBit(31, new bit(1));
        longword value5 = new longword(); value5.set(0);
        value5.setBit(0, new bit(1)); value5.setBit(2, new bit(1));
        value5.setBit(5, new bit(1)); value5.setBit(7, new bit(1));
        value5.setBit(8, new bit(1)); value5.setBit(9, new bit(1));
        value5.setBit(10, new bit(1)); value5.setBit(11, new bit(1));
        value5.setBit(12, new bit(1)); value5.setBit(13, new bit(1));
        value5.setBit(15, new bit(1)); value5.setBit(18, new bit(1));
        value5.setBit(19, new bit(1)); value5.setBit(22, new bit(1));
        value5.setBit(23, new bit(1)); value5.setBit(27, new bit(1));
        value5.setBit(28, new bit(1)); value5.setBit(30, new bit(1));
        value5.setBit(31, new bit(1));
        memory5.write(address5, value5);
        String test_output5 = memory5.read(address5).toString();
        String expected_output5 = value5.toString();
        System.out.println(
            "Address: " + address5.getSigned()*8 +
            "\nValue: " + value5.toString() +
            "\nExpected Output: " + expected_output5 + 
            "\nTest Output: " + test_output5);
        if(!test_output5.equals(expected_output5)) throw new Exception("write failed");
        else System.out.println("write successed");
        System.out.println("==== CASE 5 END ====\n");

        // case 6
        System.out.println("==== CASE 6 START ====");
        memory memory6 = new memory();
        longword address6 = new longword(); address6.set(0);
        address6.setBit(23, new bit(1)); address6.setBit(26, new bit(1));
        address6.setBit(28, new bit(1)); address6.setBit(30, new bit(1));
        longword value6 = new longword(); value6.set(0);
        value6.setBit(0, new bit(1)); value6.setBit(2, new bit(1));
        value6.setBit(4, new bit(1)); value6.setBit(5, new bit(1));
        value6.setBit(6, new bit(1)); value6.setBit(7, new bit(1));
        value6.setBit(13, new bit(1)); value6.setBit(14, new bit(1));
        value6.setBit(15, new bit(1)); value6.setBit(17, new bit(1));
        value6.setBit(21, new bit(1)); value6.setBit(22, new bit(1));
        value6.setBit(23, new bit(1)); value6.setBit(24, new bit(1));
        value6.setBit(27, new bit(1)); value6.setBit(28, new bit(1));
        value6.setBit(30, new bit(1));
        memory6.write(address6, value6);
        String test_output6 = memory6.read(address6).toString();
        String expected_output6 = value6.toString();
        System.out.println(
            "Address: " + address6.getSigned()*8 +
            "\nValue: " + value6.toString() +
            "\nExpected Output: " + expected_output6 + 
            "\nTest Output: " + test_output6);
        if(!test_output6.equals(expected_output6)) throw new Exception("write failed");
        else System.out.println("write successed");
        System.out.println("==== CASE 6 END ====\n");

        // case 7
        System.out.println("==== CASE 7 START ====");
        memory memory7 = new memory();
        longword address7 = new longword(); address7.set(0);
        address7.setBit(22, new bit(1)); address7.setBit(23, new bit(1));
        address7.setBit(27, new bit(1)); address7.setBit(29, new bit(1));
        address7.setBit(30, new bit(1)); address7.setBit(31, new bit(1));
        longword value7 = new longword(); value7.set(0);
        value7.setBit(1, new bit(1)); value7.setBit(2, new bit(1));
        value7.setBit(3, new bit(1)); value7.setBit(7, new bit(1));
        value7.setBit(8, new bit(1)); value7.setBit(9, new bit(1));
        value7.setBit(10, new bit(1)); value7.setBit(11, new bit(1));
        value7.setBit(13, new bit(1)); value7.setBit(15, new bit(1));
        value7.setBit(18, new bit(1)); value7.setBit(23, new bit(1));
        value7.setBit(26, new bit(1)); value7.setBit(28, new bit(1));
        value7.setBit(29, new bit(1)); value7.setBit(30, new bit(1));
        value7.setBit(31, new bit(1));
        memory7.write(address7, value7);
        String test_output7 = memory7.read(address7).toString();
        String expected_output7 = value7.toString();
        System.out.println(
            "Address: " + address7.getSigned()*8 +
            "\nValue: " + value7.toString() +
            "\nExpected Output: " + expected_output7 + 
            "\nTest Output: " + test_output7);
        if(!test_output7.equals(expected_output7)) throw new Exception("write failed");
        else System.out.println("write successed");
        System.out.println("==== CASE 7 END ====\n");

        // case 8
        System.out.println("==== CASE 8 START ====");
        memory memory8 = new memory();
        longword address8 = new longword(); address8.set(0);
        address8.setBit(24, new bit(1)); address8.setBit(27, new bit(1));
        longword value8 = new longword(); value8.set(0);
        value8.setBit(1, new bit(1)); value8.setBit(2, new bit(1));
        value8.setBit(3, new bit(1)); value8.setBit(5, new bit(1));
        value8.setBit(10, new bit(1)); value8.setBit(12, new bit(1));
        value8.setBit(13, new bit(1)); value8.setBit(16, new bit(1));
        value8.setBit(17, new bit(1)); value8.setBit(19, new bit(1));
        value8.setBit(21, new bit(1)); value8.setBit(22, new bit(1));
        value8.setBit(24, new bit(1));
        memory8.write(address8, value8);
        String test_output8 = memory8.read(address8).toString();
        String expected_output8 = value8.toString();
        System.out.println(
            "Address: " + address8.getSigned()*8 +
            "\nValue: " + value8.toString() +
            "\nExpected Output: " + expected_output8 + 
            "\nTest Output: " + test_output8);
        if(!test_output8.equals(expected_output8)) throw new Exception("write failed");
        else System.out.println("write successed");
        System.out.println("==== CASE 8 END ====\n");

        // case 9
        System.out.println("==== CASE 9 START ====");
        memory memory9 = new memory();
        longword address9 = new longword(); address9.set(0);
        address9.setBit(26, new bit(1)); address9.setBit(27, new bit(1));
        address9.setBit(29, new bit(1)); address9.setBit(30, new bit(1));
        longword value9 = new longword(); value9.set(0);
        value9.setBit(2, new bit(1)); value9.setBit(4, new bit(1));
        value9.setBit(9, new bit(1)); value9.setBit(11, new bit(1));
        value9.setBit(15, new bit(1)); value9.setBit(21, new bit(1));
        value9.setBit(24, new bit(1)); value9.setBit(25, new bit(1));
        value9.setBit(26, new bit(1)); value9.setBit(27, new bit(1));
        value9.setBit(29, new bit(1)); value9.setBit(31, new bit(1));
        memory9.write(address9, value9);
        String test_output9 = memory9.read(address9).toString();
        String expected_output9 = value9.toString();
        System.out.println(
            "Address: " + address9.getSigned()*8 +
            "\nValue: " + value9.toString() +
            "\nExpected Output: " + expected_output9 + 
            "\nTest Output: " + test_output9);
        if(!test_output9.equals(expected_output9)) throw new Exception("write failed");
        else System.out.println("write successed");
        System.out.println("==== CASE 9 END ====\n");

        // case 10
        System.out.println("==== CASE 10 START ====");
        memory memory10 = new memory();
        longword address10 = new longword(); address10.set(0);
        address10.setBit(22, new bit(1)); address10.setBit(23, new bit(1));
        address10.setBit(24, new bit(1)); address10.setBit(25, new bit(1));
        address10.setBit(29, new bit(1)); address10.setBit(30, new bit(1));
        address10.setBit(31, new bit(1));
        longword value10 = new longword(); value10.set(0);
        value10.setBit(1, new bit(1)); value10.setBit(10, new bit(1));
        value10.setBit(11, new bit(1)); value10.setBit(12, new bit(1));
        value10.setBit(17, new bit(1)); value10.setBit(19, new bit(1));
        value10.setBit(25, new bit(1)); value10.setBit(26, new bit(1));
        memory10.write(address10, value10);
        String test_output10 = memory10.read(address10).toString();
        String expected_output10 = value10.toString();
        System.out.println(
            "Address: " + address10.getSigned()*8 +
            "\nValue: " + value10.toString() +
            "\nExpected Output: " + expected_output10 + 
            "\nTest Output: " + test_output10);
        if(!test_output10.equals(expected_output10)) throw new Exception("write failed");
        else System.out.println("write successed");
        System.out.println("==== CASE 10 END ====\n");
        
        System.out.println("~~~~ TEST \"write\" END ~~~~\n");
    }

    private static void printIdx(longword lw){
        System.out.println("===============================");
        for(int i = 0; i < 32; i++){
            if(lw.getBit(i).getValue() == 1){
                System.out.println(i);
            }
        }
        System.out.println("===============================");
    }

    private static longword generateAddressWithRandomValue() throws Exception{ // method for generating longword set with random value
        longword longword = new longword();
        for(int index = 22; index < 32; index++){
            int random_value = (int)(Math.random()*2); // randomly generates value (0 or 1)
            bit bit = new bit(random_value);
            longword.setBit(index, bit);
        }
        return longword;
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
        testRead();
        testWrite();
    }
    
    public static void main(String[] args) throws Exception{ // main method
        runTest(); // executes tests
    }    
}
