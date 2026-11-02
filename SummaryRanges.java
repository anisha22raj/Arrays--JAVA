
import java.util.*;

public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < nums.length) {
            int start = nums[i];

            while (i + 1 < nums.length &&
                   nums[i + 1] == nums[i] + 1) {
                i++;
            }

            int end = nums[i];

            if (start == end) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + end);
            }

            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted unique elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Summary Ranges: " + summaryRanges(nums));

        sc.close();
    }
}
