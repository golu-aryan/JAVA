class pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;
    //1Constructor
    pizza() {
    }
    //2Constructor
    pizza(String bread) {
        this.bread = bread;
    }

    //3Constructor
    pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    //4Constructor
    pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    //5Constructor
    pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}

public class overloaded {
    public static void main(String[] args) {
        // overloaded constructors = multiple constructors within a class with the same name,
        // but have different parameters
        // name + parameters = signature
        pizza pizza = new pizza();

        System.out.println("Here are the ingredients of your pizaa");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}