class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        // Frequency count of each element
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        int i = 25;
        
        while (i >= 0) {
            if (arr[i] == 0) {
                i--;
                continue;
            }
            
            int n = Math.min(arr[i], repeatLimit);
            for (int j = 0; j < n; j++) {
                sb.append((char) ('a' + i));
            }
            
            arr[i] -= n;
            
            if (arr[i] > 0) {
                // Find the next character to append
                int next = i - 1;
                while (next >= 0 && arr[next] == 0) {
                    next--;
                }
                
                if (next >= 0) {
                    sb.append((char) ('a' + next));
                    arr[next]--;
                } else {
                    break;
                }
            }
        }
        
        return sb.toString();
    }
}
