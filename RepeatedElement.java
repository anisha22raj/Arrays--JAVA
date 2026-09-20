import java.util.*;

class RepeatedElement {

    public static int repeatedNTimes(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                return nums[i];
            }

            if (i + 2 < nums.length && nums[i] == nums[i + 2]) {
                return nums[i];
            }

            if (i + 3 < nums.length && nums[i] == nums[i + 3]) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[6];

        System.out.println("Enter array elements:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int result = repeatedNTimes(nums);

        System.out.println("Repeated element = " + result);

        sc.close();
    }
}