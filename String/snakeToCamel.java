import java.util.Scanner;

public class snakeToCamel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String in Snake Case :-> ");
        String snakeCase = scanner.nextLine();

        if (snakeCase.trim().isEmpty()) {
            System.out.println("String cannot be Empty");
        } else if (!Character.isLowerCase(snakeCase.charAt(0))) {
            System.out.println("Sry! Please enter Snake Case String");
        }

        String CamelCase = "";
        boolean capital = true;

        for (int i = 0; i < snakeCase.length(); i++) {
            char ch = snakeCase.charAt(i);

            if (ch == '_') {
                capital = true;
            } else {
                if (capital) {
                    CamelCase += Character.toUpperCase(ch);
                    capital = false;
                } else {
                    CamelCase += ch;
                }
            }
        }
        System.out.println("CamelCase String :-> " + CamelCase);
        scanner.close();
    }
}
