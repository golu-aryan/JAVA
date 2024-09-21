import java.util.Scanner;

public class isDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch;
        int asciiCode;
        System.out.print("Enter character : ");
        ch = scanner.nextLine().charAt(0);

        asciiCode = (int) ch;

        if (asciiCode >= 48 && asciiCode <= 57) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is not a digit");
        }
        System.out.println("The ASCII code of " + ch + " is " + asciiCode);

        scanner.close();
    }
}
