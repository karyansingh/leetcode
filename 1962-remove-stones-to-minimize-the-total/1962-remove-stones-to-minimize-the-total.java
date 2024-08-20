import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int minStoneSum(int[] piles, int k) {
        // Create a max-heap using a custom comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add all elements to the max-heap
        for (int i : piles) {
            pq.add(i);
        }
        
        // Perform k operations
        while (k > 0) {
            // Remove the largest element, halve it, and add it back to the heap
            int temp = pq.poll();
            temp = temp - temp / 2;
            pq.add(temp);
            k--;
        }
        
        // Calculate the total sum of the remaining elements
        int total = 0;
        while (!pq.isEmpty()) {
            total += pq.poll();
        }
        
        return total;
    }
}
