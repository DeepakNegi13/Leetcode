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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1==null) return head2;
        if(head2==null) return head1;

        ListNode temp = new ListNode(-1);

        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while(temp1!=null&&temp2!=null){
            if(temp1.val>=temp2.val){
                temp.next = temp2;
                temp2 = temp2.next;
                
            }else{
                temp.next = temp1;
                temp1 = temp1.next;
               
            }
            temp = temp.next;
            
        }
        if(temp1==null){
            temp.next = temp2;
        }
        if(temp2==null){
            temp.next = temp1;
        }
        return head1.val>=head2.val?head2:head1;
    }
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        if(head.next == null) return head;
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        while(temp2!=null && temp2.next != null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        } 
        ListNode head2 = temp1.next;
        temp1.next = null;
        ListNode sorted1 = sortList(head);
        ListNode sorted2 = sortList(head2);
        return mergeTwoLists(sorted1,sorted2);
    }
}