public class printf {
    public static void main(String[] args) {
        // printf() = an optional method to control, format and display text to the
        // console window
        // two arguments = format string + (object/variable/value)
        // %[flags] [precision] [width] [conversion-character]

        // System.out.printf("This is a format string %d" + 123);

        boolean mybool = true;
        char mych = '@';

        String myStr = "Aryan";
        int myInt = 50;
        double mydoub = 1000;

        // [Conversion-character]
        // System.out.printf("%b \n" , mybool);
        // System.out.printf("%c \n" , mych);
        // System.out.printf("%s \n" , myStr);
        // System.out.printf("%d \n" , myInt);
        // System.out.printf("%f \n" , mydoub);

        // [width]
        // sets number of digits of precision when outputting floating point values
        // System.out.printf("Hello %10s", myStr);

        // [Precision]
        // sets number of digits of precision when outputting floation-point values
        // System.out.printf("you have this much money %.3f", mydoub);
        

        //[Flags]
        //adds an effect to output based on the flag added to format specfier
        // - : left-justify 
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping seperator if numbers > 1000

        // System.out.printf("you have this much money %20f", mydoub);
        System.out.printf("you have this much money %020f", mydoub);
        
    }
}