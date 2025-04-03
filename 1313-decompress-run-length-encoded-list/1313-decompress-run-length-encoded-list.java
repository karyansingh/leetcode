import java.util.*;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            for (int j = 0; j < freq; j++) { 
                li.add(val);
            }
        }

        
        int arr[] = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            arr[i] = li.get(i);
        }

        return arr;
    }
}
