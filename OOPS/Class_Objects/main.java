class car{
    String make = "chevrolet";
    String model = "corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;


    void drive (){
        System.out.println("You drive the car");
    }

    void brake (){
        System.out.println("You step on the brakes");
    }
}
public class main{
    public static void main(String[] args){
        car myCar1 = new car();
        car myCar2 = new car();
        System.out.println(myCar1.model);
        System.out.println(myCar1.color);
        System.out.println("--------------");
        System.out.println(myCar2.model);
        System.out.println(myCar2.color);
    
        myCar2.drive();
        myCar1.brake();
    }

}
