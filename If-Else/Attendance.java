import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String Attendance;
        System.out.print("Is Sumanta Present or Absent? Enter value in [present/Absent] :-");
        Attendance = n.nextLine();

        if (Attendance.equalsIgnoreCase("Present")) {
            System.out.println("Talk to Sumanta");
        } else {
            System.out.println("No Need to talk to sumanta");
        }
        n.close();
    }
}
