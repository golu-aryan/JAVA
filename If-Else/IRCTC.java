import java.util.Scanner;

//IRCTC User Type Eligibility
//Write a Java program that checks the type of IRCTC user (Normal, Premium Tatkal, or Foreign 
//Tourist). Depending on the user type, display different booking windows:Normal user: 120 days advance
//booking.Premium Tatkal: Can book only on the day of the 
//journey.Foreign Tourist: Can book up to 365 days in advance
public class IRCTC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Type of IRCTC: [ Normal, Premium Tatkal, Foreign Tourist ] :->");
        String IRCTCtype = scanner.nextLine();

        if (IRCTCtype.equalsIgnoreCase("Normal")) {
            System.out.println("120 Days Advance Booking :) ");
        }  
        else if (IRCTCtype.equalsIgnoreCase("Premium Tatkal")) {
            System.out.println("Can Book Only on the Day of the Journey");
        } else if (IRCTCtype.equalsIgnoreCase("Foreign Tourist")) {
            System.out.println("Can Book upto 365 days in Advance");
        } else {
            System.out.println("Sry! Your input is not Valid, Please Try Again ;) ");
        }
        scanner.close();
    }
}
