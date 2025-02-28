import java.util.Scanner;

public class findSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String :-> ");
        String string = scanner.nextLine();

        System.out.print("Enter a String :-> ");
        String subString = scanner.nextLine();

        if (string.isEmpty() || subString.isEmpty()) {
            System.out.println("String cannot be empty");
        } else {
            boolean exists = string.contains(subString);

            System.out.println("Substring Exists :-> " + exists);
        }

        scanner.close();
    }
}