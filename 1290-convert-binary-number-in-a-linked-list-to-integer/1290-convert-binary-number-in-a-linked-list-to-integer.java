/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int count = 0;
        int ans = 0;
        ListNode dummy = head;

        // Step 1: Count the total number of nodes (to get the number of bits)
        while (dummy != null) {
            count++;
            dummy = dummy.next;
        }

        while (head != null) {
            count--;  
            ans += head.val * Math.pow(2, count);
            head = head.next;
        }

        return ans;
    }
}
