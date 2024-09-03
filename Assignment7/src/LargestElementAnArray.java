import java.util.Scanner;

public class LargestElementAnArray {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        // Create the array
        int[] array = new int[size];
        System.out.println("element:" + size);
        for (int i = 0; i < size; i++){
            array [i] = input.nextInt();

        }
        //find the largest element of array
        int largest = array[0];
        for (int i = 1 ; i < size ; i++){
            if (array[i] > largest){
                largest= array[i];

            }
        }
        // Print the largest element
        System.out.println("The largest element in the array is : " + largest);
        input.close();
    }
}