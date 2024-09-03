import java.util.Scanner;

public class Cube_sum {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);

        System.out.print("Enter the limit up to which to calculate the sum of cubes of even number: ");
        int limit = object.nextInt();

        //only fir even number
        int currentNumber = 2;

        //for sum
        int sum = 0;
        while (currentNumber <= limit){
            //calculate cube
            int cube = currentNumber * currentNumber * currentNumber;
            //addition cube
            sum = sum + cube;
            //increment
            currentNumber = currentNumber + 2;

        }
        System.out.println("sum of cube even number: " +limit+ " is " +sum);
        object.close();
    }
}

