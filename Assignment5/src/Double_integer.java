import java.util.Scanner;
public class Double_integer {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        // Read the decimal number from the user
        double decimalNumber = scanner.nextDouble();

        // Convert the double to an integer using type casting
        int integerNumber = (int) decimalNumber;

        // Print the result
        System.out.println("The integer value is: " + integerNumber);

        // Close the scanner
        scanner.close();
    }
}


