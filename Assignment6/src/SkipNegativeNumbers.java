import java.util.Scanner;
public class SkipNegativeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (0 to quit): ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }
            if (number < 0) {
                continue;
            }

            sum = sum +number;
        }

        System.out.println("The sum of positive numbers is: " + sum);
        input.close();
    }
}