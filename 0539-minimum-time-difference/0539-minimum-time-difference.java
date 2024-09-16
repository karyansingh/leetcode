import java.util.*;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        int size = timePoints.size();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            String s = timePoints.get(i);
            int h = Integer.parseInt(s.substring(0, 2));
            int m = Integer.parseInt(s.substring(3, 5));
            arr[i] = h * 60 + m;
        }
        
        Arrays.sort(arr);
        
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < size; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }
        
        // Considering the circular nature of the clock
        minDiff = Math.min(minDiff, 1440 + arr[0] - arr[size - 1]);
        
        return minDiff;
    }
}
