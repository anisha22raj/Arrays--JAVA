import java.util.*;

class ImageSmoother {

    public static int[][] imageSmoother(int[][] img) {

        int rows = img.length;
        int cols = img[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int sum = 0;
                int count = 0;

                // Check the 3x3 neighborhood
                for (int r = i - 1; r <= i + 1; r++) {
                    for (int c = j - 1; c <= j + 1; c++) {

                        if (r >= 0 && r < rows &&
                            c >= 0 && c < cols) {

                            sum += img[r][c];
                            count++;
                        }
                    }
                }

                result[i][j] = sum / count;
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

        int[][] img = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                img[i][j] = sc.nextInt();
            }
        }

        int[][] result = imageSmoother(img);

        System.out.println("Smoothed image:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}