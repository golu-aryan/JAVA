package JAVA.Basic;
public class GuessOutput {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        if (x < y) {
            y = x + z;
        } else {
            z = y - x;
        }
        
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }
}
