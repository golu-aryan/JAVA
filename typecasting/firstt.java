import java.util.Scanner;

public class firstt {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int x;
        System.out.println("Enter number:");
        x = t.nextInt();
        double y = x;
        y = (double)x / 2;      //this is typecasting of x variable which is integer first after typecasting it print double or decimal numbers.z
        System.out.println(y);
        t.close();

    }
}