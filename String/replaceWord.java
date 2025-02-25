import java.util.Scanner;

public class replaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Sentence :-> ");
        String mainString = scanner.nextLine();

        System.out.print("Enter Target Word :-> ");
        String targetString = scanner.nextLine();

        System.out.print("Enter Replacement word :-> ");
        String replacementString = scanner.nextLine();

        if (!mainString.contains(targetString)) {
            System.out.println("The Target String is not present in the Main String");
        }

        String result = mainString.replace(targetString, replacementString);

        System.out.println("String After Replacement :-> " + result);
        scanner.close();
    }
}
