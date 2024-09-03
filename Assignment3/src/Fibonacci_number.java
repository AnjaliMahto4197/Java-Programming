public class Fibonacci_number {
    public static void main(String[] args) {
        // Initialize the first two Fibonacci numbers
        int first = 0;
        int second = 1;

        // Initialize the counter for the number of Fibonacci numbers to print
        int count = 0;

        // Print the first 10 Fibonacci numbers
        System.out.println("The first 10 Fibonacci numbers are:");

        // While loop to calculate and print Fibonacci numbers
        while (count < 10) {
            if (count == 0) {
                System.out.println(first);
            } else if (count == 1) {
                System.out.println(second);
            } else {
                // Calculate the next Fibonacci number
                int next = first + second;
                System.out.println(next);

                // Update the first and second numbers
                first = second;
                second = next;
            }

            // Increment the count
            count++;
        }
    }
}

