import java.util.Scanner;

public class removeWhiteSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        System.out.print("Enter String :-> ");
        String string = scanner.nextLine();

        if (string.isEmpty()) {
            System.out.println("String cannot be Empty.");
        } else {
            int length = string.length();
            for (int i = 0; i < length; i++) {
                char ch = string.charAt(i);
                if (ch == ' ') {
                    continue;
                }
                result += ch;
            }
            System.out.println("After Removing WhiteSpace String is :-> " + result);
        }
        scanner.close();
    }
}
