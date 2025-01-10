
import java.util.Scanner;

public class axis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x-coordinate: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y-coordinate: ");
        double y = scanner.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("The point is at the origin (0,0)");
        } 
        else if (x == 0) {
            System.out.println("The point lies on the y-axis.");
        } 
        else if (y == 0) {
            System.out.println("The point lies on the x-axis.");
        } 
        else if (x > 0 && y > 0) {
            System.out.println("The point is in the 1st quadrant.");
        }
        else if (x < 0 && y > 0) {
            System.out.println("The point is in the 2nd quadrant.");
        } 
        else if (x < 0 && y < 0) {
            System.out.println("The point is in the 3rd quadrant.");
        }
        else {
            System.out.println("The point is in the 4th quadrant.");
        }

        scanner.close();
    }
}