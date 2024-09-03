public class FirstPrimeNumber {
    public static void main(String[] args) {

        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.println("The first prime number in the range 1 to 100 is: " + num);
                break;
            }
        }
    }


    public static boolean isPrime(int number) {
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}