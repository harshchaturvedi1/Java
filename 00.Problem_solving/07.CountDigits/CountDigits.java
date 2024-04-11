// Write a Java program that reads a positive integer and count the number of
// digits the number has.

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        // assuming it will have atleast one digit
        int num, digits = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");

        num = scanner.nextInt();
        scanner.close();

        while (num >= 10) {
            digits += 1;
            num = num / 10;
        }

        System.out.println("the digits count : " + digits);

        // process 2
        int digits2 = (int) Math.log10(num) + 1;
        System.out.println("the digits count : " + digits2);

        // process 3
        int digits3 = String.valueOf(num).length();
        System.out.println("the digits count : " + digits3);

    }
}