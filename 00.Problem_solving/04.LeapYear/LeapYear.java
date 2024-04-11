// Write a Java program that takes a year from the user and prints whether it is
// a leap year or not.

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the year : ");

        year = scanner.nextInt();

        // process 1
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " " + " is leap year");
                }
            } else {
                System.out.println(year + " " + " is leap year");
            }

        } else {
            System.out.println("Not a leap year");
        }

        // process 2
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " " + " is leap year");
        } else {
            System.out.println("Not a leap year");
        }
        /*
         * here since it is divisible b 400
         * it will be automatically be divisible by 4 and 100
         */
        scanner.close();

    }
}