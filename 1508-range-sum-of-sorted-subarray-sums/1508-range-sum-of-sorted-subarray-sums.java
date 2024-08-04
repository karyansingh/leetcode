import java.util.Arrays;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] sum = new int[(n * (n + 1)) / 2];
        int k = 0;
        
        // Compute all subarray sums
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                sum[k++] = currentSum;
            }
        }
        
        // Sort the subarray sums
        Arrays.sort(sum);
        
        // Calculate the sum of elements from index `left-1` to `right-1`
        long result = 0;
        for (int j = left - 1; j <= right - 1; j++) {
            result += sum[j];
        }
        
        // Return the result modulo 10^9 + 7
        return (int)(result % 1000000007);
    }
}
