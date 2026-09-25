import java.util.*;

class HeightChecker {

    public static int heightChecker(int[] heights) {

        int[] expected = heights.clone();

        Arrays.sort(expected);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] heights = new int[n];

        System.out.println("Enter heights:");

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int result = heightChecker(heights);

        System.out.println("Number of students in wrong position = " + result);

        sc.close();
    }
}