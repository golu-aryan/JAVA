import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String :-> ");
        String string = scanner.nextLine();

        System.out.print("Enter Starting Index :-> ");
        int start = scanner.nextInt();

        System.out.print("Enter Ending Index :-> ");
        int end = scanner.nextInt();

        if (string.isEmpty()) {
            System.out.println("String cannot be empty");
        } else {
            if (start >= 0 && end <= string.length() && start < end) {
                String substring = string.substring(start, end);
                System.out.println("Extracted Substring :-> " + substring);
            } else {
                System.out.println("Invalid Indices! Start Should be less than end");
            }
        }

        scanner.close();
    }
}
