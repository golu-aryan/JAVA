import java.util.Scanner;

public class BoardingPoints {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your city name [Banglore/Chennai/Hyderabad] :-> ");
        String city = scanner.nextLine();

        if (city.equalsIgnoreCase("Banglore")) {
            System.out.println("The Available Boarding Points : Majestic, Marathahalli, Electronic");
        } else if (city.equalsIgnoreCase("Chennai")) {
            System.out.println("The Available Boarding Points : Koyambedu & Tambaram");
        } else if (city.equalsIgnoreCase("Hyderabad")) {
            System.out.println("The Available Boarding Points : Lakdi k Pul, Ameerpet");
        } else {
            System.out.println("No Boarding Points available for the selected one");
        }
        scanner.close();
    }
}
