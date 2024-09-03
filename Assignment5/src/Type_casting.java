import java.util.Scanner;
public class Type_casting{
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a large integer value
        System.out.print("Enter a large integer value (long): ");
        // Read the long value from the user
        long largeValue = scanner.nextLong();

        // Convert the long to a byte using type casting
        byte smallerValue = (byte) largeValue;

        // Print the result
        System.out.println("The byte value after casting is: " + smallerValue);

        // Close the scanner
        scanner.close();
    }
}

