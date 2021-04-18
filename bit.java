public class bit implements IBit{
    
    private int bit_value; // declares the value of bit class object
    
    public bit(){} // non argument constructor 

    public bit(int value) throws Exception{ // constructor for integer type argument
        validateArg(value);
        this.bit_value = value;
    }

    public void set(int value){
        try{
            validateArg(value);
            this.bit_value = value; // sets the bit value by the argument value which is an user input value
        }catch(Exception error){
            System.out.println(error);
            System.exit(0);
        }
    }

    public void toggle(){
        this.bit_value = this.bit_value == 0 ? 1 : 0; // changes the value from 0 to 1 or 1 to 0
    }

    public void set(){
        this.bit_value = 1; // sets the bit value to 1
    }

    public void clear(){
        this.bit_value = 0; // sets the bit value to 0
    }

    public int getValue(){
        return this.bit_value; // returns the current bit value
    }

    public bit and(bit other){ // AND operation
        bit new_bit = new bit();
        if(this.bit_value == 1){
            if(other.bit_value == 1){
                new_bit.set(); // sets the new_bit to 1 if both bits are 1
                return new_bit;
            }
        }
        new_bit.clear(); // sets the new_bit to 0 if both are not 1
        return new_bit;
    }

    public bit or(bit other){ // OR operation
        bit new_bit = new bit();
        if(this.bit_value == 0){
            if(other.bit_value == 0){
                new_bit.clear(); // sets the new_bit to 0 if both bits are 0
                return new_bit;
            }
        }
        new_bit.set(); // sets the new_bit to 1 if both are not 0
        return new_bit;
    }

    public bit xor(bit other){ // XOR operation
        bit new_bit = new bit();
        if(this.bit_value == other.bit_value){
            new_bit.clear(); // sets the new_bit to 0 if both values are same as each otehr
        }else{
            new_bit.set(); // sets the new_bit to 1 if both values are not same as each other
        }
        return new_bit;
    }

    public bit not(){ // NOT operation
        int value = this.bit_value == 0 ? 1 : 0;
        bit new_bit = new bit();
        new_bit.set(value);
        return new_bit;
    }

    private void validateArg(int value) throws Exception{ // method for validating the argument
        if(value < 0 || value > 1){ // throws Error if the argument is either less than 0 or greater than 1
            throw new Exception("the argument has to be either 0 or 1");
        }
    }
    
    public String toString(){
        return Integer.toString(this.bit_value); // returns the current bit value (0 or 1)
    }
}