package JAVA.Basic;
import java.util.Scanner;

public class addigit{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);

        System.out.println("Enter an integer between 0 and 1000: ");

        int num = n.nextInt();

        int firsDdigit = num % 10;
        int remainingNumber = num / 10;
        int secondDigit = remainingNumber %10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;

        int sum = thirdDigit + secondDigit + firsDdigit + fourthDigit;
        System.out.println("The sum of all digits in "+ num + " is " +sum);
    }
}