

interface area {
    final static float pi = 3.14F;  //F mean float value
    float calculate(float x, float y);
}
class rectangle implements area{
    public float calculate(float x, float y){
        return x*y;
    }
}
class circle implements area{
    public float calculate(float x, float y){
        return pi*x*x;
    }
}

public class f {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        circle cir = new circle();

        area a;
        a = rect;
        System.out.println("Area of rectangle : " + a.calculate(10, 20));
        a = cir;
        System.out.println("Area of circle : " + a.calculate(10, 0));

    }
}
