class Solution {
    public int countHillValley(int[] nums) {
        int hill = 0;
        int valley = 0;
        
        for(int i=1;i<nums.length;i++)
         {
             if(nums[i]==nums[i-1])
             {
                 continue;
             }
             int j=i-1;int k=i+1;
             while(j>=0 && nums[i]==nums[j])
             {
                 j--;
             }
             while(k<nums.length && nums[i]==nums[k])
             {
                 k++;
             }
             if(j<0 || k>=nums.length)
             {
                 continue;
             }
            if (nums[i] < nums[j] && nums[i] < nums[k]) {
                hill++;
            } else if (nums[i] > nums[j] && nums[i] > nums[k]) {
                valley++;
            }
    
        }
        return hill + valley;
    }
}
