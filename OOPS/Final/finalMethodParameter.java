public class finalMethodParameter {
    public static void printFee(final int fee) {
        System.out.println("Course Fees :-> " + fee);

        //Try to modify the final parameter
        // fee = 24999; //A Compile-time error
    }
    public static void main(String[] args) {
        printFee(2000);
    }
}