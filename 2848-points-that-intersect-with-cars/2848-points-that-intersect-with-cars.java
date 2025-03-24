import java.util.*;

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> points = new HashSet<>();
        
        for (List<Integer> li : nums) {
            int start = li.get(0);
            int end = li.get(1);
            
            for (int i = start; i <= end; i++) {
                points.add(i);
            }
        }
        
        return points.size();
    }
}
