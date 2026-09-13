import java.util.*;

class MajorityElement {

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = new int[7];

            System.out.println("Enter array elements:");

            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }

            int result = majorityElement(nums);

            System.out.println("Majority element = " + result);
        }
    }
}
