class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0]; 
        if (n == 2) return Math.max(nums[0], nums[1]); 
        return Math.max(robRange(nums, 0, n - 2), robRange(nums, 1, n - 1));
    }
    
    public int robRange(int[] nums, int start, int end) {
        if (start > end) return 0; 
        
        int n = end - start + 1; 
        int[] dp = new int[n + 1]; 

        dp[0] = 0; 
        dp[1] = nums[start]; 

        for (int i = 2; i <= n; i++) {
            int take = nums[start + i - 1] + dp[i - 2];
            int notTake = dp[i - 1]; 
            dp[i] = Math.max(take, notTake); 

       
    }
     return dp[n]; 
    
    }
}
