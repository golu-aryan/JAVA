package JAVA.Basic;
import java.util.Scanner;

public class NewProgram {
    public static void main(String[] args) {
        String name;
        float chemistry, physics, maths, ttlmarks, avg, perc;

        Scanner n = new Scanner(System.in);
        System.out.print("Enter your name:");
        name = n.nextLine();

        System.out.print("Enter your chemistry marks :");
        chemistry = n.nextFloat();
        System.out.print("Enter your physics marks :");
        physics= n.nextFloat();
        System.out.print("Enter your maths marks :");
        maths = n.nextFloat();

        ttlmarks = chemistry+physics+maths;
        avg = ttlmarks/3;
        perc = (ttlmarks/75)*100;


        System.out.println("your name is: " + name);
        System.out.println("your total marks : " + ttlmarks);
        System.out.println("your average marks is :" + avg);
        System.out.println("Your percentage is :" + perc + "%");
    }
}
