import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigdecimal {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number : ");
        double num = n.nextDouble();

        BigDecimal bd = new BigDecimal(num);
        // This will give round off value
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println(bd);

        System.out.println("---------------------");

        bd = new BigDecimal(num);
        // This will give value without round off
        bd = bd.setScale(1, RoundingMode.DOWN);
        System.out.print(bd);

        n.close();
    }
}
