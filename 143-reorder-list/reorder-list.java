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
    public void swap(ListNode head){
        if(head==null) return;
        if(head.next==null) return;
        int temp = head.val;
        head.val = head.next.val;
        head.next.val = temp;
        swap(head.next.next);
    }
    public void reorderList(ListNode head) {
        if(head.next==null) return ;
        reorderList(head.next);
        swap(head.next);
        
    }
}