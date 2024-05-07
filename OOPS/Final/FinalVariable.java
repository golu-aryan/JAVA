public class FinalVariable {
    public static void main(String[] args) {
        int a = 5;
        final int b = 10;
        a = 10;
        b = 5;      //You can't change the value o final variable
        System.out.println("a = " + a + "b = " + b);
    }
}