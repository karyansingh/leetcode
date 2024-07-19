class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int openCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                if (openCount > 0) {
                    ans.append(c);
                }
                openCount++;
            } else if (c == ')') {
                openCount--;
                if (openCount > 0) {
                    ans.append(c);
                }
            }
        }

        return ans.toString();
    }
}
