// Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        int num;
        Scanner userNum = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        num = userNum.nextInt();
        System.out.println("Entered integer is : " + num);
        if (num >= 0)
            System.out.println("Entered integer is positive ");
        else
            System.out.println("Entered integer is negative ");

        userNum.close();
    }
}
