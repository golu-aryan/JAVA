
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isHotel = false;
        String startingStation, destinationStation, hotel_booking = " ";
        System.out.print("Would you like to make a booking? Please Enter input [ y / n ] :-> ");
        String userOption = scanner.nextLine();

        while (userOption.equalsIgnoreCase("Y") || userOption.equalsIgnoreCase("y")) {
            System.out.println("-----------------------------------------------------------");
            System.out.println();
            System.out.println("##########  What Would U Like Today  #########");
            System.out.println();
            System.out.println("    ************    MENU    ************     ");
            System.out.println("______________________________________________");
            System.out.println("1>  Ticket Booking");
            System.out.println("2>  Hotel Booking");
            System.out.println("3>  Exit");
            System.out.println();
            System.out.print("Please Enter Your Choice :-> ");
            String booking = scanner.nextLine();
            System.out.println();

            if (booking.equalsIgnoreCase("Ticket Booking") || booking.equals("1")) {
                System.out.println("----------------------------------------------------------");
                System.out.println(">>>>Weclome To The Ticket Booking Counter<<<<");
                System.out.println();
                System.out.println("    ************    MENU    **********  ");
                System.out.println("______________________________________________");
                System.out.println("1>  Train Ticket");
                System.out.println("2>  Bus Ticket");
                System.out.println("3>  Flight Ticket");
                System.out.println("4>  Exit");
                System.out.println();
                System.out.print("Please Enter Your Choice :-> ");
                String ticket_booking = scanner.nextLine();
                System.out.println();
                switch (ticket_booking) {
                    case "1", "Train Ticket Booking":
                        System.out.println("----------------------------------------------------------");
                        System.out.println("============    Welcome   =============");
                        System.out.println(">>>>>   Train Ticket Booking    <<<<<<");
                        System.out.print("Enter The Starting Station Name :-> ");
                        startingStation = scanner.nextLine();
                        System.out.print("Enter The Destination Station Name :-> ");
                        destinationStation = scanner.nextLine();
                        System.out.println("Your Ticket is Confirmed.");
                        System.out.println(
                                "Thanks for Booking the ticket from " + startingStation + " to "
                                        + destinationStation);
                        System.out.println("    <<<<    HAPPY JOURNEY, HAVE A NICE DAY  >>>>    ");
                        System.out.println("----------------------------------------------------------");
                        break;

                    case "2", "Bus Ticket Booking":
                        System.out.println("----------------------------------------------------------");
                        System.out.println("============    Welcome   =============");
                        System.out.println(">>>>>   Bus Ticket Booking    <<<<<<");
                        System.out.print("Enter The Starting Station Name :-> ");
                        startingStation = scanner.nextLine();
                        System.out.print("Enter The Destination Station Name :-> ");
                        destinationStation = scanner.nextLine();
                        System.out.println("Your Ticket is Confirmed.");
                        System.out.println(
                                "Thanks for Booking the ticket from " + startingStation + " to "
                                        + destinationStation);
                        System.out.println("    <<<<    HAPPY JOURNEY, HAVE A NICE DAY  >>>>    ");
                        System.out.println("----------------------------------------------------------");
                        break;

                    case "3", "Flight Ticket Booking":
                        System.out.println("----------------------------------------------------------");
                        System.out.println("============    Welcome   =============");
                        System.out.println(">>>>>   Flight Ticket Booking    <<<<<<");
                        System.out.print("Enter The Starting Station Name :-> ");
                        startingStation = scanner.nextLine();
                        System.out.print("Enter The Destination Station Name :-> ");
                        destinationStation = scanner.nextLine();
                        System.out.println("Congrats! Your Ticket is Confirmed.");
                        System.out.println(
                                "Thanks for Booking the ticket from " + startingStation + " to "
                                        + destinationStation);
                        System.out.println("    <<<<    HAPPY JOURNEY, HAVE A NICE DAY  >>>>    ");
                        System.out.println("----------------------------------------------------------");
                        break;

                    case "4", "Exit":
                        System.out.println("Exit.....Thanks for Visiting, See you soon......");
                        userOption = "n";
                        break;

                    default:
                        System.out.println("Sry! You enter Wrong/Invalid input, Please Enter Valid Ticket...");
                        break;
                }
            } else if (booking.equalsIgnoreCase("Hotel Booking") || booking.equals("2")) {
                System.out.println("----------------------------------------------------------");
                System.out.println(">>>>Weclome To The Hotel Booking Software<<<<");
                System.out.println();
                System.out.println("    ************    MENU    **********  ");
                System.out.println("______________________________________________");
                System.out.println("    ----List of Hotel Types----    ");
                System.out.println();
                System.out.println("1>  Ultra Luxury");
                System.out.println("2>  Super Luxury Hotel");
                System.out.println("3>  Luxury Hotel");
                System.out.println("4>  Semi Luxury Hotel");
                System.out.println("5>  Budget Hotel");
                System.out.println("6>  Exit");
                System.out.println();
                System.out.print("Please Enter Your Choice :-> ");
                hotel_booking = scanner.nextLine();
                System.out.println();

                switch (hotel_booking) {
                    case "1", "Ultra Luxury":
                        System.out.println("----------------------------------------------------------");
                        System.out.println(">>>>>  Welcome To Hotel Booking Software    <<<<<<");
                        System.out.println();
                        System.out.println("    ************    MENU    **********  ");
                        System.out.println("______________________________________________");
                        System.out.println("    ----List of Hotel Types----    ");
                        System.out.println();
                        System.out.println("1>  Taj Hotel");
                        System.out.println("2>  Oberoi Hotel");
                        System.out.println("3>  Sheraton");
                        System.out.println("4>  Exit");
                        System.out.print("Please Enter Your Choice :-> ");
                        String ultra_luxury_booking = scanner.nextLine();
                        if (ultra_luxury_booking.equals("1")
                                || ultra_luxury_booking.equalsIgnoreCase("Taj Hotel")) {
                            isHotel = true;
                        } else if (ultra_luxury_booking.equals("2")
                                || ultra_luxury_booking.equalsIgnoreCase("Oberoi Hotel")) {
                            isHotel = true;
                        } else if (ultra_luxury_booking.equalsIgnoreCase("Sheraton")
                                || ultra_luxury_booking.equals("3")) {
                            isHotel = true;
                        } else {
                            System.out.println("Wrong Input,Please Enter Valid Hotel");
                        }
                        break;

                    case "2", "Super Luxury Hotel":
                        System.out.println("----------------------------------------------------------");
                        System.out.println(">>>>>  Welcome To Hotel Booking Software    <<<<<<");
                        System.out.println();
                        System.out.println("    ************    MENU    **********  ");
                        System.out.println("______________________________________________");
                        System.out.println("    ----List of Hotel Types----    ");
                        System.out.println();
                        System.out.println("1>  Taj Hotel");
                        System.out.println("2>  Oberoi Hotel");
                        System.out.println("3>  Sheraton");
                        System.out.println("4>  Exit");
                        System.out.print("Please Enter Your Choice :-> ");
                        String super_luxuryHotel_booking = scanner.nextLine();
                        if (super_luxuryHotel_booking.equals("1")
                                || super_luxuryHotel_booking.equalsIgnoreCase("Taj Hotel")) {
                            isHotel = true;
                        } else if (super_luxuryHotel_booking.equals("2")
                                || super_luxuryHotel_booking.equalsIgnoreCase("Oberoi Hotel")) {
                            isHotel = true;
                        } else if (super_luxuryHotel_booking.equalsIgnoreCase("Sheraton")
                                || super_luxuryHotel_booking.equals("3")) {
                            isHotel = true;
                        } else {
                            System.out.println("Wrong Input,Please Enter Valid Hotel");
                        }
                        break;

                    case "3", "Luxury Hotel":
                        System.out.println("----------------------------------------------------------");
                        System.out.println(">>>>>  Welcome To Hotel Booking Software    <<<<<<");
                        System.out.println();
                        System.out.println("    ************    MENU    **********  ");
                        System.out.println("______________________________________________");
                        System.out.println("    ----List of Hotel Types----    ");
                        System.out.println();
                        System.out.println("1>  Taj Hotel");
                        System.out.println("2>  Oberoi Hotel");
                        System.out.println("3>  Sheraton");
                        System.out.println("4>  Exit");
                        System.out.print("Please Enter Your Choice :-> ");
                        String sheraton_booking = scanner.nextLine();
                        if (sheraton_booking.equals("1") || sheraton_booking.equalsIgnoreCase("Taj Hotel")) {
                            isHotel = true;
                        } else if (sheraton_booking.equals("2")
                                || sheraton_booking.equalsIgnoreCase("Oberoi Hotel")) {
                            isHotel = true;
                        } else if (sheraton_booking.equalsIgnoreCase("Sheraton") || sheraton_booking.equals("3")) {
                            isHotel = true;
                        } else {
                            System.out.println("Wrong Input,Please Enter Valid Hotel");
                        }
                        break;

                    case "4", "Semi Luxury Hotel":
                        System.out.println("----------------------------------------------------------");
                        System.out.println(">>>>>  Welcome To Hotel Booking Software    <<<<<<");
                        System.out.println();
                        System.out.println("    ************    MENU    **********  ");
                        System.out.println("______________________________________________");
                        System.out.println("    ----List of Hotel Types----    ");
                        System.out.println();
                        System.out.println("1>  Taj Hotel");
                        System.out.println("2>  Oberoi Hotel");
                        System.out.println("3>  Sheraton");
                        System.out.println("4>  Exit");
                        System.out.print("Please Enter Your Choice :-> ");
                        String semi_luxuryHotel_booking = scanner.nextLine();
                        if (semi_luxuryHotel_booking.equals("1")
                                || semi_luxuryHotel_booking.equalsIgnoreCase("Taj Hotel")) {
                            isHotel = true;
                        } else if (semi_luxuryHotel_booking.equals("2")
                                || semi_luxuryHotel_booking.equalsIgnoreCase("Oberoi Hotel")) {
                            isHotel = true;
                        } else if (semi_luxuryHotel_booking.equalsIgnoreCase("Sheraton")
                                || semi_luxuryHotel_booking.equals("3")) {
                            isHotel = true;
                        } else {
                            System.out.println("Wrong Input,Please Enter Valid Hotel");
                        }
                        break;

                    case "5", "Budget Hotel":
                        System.out.println("----------------------------------------------------------");
                        System.out.println(">>>>>  Welcome To Hotel Booking Software    <<<<<<");
                        System.out.println();
                        System.out.println("    ************    MENU    **********  ");
                        System.out.println("______________________________________________");
                        System.out.println("    ----List of Hotel Types----    ");
                        System.out.println();
                        System.out.println("1>  Taj Hotel");
                        System.out.println("2>  Oberoi Hotel");
                        System.out.println("3>  Sheraton");
                        System.out.println("4>  Exit");
                        System.out.print("Please Enter Your Choice :-> ");
                        String budget_Hotel_booking = scanner.nextLine();
                        if (budget_Hotel_booking.equals("1")
                                || budget_Hotel_booking.equalsIgnoreCase("Taj Hotel")) {
                            isHotel = true;
                        } else if (budget_Hotel_booking.equals("2")
                                || budget_Hotel_booking.equalsIgnoreCase("Oberoi Hotel")) {
                            isHotel = true;
                        } else if (budget_Hotel_booking.equalsIgnoreCase("Sheraton")
                                || budget_Hotel_booking.equals("3")) {
                            isHotel = true;
                        } else {
                            System.out.println("Wrong Input,Please Enter Valid Hotel");
                        }
                        break;

                    case "6", "Exit":
                        System.out.println("Exit.....Thanks for Visiting, See you soon......");
                        userOption = "n";
                        break;
                    default:
                        System.out.println("Sry! You enter Wrong/Invalid input, Please Enter Valid Hotel...");
                        break;
                }
            } else if (booking.equalsIgnoreCase("Exit") || booking.equals("3")) {
                System.out.println("Exit.....Thanks for Visiting, See you soon......");
                userOption = "n";
            } else {
                System.out.println("Sry! Invalid Input,Please Try Again.");
            }

                System.out.print("Do you want to make another booking [y/n] :-> ");
                userOption = scanner.nextLine();
            if (userOption.equals("y")) {
                continue;
            }
        }

        if (isHotel) {
            System.out.println("___________________________________________________________");
            System.out.println();
            System.out.println(">>>    Thanks a lot for Booking a Hotel with us.    <<<");
            System.out.println();
            System.out.println("I Wish you a Happy Stay at Our Hotel.");
            System.out.println("-----------------------------------------------------------");
        }

        scanner.close();
    }
}
