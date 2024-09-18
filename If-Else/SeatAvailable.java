import java.util.Scanner;
//Check Seat Availability in Different Classes
//Write a Java program that takes input for the class of travel 
//(e.g., 1 for First AC, 2 for Second AC, 3 for Sleeper), and the 
//number of available seats. If the class of travel is First AC and seats are available, 
//print "Seats available in First AC." Otherwise, print "Seats unavailable." 
public class SeatAvailable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number for class of Travel : [ 1 -> For First AC, 2 -> For Second AC, 3 -> For Sleeper ] :-> ");
        int travelClass = scanner.nextInt();

        System.out.print("Enter number of Available Seats :");
        int seats = scanner.nextInt();

        if(travelClass == 1){
            if(seats <= 10){
                System.out.println("Seats Available in First AC.");
            } else {
                System.out.println("Seats Unavailable in First AC");
            }
        } else if (travelClass == 2) {
            if (seats <= 20 ) {
                System.out.println("Seats Available in Second AC");
            }
            else {
                System.out.println("Seats Unavailable in Second AC");
            }
        } else if (travelClass == 3) {
            if(seats <= 30) {
                System.out.println("Seats are Available in Sleeper");
            } else {
                System.out.println("Seats are Unavailable");
            }
        } else {
            System.out.println("Sry! You Entered Invalid Class of Travel");
        }

        scanner.close();
    }
}
