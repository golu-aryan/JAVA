import java.util.Scanner;
//Write a program to Accept the weight and height(in meter) of a person and print BMI
public class BMI {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        int weight = n.nextInt();

        System.out.print("Enter height (m): ");
        int height = n.nextInt();

        double BMI = weight/(height*height);

        System.out.print("BMI - " + BMI);
        n.close();
    }
}
