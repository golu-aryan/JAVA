package JAVA.OOPS.AccessModifier;

class A{
    private int data = 29;
    private void msg(){
        System.out.println("Hello java");
    }
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.data);
        
    }
}