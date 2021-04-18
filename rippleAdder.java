public class rippleAdder {
    
    public static longword add(longword a, longword b) throws Exception{ // adds two longwords
        longword longword = new longword();
        int carry = 0;
        for(int index = 31; index >= 0; index--){
            bit a_bit = a.getBit(index);
            bit b_bit = b.getBit(index);
            int a_bit_value = a_bit.getValue();
            int b_bit_value = b_bit.getValue();
            int new_value = 0;
            if(a_bit_value == 0 && b_bit_value == 0){
                if(carry == 1){
                    new_value = a_bit.not().getValue();
                    carry = 0;
                }else{
                    new_value = a_bit.and(b_bit).getValue();
                }
            }else if(
                (a_bit_value == 1 && b_bit_value == 0) ||
                (a_bit_value == 0 && b_bit_value == 1)
            ){
                if(carry == 1){
                    new_value = a_bit.and(b_bit).getValue();
                }else{
                    new_value = a_bit.or(b_bit).getValue();
                }
            }else{ // a:1 b:1
                if(carry == 1){
                    new_value = a_bit.and(b_bit).getValue();
                }else{
                    new_value = a_bit.xor(b_bit).getValue();
                    carry = 1;
                }
            }
            longword.setBit(index, new bit(new_value));
        }
        return longword;
    }
    
    public static longword subtract(longword a, longword b) throws Exception{ // subtracts two longwords
        // "b" has to be multiplied by -1 because "a - b" is equal to "a + (-b)" => 2's complement
        longword longword = add(a, twosComplement(b));
        return longword;
    }

    private static longword twosComplement(longword other) throws Exception{ // converts longword in 2's complement
        longword inverted_longword = other.not(); // inverts longword
        longword carry = new longword(); carry.setBit(31, new bit(1));
        longword longword = add(inverted_longword, carry);
        return longword;
    }
}