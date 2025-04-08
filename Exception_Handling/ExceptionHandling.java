public class ExceptionHandling {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 10;
        b = 5;
        c = 5;
        try {
            if (b - c == 0) {
                throw new ArithmeticException("Division by zero");
            }
            d = a / (b - c);
            System.out.println("Division: " + d);
        } catch (ArithmeticException e1) {
            System.out.println("Arithmetic Exception: " + e1.getMessage());
        }
        System.out.println("End of program");
    }
}
