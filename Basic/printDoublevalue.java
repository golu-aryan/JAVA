package JAVA.Basic;
import java.util.Scanner;

public class printDoublevalue {
    public static void main(String[] args){
        double y;

        Scanner r = new Scanner(System.in);

        System.out.print("Enter the double value: ");
        y = r.nextDouble();

        System.out.print("The double value is :" + y);
    }
}
