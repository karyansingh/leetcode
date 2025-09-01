class Solution {
    public int[] nums;
    public Random rand;


    public Solution(int[] nums) {
        this.nums=nums;
        this.rand=new Random();
    }
    
    public int pick(int target) {
        int n=this.nums.length;
        int count=0;
        int idx=0;
        for(int i=0;i<n;i++)
        {
            if(this.nums[i]==target){
                count++;

                if(rand.nextInt(count)==0){
                    idx=i;
                }
            }
        }
        return idx;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */