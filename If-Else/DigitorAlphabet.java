import java.util.Scanner;

public class DigitorAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        int asciiCode;

        System.out.print("Enter a character: ");
        ch = scanner.nextLine().charAt(0);

        asciiCode = (int) ch;

        if (asciiCode >= 48 && asciiCode <= 57) {
            System.out.println("");
        } else if (asciiCode >= 65 && asciiCode <= 90) {
            System.out.println("You entered alphabet in UpperCase");
        } else if (asciiCode >= 97 && asciiCode <= 122) {
            System.out.println("You entered alphabet in lowercase");
        } else if (asciiCode == 32 || asciiCode == 27 || asciiCode == 13) {
            System.out.println(" space,Esc,Enter");
        } else {
            System.out.println("something else.");
        }

        System.out.println("The ASCII value of '" + ch + "' is: " + asciiCode);
        scanner.close();
    }
}
