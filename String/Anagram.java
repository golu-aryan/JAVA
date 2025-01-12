import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.print("Enter First String :-> ");
        String string_1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter Second String :-> ");
        String string_2 = scanner.nextLine().toLowerCase();

        if (string_1.isEmpty() || string_2.isEmpty()) {
            System.out.println("String cannot be empty");
        }

        if (string_1.length() != string_2.length()) {
            System.out.println("Strings are not Anagrams Due to Different lengths");
        } else {
            for (int i = 0; i < string_1.length(); i++) {
                char ch = string_1.charAt(i);
                if (!(ch >= 'a' && ch <= 'z')) {
                    isValid = false;
                    break;
                }
            }
            for (int i = 0; i < string_2.length(); i++) {
                char ch = string_2.charAt(i);
                if (!(ch >= 'a' && ch <= 'z')) {
                    isValid = false;
                    break;
                }
            }
            if (!isValid) {
                System.out.println("Strings are not valid for anagram check");
            } else {
                boolean isAnagram = true;

                for (int i = 0; i < string_1.length(); i++) {
                    int count1 = 0, count2 = 0;
                    char ch = string_1.charAt(i);
                    for (int j = 0; j < string_2.length(); j++) {
                        if (string_1.charAt(j) == ch) {
                            count1++;
                        }
                        if (string_2.charAt(j) == ch) {
                            count2++;
                        }
                    }
                    if (count1 != count2) {
                        isAnagram = false;
                        break;
                    }
                }
                if (isAnagram) {
                    System.out.println("String are Anagram");
                } else {
                    System.out.println("String are not Anagram");
                }
            }
        }
        scanner.close();
    }
}
