import java.util.Scanner;

public class kg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kilogram :");
        int kg = sc.nextInt();

        double pound = kg*2.20462;
        System.out.println("The weight in pound is : "+ pound);
        sc.close();
    }
}
