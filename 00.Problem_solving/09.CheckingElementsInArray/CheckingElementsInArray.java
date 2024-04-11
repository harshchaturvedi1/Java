// Write a Java program which takes an array as input and a variable x. Check if x is present in the array or not.

import java.util.Scanner;

public class CheckingElementsInArray {
    public static void main(String[] args) {
        int[] arr;
        int length, searchInt;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length : ");
        length = scanner.nextInt();

        arr = new int[length];

        System.out.print("enter " + length + " integrs by space separated : ");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("enter no. to search : ");
        searchInt = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < length; i++) {
            if (arr[i] == searchInt) {
                System.out.println("The val is present at index : " + i);
                break;
            }
        }

    }
}
