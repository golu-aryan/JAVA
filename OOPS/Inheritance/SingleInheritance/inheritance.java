package SingleInheritance;
//Base class
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

// Derived class inheriting from parent class(class Vehicle)
class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating");
    }
}

public class inheritance {

    public static void main(String[] args) {
        Car n = new Car();
        n.move();
        n.accelerate();
    }
}