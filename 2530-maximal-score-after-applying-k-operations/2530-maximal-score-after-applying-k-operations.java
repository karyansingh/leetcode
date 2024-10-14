import java.util.PriorityQueue;
import java.util.Comparator;

public class Solution {
    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for (int num : nums) {
            pq.add((long) num);
        }
        
        long score = 0;
        
        while (k > 0) {
            long ele = pq.poll();  
            score += ele;
            pq.add((long) Math.ceil(ele / 3.0));  
            k--;
        }
        
        return score;
    }

}
