import java.util.ArrayList;

//2D ArrayList= a dynamic list of list..you can change the size of these lists during runtime

public class arraylist {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Donuts");


        ArrayList<String> produceList = new ArrayList();
        produceList.add("Tomatos");
        produceList.add("Peppers");
        produceList.add("Samosas");


        ArrayList<String> DrinkList = new ArrayList();
        DrinkList.add("Soda");
        DrinkList.add("Coffee");
        DrinkList.add("Juice");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(DrinkList);

        System.out.println(groceryList.get(2));
    }
}
