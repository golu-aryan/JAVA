import java.util.Scanner;

public class celcius {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter temperature in farenheit : ");
        float farenheit = n.nextFloat();

        double celsius = (farenheit - 32) * 5/9;

        System.out.print("Temperatur in celsius is : " + celsius);
        n.close();
    }
}
