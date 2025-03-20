import java.util.Scanner;

public class RemoveDigits {
    public static boolean containDigits(String string) {
        for (char ch : string.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    public static String removeDigits(String string) {
        StringBuilder result = new StringBuilder();

        for (char ch : string.toCharArray()) {
            if (!Character.isDigit(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String Contains digits :-> ");
        String string = scanner.nextLine();

        if (containDigits(string)) {
            String result = removeDigits(string);
            System.out.print("After Removing Digits :-> " + result);
        } else {
            System.out.println("Invalid Input. The String must contain digits.");
        }
        scanner.close();
    }
}
