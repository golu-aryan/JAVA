import java.util.Scanner;
//Write a program to accept base and height of a traingle and print the area of traingle
public class traingle {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.print("Enter Base : ");
        int base = t.nextInt();

        System.out.print("Enter Height :");
        int height = t.nextInt();

        int area = (base*height)/2;

        System.out.print("Area of traingle is : " + area);
        t.close();
    }
}
