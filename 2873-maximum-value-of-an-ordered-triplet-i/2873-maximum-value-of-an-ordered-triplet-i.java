class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] preMax = new int[n];
        int[] postMax = new int[n];
        int max = nums[0];
        for(int i=0; i<n; i++){
            
            if(max < nums[i]){
                max = nums[i];
                preMax[i] = nums[i];
            }else
                preMax[i] = max; 
        }
        max = 0;
        for(int i=n-1; i>=0; i--){
            postMax[i] = max;
            if(max < nums[i]){
                max = nums[i];
            }
        }
        
        long ans = 0l;
        for(int i=0; i<n; i++){
            
            long curr = (preMax[i] - nums[i]) * (long)postMax[i];
            if(ans < curr)
                ans = curr;
        }
        return ans;
    }
}