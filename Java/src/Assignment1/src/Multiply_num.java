import java.util.*;  // Import the java.util package to use the Scanner class

public class Multiply_num {  // Define a public class named 'MultiplyTwoNumbers'
    public static void main(String[] args) {  // The main method, which is the entry point of the program
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the console

        System.out.print("Enter the first number: ");  // Prompt the user to enter the first number
        int num1 = scanner.nextInt();  // Read the first number as an integer and store it in variable 'num1'

        System.out.print("Enter the second number: ");  // Prompt the user to enter the second number
        int num2 = scanner.nextInt();  // Read the second number as an integer and store it in variable 'num2'

        int mult = num1 * num2;  // Multiply the two numbers and store the result in variable 'product'

        System.out.println("The mult of " + num1 + " and " + num2 + " is " + mult);  // Display the result

        scanner.close();  // Close the Scanner object to release resources
    }
}
