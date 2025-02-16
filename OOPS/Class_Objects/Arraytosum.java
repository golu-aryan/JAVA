package JAVA.OOPS.Class_Objects;

class Print{
    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Arraytosum {
    public static void main(String[] args){
        int[] myArray = {1,2,3,4,5};

        System.out.println("Array elements are :");
        Print print = new Print();
        print.printArray(myArray);
        
    }

}
