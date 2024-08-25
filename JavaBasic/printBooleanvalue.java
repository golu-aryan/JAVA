import java.util.Scanner;

public class printBooleanvalue
{
    public static void main(String[] args){
        boolean x;
        Scanner q = new Scanner(System.in);

        System.out.print("Enter boolean value:");
        x = q.nextBoolean();

        System.out.print("The boolean value is:" + x);
    }
}
