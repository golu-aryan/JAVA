import java.util.Scanner;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String :-> ");
        String string = scanner.nextLine();

        System.out.print("Enter a Character to Count :-> ");
        String Character = scanner.nextLine();

        if (Character.length() != 1 || !string.contains(Character)) {
            System.out.println("Invalid input. Enter a Single Character present in the String");
            return;
        }

        char target = Character.charAt(0);
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("The Character " + target + " appears " + count + " times");
        scanner.close();
    }
}
