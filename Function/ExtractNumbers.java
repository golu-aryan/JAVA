import java.util.Scanner;

public class ExtractNumbers {
    public static void Extracting(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                if (!temp.isEmpty()) {
                    System.out.print(temp);
                    temp = " ";
                }
            }
        }
        if (!temp.isEmpty()) {
            System.out.print(temp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any Sentence but with numeric Value :-> ");
        String sentence = scanner.nextLine();

        System.out.println("Numbers found in Sentence are :-> ");
        Extracting(sentence);

        scanner.close();
    }
}
