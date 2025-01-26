
public class wrapper {
    public static void main(String[] args) {
        //Wrapper class = Provides a way to use primitive data types as reference data types
        //                reference data types contain useful methods
        //                can be used with collections (ex.ArrayList)

        //Primitive             Wrapper
        //-----------           -----------
        //boolean               Boolean
        //char                  Character
        //int                   Int 
        //double                Double


        //Autoboxing = the automatic conversion that the java compiler makes between the primitive types
        //and their corresponding object wrapper classes

        //unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean a = true;
        Character b = 'a';
        Integer c = 123;
        Double d = 3.14;
        String e = "Aryan";
        
        if(a==true)
        {
            System.out.println("This is true");
        }
    }    
}
