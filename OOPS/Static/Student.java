//Parameterized Constructor
public class Student {  
        int id;
        String name;
        static String cName = "Batman";
    Student(int i,String n){   //Constructor is a block of codes similar to method.It is called when an instance of the class is created.At the time of calling the constructor, memory for the object is allocated in the memory. It is a special type of method that is used 
        id = i; 
        name = n;
    }
    void display(){
        System.out.println(id+" "+name+" "+cName);
    }
    public static void main(String[] args) {
        Student s1 = new Student(111, "Aryan");
        Student s2 = new Student(222,"Karan");
        s1.display();
        s2.display();
    }
}
