class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        left[0] = nums[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.min(left[i-1], nums[i]);
        }
        
        right[n-1] = nums[n-1];
        for (int i = n-2; i >= 0; i--) {
            right[i] = Math.min(right[i+1], nums[i]);   
        }
        
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (left[i] < nums[i] && right[i] < nums[i]) min = Math.min(left[i] + right[i] + nums[i], min);
        }
        
        return min == Integer.MAX_VALUE? -1: min;
    }
}