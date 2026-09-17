import java.util.*;

class MaximumProduct {

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[4];

        System.out.println("Enter array elements:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maximumProduct(nums);

        System.out.println("Maximum product = " + result);

        sc.close();
    }
}