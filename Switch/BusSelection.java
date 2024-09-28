import java.util.Scanner;

public class BusSelection {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Types of Buses :) ");
        System.out.println("1.  Sleeper");
        System.out.println("2.  Semi-Sleeper");
        System.out.println("3.  AC");
        System.out.println("4.  Non-Ac");
        System.out.print("Enter your Bus Type for Traveling :-> ");
        String type = scanner.nextLine();

        switch (type.toLowerCase()) {
            case "sleeper":
                System.out.println("List of Sleeper Busses");
                System.out.println("1>  Greenline Sleeper Express");
                System.out.println("2>  BlueBird Sleeper Coach");
                System.out.println("3>  KPN Travels Sleeper Luxury");
                break;

            case "semi-sleeper":
                System.out.println("List of Semi-Sleeper Buses");
                System.out.println("1>  Orange Travels Semi-Sleeper Comfort");
                System.out.println("2>  Sri Krishna Travels Semi-Sleeper");
                System.out.println("3>  HawaiJahaj Semi-sleeper Express");
                break;
            
            case "ac":
                System.out.println("List of AC Buses");
                System.out.println("1>  Eagle Travel AC Club Class");
                System.out.println("2>  Mountains Travels AC Deluxe");
                System.out.println("3>  Flyers Travels AC Express");
                break;
            
            case "non-ac":
                System.out.println("List of Non-AC Buses");
                System.out.println("1>  Durgamba Non-AC Seater");
                System.out.println("2>  National Travels Non-AC Deluxe");
                System.out.println("3>  Shrivastava Non-AC Comfort");
                break;
        
            default:
            System.out.println("Sry! Invalid Input, Please select Valid Travel Type.");
                break;
        }
        scanner.close();
    }
}
