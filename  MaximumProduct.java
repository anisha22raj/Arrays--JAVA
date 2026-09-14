import java.util.*;

class MaximumProduct {

    public static int maxProduct(int[] nums) {
        int first = 0;
        int second = 0;

        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second) {
                second = num;
            }
        }

        return (first - 1) * (second - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = new int[4];

            System.out.println("Enter array elements:");

            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }

            int result = maxProduct(nums);

            System.out.println("Maximum product = " + result);
        }
    }
}