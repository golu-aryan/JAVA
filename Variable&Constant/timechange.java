import java.util.Scanner;

//WAP to accept time in minutes.......print the time in hours and minutes. ex-400minutes becomes 6 hours and forty minutes
public class timechange {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter time in minutes");
        int time = n.nextInt();

        int hours = time / 60;
        int minutes = time % 60;

        System.out.println(time + " minutes is equivalent to " + hours + " hours and " + minutes + " minutes.");
        n.close();
    }
}
