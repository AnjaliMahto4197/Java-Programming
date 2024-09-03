import java.util.Scanner;

public class Concatenate_number_string {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        String x = object.nextLine();

        System.out.print("Enter the second number : ");
        String y = object.nextLine();

        String z = x + y;
        System.out.println("The sum is: " + z);

        object.close();
    }
}
