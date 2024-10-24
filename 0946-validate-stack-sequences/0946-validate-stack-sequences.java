import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        int i = 0, j = 0;
        Stack<Integer> stack = new Stack<>();
        
        while (i < n) {
            stack.push(pushed[i++]);
            while (!stack.isEmpty() && j < n && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        
        return stack.isEmpty();
    }
}
