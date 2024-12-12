import java.util.Scanner;

public class Longest_Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Sentence :-> ");
        String sentence = scanner.nextLine();

        if (sentence.isEmpty()) {
            System.out.println("The Sentence must have at least one word.");
            return;
        }

        String Longest = " ";
        String Current = " ";

        sentence += " ";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                Current += ch;
            } else {
                if (Current.length() > Longest.length()) {
                    Longest = Current;
                }
                Current = " ";
            }
        }
        System.out.println("The Longest word is :-> " + Longest);
        scanner.close();
    }
}