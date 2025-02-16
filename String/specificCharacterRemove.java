import java.util.Scanner;

public class specificCharacterRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String :-> ");
        String string = scanner.nextLine();

        System.out.print("Enter the Character to Remove :-> ");
        String CharacterRemove = scanner.nextLine();

        if (CharacterRemove.length() != 1 || !string.contains(CharacterRemove)) {
            System.out.println("Invalid input. Enter a single Character Present in the string");
            return;
        }

        char target = CharacterRemove.charAt(0);
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != target) {
                result +=  string.charAt(i);
            }
        }

        System.out.println("String after removal :-> " + result);
        scanner.close();
    }
}
