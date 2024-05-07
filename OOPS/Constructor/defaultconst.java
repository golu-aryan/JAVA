public class defaultconst {
    String Name;
    int age;

    defaultconst() {
        Name = "Aryan";
        age = 21;
    }

    public static void main(String[] args) {
        defaultconst s = new defaultconst();
        System.out.println(s.age);
        System.out.println(s.Name);
    }
}
