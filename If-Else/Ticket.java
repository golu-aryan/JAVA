import java.util.Scanner;
//Patna - Gaya, Patna-Hajipur - Buses are available.you are welcome.
//Gaya-patna, gaya-hajipur - Buses are available.you are welcome
//Samastipur-Munger, Munger-Samastipur
//else - There is no bus to this route. Please try later.
import javax.print.attribute.standard.Destination;

public class Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Starting place Name :- ");
        String arrival = scanner.nextLine();
        System.out.print("Enter Destination :- ");
        String destination = scanner.nextLine();


        if ((arrival.equalsIgnoreCase("Patna") && 
        (destination.equalsIgnoreCase("Gaya") || destination.equalsIgnoreCase("Hajipur"))) ||
        (arrival.equalsIgnoreCase("Gaya") && 
        (destination.equalsIgnoreCase("Patna") || destination.equalsIgnoreCase("Hajipur"))) ||
        (arrival.equalsIgnoreCase("Samastipur") && destination.equalsIgnoreCase("Munger")) ||
        (arrival.equalsIgnoreCase("Munger") && destination.equalsIgnoreCase("Samastipur"))) {
        
        System.out.println("Buses are available from " + arrival + " to " + destination + ", You're welcome :)");
    } else {
        System.out.println("Sorry! From " + arrival + " to " + destination + " bus is not available.");
    }
        scanner.close();
    }
}
