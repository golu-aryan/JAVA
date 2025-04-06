import java.util.Scanner;

public class shipingAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter your Home Address :-> ");
        String Home = scanner.nextLine();

        System.out.print("Please Enter your Work Address :-> ");
        String Work = scanner.nextLine();

        System.out.print("Please Enter Any other Address :-> ");
        String Other = scanner.nextLine();

        if (Home.equals(" ") || Work.equals(" ") || Other.equals(" ")) {
            System.out.println("Error : Please Enter a valid Address");
        } else {
            System.out.println("1>   Home Addresses : " + Home);
            System.out.println("2>   Work Addresses : " + Work);
            System.out.println("3>   Other Addresses : " + Other);
        }
        scanner.close();
    }
}
