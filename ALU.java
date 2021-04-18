public class ALU {

    public static longword doOp(bit[] operation, longword a, longword b) throws Exception{
        validateOperation(operation); // validates operation
        longword longword = null;
        // compares bits
        if(operation[0].getValue() == 0){ // 0111
            longword = multiplier.multiply(a, b); // multiply
        }else{ // 1xxx
            if(operation[1].getValue() == 1){ // 11xx
                if(operation[2].getValue() == 1){ // 111x
                    if(operation[3].getValue() == 1){ // 1111
                        longword = rippleAdder.subtract(a, b); // subtract
                    }else{ // 1110
                        longword = rippleAdder.add(a, b); // add
                    }
                }else{ // 110x
                    if(operation[3].getValue() == 1){ // 1101
                        longword = a.rightShift(calculateShiftAmount(b)); // right shift
                    }else{ // 1100
                        longword = a.leftShift(calculateShiftAmount(b)); // left shift
                    }
                }
            }else{ // 10xx
                if(operation[2].getValue() == 1){ // 101x
                    if(operation[3].getValue() == 1){ // 1011
                        longword = a.not(); // not
                    }else{ // 1010
                        longword = a.xor(b); // xor
                    }
                }else{ // 100x
                    if(operation[3].getValue() == 1){ // 1001
                        longword = a.or(b); // or
                    }else{ // 1000
                        longword = a.and(b); // and
                    }
                }   
            }
        }
        return longword;
    }

    private static int calculateShiftAmount(longword b){ // calculates amount for shift
        int amount = 0, factor = 1;
        for(int index = 31; index >= 27; index--){ // the lowest 5 bits
            amount += b.getBit(index).getValue()*factor;
            factor *= 2;
        }
        return amount;
    }

    private static void validateOperation(bit[] operation) throws Exception{
        if(operation.length != 4){
            throw new Exception("operation must be 4 bits.");
        }
        String str_operation =
         operation[0].toString() + 
         operation[1].toString() + 
         operation[2].toString() + 
         operation[3].toString();
        switch(str_operation){
            case "1000": break; // add
            case "1001": break; // or
            case "1010": break; // xor
            case "1011": break; // not
            case "1100": break; // sll
            case "1101": break; // srl
            case "1110": break; // add
            case "1111": break; // sub
            case "0111": break; // mul
            default: throw new Exception("operation is invalid");
        }
    }
}
