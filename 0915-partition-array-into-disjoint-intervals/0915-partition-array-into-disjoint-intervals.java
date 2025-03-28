class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];
        
        // Calculate leftMax array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            leftMax[i] = max;
        }
        
        // Calculate rightMin array
        int min = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            rightMin[i] = min;
        }
        
        // Find the partition point
        for (int i = 0; i < n - 1; i++) {
            if (leftMax[i] <= rightMin[i + 1]) {
                return i + 1;
            }
        }
        
        return -1;
    }
}