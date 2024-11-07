import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minimumCardPickup(int[] cards) {
        int l = 0, r = 0;
        int minAns = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();

        while (r < cards.length) {
            if (set.contains(cards[r])) {
                minAns = Math.min(minAns, r - l + 1);
                set.remove(cards[l]);
                l++;
            } else {
                set.add(cards[r]);
                r++;
            }
        }

        return minAns == Integer.MAX_VALUE ? -1 : minAns;
    }
}
