public class memory{
    private final int SIZE = 8*1024; // declares memory size
    private final int LAST_ADDR = 8176;

    private bit[] memory = null; // declares memory

    public memory() throws Exception{
        this.memory = new bit[SIZE]; // 1024 bytes
        for(int index = 0; index < SIZE; index++){
            this.memory[index] = new bit(); // allocates memory
        }
    }

    public longword read(longword address) throws Exception{ // method for reading requested address
        int address_position = address.getSigned()*8; // gets address position
        validateAddress(address_position); // validates address position
        longword requested_longword = new longword();
        int end_point = address_position == LAST_ADDR ? address_position+16 : address_position+32; 
        for(int index = address_position; index < end_point; index++){
            requested_longword.setBit(index-address_position, this.memory[index]); // sets longword from requested address
        }
        return requested_longword;
    }

    public void write(longword address, longword value) throws Exception{ // method for writing value on requested address
        int address_position = address.getSigned()*8; // gets address position
        validateAddress(address_position); // validates address position
        for(int index = address_position; index < address_position+32; index++){
            this.memory[index].set(value.getBit(index-(address_position)).getValue()); // sets values on requested address
        }
    }

    private void validateAddress(int address_position) throws Exception{ // method for validating address position
        if(address_position < 0 || address_position > SIZE-16){
            throw new Exception("Requested address is out of the range");
        }
    }

    @Override
    public String toString(){ // returns a comma separated string of 0's and 1's: "0,0,0,0,0 (etcetera)"
        StringBuilder stringBuilder = new StringBuilder();
        for(int index = 0; index < this.memory.length; index++){
            stringBuilder.append(Integer.toString(this.memory[index].getValue()));
            if(index != this.memory.length-1) stringBuilder.append(",");
        }
        return stringBuilder.toString();
    }
}