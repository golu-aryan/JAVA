import java.util.Scanner;

public class ReplaceSubstring {
    public static String replaceString(String mainString, String replacementString, String targetString) {
        if (!mainString.contains(targetString)) {
            return "Target substring not found!";
        }
        return mainString.replace(targetString, replacementString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Sentece :-> ");
        String mainString = scanner.nextLine();

        System.out.print("Enter Target :-> ");
        String targetString = scanner.nextLine();

        System.out.print("Enter Replacement :-> ");
        String replacementString = scanner.nextLine();

        String result = replaceString(mainString, replacementString, targetString);

        System.out.println("String After Replacement :-> " + result);

        scanner.close();
    }
}
