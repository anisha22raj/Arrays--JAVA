class deleteMinimumElementsToBecomeSorted {

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 8, 6};

        int n = arr.length;

        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {

            dp[i] = 1;

            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }

        int deletions = n - max;

        System.out.println("Minimum deletions = " + deletions);
    }
}