class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501]; 

        
        for (int num : arr) {
            freq[num]++;
        }

        for (int i = freq.length - 1; i >= 1; i--) {
            if (freq[i] == i) {
                return i;
            }
        }

        return -1;
    }
}