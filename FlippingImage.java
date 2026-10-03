import java.util.*;

class FlippingImage {

    public static int[][] flipAndInvertImage(int[][] image) {

        int rows = image.length;
        int cols = image[0].length;

        for (int i = 0; i < rows; i++) {

            // Reverse each row
            int left = 0;
            int right = cols - 1;

            while (left <= right) {

                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                // Flip bits
                image[i][left] = 1 - image[i][left];

                if (left != right) {
                    image[i][right] = 1 - image[i][right];
                }

                left++;
                right--;
            }
        }

        return image;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] image = new int[rows][cols];

        System.out.println("Enter matrix elements (0 or 1):");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                image[i][j] = sc.nextInt();
            }
        }

        int[][] result = flipAndInvertImage(image);

        System.out.println("Flipped and inverted image:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}