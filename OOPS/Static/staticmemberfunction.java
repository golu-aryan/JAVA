public class staticmemberfunction {
    int roll;
    String name;
    static String cname = "Manhus college";

    staticmemberfunction(int x, String y) {
        roll = x;
        name = y;
    }

    void display() {
        System.out.println("Roll no : " + roll + "\nName " + name + "\ncollege name : " + cname);
    }

    static void change() {// In static member function only use static data/variables
        cname = "abc";
    }

    public static void main(String[] args) {
        staticmemberfunction q = new staticmemberfunction(123, "Akash");
        q.display();
        staticmemberfunction.change(); // In static member function only use static data/variables
        q.display();
    }
}