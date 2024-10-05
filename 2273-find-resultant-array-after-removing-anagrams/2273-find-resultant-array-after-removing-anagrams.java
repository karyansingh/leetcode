import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> li = new ArrayList<>();
        li.add(words[0]); // Add the first word initially

        for (int i = 1; i < words.length; i++) {
            if (!checkAnagram(words[i - 1], words[i])) {
                li.add(words[i]);
            }
        }
        return li;
    }

    public boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            m2.put(c, m2.getOrDefault(c, 0) + 1);
        }

        return m1.equals(m2);
    }
}
