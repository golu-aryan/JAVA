package JAVA.OOPS.Array;

class Food {
    String name;

    Food(String name) {
        this.name = name;
    }
}

public class array {
    public static void main(String[] args) {

        Food food1 = new Food("Pizaa");
        Food food2 = new Food("HamBurger");
        Food food3 = new Food("HotDog");

        Food[] refrigerator = { food1, food2, food3 }; // Array of Objects

        // regrigerator[0] = food1;
        // regrigerator[1] = food2;
        // regrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}