import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        int r, c;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number");
        r = t.nextInt();
        c = t.nextInt();
        for (int i = 0; i <= r; i++) {
            for(int j = 0; j <= c; j++){
                System.out.println("*");
            }
            System.out.println("\n");
        }
        t.close();
    }
}
