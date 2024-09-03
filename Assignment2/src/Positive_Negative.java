import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  a number: ");
        int num = scanner.nextInt();

        if (num > 0){
            System.out.println("The Number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        }else {
            System.out.println("The number is equal");
        }
        scanner.close();
    }
}
