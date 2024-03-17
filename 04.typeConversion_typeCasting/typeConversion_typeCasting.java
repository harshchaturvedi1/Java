class TypeConversion{
    public static void main(String args []){
        float f = 5.6f;
        int x = (int) f;

        System.out.println(x);

        int num1 = 257;
        int byte1 = (byte) num1;
        System.out.println(byte1); // 1


//         int num1 = 257;: You assign the value 257 to the variable num1, which is of type int.

// int byte1 = (byte) num1;: You attempt to cast the num1 variable to a byte. Since byte can only hold values from -128 to 127, the value 257 is outside of this range.

// When you cast 257 to a byte, the value is truncated to fit into the range of a byte. Truncation means that only the least significant 8 bits are retained, and any higher order bits are discarded. In this case, the least significant 8 bits of 257 are 00000001.

// In binary, 00000001 represents the decimal value 1, so the resulting value after casting is 1.

// System.out.println(byte1);: You print the value of byte1, which is 1.

// So, the output of the code is 1.

// This behavior is due to the way integer overflow and underflow are handled in Java, where the excess bits are simply discarded, resulting in potentially unexpected behavior. It's important to be cautious when performing explicit type casting, especially when converting between data types with different ranges.
    }
}