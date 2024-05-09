class upperTraingle {
    public static void upper(int a[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i <= j) {
                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class lowerTriangle extends upperTraingle {
    public static void lower(int arr[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i >= j) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class upperlowertriangle {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        lowerTriangle lt = new lowerTriangle();
        lt.upper(array);
        System.out.println();
        lt.lower(array);

    }
}