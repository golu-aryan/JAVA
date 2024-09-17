//toString = special method that all object inherit, that returns a String that "Textually represents" an Object.
//              can be used both implicitly and explcitly

class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "Red";
    int year = 2024;

    public String toString() {
        // String myString = make+"\n"+model+"\n"+color+"\n"+year;
        // return myString;
        return make + "\n" + model + "\n" + color + "\n" + year;
    }

}

public class toString {
    public static void main(String[] args) {
        Car car = new Car();
        // System.out.println(car); // Car@2f92e0f4 - This car object address

        // System.out.println(car.model);
        // System.out.println(car.make);
        // System.out.println(car.color);
        // System.out.println(car.year);

        // System.out.println(car.toString());
        System.out.println(car);
    }
}