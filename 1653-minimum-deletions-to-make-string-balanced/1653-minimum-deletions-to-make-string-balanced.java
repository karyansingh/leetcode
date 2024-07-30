import java.util.Stack;

class Solution {
    public int minimumDeletions(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == 'b' && currentChar == 'a') {
                stack.pop();
                count++;
            } else {
                stack.push(currentChar);
            }
        }

        return count;
    }
}
