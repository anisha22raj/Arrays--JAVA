import java.util.*;

class ReplaceElements {

    public static int[] replaceElements(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int max = arr[i + 1];

            for (int j = i + 2; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            arr[i] = max;
        }

        arr[n - 1] = -1;

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = replaceElements(arr);

        System.out.println("Result:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
