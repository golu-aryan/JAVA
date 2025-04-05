package JAVA.OOPS.NestedClass.Static;

public class Outer {
    static int data = 50;
    int nonStaticData = 100;

    static class StaticNested {
        void show () {
            System.out.println("Data :-> " + data);
            //The non-static member of outer class can not be used inside the nested static class
            //System.out.println("Non-Static Member Data :-> " + nonStaticData);
        }
    }
}
