package JAVA.Basic;
import java.util.Scanner;

public class TripleInput {
    public static void main(String[] args){
        Scanner v = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Enter first number:");
        n1 = v.nextInt();

        System.out.print("Enter second number:");
        n2 = v.nextInt();

        System.out.print("Enter Third number:");
        n3 = v.nextInt();

        System.out.println("The number you entered is " + n1 + "," + n2 + "," + n3);
    }
}
