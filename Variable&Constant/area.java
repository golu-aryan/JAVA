/*write a program to print the area and perimeter of circle */
import java.util.Scanner;

public class area {

    public static void main(String[] args) {
        double radius;
        Scanner n = new Scanner(System.in);

        radius = n.nextDouble();
        double perimeter = 2 * Math.PI * radius;

        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
