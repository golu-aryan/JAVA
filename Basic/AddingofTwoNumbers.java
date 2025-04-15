package JAVA.Basic;
import java.util.Scanner;

public class AddingofTwoNumbers
{
    public static void main(String[] args){
        int num1, num2, add;
        Scanner n = new Scanner(System.in);

        System.out.print("Enter first number:");
        num1 = n.nextInt();

        System.out.println("Enter second number:");
        num2 = n.nextInt();

        add = num1+num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is :" + add);

        n.close();
    }
}
