import java.util.Vector;

public class allfunc {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();

        list.add("Ram");
        list.add("Sita");
        list.add("Lakshman");
        list.add("Hanuman");

        System.out.println("Vector elements are:" + list);
        // [Ram, Sita, Lakshman, Hanuman]

        list.insertElementAt("Ravan", 1);
        System.out.println("Vector after inserting Ravan" + list);
        // [Ram, Ravan, Sita, Lakshman, Hanuman]

        System.out.println("Size of list = " + list.size());
        // 5

        list.removeElement("Sita");
        System.out.println("After Removing Sita =" + list);
        // [Ram, Ravan, Lakshman, Hanuman]

        list.removeElementAt(2);
        System.out.println("Removing After 3 element = " + list);
        // [Ram, Ravan, Hanuman]

        list.removeAllElements();
        System.out.println("After removing all Elements = " + list);
        // []
    }
}
