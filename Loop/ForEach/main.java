import java.util.ArrayList;
//For each = Traversing technique to iterate through the elements in an array/collection
//less steps, more readable, less flexible
public class main {
    public static void main(String[] args) {
        // String[] animals = { "cat", "dog", "rat", "bird" };

        ArrayList<String> animal = new ArrayList<String>();

        animal.add("Lion");
        animal.add("Tiger");
        animal.add("Dog");
        animal.add("Leopard");
        for (String i : animal) {
            System.out.println(i);
        }

    }
}
