package JAVA.OOPS.Class_Objects.Calculator;

public class Calculator {
    public int add (int num1, int num2) {
        return num1+num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public int multiply(int num1, int num2) {
        return  num1*num2;
    }
    public int divide(int num1, int num2) {
        try  {
            if (num2 == 0) {
                throw new ArithmeticException("Error:-> Division by zero is not allowed");
            }
        } catch (ArithmeticException e) {
            System.out.println("Look :-> " + e.getMessage());
        }
        return num1/num2;
    }
}
