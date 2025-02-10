import java.util.Scanner;

public class circleradius {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int radius;
        double pi = 3.14, area, circumference;

        System.out.print("Enter radius for circle : ");
        radius = m.nextInt();

        area = pi * (radius * radius);
        System.out.printf("Area of circle is : %.2f" , area);

        circumference = 2 * pi * radius;
        System.out.printf("\nCircumference of circle is : %.2f", circumference);
        m.close();
    }
}
