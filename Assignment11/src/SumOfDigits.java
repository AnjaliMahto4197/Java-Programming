import java.util.Scanner;

public class SumOfDigits {
    public static int sum(int n){
        // when n is 0 , return 0
        if (n == 0){
            return 0;
        }else{
            //add the last digits to the remaining digits
            return (n % 10 ) + sum(n/10);
        }
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int result = sum(num);
        System.out.println("The sum of " + num + " is : " + result);
    }
}
