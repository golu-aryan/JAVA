package JAVA.Basic;
import java.util.Scanner;

public class printFloatvalue {
    public static void main(String[] args) {
        float f;

        Scanner d = new Scanner(System.in);
        System.out.print("Enter float number:");
        f = d.nextFloat();

        System.out.print("The float number is : " + f);
    }
}
