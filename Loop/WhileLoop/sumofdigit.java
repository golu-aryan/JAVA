
//Write a program to print sum of digits of a given number.
import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);

        System.out.println("Enter digit :");
        int num = n.nextInt();

        int sum = 0;
        while( num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digit is :" + sum);
    }
}
