class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindowSize = Integer.MAX_VALUE;
        int currSum = 0;
        int low = 0;
        for (int high = 0; high < nums.length; high++) {
            currSum += nums[high];
            while (currSum >= target) {
                minWindowSize = Math.min(minWindowSize, high - low + 1);
                currSum -= nums[low];
                low++;
            }
        }
        return minWindowSize == Integer.MAX_VALUE ? 0 : minWindowSize;
    }
}
