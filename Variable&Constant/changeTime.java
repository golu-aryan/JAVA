import java.util.Scanner;

public class changeTime {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter time in hours :");
        int hours = n.nextInt();

        System.out.print("Enter time in minutes : ");
        int minutes = n.nextInt();

        int time = (hours * 60) + minutes;

        System.out.print("The time in minutes : "+ time);

        n.close();
    }
}
