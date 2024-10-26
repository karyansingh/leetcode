import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        solve(res, new ArrayList<>(), nums, used);
        return res;
    }

    public void solve(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;
            used[i] = true;
            temp.add(nums[i]);
            solve(res, temp, nums, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
