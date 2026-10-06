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
        if(head.next.next==null) return head.val+head.next.val;
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            st.push(temp.val);
            temp = temp.next;
        }
        int max = Integer.MIN_VALUE;
        temp = head;
        ListNode temp2 = head.next;
        while(temp2.next!=null){
            int val = st.pop();
            max = Math.max(max,val+temp.val);
            temp = temp.next;
            temp2 = temp2.next.next;
        }
        max = Math.max(max,st.pop()+temp.val);
        return max;
    }
}