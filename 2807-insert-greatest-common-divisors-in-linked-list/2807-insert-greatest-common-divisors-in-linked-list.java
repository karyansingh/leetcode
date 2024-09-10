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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

       ListNode head1=head;
       ListNode head2=head.next;
       while(head2!=null)
       {
            ListNode n=new ListNode(gcd(head1.val,head2.val));
            head1.next=n;
            n.next=head2;
            head1=head1.next.next;
            head2=head2.next;
       } 
       return head;
    }
    public int gcd(int a,int b)
    {
         int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

       
        return result;
    }
}