import java.util.Scanner;

public class Sentence_Concatenate_string {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);

        System.out.print("Enter the first sentence: ");
        String firstSentence = object.nextLine();

        System.out.print("Enter the first second sentence: ");
        String secondSentence = object.nextLine();

        System.out.print("Enter the first third sentence: ");
        String thirdSentence = object.nextLine();

        String Sentence =  firstSentence+" "+secondSentence+" "+thirdSentence+ "." ;

        System.out.println("complete sentence is : " + Sentence);

    }
}

