import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n = q.nextInt();
        for (int i = 1; i <= (2 * n) - 1; i += 2) {
            System.out.println(i);
        }
        q.close();
    }
}
