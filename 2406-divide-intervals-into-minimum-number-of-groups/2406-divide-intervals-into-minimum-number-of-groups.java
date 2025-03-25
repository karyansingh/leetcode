import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int minGroups(int[][] intervals) {
        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Creating a priority queue to store end points
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int[] arr : intervals) {
            if (!pq.isEmpty() && arr[0] > pq.peek()) {
                pq.poll();
            }
            pq.add(arr[1]);
        }
        return pq.size();
    }
}
