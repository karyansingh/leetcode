import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int n = nums.length;
        int[] a = new int[n + 1]; 

        
        for (int i = 0; i < n; i++) {
            a[nums[i]]++;
        }

        
        for (int i = 1; i <= n; i++) {
            if (a[i] == 0) {
                li.add(i); 
            }
        }
        
        return li;
    }
}
