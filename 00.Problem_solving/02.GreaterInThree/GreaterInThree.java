// Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.Scanner;

public class GreaterInThree {
    public static void main(String[] args) {

        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers space separates : ");

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        System.out.println("three entered values are : " + a + " " + b + " " + c);

        // process 1
        if (a > b) {
            if (a > c) {
                System.out.println("greater element is : " + a);
            } else {
                System.out.println("greater element is : " + c);

            }
        } else {
            if (b > c) {
                System.out.println("greater element is : " + b);
            } else {
                System.out.println("greater element is : " + c);

            }
        }

        // process 2
        if (a > b && a > c)
            System.out.println("greater element is : " + a);
        else if (b > a && b > c)
            System.out.println("greater element is : " + b);
        else
            System.out.println("greater element is : " + c);

        scanner.close();

    }
}
