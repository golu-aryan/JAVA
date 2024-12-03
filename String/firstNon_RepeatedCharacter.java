import java.util.Scanner;

public class firstNon_RepeatedCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String :-> ");
        String string = scanner.nextLine();

        if (string.isEmpty()) {
            System.out.println("String cannot be empty");
        } else {
            char result = '\0';
            for (int i = 0; i < string.length(); i++) {
                char ch = string.charAt(i);
                boolean isRepeated = false;

                for (int j = 0; j < string.length(); j++) {
                    if (i != j && string.charAt(j) == ch) {
                        isRepeated = true;
                        break;
                    }
                }
                if (!isRepeated) {
                    result = ch;
                    break;
                }
            }
            if (result != '\0') {
                System.out.println("First Non-Repeated Character :-> " + result);
            } else {
                System.out.println("No Non-Repeated Character found");
            }
        }
        scanner.close();
    }
}
