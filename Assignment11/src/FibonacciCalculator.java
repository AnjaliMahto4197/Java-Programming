import java.util.Scanner;

public class FibonacciCalculator {
    public static int fibonacci (int n){
        if (n == 0){
            return 0;
        }else if (n ==1){
            return 1;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number : ");
        int num = input.nextInt();
        if (num < 0){
            System.out.println("Please Enter a positive number. ");
        }else {
            int result = fibonacci(num);
            System.out.println("Fibonacci number at position " + num + " is : " + result);
        }
    }
}
