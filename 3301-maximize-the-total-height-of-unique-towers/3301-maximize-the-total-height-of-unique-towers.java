import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        // Sort the array in descending order
        Integer[] maxHeight = Arrays.stream(maximumHeight).boxed().toArray(Integer[]::new);
        Arrays.sort(maxHeight, Collections.reverseOrder());
        
        long sum = maxHeight[0];
        for (int i = 1; i < maxHeight.length; i++) {
            int n = Math.min(maxHeight[i], maxHeight[i - 1] - 1);
            if(n<=0)return -1;
            maxHeight[i] = n;
            sum += n;
        }
        return sum;
    }
}
