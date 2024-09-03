import java.util.Scanner;

public class Largest_three_num{
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second Number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println( "First Number is largest number");
        } else if (num2>num1 && num2>num3) {
            System.out.println("Second number is largest number");
        } else if (num3>num1 && num3>num2){
            System.out.println("Third Number is largest number");
        }
        scanner.close();

    }

}
