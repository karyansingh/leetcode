class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }

    private long count(int[] nums, int target) {
        long count = 0;
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            while (i < j && nums[i] + nums[j] > target) {
                j--;
            }
            count += Math.max(0, j - i);
        }
        return count;
    }
}