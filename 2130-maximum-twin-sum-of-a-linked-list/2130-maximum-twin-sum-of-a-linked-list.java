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
    public int pairSum(ListNode head) {        
        ArrayList<Integer> li = new ArrayList<>();        
        while (head != null) {             
            li.add(head.val);             
            head = head.next;        
        }        
        int l = 0; 
        int r = li.size() - 1;        
        int max = Integer.MIN_VALUE;        
        while (l <= r) {           
            max = Math.max(li.get(l) + li.get(r), max);           
            l++; 
            r--;        
        }        
        return max;    
    }
}
