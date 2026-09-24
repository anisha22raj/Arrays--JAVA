import java.util.*;

class KthSmallest {

    public static int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        int[] arr = new int[n * n];
        int index = 0;

        // Convert matrix into 1D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[index] = matrix[i][j];
                index++;
            }
        }

        // Sort array
        Arrays.sort(arr);

        // k-th smallest
        return arr[k - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = kthSmallest(matrix, k);

        System.out.println("Kth smallest element = " + result);

        sc.close();
    }
}