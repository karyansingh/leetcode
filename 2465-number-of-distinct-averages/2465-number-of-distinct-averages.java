import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> s = new HashSet<>();
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            double mid = (nums[l] + nums[r]) / 2.0;
            s.add(mid);
            l++;
            r--;
        }
        return s.size();
    }
}
