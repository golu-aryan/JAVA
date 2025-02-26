import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.print("Enter String :-> ");
        String string = scanner.nextLine();

        if (string.isEmpty()) {
            System.out.println("Sry! String cannot be Empty.");
        } else {
            int length = string.length();
            for (i = 0; i < length; i++) {
                if (string.charAt(i) != string.charAt(length - 1 - i)) {
                    System.out.println("String is not Palindrome");
                    break;
                }
            }
            if (i == length) {
                System.out.println("String is Palindrome.");
            }
        }

        scanner.close();
    }
}