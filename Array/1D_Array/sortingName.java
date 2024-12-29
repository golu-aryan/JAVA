import java.util.Arrays;
import java.util.Scanner;

public class sortingName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int found = 0;
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Please Enter a Name :-> ");
            names[i] = scanner.nextLine();
        }

        System.out.print("Please enter name for search :-> ");
        String search = scanner.nextLine();

        for (String name : names) {
            System.out.println(name);
        }

        Arrays.sort(names);

        for (String name : names) {
            if (name.equalsIgnoreCase(search)) {
                found++;
                break;
            }
        }

        if (found == 1) {
            System.out.println(search + " Found");
        } else {
            System.out.println(search + " Not Found");
        }
        scanner.close();
    }
}