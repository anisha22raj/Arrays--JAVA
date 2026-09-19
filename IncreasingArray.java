import java.util.*;

class IncreasingArray {

    public static boolean canBeIncreasing(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] <= nums[i - 1]) {
                count++;

                if (count > 1) {
                    return false;
                }

                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter array elements:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = canBeIncreasing(nums);

        System.out.println("Can be made strictly increasing: " + result);

        sc.close();
    }
}