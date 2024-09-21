import java.util.Scanner;

public class GetASCII{
    public static void main(String[] args){
        char ch;
        int asciiCode;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter character : ");
        ch = scanner.nextLine().charAt(0);


        asciiCode = (int) ch;
        System.out.println("The ASCII Code of " + ch + " is " + asciiCode);

        scanner.close();
    }
}