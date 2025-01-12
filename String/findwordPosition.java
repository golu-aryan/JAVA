import java.util.Scanner;

public class findwordPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Sentence :-> ");
        String sentence = scanner.nextLine();

        System.out.print("Enter Word :-> ");
        String word = scanner.nextLine();

        boolean found = false;
        int wordLength = word.length();

        for (int i = 0; i < sentence.length() - wordLength; i++) {
            boolean match = true;

            for (int j = 0; j < wordLength; j++) {
                if (sentence.charAt(i + j) != word.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                System.out.println(i + " ");
                found = true;
            }

            if (!found) {
                System.out.println("Sry Not Found Your Word. Please Try Again");
            }
        }

        scanner.close();
    }
}
