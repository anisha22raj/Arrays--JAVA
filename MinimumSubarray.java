import java.util.*;

class MinimumSubarray {

    public static int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum >= target) {
                    min = Math.min(min, j - i + 1);
                    break;
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            return 0;
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] nums = new int[6];

        System.out.println("Enter array elements:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int result = minSubArrayLen(target, nums);

        System.out.println("Minimum subarray length = " + result);

        sc.close();
    }
}