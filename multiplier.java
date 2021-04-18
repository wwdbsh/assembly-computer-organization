public class multiplier {
    
    public static longword multiply(longword a, longword b) throws Exception{ // multiplies two longwords
        longword longword = new longword();
        for(int index = 31; index >= 0; index--){
            if(b.getBit(index).getValue() == 1){ // if "b's value" is 1, performs leftShift to "a" and adds "shifted a" cumulatively. if not, nothing happens
                longword shifted_a = a.leftShift(31-index); // shifts "a" to left by (31 - index)
                longword = rippleAdder.add(longword, shifted_a); // adds "shifted a" cumulatively
            }
        }
        return longword;
    }
}