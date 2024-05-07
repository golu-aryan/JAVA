import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String name = new String();
        System.out.println("Enter your name:");
        name = n.next();
        int length = name.length();
        System.out.println(name+"  "+length);
    }
}
