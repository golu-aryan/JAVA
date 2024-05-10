public class corner {
    public static void main(String[] args) {
        
        int[][] array = {
            {1, 2, 3},
            {5, 6, 7},
            {9, 10, 11}
        };

        
        System.out.println("Corner numbers of the 2D array:");
        System.out.println(array[0][0]); 
        System.out.println(array[0][array[0].length - 1]); 
        System.out.println(array[array.length - 1][0]); 
        System.out.println(array[array.length - 1][array[array.length - 1].length - 1]); 
    }
}
