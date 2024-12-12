import java.util.Scanner;

public class ConverttoUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String :-> ");
        String string = scanner.nextLine();
        boolean isAlphabetic = true;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z')) {
                isAlphabetic = false;
                break;
            }
        }
        if (isAlphabetic) {
            System.out.println(string.toUpperCase());
        }
        scanner.close();
    }
}
