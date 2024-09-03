import java.util.Scanner;

public class Positive_integer {
    public static void main (String[] args){
        Scanner object = new Scanner(System.in);

        int sum = 0;
        int number ;

        System.out.println("Enter Positive integer to sum. Enter 0 to finish");
        while (true){
            number = object.nextInt();
            // Check if the number is 0 to terminate the loop
            if (number==0){
                break;
            }
            // Add only positive integers to the sum
            if (number>0){
                sum += number;

            }else {
                System.out.println("Negative number are not included");
            }
        }
        System.out.println("Sum of positive integer:" + sum);
        object.close();
    }
}
