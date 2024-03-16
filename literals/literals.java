class Literals{
    public static void main(String args[]){
        int decimal = 10;       // Decimal literal
        int hex = 0x1A;         // Hexadecimal literal (starts with 0x or 0X)
        int octal = 076;        // Octal literal (starts with 0)
        int binary = 0b1010;    // Binary literal (starts with 0b or 0B)
        
        // to differenciate zeros in code
        int zerosDiff = 1_00_00_000; // o/p => 10000000


        double num1 = 12e5;

        System.out.println(decimal);
        System.out.println(hex);
        System.out.println(octal);
        System.out.println(binary);
        System.out.println(zerosDiff);
        System.out.println(num1);



        //  characters and operations
        char c = 'a';
        c++;
        System.out.println(c);


    }
}