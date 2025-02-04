public class car {
    public static void main(String[]args){
        String[][] cars = new String[3][3];

        cars[0][0] = "Camero";
        cars[0][1] = "Silverado";
        cars[0][2] = "Mustang";
        cars[1][0] = "BMW";
        cars[1][1] = "Jaguar";
        cars[1][2] = "Lamborghini";
        cars[2][0] = "Buggati";
        cars[2][1] = "Mercedees";
        cars[2][2] = "Supra";
        
        for(int i = 0; i<cars.length; i++){
            System.out.println();
            for(int j = 0; j<cars[i].length; j++){
                    System.out.println(cars[i][j]+" ");
            }
        }
    }
}