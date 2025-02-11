/*write a program to print the sum, multiply, subtraction, divide, remainder of two number*/
import java.util.Scanner;

public class alloperator {
    public static void main(String[] args) {

        int a, b;
        System.out.println("Enter the two numbers:--");
        Scanner n = new Scanner(System.in);
        a = n.nextInt();
        b = n.nextInt();

        System.out.println("Addition = " + (a + b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Subtraction= " + (a - b));
        System.out.println("Module = " + (a % b));
        System.out.println("Divide = " + (a / b));

        n.close();
    }
}