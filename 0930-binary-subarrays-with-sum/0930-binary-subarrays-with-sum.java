class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // Function to count number of subarrays with sum <= goal
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    // Inline the atMost function logic directly here
    private int atMost(int[] nums, int goal) {
        if (goal < 0) return 0; // No subarrays can have a negative sum
        int count = 0;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > goal) {
                sum -= nums[left++];
            }

            count += right - left + 1;
        }

        return count;
    }
}
