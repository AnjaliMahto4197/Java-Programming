import java.util.Scanner;

public class Number_Even_Odd{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("number is Even Number");
        }else{
            System.out.println("number is odd Number");
        }
        scanner.close();
    }
}
