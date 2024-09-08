import java.util.Scanner;;

public class totalWeight {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter the weight of product 1 : ");
        double weight1 = n.nextDouble();

        System.out.print("Enter the weight of product 2 : ");
        double weight2 = n.nextDouble();

        System.out.print("Enter the weight of product 3 : ");
        double weight3 = n.nextDouble();

        System.out.print("Enter the weight of product 4 : ");
        double weight4 = n.nextDouble();

        System.out.print("Enter the weight of product 5 : ");
        double weight5 = n.nextDouble();

        double total_Weight = weight1 + weight2 + weight3 + weight4 + weight5;

        System.out.println("The total weight of the five products is : " + total_Weight + " units");
        n.close();
    }
}