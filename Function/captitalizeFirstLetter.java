import java.util.Scanner;

public class captitalizeFirstLetter {
    public static String capitalizeLetter(String sentence) {

        String result = " ";
        boolean isFirstWord = true;

        if (sentence.isEmpty()) {
            System.out.println("Sry! Please Enter at-least one word");
        }

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (isFirstWord && Character.isLetter(ch)) {
                result += Character.toUpperCase(ch);
                isFirstWord = false;
            } else {
                result += ch;
            }
            if (ch == ' ') {
                isFirstWord = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence;
        System.out.print("Enter any Sentence :-> ");
        sentence = scanner.nextLine();

        System.out.println("After Capitalize First Word :-> " + capitalizeLetter(sentence));

        scanner.close();
    }
}
