public class WavePrintMatrix {

    static void wavePrintMatrix(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {

            if (j % 2 == 0) {
                // even column -> top to bottom
                for (int i = 0; i < rows; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } 
            else {
                // odd column -> bottom to top
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }


    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        wavePrintMatrix(matrix);
    }
}