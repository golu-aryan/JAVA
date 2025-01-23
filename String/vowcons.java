import java.util.Scanner;

public class vowcons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        int vowel = 0, consonants = 0;
        System.out.print("Enter any String :-> ");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if ((ch == 'A' || ch == ('a')) || (ch == 'E' || ch == 'e') || (ch == 'I' || ch == 'i')
                    || (ch == 'O' || ch == 'o') || (ch == 'U' || ch == 'u')) {
                vowel++;
            } else {
                consonants++;
            }
        }
        System.out.println("Total Vowels in String " + string + " is :-> " + vowel);
        System.out.println("Total Consonants in String " + string + " is :-> " + consonants);
        scanner.close();
    }
}
