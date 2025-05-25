class Solution {
    public String resultingString(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && (Math.abs(st.peek() - c) == 1 || Math.abs(st.peek() - c) == 25)) {
                st.pop(); // remove both
            } else {
                st.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }

        return sb.toString();
    }
}