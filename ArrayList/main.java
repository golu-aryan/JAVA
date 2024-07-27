import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        

        //ArrayList = a resizable array.
        //Elements can be added and removed after compilation phase store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Sweets");
        food.add("EggRoll");

        food.set(0, "Chicken chilli");//set override the value 
        // food.remove(2);      //remove elements by their index number 

        // food.clear();        //clear all elements in array list.
        for(int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}