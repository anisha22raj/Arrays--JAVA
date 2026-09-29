import java.util.*;

class ReshapeMatrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int rows = mat.length;
        int cols = mat[0].length;

        // If total elements are different, reshape is not possible
        if (rows * cols != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                result[index / c][index % c] = mat[i][j];

                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter new number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter new number of columns: ");
        int c = sc.nextInt();

        int[][] result = matrixReshape(mat, r, c);

        System.out.println("Reshaped matrix:");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}