import java.util.Scanner;

public class converttoLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any String value :-> ");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z')) {
                System.out.println("Invalid Input.");
            }
        }
        System.out.println(string.toLowerCase());
        scanner.close();
    }
}
