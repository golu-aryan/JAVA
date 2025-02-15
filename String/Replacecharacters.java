import java.util.Scanner;

public class Replacecharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string :-> ");
        String string = scanner.nextLine();

        System.out.print("Enter Character to replace :-> ");
        String target = scanner.nextLine();

        System.out.print("Enter replacement Character :-> ");
        String replacement = scanner.nextLine();

        if (target.length() == 1 && replacement.length() == 1) {
            System.out.println("Modified String :-> " + string.replace(target.charAt(0), replacement.charAt(0)));
        } else {
            System.out.println("Please enter valid sinlge character for replacement");
        }

        scanner.close();
    }
}
