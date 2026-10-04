
import java.util.*;

class Shift2Dgrid {

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        int[] arr = new int[total];

        // Convert 2D grid into 1D array
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[index++] = grid[i][j];
            }
        }

        // Shift elements to the right
        k = k % total;
        int[] shifted = new int[total];

        for (int i = 0; i < total; i++) {
            shifted[(i + k) % total] = arr[i];
        }

        // Convert back into 2D list
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(shifted[i * n + j]);
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        System.out.println("Enter grid elements:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        List<List<Integer>> result = shiftGrid(grid, k);

        System.out.println("Shifted grid:");

        for (List<Integer> row : result) {
            System.out.println(row);
        }

        sc.close();
    }
}
