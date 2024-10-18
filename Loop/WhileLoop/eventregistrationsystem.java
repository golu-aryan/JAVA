import java.util.Scanner;

public class eventregistrationsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String events;
        int CricketCount = 0;
        int FootballCount = 0;
        int BadmintonCount = 0;
        int DanceCount = 0;
        int SingingCount = 0;
        int DramaCount = 0;

        System.out.print("Do you want registration in college events [y/n] :-> ");
        String userChoice = scanner.nextLine();

        while (userChoice.equalsIgnoreCase("y")) {
            System.out.println("0>  Exit");
            System.out.println("1>  Sports");
            System.out.println("2>  Cultural");
            System.out.print("Enter Event name in which student's want to register :-> ");
            events = scanner.nextLine();

            if (events.equalsIgnoreCase("1") || events.equalsIgnoreCase("Sports")) {
                System.out.println("---Sports Events---");
                System.out.println("1>  Cricket");
                System.out.println("2>  Football");
                System.out.println("3>  Badminton");
                System.out.println("0> Exit");
                System.out.print("Enter Sports Event :-> ");
                String sportevents = scanner.nextLine();

                switch (sportevents) {
                    case "1", "Cricket":
                        System.out.println("You have successfully registered for Cricket");
                        CricketCount++;
                        break;
                    case "2", "Football":
                        System.out.println("You have successfully registered for Football");
                        FootballCount++;
                        break;
                    case "3", "Badminton":
                        System.out.println("You have successfully registered for Badminton");
                        BadmintonCount++;
                        break;
                    case "0", "Exit":
                        System.out.println("Exit...");
                        break;
                    default:
                        System.out.println("Invalid input! Please Try Again");
                        continue;
                }
            } else if (events.equalsIgnoreCase("2") || events.equalsIgnoreCase("Cultural")) {
                System.out.println("0>  Exit");
                System.out.println("1>  Dancing");
                System.out.println("2>  Singing");
                System.out.println("3>  Drama");
                System.out.print("Enter Cultural Event :-> ");
                String culturalevents = scanner.nextLine();

                switch (culturalevents ) {
                    case "1", "Dancing":
                        DanceCount++;
                        System.out.println("You have successfully registered for Dancing");
                        break;
                    case "2", "Singing":
                        SingingCount++;
                        System.out.println("You have successfully registered for Singing");
                        break;

                    case "3", "Drama":
                        DramaCount++;
                        System.out.println("You have successfully registered for Drama");
                        break;

                    case "0", "Exit":
                        System.out.println("Exit...");
                        break;
                    default:
                        System.out.println("Invalid input! Please Try Again");
                        continue;
                }
            } else {
                System.out.println("Exit...");
                break;
            }
        }
        System.out.println("Registration has ended.");
        System.out.println("Number of participants in each event:");
        System.out.println("Cricket: " + CricketCount);
        System.out.println("Football: " + FootballCount);
        System.out.println("Badminton: " + BadmintonCount);
        System.out.println("Dance: " + DanceCount);
        System.out.println("Singing: " + SingingCount);
        System.out.println("Drama: " + DramaCount);
        scanner.close();
    }
}
