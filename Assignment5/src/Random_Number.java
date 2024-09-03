public class Random_Number {
    public static void main(String[] args) {
        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = Math.random();

        // Scale and shift the random double to the range 1 to 100
        int randomNumber = (int) (randomDouble * 100) + 1;

        // Print the random number
        System.out.println("Random number between 1 and 100: " + randomNumber);
    }
}
