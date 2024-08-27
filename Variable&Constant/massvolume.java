import java.util.Scanner;

public class massvolume {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);

        System.out.print("Enter mass : ");
        float mass = r.nextFloat();

        System.out.print("Enter volume : ");
        float volume = r.nextFloat();

        double density = mass/volume;

        System.out.print("Density is : " + density);
        r.close();
    }
}
