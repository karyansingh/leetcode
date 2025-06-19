class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        
        while (i < nums.length) {
            int start = nums[i]; 
            i++;
            while (i < nums.length && nums[i] - start <= k) {
                i++;
            }
            count++; 
        }
        
        return count;
    }
}