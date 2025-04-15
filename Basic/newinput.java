package JAVA.Basic;
import java.util.Scanner;

public class newinput {
    public static void main(String[] args) {
        String name;
        int programs;
        Scanner n = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = n.nextLine();

        System.out.print("Enter how many programs you have written : ");
        programs = n.nextInt();

        System.out.println("Hi, My name is : "+ name + " I have written " + programs + " java program so far. I'm learning java");
    }
}
