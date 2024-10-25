import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> li = new ArrayList<>();
        solve(1, n, k, li);
        return ans;
    }

    public void solve(int start, int n, int k, List<Integer> li) {
        if (k == 0) {
            ans.add(new ArrayList<>(li));
            return;
        }
        if (start > n) {
            return;
        }
        li.add(start);
        solve(start + 1, n, k - 1, li);
        li.remove(li.size() - 1);
        solve(start + 1, n, k, li);
    }
}
