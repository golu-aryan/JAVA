import java.util.Scanner;

public class powerofNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        System.out.print("Enter Base Number :-> ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent Number :-> ");
        int exponent = scanner.nextInt();

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(base + "^" + exponent + " = " + result);
        scanner.close();
    }
}
