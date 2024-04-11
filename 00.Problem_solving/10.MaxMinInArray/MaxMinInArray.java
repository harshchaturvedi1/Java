// Write a Java program to find the maximum and minimum value of an array.

import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        int[] arr;
        int length, max, min;

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter array length : ");
        length = scanner.nextInt();

        arr = new int[length];

        System.out.print("enter space separated elements of array : ");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        max = min = arr[0];
        for (int i = 0; i < length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];

            // System.out.println(max + " " + min + " " + i);
        }

        System.out.println("Max element is : " + max);
        System.out.println("Min element is : " + min);

        scanner.close();
    }
}
