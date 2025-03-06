package JAVA.OOPS.Constructor;

class human {
    String name;
    int age;
    double weight;

    human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }
    void drink(){
        System.out.println(this.name + " is drinking");
    }
}

public class humanRecords {
    public static void main(String[] args) {
        //constructor = special method that is called when an object is instantiated (created)
        human h = new human("aryan", 21,60);
        human human = new human("aprajita", 20,50);

        h.eat();
        human.drink();
    }
}
