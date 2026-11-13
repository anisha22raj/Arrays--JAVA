
import java.util.*;

public class IntersectionOfArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] nums1 = new int[n];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] nums2 = new int[m];

        System.out.println("Enter second array elements:");
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = intersect(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));

        sc.close();
    }
}
