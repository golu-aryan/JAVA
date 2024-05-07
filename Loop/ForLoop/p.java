
import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int res = 1;
        for (int i = 1; i <= 10; i++) {
            res *= n;
            // for (int j = 1; j <= i; j++) {
            // }
            System.out.println(n + " ^ " + i + " = " + res);
        }
    }
}
