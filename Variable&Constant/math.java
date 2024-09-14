import java.util.Scanner;

public class math {
    public static void main(String[] args){
        double num, power, result;
        Scanner n = new Scanner(System.in);

        System.out.println("Please enter a number");
        num = n.nextDouble();

        System.out.print("Enter the power you want to raise on the given number ");
        power = n.nextDouble();

        result = Math.pow(num, power);
        System.out.println("The value of power "+ power + " of " + num + " is " +result);
        n.close();
    }
}
