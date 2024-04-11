// Write a Java program to take a lower case English alphabet as character input
// and print whether it is a Vowel or Consonant.

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        char c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lower case  character : ");

        // char c = scanner.nextLine().charAt(0);
        c = scanner.next().charAt(0);

        // process1
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");

        }

        // process 2
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }

        // process 3
        // Using character comparison with a predefined set of vowels:

        String vowels = "aeiouAEIOU";
        if (vowels.indexOf(c) != -1) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }

        scanner.close();

    }
}