import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int[] arr, int size) {
        for (int i = 0; i < size / 2; i++) {
            if (arr[i] != arr[size - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the Array :-> ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid Input! Size must be Greater than zero.");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter " + size + " Elements :->");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " :-> ");
            arr[i] = scanner.nextInt();
        }

        if (isPalindrome(arr, size)) {
            System.out.println("This Number is Palindrome");
        } else {
            System.out.println("This Number is not Palindrome");
        }

        scanner.close();
    }
}