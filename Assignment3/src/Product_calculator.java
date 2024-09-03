public class Product_calculator {
    public static void main(String[] args){
        int product = 1;
        int number = 1;

        while(number <= 5){
            product *= number;
            number++;
        }
        System.out.println("The product number from 1 tp 5 is :" + product);

    }
}

