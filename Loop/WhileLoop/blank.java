//While loop = executes a block of code as long as a it's condition remains true

import java.util.Scanner;

public class blank {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);

        String name = " ";

        while(name.isBlank()){
            System.out.println("Enter your name :");
            name = n.nextLine();
        }

        System.out.println("Hello " + name);
        n.close();
    }
}
