import java.util.Scanner;
public class Square_root {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        // Read the number as an integer
        int num = scanner.nextInt();

        // Calculate the square root of the number
        double squareRoot = Math.sqrt(num);

        // Print the square root with a descriptive message
        System.out.printf("The square root of %d is %.2f%n", num, squareRoot);

        // Close the scanner
        scanner.close();
    }
}
