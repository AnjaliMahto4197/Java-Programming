import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Prompt user to input the elements of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the array before reversing
        System.out.println("Array before reversing:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Move to next line

        // Reverse the array
        for (int i = 0; i < size / 2; i++) {
            // Swap elements at positions i and (size - 1 - i)
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        // Print the array after reversing
        System.out.println("Array after reversing:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Move to next line

        // Close the scanner
        scanner.close();
    }
}
