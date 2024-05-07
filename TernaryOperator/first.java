import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);

        System.out.println("Enter the number:");
        int n = t.nextInt();
        System.out.println("your number is " + ((n%2==0) ? "even" : "odd"));
    }
}