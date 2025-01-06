import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args){
        Scanner year = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int Year = year.nextInt();

        if ((Year % 4 == 0 && Year % 100 != 0 ) || (Year % 400 == 0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("not a leap year");
        }
        year.close();
    }
}
