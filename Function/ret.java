public class ret {
    //Method = a block of code that is executed whenever it is called upon 
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        System.out.println(add(x, y));
    }

    static int add(int x, int y) {
        return x + y;
    }
}