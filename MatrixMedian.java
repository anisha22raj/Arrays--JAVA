import java.util.*;

class MatrixMedian {

    public static int findMedian(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] arr = new int[rows * cols];
        int index = 0;

        // Convert matrix into 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[index] = matrix[i][j];
                index++;
            }
        }

        // Sort the array
        Arrays.sort(arr);

        // Find median
        return arr[(rows * cols) / 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int median = findMedian(matrix);

        System.out.println("Median = " + median);

        sc.close();
    }
}