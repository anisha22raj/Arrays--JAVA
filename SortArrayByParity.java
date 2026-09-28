import java.util.*;

class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {

        int[] result = new int[nums.length];
        int index = 0;

        // Put even numbers first
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
            }
        }

        // Put odd numbers after even numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[index] = nums[i];
                index++;
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

        int[] result = sortArrayByParity(nums);

        System.out.println("Array after sorting by parity:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}