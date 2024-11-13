import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int c : nums) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Integer> li = new ArrayList<>();
        for (int n : map.keySet()) {
            if (map.get(n) == 1 && !map.containsKey(n - 1) && !map.containsKey(n + 1)) {
                li.add(n);
            }
        }
        return li;
    }
}
