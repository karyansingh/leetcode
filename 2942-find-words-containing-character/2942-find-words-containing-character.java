import java.util.*;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li = new ArrayList<>();
        int i = 0;
        for (String word : words) {
            if (word.indexOf(x) != -1) {
                li.add(i);
            }
            i++;
        }
        return li;
    }
}
