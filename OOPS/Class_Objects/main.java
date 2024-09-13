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
        car myCar = new car();
        System.out.println(myCar.model);
        System.out.println(myCar.color);
    
        myCar.drive();
        myCar.brake();
    }

}
