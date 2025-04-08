import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("My calculator *_*");
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("Enter the second number:");
        int y = sc.nextInt();
        System.out.println("Please choose the Operator");
        System.out.println("+ for Addition \t - for subtraction \t / for division \t * for multiplication");
        System.out.println("Enter your choice :)");
        char c = sc.next().charAt(0);
        if (c == '+') {
            System.out.println("Your two numbers addition is : " + (x + y));
        } else if (c == '-') {
            System.out.println("your two numbers subtraction is : " + (x - y));
        } else if (c == '/') {
            System.out.println("your two numbers division is : " + (x / y));
        } else if(c == '*') {
            System.out.println("your two numbers multiplication is:" + (x * y));
        }
        else {
            System.out.println("Sry! Invalid number or Invalid operator");
        }
        sc.close();
    }
}
