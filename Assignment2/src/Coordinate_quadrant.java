import java.util.Scanner;
public class Coordinate_quadrant {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the x and y coordinates
        System.out.print("Enter the x coordinate: ");
        int x = scanner.nextInt(); // Read the x coordinate

        System.out.print("Enter the y coordinate: ");
        int y = scanner.nextInt(); // Read the y coordinate

        // Determine the quadrant or axis position
        if (x > 0 && y > 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the First quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Fourth quadrant.");
        } else if (x == 0 && y != 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies on the Y-axis.");
        } else if (x != 0 && y == 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies on the X-axis.");
        } else {
            System.out.println("The coordinate point (" + x + "," + y + ") is at the origin.");
        }

        // Close the scanner
        scanner.close();
    }
}
