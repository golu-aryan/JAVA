class Student {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
public class finalReference {
    public static void main(String[] args) {
        final Student s = new Student();

        s.setAge(20);

        System.out.println("Updated Age :-> " + s.getAge());

        s = new Student();      
    }
}