import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> q = new PriorityQueue<>((a, b) -> b - a); 
        for (int c : gifts) {
            q.add(c);
        }
        for (int i = 0; i < k; i++) {
            int maxGifts = q.poll();
            int remainingGifts = (int) Math.floor(Math.sqrt(maxGifts));
            q.add(remainingGifts);
        }
        long ans = 0;
        while (!q.isEmpty()) {
            ans += q.poll();
        }
        return ans;
    }
}
