/*write a program to print ascii value of character */
import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        char ch = n.next().charAt(3);   //this print character 3 index of the word
        System.out.println((int) ch);           //Ex:- Aryan, so the output is 97 because of you choose index 3 which is a and ascii is 97
        n.close();
    }
}
