import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Define the size of the matrices
        int row = 2;
        int cols = 2;

        // Create matrices
        int[][] matrix1 = new int[row][cols];
        int[][] matrix2 = new int[row][cols];
        int[][] resultMatrix = new int[row][cols]; // Changed variable name to resultMatrix

        // Input elements for matrix1
        System.out.println("Enter elements number of first  matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position  " + i + " " + j + ": ");
                matrix1[i][j] = input.nextInt();
            }
        }

        // Input elements for matrix2
        System.out.println("Enter elements number of second  matrix:  ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position " + i + " " + j + ": ");
                matrix2[i][j] = input.nextInt();
            }
        }

        // Perform Addition
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the resulting matrix
        System.out.println("Resulting matrix after addition: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
