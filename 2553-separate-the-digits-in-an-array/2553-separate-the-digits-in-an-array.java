import java.util.ArrayList;

class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int c : nums) {
            String numStr = Integer.toString(c);
            for (char ch : numStr.toCharArray()) {
                li.add(Character.getNumericValue(ch));
            }
        }
        int len = li.size();
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = li.get(i);
        }
        return ans;
    }
}
