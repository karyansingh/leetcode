import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        
        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> resultList = new ArrayList<>();
        
        // Find the common elements and add them to the result list
        for (int num : map1.keySet()) {
            if (map2.containsKey(num)) {
                int count = Math.min(map1.get(num), map2.get(num));
                for (int i = 0; i < count; i++) {
                    resultList.add(num);
                }
            }
        }
        
        // Convert the result list to an integer array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
