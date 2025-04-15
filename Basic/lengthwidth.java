package JAVA.Basic;
import java.util.Scanner;

public class lengthwidth {
    public static void main(String[] args){
        int length, widht, area, perimeter;

        Scanner q = new Scanner(System.in);

        System.out.print("Enter length : ");
        length = q.nextInt();

        System.out.print("Enter width : ");
        widht = q.nextInt();

        area = length*widht;
        perimeter = 2*(length+widht);

        System.out.println("Area of rectangle is : " + area + "\nPerimeter of rectangle is :" + perimeter);
    }
}
