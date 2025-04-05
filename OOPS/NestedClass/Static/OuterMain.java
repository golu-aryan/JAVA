package JAVA.OOPS.NestedClass.Static;

public class OuterMain {
    public static void main(String[] args) {
        //Object of the Nested Static class can be created without having an Object of the Outer Class
        Outer.StaticNested obj = new Outer.StaticNested();
        obj.show();
    }
}
