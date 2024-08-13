import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private void findCombinations(int start, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        if (target < 0) {
            return; // No valid combination can be found if target is negative
        }

        for (int i = start; i < candidates.length; i++) {
            ds.add(candidates[i]);
            // Since we can reuse the same candidate, pass `i` instead of `i + 1`
            findCombinations(i, candidates, target - candidates[i], ans, ds);
            ds.remove(ds.size() - 1); // Backtrack
        }
    }
}
