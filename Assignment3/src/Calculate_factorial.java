import java.util.Scanner;

public class Calculate_factorial {
    public static void main(String [] args){
        Scanner object = new Scanner(System.in);
        System.out.print("Enter a positive Number:");
        int number = object.nextInt();

        if (number<0){
            System.out.println("Factorial number is not defined for negative numbers.");
        }else{
            long factorial = 1;
            int i = number;
            while (i>0){
                factorial *=1;
                i --;
            }
            System.out.println("The factorial of " + number + " is " +factorial);
        }
        object.close();
    }
}


