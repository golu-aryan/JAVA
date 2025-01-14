
import java.util.ArrayList;
//ArrayList = A resizable array
//Elements can be added and removed after compilation phase store references data types.
public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Egg");
        food.set(0,"Burger");

        // for(int i = 0; i < food.size(); i++){
        //     System.out.println(food.get(i));
        // }

        for (String foods : food) {
            System.out.println(foods);
        }
    }
}
