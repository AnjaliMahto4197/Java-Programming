import java.util.Scanner;

public class Check_greater_number {
public static void main(String[] args){
    Scanner object = new Scanner(System.in);
    //user to enter a number
    System.out.print("Enter a number: ");
    double number = object.nextDouble();

    if(number > 100){
        System.out.println("The number is greater than 100 . ");
    }else{
        System.out.println("The number is not greater than 100 . ");
    }
    object.close();
}
}

