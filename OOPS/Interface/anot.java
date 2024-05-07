interface animal{
    void makeSound();
}
class dog implements animal{
    public void makeSound(){
        System.out.println("Woof");
    }
}
class cat implements animal{
    public void makeSound() {
        System.out.println("Meow");
    }
}
public class anot {
    public static void main(String[] args){
        animal a = new dog();
        animal b = new cat();

        a.makeSound();
        b.makeSound();
    }
}