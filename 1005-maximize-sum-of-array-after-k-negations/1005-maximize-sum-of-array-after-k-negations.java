import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        // Use a priority queue to keep track of the smallest elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }

        // Perform k negations
        for (int i = 0; i < k; i++) {
            int smallest = pq.poll();
            pq.add(-smallest);
        }

        // Calculate the sum of the array
        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }
}
