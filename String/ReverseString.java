import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String :-> ");
        String string = scanner.nextLine();

        if (string.isEmpty()) {
            System.out.println("String cannot be empty");
        } else {
            String reverse = "";
            for (int i = string.length() - 1; i >= 0; i--) {
                reverse += string.charAt(i);
            }
            System.out.println("Reversed String :-> " + reverse);
        }
        scanner.close();
    }
}
