import java.util.*;

class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Frequency map of characters in 's'
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        // Append characters in the order defined by 'order'
        for (int i = 0; i < order.length(); i++) {
            char ch1 = order.charAt(i);
            if (map.containsKey(ch1)) {
                int freq = map.get(ch1);
                while (freq > 0) {
                    sb.append(ch1);
                    freq--;
                }
                map.remove(ch1); // Remove processed character
            }
        }

        // Append remaining characters in 's' that were not in 'order'
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int freq1 = entry.getValue();
            char ch2 = entry.getKey();
            while (freq1 > 0) {
                sb.append(ch2);
                freq1--;
            }
        }

        return sb.toString();
    }
}
