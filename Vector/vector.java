import java.util.Vector;

public class vector{
    public static void main(String[] args){
        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(30);
        numbers.add(60);

        System.out.println("Original Vector:");
        for(int i = 0; i< numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        numbers.set(2,40);
        numbers.remove(1);  

        System.out.println("Modified Vector:");
        for(int i = 0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}