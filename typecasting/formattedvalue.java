import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class formattedvalue {
    public static void main(String[] args) {
        double dbl = 10.999999993333555;
        //This will give round off value
        System.out.printf("%.2f\n", dbl); //output = 11.00
        

        //This will give round off value
        String formattedValue = String.format("%.2f", dbl);
        System.out.println(formattedValue);

        //This will give round off value
        DecimalFormat df = new DecimalFormat("#.##");
        formattedValue = df.format(dbl);
        System.out.println(formattedValue);

        //This will give round off value
        BigDecimal bd = new BigDecimal(dbl);
        bd = bd.setScale(2,RoundingMode.HALF_UP);
        System.out.println(bd);
    }
}
