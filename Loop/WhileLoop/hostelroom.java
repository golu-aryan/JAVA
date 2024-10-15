import java.util.Scanner;

public class hostelroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName, Gender, floor = " ", wing;
        int studyYear;
        String userChoice;

        System.out.print("Do you want to allocate room for students? [y/n] :-> ");
        userChoice = scanner.nextLine();

        while (userChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter Student's Name :-> ");
            studentName = scanner.nextLine();

            while (true) {
                System.out.print("Enter student current year of study [1st, 2nd,3rd,4th] :-> ");
                if (scanner.hasNextInt()) {
                    studyYear = scanner.nextInt();

                    if (studyYear >= 1 && studyYear <= 4) {
                        break;
                    } else {
                        System.out.println("Invalid Year! Please Enter year between 1 and 4");
                        continue;
                    }
                } else {
                    System.out.println("Invalid Input! Please Enter valid integer value for year of study");
                    continue;
                }
            }
            scanner.nextLine();

            while (true) {
                System.out.print("Enter Student Gender [Male/Female] :-> ");
                Gender = scanner.nextLine();

                if (Gender.equalsIgnoreCase("Male") || Gender.equalsIgnoreCase("Female")) {
                    break;
                } else {
                    System.out.println("Invalid Gender! Please Enter Male or Female");
                    continue;
                }
            }

            switch (studyYear) {
                case 1:
                    floor = "Ground Floor";
                    break;
                case 2:
                    floor = "First Floor";
                    break;
                case 3:
                    floor = "Second Floor";
                    break;
                case 4:
                    floor = "Third Floor";
                    break;
                default:
                    System.out.print("Invalid Year, Please enter valid year.");
                    break;
            }

            if (Gender.equalsIgnoreCase("Male")) {
                wing = "West Wing";
            } else {
                wing = "East Wing";
            }
            System.out.println("Room Allocated to " + studentName + " : " + floor + ", " + wing + " of the hotstel");

            System.out.print("Do you want to allocate room for another student? [y/n] :-> ");
            userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("n")) {
                System.out.println("Hostel Room allocation process complete");
                break;
            }
        }

        scanner.close();
    }
}
