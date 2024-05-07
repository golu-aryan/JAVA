/*write a program to swap two numbers*/
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int x,z;
        System.out.println("Enter the two number:--");
        Scanner n = new Scanner(System.in);
        int temp;
        x = n.nextInt();
        z = n.nextInt();

        temp = x;
        x = z;
        z = temp;

        System.out.println("The swapping number is = " + x + z);

    }
}
