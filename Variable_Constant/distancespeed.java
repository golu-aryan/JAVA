import java.util.Scanner;
//Distance covered by a car in meters and the time in seconds it took to cover that distance print the speed of car
public class distancespeed {
    public static void main(String[] args){
        Scanner b = new Scanner(System.in);

        System.out.print("Enter Distances in meter : ");
        double distance = b.nextDouble();

        System.out.print("Enter time in seconds : ");
        double time = b.nextDouble();

        double speed = distance/time;

        System.out.print("The speed of car is : "+ speed);
        b.close();
    }
}
