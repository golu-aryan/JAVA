import java.util.Scanner;

public class in_Built {
   public static void main(String[] args) {
      char ch;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a character :");
      ch = scanner.nextLine().charAt(0);

      if (Character.isDigit(ch)) {
         System.out.println("You enter a Digit");
      } else if (Character.isLowerCase(ch)) {
         System.out.println("You enter in lowerCase");
      } else if (Character.isUpperCase(ch)) {
         System.out.println("You enter in uppercase");
      } else if (Character.isWhitespace(ch)) {
         System.out.println("you enter a space character");
      } else {
         System.out.println("You enter a special character");
      }
      scanner.close();
   }
}
