public class TransposeOfMatrix {

    static int[][] transposeMatrix(int matrix[][]) {

        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        int newTotalRows = totalCols;
        int newTotalCols = totalRows;

        int ans[][] = new int[newTotalRows][newTotalCols];

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }


    static void printMatrix(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int result[][] = transposeMatrix(matrix);

        printMatrix(result);
    }
}