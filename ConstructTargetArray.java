import java.util.*;

class ConstructTargetArray {

    public static boolean isPossible(int[] target) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        int sum = 0;

        for (int num : target) {
            pq.add(num);
            sum += num;
        }

        while (pq.peek() != 1) {

            int largest = pq.poll();

            int rest = sum - largest;

            if (rest <= 0 || largest <= rest) {
                return false;
            }

            int previous = largest % rest;

            if (previous == 0) {
                return false;
            }

            pq.add(previous);

            sum = rest + previous;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] target = new int[n];

        System.out.println("Enter target array:");

        for (int i = 0; i < n; i++) {
            target[i] = sc.nextInt();
        }

        boolean result = isPossible(target);

        System.out.println("Can construct target array = " + result);

        sc.close();
    }
}