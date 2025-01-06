import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reverseNumber = 0;

        for (;number != 0; number = number / 10) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
        }

        // Check if the reversed number is the same as the original number
        if (originalNumber == reverseNumber) {
            System.out.println("The number " + originalNumber + " is a palindrome.");
        } else {
            System.out.println("The number " + originalNumber + " is not a palindrome.");
        }

        scanner.close();
    }
}
