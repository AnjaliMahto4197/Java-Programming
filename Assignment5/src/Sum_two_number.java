import java.util.Scanner;

public class Sum_two_number {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        // Use nextInt() to read an integer value
        int x = scanner.nextInt();

        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        // Use nextInt() to read an integer value
        int y = scanner.nextInt();

        // Calculate the sum of the two numbers
        int z = x + y;

        // Output the result
        System.out.println("The sum is: " + z);

        // Close the scanner
        scanner.close();
    }
}
