import java.util.Scanner;

public class vowcons {
    public static void main(String[] args) {
        String s = new String();
        int vol = 0, con = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s = sc.nextLine();

        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vol++;
                } else {
                    con++;
                }
            }
        }
        System.out.println("Number of vowels are " + vol);
        System.out.println("Number of consonants are " + con);

    }
}
