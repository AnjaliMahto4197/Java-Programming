import java.util.HashSet;
import java.util.Scanner;

public class Detect_Duplicate {
    public static void main(String[] args){
        HashSet<Integer> numbers = new HashSet<>();
        Scanner object = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number:");
            int number = object.nextInt();

               if (numbers.contains(number)) {
               System.out.println("Duplicate number detected: " + number);
               break;
              }else{
                   numbers.add(number);
               }
        }
        object.close();
    }
}
