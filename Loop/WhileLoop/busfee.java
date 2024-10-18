import java.util.Scanner;

public class busfee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = 0, busfee = 0;

        System.out.print(
                "Do you want to Calculate monthly bus fee based on distance between your home and school? [y/n] :-> ");
        String userChoice = scanner.nextLine();
        while (userChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter Distance from your home and Distance :-> ");
            distance = scanner.nextInt();

            if (distance <= 0) {
                System.out.println("Invalid input. Please enter a distance greater than 0");
                continue;
            }

            if (distance <= 5) {
                busfee = 500;
            } else if (distance <= 10) {
                busfee = 800;
            } else if (distance <= 15) {
                busfee = 1200;
            } else {
                busfee = 1500;
            }

            System.out.println("The bus fee for " + distance + " km is : " + busfee + " per month");

            scanner.nextLine();
            System.out.print("Do you want to calculate Again? [y/n] :-> ");
            userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("n")) {
                break;
            }
        }
        scanner.close();
    }
}
