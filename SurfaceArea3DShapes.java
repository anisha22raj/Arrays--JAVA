import java.util.*;

public class SurfaceArea3DShapes {

    public static int surfaceArea(int[][] grid) {
        int n = grid.length;
        int area = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int height = grid[i][j];

                if (height > 0) {
                    area += 2;
                    area += 4 * height;

                    if (i > 0) {
                        area -= 2 * Math.min(height, grid[i - 1][j]);
                    }

                    if (j > 0) {
                        area -= 2 * Math.min(height, grid[i][j - 1]);
                    }
                }
            }
        }

        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println(surfaceArea(grid));

        sc.close();
    }
}