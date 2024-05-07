
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year:--");
        int y;
        y = s.nextInt();
        if (y % 4 == 0) {
            System.err.println("this is leap year!");
        } else {
            System.out.println("Sry! this is not leap year");
        }

    }
}
