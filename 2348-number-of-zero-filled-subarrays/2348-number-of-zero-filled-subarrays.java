class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long zeroCount = 0;
        
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
                count += zeroCount;
            } else {
                zeroCount = 0;
            }
        }
        
        return count;
    }
}
