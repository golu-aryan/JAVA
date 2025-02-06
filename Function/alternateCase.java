import java.util.Scanner;

public class alternateCase {
    public static String characterAlternate(String string) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }
        return result.toString();
    }

    public static boolean isValid(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String [Alphabetic Character Only] :-> ");
        String string = scanner.nextLine();

        if (!isValid(string)) {
            System.out.println("Invalid Input. Please enter only Alphabetic Characters");
            return;
        }

        String alternateCaseString = characterAlternate(string);

        System.out.println("String with Alternate Case :-> " + alternateCaseString);

        scanner.close();
    }
}
