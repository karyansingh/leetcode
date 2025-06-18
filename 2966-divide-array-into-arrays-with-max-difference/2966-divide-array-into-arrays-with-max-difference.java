import java.util.Arrays;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        if (n % 3 != 0) return new int[0][0];
        
        Arrays.sort(nums);
        int[][] res = new int[n / 3][3];
        int index = 0;

        for (int i = 0; i < n; i += 3) { // Increment by 3 instead of 1
            if (nums[i + 2] - nums[i] <= k) {
                res[index][0] = nums[i];
                res[index][1] = nums[i + 1];
                res[index][2] = nums[i + 2];
                index++;
            } else {
                return new int[0][0]; 
            }
        }
        return res;
    }
}