package JAVA.OOPS.Constructor.RectangleArea;
import JAVA.OOPS.Constructor.RectangleArea.calculateArea.calculateArea;
import JAVA.OOPS.Constructor.RectangleArea.rectangle.rectangle;

import java.util.Scanner;
public class rectangleMain {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length :-> ");
        int length = scanner.nextInt();

        System.out.print("Enter Width :-> ");
        int width = scanner.nextInt();

        rectangle rect = new rectangle();
        rect.setLength(length);
        rect.setWidth(width);
        calculateArea area = new calculateArea();
        int areaOfRectangle = area.calculate(rect);

        System.out.println("Area of Rectanlge is :-> " + areaOfRectangle);
        scanner.close();
    }
}
