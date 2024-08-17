class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int l = 1, r = 10000005; 
        int ans = -1; 
        
        while (l <= r) {
            int mid = (l + r) / 2; 
            double time = 0; 

           
            for (int i = 0; i < dist.length - 1; i++) {
                time += Math.ceil((double) dist[i] / mid);
            }
            time += (double) dist[dist.length - 1] / mid; 

            
            if (time <= hour) {
                ans = mid; 
                r = mid - 1; 
            } else {
                l = mid + 1;
            }
        }
        
        return ans;
    }
}
