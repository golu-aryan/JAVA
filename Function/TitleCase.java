import java.util.Scanner;

public class TitleCase {
    public static String totitleCase(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder titleCaseSentence = new StringBuilder();

        for (String word : words) {
            String titlCaseWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            titleCaseSentence.append(titlCaseWord).append(" ");
        }
        return titleCaseSentence.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence:-> ");
        String sentence = scanner.nextLine();

        if (sentence.isEmpty()) {
            System.out.println("Invalid input. Sentence must contain at least one word");
            return;
        }

        String titleCased = totitleCase(sentence);

        System.out.println("Title Case Sentence :-> " + titleCased);

        scanner.close();
    }
}
