import java.util.Scanner;
public class SumOfRowColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = 3;
        int cols = 3;

        int [][] matrix = new int[rows][cols];

        System.out.println("Enter the no for matrix :");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print("Enter number at position " + i + "," + j +":");
                matrix[i][j]=input.nextInt();
            }
        }

        System.out.println("sum of row :");
        for (int i=0;i<rows;i++){
            int rowsum=0;
            for (int j=0;j<cols;j++){
                rowsum += matrix[i][j];
            }
            System.out.println("Sum of row" + (i+1) + ":" + rowsum);
        }

        System.out.println("sum of cols :");
        for (int j=0;j<cols;j++)
        {
            int colsum=0;
            for (int i=0;i<rows;i++)   {
                colsum += matrix[i][j];
            }
            System.out.println("Sum of cols" + (j+1) + ":" + colsum);
        }

    }
}