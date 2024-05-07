import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            int res = n;
            if (i == 1) {
                System.out.println(res);
            } else {
                for (int j = 2; j <= i; j++) {
                    res *= n;
                }
            }
            System.out.println(n + " " + i + " " + res);
        }
    }
}
