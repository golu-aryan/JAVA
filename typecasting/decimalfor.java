import java.util.Scanner;
import java.text.DecimalFormat;
public class decimalfor {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = n.nextInt();

        String formated;

        DecimalFormat d = new DecimalFormat("#,###");
        formated = d.format(number);

        System.out.println("Formatted number :" + formated);

        n.close();
    }
}
