import java.util.Vector;

class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> v1 = new Stack<>();
        Stack<Character> v2 = new Stack<>();
        boolean flag = x > y;
        int ans = 0;

        // First pass
        for (char c : s.toCharArray()) {
            if (!v1.isEmpty()) {
                if (flag) {
                    if (v1.peek() == 'a' && c == 'b') {
                        ans += x;
                        v1.remove(v1.size() - 1);
                    } else {
                        v1.add(c);
                    }
                } else {
                    if (v1.peek() == 'b' && c == 'a') {
                        ans += y;
                        v1.remove(v1.size() - 1);
                    } else {
                        v1.add(c);
                    }
                }
            } else {
                v1.add(c);
            }
        }

        // Second pass
        for (char c : v1) {
            if (!v2.isEmpty()) {
                if (!flag) {
                    if (v2.peek() == 'a' && c == 'b') {
                        ans += x;
                        v2.remove(v2.size() - 1);
                    } else {
                        v2.add(c);
                    }
                } else {
                    if (v2.peek() == 'b' && c == 'a') {
                        ans += y;
                        v2.remove(v2.size() - 1);
                    } else {
                        v2.add(c);
                    }
                }
            } else {
                v2.add(c);
            }
        }

        return ans;
    }
}