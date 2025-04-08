import java.util.Scanner;

public class tolowercase {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String Attendance;

        System.out.print("Name : ");
        String name = n.nextLine().toUpperCase();

        System.out.printf("Is %s Present or Absent? Enter value in [present/Absent] :-" , name);
        Attendance = n.nextLine();

        if (Attendance.toLowerCase().intern() == "present") {
            System.out.printf("Talk to %s \n", name);
        } else {
            System.out.printf("No Need to talk to %s", name);
        }
        n.close(); 
    }
}