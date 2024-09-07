public class method {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon

        String name = "Aryan";
        int age = 21;

        hello(name, age);
    }

    static void hello(String title, int year) {
        System.out.println("Hello " + title + " \n Your age is : " + year);

    }
}
