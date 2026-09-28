import java.util.*;

class DisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int n = nums.length;
        int[] freq = new int[n + 1];

        // Count each number
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }

        List<Integer> result = new ArrayList<>();

        // Find numbers from 1 to n which are absent
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println("Missing numbers:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}