class ThirdMax {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num < firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num < secondMax) {
                thirdMax = num;
            }
        }

        if (thirdMax == Integer.MIN_VALUE) {
            System.out.println("There is no third maximum number.");
        } else {
            System.out.println("The third maximum number is: " + thirdMax);
        }
    }
    
}
