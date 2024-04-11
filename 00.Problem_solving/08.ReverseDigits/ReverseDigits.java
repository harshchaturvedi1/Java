// reverse digits of a number

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        int num, reversedNum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");

        num = scanner.nextInt();
        scanner.close();

        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = (reversedNum * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println("reversed num is : " + reversedNum);
    }
}
