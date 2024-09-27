import java.util.HashMap;

class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < answers.length; i++) {
            map.put(answers[i], map.getOrDefault(answers[i], 0) + 1);
        }
        int ans = 0;
        for (int key : map.keySet()) {
            int groupSize = key + 1;
            int reportees = map.get(key);
            ans += (int) Math.ceil((float) reportees / (float) groupSize) * groupSize;
        }
        return ans;
    }
}
