import java.util.*;

class LuckyNumbers {

    public static List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {

            // Find minimum element in current row
            int min = matrix[i][0];
            int minCol = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minCol = j;
                }
            }

            // Check if it is maximum in its column
            boolean lucky = true;

            for (int k = 0; k < rows; k++) {
                if (matrix[k][minCol] > min) {
                    lucky = false;
                    break;
                }
            }

            if (lucky) {
                result.add(min);
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

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        List<Integer> result = luckyNumbers(matrix);

        System.out.println("Lucky numbers:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}