import java.util.Arrays;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[] = new int[nums.length];
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        int i = 0;
        while (l <= r) {
            if (i % 2 == 0) {
                res[i] = nums[r];
                r--;
            } else {
                res[i] = nums[l];
                l++;
            }
            i++;
        }
        return res;
    }
}
