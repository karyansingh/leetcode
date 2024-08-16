import java.util.List;

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        // Initialize min and max values
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int result = Integer.MIN_VALUE;
        
        // Iterate through the lists
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> currentList = arrays.get(i);
            int currentMin = currentList.get(0);
            int currentMax = currentList.get(currentList.size() - 1);
            
            // Calculate maximum distance
            result = Math.max(result, Math.abs(currentMax - min));
            result = Math.max(result, Math.abs(currentMin - max));
            
            // Update min and max values
            min = Math.min(min, currentMin);
            max = Math.max(max, currentMax);
        }
        
        return result;
    }
}
