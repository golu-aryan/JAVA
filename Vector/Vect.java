import java.util.Vector;

public class Vect {
    public static void main(String[] args) {
        Vector<String> name = new Vector<>();

        name.add("Java");
        name.add("Is");
        name.add("Awesome!");

        System.out.println("Vector Elements are :");
        for (String element : name) {
            System.out.println(element);
        }
    }
}
