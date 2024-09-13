public class mains {
    public static void main(String[] args) {
        // Printf() = an optional method to control, format and display text to the
        // console window
        // two arguments = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '#';
        String myString = "Aryan";
        int myInt = 30;
        double myDouble = -5600000;

        System.out.printf("%b \n",myBoolean);
        System.out.printf("%c \n",myChar);
        System.out.printf("%s \n",myString);
        System.out.printf("%d \n",myInt);
        System.out.printf("%f \n",myDouble);

        // [Width]
        // Minimum number of characters to be written as output
        System.out.printf("Hello %10s \n", myString);

        //[Precision]
        //sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %.2f \n", myDouble);

        //[flags]
        //adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : outptut a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric value are zero-padded
        // , : comma grouping separator if number > 1000
        System.out.printf("You have this much money %,f \n", myDouble);

    }
}
