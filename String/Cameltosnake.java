import java.util.Scanner;

public class Cameltosnake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CamelCase String :-> ");
        String CamelCase = scanner.nextLine();

        if (CamelCase.isEmpty() || !Character.isUpperCase(CamelCase.charAt(0))) {
            System.out.println("Invalid input. Please Enter CamelCase String");
        }
        String snakeCase = "";

        for (int i = 0; i < CamelCase.length(); i++) {
            char ch = CamelCase.charAt(i);

            if (Character.isUpperCase(ch)) {
                if (i != 0) {
                    snakeCase += "_";
                }
                snakeCase += Character.toLowerCase(ch);
            } else {
                snakeCase += ch;
            }
        }
        System.out.println("snake case :-> " + snakeCase);
        scanner.close();
    }
}
