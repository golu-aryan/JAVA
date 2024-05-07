public class Staticvariable {
    int rollno;
    String name;
    static String college = "ABC";      

    Staticvariable(int r,String n){
        rollno =r;
        name = n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
    public static void main(String[] args){
        Staticvariable s = new Staticvariable(11,"Aryan");
        Staticvariable q = new Staticvariable(13,"Kumar");

        s.display();
        q.display();
    }
}
