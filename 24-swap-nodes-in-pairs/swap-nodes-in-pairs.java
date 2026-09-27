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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode main = new ListNode(-1);
        ListNode temp = main;
        ListNode t1 = head;
        ListNode t2 = head.next;
        while(t2 != null && t2.next != null){
            temp.next = t2;
            temp = t2;
            t2 = t2.next;
            temp.next = t1;
            temp = t1;
            t1 = t2;
            t2 = t2.next;
        }
        if(t2==null){
            temp.next = t1;
            t1.next = null;
        }
        if(t2!=null && t2.next==null){
            temp.next = t2;
            t2.next = t1;
            t1.next = null;
        }
        return main.next;
    }
}