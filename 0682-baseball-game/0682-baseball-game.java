import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        
        for (String op : operations) {
            switch (op) {
                case "C":
                    if (!s.isEmpty()) {
                        s.pop();
                    }
                    break;
                case "D":
                    if (!s.isEmpty()) {
                        s.push(2 * s.peek());
                    }
                    break;
                case "+":
                    if (s.size() >= 2) {
                        int top1 = s.pop();
                        int top2 = s.peek();
                        s.push(top1);
                        s.push(top1 + top2);
                    }
                    break;
                default:
                    s.push(Integer.parseInt(op));
                    break;
            }
        }
        
        int total = 0;
        while (!s.isEmpty()) {
            total += s.pop();
        }
        
        return total;
    }
}
