import java.util.Scanner;

public class multi_line_address {
    public static void main(String [] args){
        Scanner object = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = object.nextLine();

        System.out.print("Enter your city : ");
        String city = object.nextLine();

        System.out.print("Enter your pin code : ");
        String code = object.nextLine();

        String address =
                " Name :  " + name + "\n" +
                "City Name : " + city + "\n" + " Pin code : " +
                code;
        System.out.println("Full Address : " + "\n" + address );

        object.close();
    }
}