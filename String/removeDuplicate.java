import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String :-> ");
        String string = scanner.nextLine();

        if (string.isEmpty()) {
            System.out.println("String cannot be Empty");
        } else {
            String result = "";
            for (int i = 0; i < string.length(); i++) {
                char ch = string.charAt(i);
                boolean isDuplicate = false;
                for (int j = 0; j < result.length(); j++) {
                    if (result.charAt(j) == ch) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    result += ch;
                }
            }
            System.out.println("String after removing Duplicates :-> " + result);
        }
        scanner.close();
    }
}
