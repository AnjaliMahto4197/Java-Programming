import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Calculate the sum of digits
        int sum = sumOfDigits(number);

        // Output the result
        System.out.println("The sum of the digits is: " + sum);
    }

    public static int sumOfDigits(int number) {


        int sum = 0;

        // Extract digits and calculate the sum
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit
            sum += digit;            // Add the digit to the sum
            number /= 10;            // Remove the last digit from the number
        }

        return sum;
    }
}
