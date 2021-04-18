public class longword implements ILongword{
    
    private bit[] longword; // declares bit arraay variable for representing longword

    public longword(){
        this.longword = new bit[32]; // initializes 32 size bit array
        for(int index = 0; index < 32; index++){ // stores bit instances to longword
            this.longword[index] = new bit();
        }
    }

    public bit getBit(int i){ // Get bit i
        try{
            validateIndex(i); // checks if the index is valid
        }catch(Exception error){
            System.out.println(error);
            System.exit(0);
        }
        return this.longword[i];
    } 

    public void setBit(int i, bit value){ // set bit i's value
        try{
            validateIndex(i); // checks if the index is valid
        }catch(Exception error){
            System.out.println(error);
            System.exit(0);
        }
        this.longword[i].set(value.getValue());
    }
    
    public longword and(longword other){ // and two longwords, returning a third
        longword new_longword = new longword();
        for(int index = this.longword.length-1; index >= 0; index--){
            bit new_bit = this.longword[index].and(other.getBit(index)); // creates new bit through "and" bit operation
            new_longword.setBit(index, new_bit);
        }
        return new_longword;
    } 

    public longword or(longword other){  // or two longwords, returning a third
        longword new_longword = new longword();
        for(int index = this.longword.length-1; index >= 0; index--){
            bit new_bit = this.longword[index].or(other.getBit(index)); // creates new bit through "or" bit operation
            new_longword.setBit(index, new_bit);
        }
        return new_longword;
    }
    
    public longword xor(longword other){  // xor two longwords, returning a third
        longword new_longword = new longword();
        for(int index = this.longword.length-1; index >= 0; index--){
            bit new_bit = this.longword[index].xor(other.getBit(index)); // creates new bit through "xor" bit operation
            new_longword.setBit(index, new_bit);
        }
        return new_longword;
    }

    public longword not(){  // negate this longword, creating another
        longword new_longword = new longword();
        for(int index = this.longword.length-1; index >= 0; index--){
            bit new_bit = this.longword[index].not(); // creates new bit through "not" bit operation
            new_longword.setBit(index, new_bit);
        }
        return new_longword;
    }

    public longword rightShift(int amount){ // rightshift this longword by amount bits, creating a new longword
        try{
            validateShiftAmount(amount); // checks if the amount is valid
        }catch(Exception error){
            System.out.println(error);
            System.exit(0);
        }
        longword new_longword = new longword();
        int new_index = new_longword.longword.length - 1;
        for(int index = this.longword.length-1-amount; index >= 0; index--){
            new_longword.getBit(new_index).set(this.longword[index].getValue());
            new_index--;
        }
        while(new_index >= 0){ // fills left side with 0s
            new_longword.getBit(new_index).clear();
            new_index--;
        }
        return new_longword;
    }

    public longword leftShift(int amount){ // leftshift this longword by amount bits, creating a new longword
        try{
            validateShiftAmount(amount);  // checks if the amount is valid
        }catch(Exception error){
            System.out.println(error);
            System.exit(0);
        }
        longword new_longword = new longword();
        int new_index = 0;
        for(int index = amount; index < this.longword.length; index++){
            new_longword.getBit(new_index).set(this.longword[index].getValue());
            new_index++;
        }
        while(new_index < new_longword.longword.length){ // fills right side with 0s
            new_longword.getBit(new_index).clear();
            new_index++;
        }
        return new_longword;
    }
    
    @Override
    public String toString(){ // returns a comma separated string of 0's and 1's: "0,0,0,0,0 (etcetera)" for example
        StringBuilder stringBuilder = new StringBuilder();
        for(int index = 0; index < this.longword.length; index++){
            stringBuilder.append(Integer.toString(this.longword[index].getValue()));
            if(index != this.longword.length-1) stringBuilder.append(",");
        }
        return stringBuilder.toString();
    }

    public long getUnsigned(){ // returns the value of this longword as a long
        long unsigned_integer = 0, factor = 1;
        for(int index = this.longword.length-1; index >= 0; index--){
            unsigned_integer += (this.longword[index].getValue()*factor);
            factor *= 2; // updates factor
        }
        return unsigned_integer;
    } 
    
    public int getSigned(){ // returns the value of this longword as an int
        int signed_integer = 0, factor = 1;
        if(this.longword[0].getValue() == 0){ // sign bit is 0 => positive
            for(int index = this.longword.length-1; index >= 1; index--){
                signed_integer += (this.longword[index].getValue()*factor);
                factor *= 2; // updates factor
            }
        }else{ // sign bit is 1 => negative
            longword new_longword = not(); // new long word for 2's complement 
            int carry = 1;
            for(int index = new_longword.longword.length-1; index >= 0; index--){
                if(new_longword.getBit(index).getValue()+carry != 2){
                    signed_integer += ((new_longword.getBit(index).getValue()+carry)*factor);
                    carry = 0; // sets carry to 0
                }
                factor *= 2; // updates factor
            }
            signed_integer *= -1;
        }
        return signed_integer;
    } 

    public void copy(longword other){ // copies the values of the bits from another longword into this one
        for(int index = this.longword.length-1; index >= 0; index--){
            this.longword[index].set(other.getBit(index).getValue()); // copy
        }
    }

    public void set(int value){ // set the value of the bits of this longword (used for tests)
        try{
            validateArg(value); // validates the argument
        }catch(Exception error){
            System.out.println(error); // prints out error
            System.exit(0); // exits
        }
        for(int index = this.longword.length-1; index >= 0; index--){
            this.longword[index].set(value); // sets bit value
        }
    }

    private void validateArg(int value) throws Exception{ // method for validating the argument
        if(value < 0 || value > 1){ // throws Error if the argument is either less than 0 or greater than 1
            throw new Exception("the value for set has to be either 0 or 1");
        }
    }

    private void validateShiftAmount(int amount) throws Exception{ // method for validating shifting amount
        if(amount < 0){
            throw new Exception("the amount has to be either 0 or a positive integer");
        }
    }

    private void validateIndex(int index) throws Exception{ // method for validating array index
        if(index < 0 || index > 31){
            throw new Exception("out of longword's index");
        }
    }
}
