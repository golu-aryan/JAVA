import java.util.Random;

class diceRoller {
    // Global Variable
    Random random;
    int number = 0;

    diceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;// output is Random number
        System.out.println(number);
    }
}

public class dice {
    public static void main(String[] args) {
        // Local = declared inside a method visible only to that method
        // Global = declared outside a method, but within a class visible to all parts
        // of a class
        diceRoller diceRoller = new diceRoller();

    }
}
