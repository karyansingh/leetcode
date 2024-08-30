class Solution {
    public int[] nextLargerNodes(ListNode head) {
        // Convert the linked list to an array for easier reverse traversal
        List<Integer> numsList = new ArrayList<>();
        while (head != null) {
            numsList.add(head.val);
            head = head.next;
        }
        
        int n = numsList.size();
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // Initialize result array with zeros
        Arrays.fill(res, 0);
        
        // Traverse the array in reverse
        for (int i = n - 1; i >= 0; i--) {
            int currVal = numsList.get(i);
            
            // Pop elements from the stack while they are smaller than the current value
            while (!stack.isEmpty() && numsList.get(stack.peek()) <= currVal) {
                stack.pop();
            }
            
            // If the stack is not empty, the top element is the next greater value
            if (!stack.isEmpty()) {
                res[i] = numsList.get(stack.peek());
            }
            
            // Push the current value onto the stack
            stack.push(i);
        }
        
        return res;
    }
}
