class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] result = new int[n];
        int sum = 0;
        int i = 0;

        if (k > 0) {
            // start from i+1 value
            int j = i + 1;
            while (i < n) {
                // keep updating sum
                sum += code[j % n];
                if (j - i < k) {
                    j++;
                }
                // once k values sum is done, remove the first value from sum and move the window
                else if (j - i == k) {
                    result[i] = sum;
                    sum -= code[(j - k + 1) % n];
                    i++;
                    j++;
                }
            }
        }
        
        else if (k < 0) {
            // start from i-k value, do n+ to handle <0 value
            int j = n + (i - Math.abs(k));
            while (i < n) {
                // keep updating sum
                sum += code[j];
                // keep moving j until j becomes equal to i
                if (j != i) {
                    // do % n to handle >n values
                    j = ++j % n;
                }
                // remove first value from sum and move i
                if (j == i) {
                    result[i] = sum;
                    // do +n and % n to handle <0 and >n values
                    sum -= code[(n + (j - Math.abs(k))) % n];
                    i++;
                }
            }
        }

        return result;
        
    }
}