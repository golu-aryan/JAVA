import java.util.Scanner;

public class LibraryMemberShip {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter number of standard members :");
        int normal = n.nextInt();
        System.out.print("Enter fee of standard members :");
        int normalfee = n.nextInt();

        System.out.println("-----------------------------------");

        System.out.print("Enter number of premium members :");
        int premium = n.nextInt();
        System.out.print("Enter fee of premium members :");
        int premiumfee = n.nextInt();

        int normalEarning = normal * normalfee;
        int premiumEarning = premium * normalfee;

        int totalEarning = normalEarning + premiumEarning;

        System.out.print("The Total earning from library membership are : " + totalEarning);

        n.close();
    }
}
