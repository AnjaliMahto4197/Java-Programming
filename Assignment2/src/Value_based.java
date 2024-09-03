import java.util.Scanner;
public class Value_based{
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of m
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt(); // Read the integer value from the user

        // Declare variable n
        int n;

        // Determine the value of n based on the value of m
        if (m > 0) {
            n = 1;
        } else if (m == 0) {
            n = 0;
        } else {
            n = -1;
        }

        // Display the value of n
        System.out.println("The value of n = " + n);

        // Close the scanner
        scanner.close();
    }
}
