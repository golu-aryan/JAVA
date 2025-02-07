/*write a program to find the penultimate(next to the last) word in a sentence.*/
import java.util.Scanner;

public class nextolast {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input a sentence:");

        String line = in.nextLine();

        String[] words = line.split("[ ]+");

        System.out.println("Penultimate word: " + words[words.length - 2]);
        in.close();
    }
}
