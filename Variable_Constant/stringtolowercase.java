/*write a program to convert a string into lowercase. */

import java.util.Scanner;

public class stringtolowercase {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter a string:");
        String line = t.nextLine();

        line = line.toLowerCase();
        System.out.println(line);
        t.close();
    }
}
