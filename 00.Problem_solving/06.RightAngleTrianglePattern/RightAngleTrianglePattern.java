// Write a Java program to display the pattern like a right angle triangle with
// a number.

import java.util.Scanner;

public class RightAngleTrianglePattern {

    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");

        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        scanner.close();

    }
}