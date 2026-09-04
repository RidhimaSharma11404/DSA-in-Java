class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int[] prefix = new int[n + 1];

        for(int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i <= n - k; i++) {
            int sum = prefix[i + k] - prefix[i];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}