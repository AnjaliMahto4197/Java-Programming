import java.util.Scanner;
public class TransposeOfMatrix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rows = 3;
        int cols = 3;

        int [][] matrix = new int[rows][cols];
        int[][] temp = new int[rows][cols];

        System.out.println("Enter the number for matrix :");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print("Enter number at position " + i + "," + j +":");
                matrix[i][j]=input.nextInt();
            }
        }

        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                temp[j][i] = matrix[i][j];
            }

        }

        System.out.println("original  matrix :");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed   matrix :");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}