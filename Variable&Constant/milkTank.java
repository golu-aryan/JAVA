import java.util.Scanner;

public class milkTank {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter volume of a milk tank in liters :");
        double volume = n.nextDouble();

        System.out.print("Enter flow of milk in liters :");
        double flow = n.nextDouble();

        double time = volume/flow;

        System.out.print("Time to fill milk tanker :" + time);
        n.close();
    }
}
