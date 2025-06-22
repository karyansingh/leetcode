class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int size = (n + k - 1) / k;  // Ceiling division
        String[] res = new String[size];

        int j = 0;
        for (int i = 0; i < n; i += k) {
            int end = Math.min(i + k, n);
            String part = s.substring(i, end);
            if (part.length() < k) {
                StringBuilder sb = new StringBuilder(part);
                while (sb.length() < k) {
                    sb.append(fill);
                }
                part = sb.toString();
            }
            res[j++] = part;
        }

        return res;
    }
}