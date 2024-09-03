import java.util.Scanner;

public class Palindrome_string {
    public static  void main(String [] args){
        Scanner object = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = object.nextLine();

        // Normalize the string: convert to lowercase and remove spaces
        //\s matches any whitespace character, including spaces, tabs, and newlines.

    }
}

//import java.util.Scanner;
//public class PalindromeChecker {
//    public static void main(String[] args) {
//        // Create a Scanner object for reading input
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter a string
//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine(); // Read the input string
//
//        // Normalize the string: convert to lowercase and remove spaces
//        String normalized = input.toLowerCase().replaceAll("\\s+", "");
//
//        // Reverse the normalized string
//        String reversed = new StringBuilder(normalized).reverse().toString();
//
//        // Check if the normalized string is equal to its reversed version
//        if (normalized.equals(reversed)) {
//            System.out.println("\"" + input + "\" is a palindrome.");
//        } else {
//            System.out.println("\"" + input + "\" is not a palindrome.");
//        }
//
//        // Close the scanner
//        scanner.close();
//    }
//}
