import java.util.*;

class MaximalRectangle {

    public static int maximalRectangle(char[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == '1') {

                    int width = cols;

                    for (int k = i; k < rows; k++) {

                        if (matrix[k][j] == '0') {
                            break;
                        }

                        int currentWidth = 0;

                        for (int l = j; l < cols; l++) {

                            if (matrix[k][l] == '1') {
                                currentWidth++;
                            } else {
                                break;
                            }
                        }

                        width = Math.min(width, currentWidth);

                        int height = k - i + 1;

                        maxArea = Math.max(maxArea, width * height);
                    }
                }
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        char[][] matrix = new char[rows][cols];

        System.out.println("Enter matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }

        int result = maximalRectangle(matrix);

        System.out.println("Maximum rectangle area = " + result);

        sc.close();
    }
}