import java.util.Scanner;

public class ispresent {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Name : ");
        String name = n.nextLine();

        System.out.print("Is" + name + " Present or not [true/false] :");
        boolean isPresent = n.nextBoolean();

        if (isPresent) {
            System.out.println("Talk to " + name);
        } else {
            System.out.println("No Need to talk with " + name);
        }

        n.close();
    }
}
