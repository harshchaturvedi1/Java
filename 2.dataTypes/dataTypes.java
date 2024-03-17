// class Hello {
//     public static void main(String args[]) {
//             float marks = 3.5;
//             System.out.println(marks);
//     }
// }

/* 
In Java, you'll encounter a compilation error in your code because you're 
attempting to assign a decimal number (3.5) to a variable of type float 
without explicitly indicating it as a float literal. By default, 
Java treats decimal literals as double. To fix this issue, you 
\can either explicitly cast the decimal number to a float or append an 
'f' or 'F' to the number to indicate that it's a float literal. Here's 
the corrected code:
*/

class Hello {
    public static void main(String args[]) {
            float marks = 3.5f; // or float marks = (float) 3.5;
            System.out.println(marks);
    }
}


class AnotherClass{
    public static void main(String args[]){
        int num1 =  9;
        byte by = 127;
        short sh =  558;
        long l = 5854l;

        float f = 5.8f;
        double d = 5.8;

        char c = 'k';
        // char c = "k"; // will give error

        boolean b =  true;


    }
}