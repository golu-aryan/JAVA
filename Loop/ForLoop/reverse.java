import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int n, i;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the number -");
        n = r.nextInt();
        for (i = n; i >= 1; i--) {
            System.out.println(i);
            r.close();
        }
    }
}