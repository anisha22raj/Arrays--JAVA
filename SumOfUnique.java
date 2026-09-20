import java.util.*;

class SumOfUnique {

    public static int sumOfUnique(int[] nums) {
        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        int sum = 0;

        for (int num : nums) {
            if (freq[num] == 1) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[4];

        System.out.println("Enter array elements:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int result = sumOfUnique(nums);

        System.out.println("Sum of unique elements = " + result);

        sc.close();
    }
}