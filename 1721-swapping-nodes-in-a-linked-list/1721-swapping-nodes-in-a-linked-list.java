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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int count = 1; 
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        
        ListNode t1 = head;
        ListNode t2 = head;
        for (int i = 1; i < k; i++) {
            t1 = t1.next;
        }
        for (int i = 1; i <= count - k; i++) {
            t2 = t2.next;
        }
        
        int t = t1.val;
        t1.val = t2.val;
        t2.val = t;
        
        return head;
    }
}
