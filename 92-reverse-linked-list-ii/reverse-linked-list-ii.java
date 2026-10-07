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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
    
        for(int i = 1;i<left;i++) temp = temp.next;
        ListNode initial = temp;
        Stack<Integer> st = new Stack<>();
        for(int i = 1;i<=(right-left);i++){
            st.push(temp.val);
            temp = temp.next;
        } 
        st.push(temp.val);
        while(initial!=temp){
            initial.val = st.pop();
            initial = initial.next;
        }
        initial.val = st.pop();
        return head;

    }
}