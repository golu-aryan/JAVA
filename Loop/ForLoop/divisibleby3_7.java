import java.util.Scanner;

public class divisibleby3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number  :-> ");
        int n = scanner.nextInt();

        System.out.println("Number is Divisible by 3 & 7 are -> ");

        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
