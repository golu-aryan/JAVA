import java.util.Scanner;

class A{
    int a;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value :");
        a = sc.nextInt();
    }
}
class B extends A{
    int b;
    void getdata()
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number:");
        b = n.nextInt();
    }
}

class C extends B{
    void add(){
        System.out.println("Addition = "+ (a+b));
    }
}
public class Multi_level {
    public static void main(String [] args){
        C a = new C();
        a.input();
        a.getdata();
        a.add();
    }
}
