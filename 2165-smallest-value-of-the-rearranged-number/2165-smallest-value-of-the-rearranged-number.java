import java.util.Arrays;

class Solution {
    public long smallestNumber(long num) {
        char[] arr = Long.toString(num).toCharArray();
        Arrays.sort(arr);
        StringBuilder s = new StringBuilder();
        if (num >= 0) {
            int i = 0;
            while (i < arr.length && arr[i] == '0') {
                i++;
            }
            if (i < arr.length) {
                s.append(arr[i]);
                for (int j = 0; j < i; j++) {
                    s.append('0');
                }
                for (int j = i + 1; j < arr.length; j++) {
                    s.append(arr[j]);
                }
            } else {
                s.append('0'); 
            }
        } else {
            s.append('-');
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] != '-') {
                    s.append(arr[i]);
                }
            }
        }
        return Long.parseLong(s.toString());
    }
}
