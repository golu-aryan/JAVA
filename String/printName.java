import java.util.Arrays;
import java.util.Scanner;

public class printName {
    public static void printingName(String[] Names) {
        for (String name : Names) {
            System.out.println(name);
        }
        System.out.println("\nAfter Sorting Name\n");
        Arrays.sort(Names);

        for (String name : Names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter Name :-> ");
            names[i] = scanner.nextLine();
        }

        printingName(names);

        scanner.close();
    }
}