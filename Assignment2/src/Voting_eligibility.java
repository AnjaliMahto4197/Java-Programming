import java.util.Scanner;
public class Voting_eligibility {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age for voting Eligibility: ");
        int age = scanner.nextInt();

        if (age > 18 ){
            System.out.println("Eligibility for voting");
        } else if (age < 18) {
            System.out.println("Not Eligibility for voting");
        }

        scanner.close();
    }
}
