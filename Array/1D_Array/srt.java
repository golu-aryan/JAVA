import java.util.Arrays;

public class srt {
    public static void main(String[] args) {
        //Declare and initialize an integer array
        int[] my_array1={
            1789,232,434,544,342,2425,252,565,463
        };
        //Declare and initialize a string array 
        String[] my_array2 = {
            "java",
            "python",
            "PHP",
            "c#",
            "C Programming",
            "c++"
        };
        //Print the original numeric array
        System.out.println("Original numeric array:"+Arrays.toString(my_array1));
        //Sort the numeric array in ascending order
        Arrays.sort(my_array1);

        //Print the sorted numeric array
        System.out.println("Sorted numeric array:"+Arrays.toString(my_array1));
        System.out.println("Original array:"+Arrays.toString(my_array2));


    }
}
