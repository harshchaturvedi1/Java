// Write a Java program to display the sum of first n natural numbers.

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        int num, sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");

        num = scanner.nextInt();

        // process 1
        for (int i = 1; i <= num; i++) {
            sum += i;
            // sum = sum + i;
        }
        System.out.println("Sum is : " + sum);

        // process 2
        int sum2 = (num * (num + 1)) / 2;
        System.out.println("Sum is : " + sum2);

        scanner.close();

    }
}