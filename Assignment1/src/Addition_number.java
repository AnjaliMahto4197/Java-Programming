import java.util.*;  // Import the java.util package to use the Scanner class

public class Addition_number {  // Define a public class named 'AdditionOfTwoNumbers'
    public static void main(String[] args) {  // The main method, which is the entry point of the program
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the console

        System.out.print("Enter the first integer: ");  // Prompt the user to enter the first integer
        int num1 = scanner.nextInt();  // Read the first integer from the user and store it in variable 'num1'

        System.out.print("Enter the second integer: ");  // Prompt the user to enter the second integer
        int num2 = scanner.nextInt();  // Read the second integer from the user and store it in variable 'num2'

        int sum = num1 + num2;  // Add the two integers and store the result in variable 'sum'

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);  // Display the result

        scanner.close();  // Close the Scanner object to release resources
    }
}
