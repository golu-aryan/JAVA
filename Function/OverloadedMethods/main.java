
public class main {
    //overloaded methods = methods that share the same name but have different parameters
    public static void main(String[] args) {
     int x = add(2,3,5,10); 
     System.out.println(x);  
    }

    static int add(int a, int b){
        System.out.println("This is overloaded number #1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overloaded number #2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded number #3");
        return a+b+c+d;
    }
}

