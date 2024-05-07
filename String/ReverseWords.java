import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        sc.close();

        int i, j, k;
        i = str.length() - 1;

        while (i >= 0) {
            j = i;
            while (j >= 0 && str.charAt(j) != ' ') {
                j--;
            }
            k = j + 1; // Adjusted the value of k outside the inner loop
            while (k <= i) {
                System.out.print(str.charAt(k)); // Use print instead of println to avoid new line after each word
                k++;
            }
            System.out.print(" "); // Print space between words
            i = j - 1;
        }
    }
}
