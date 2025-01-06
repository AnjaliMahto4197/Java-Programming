import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        int originalNumber  = number;
        int reverseNumber = 0;

        while (number != 0){
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number/10;
            System.out.println("The reverse of " + originalNumber + " is " + reverseNumber);

        }
         scanner.close();

    }
}




