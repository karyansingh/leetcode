class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max = 0;
        
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        int left = 1, right = max;
        int res = 0; 
        while (left <= right) {
            int mid = left + (right - left) / 2; 
            if (isPossible(candies, mid, k)) {
                res = mid; 
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return res; 
    }

    public boolean isPossible(int[] candies, int mid, long k) {
        long count = 0; 
        for (int i = 0; i < candies.length; i++) {
            count += candies[i] / mid; 
        }
        return count >= k;
    }
}
