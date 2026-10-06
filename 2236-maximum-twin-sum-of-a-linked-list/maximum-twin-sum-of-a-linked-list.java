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
    // public int pairSum(ListNode head) {
    //     if(head.next.next==null) return head.val+head.next.val;
    //     Stack<Integer> st = new Stack<>();
    //     ListNode temp = head;
    //     while(temp!=null){
    //         st.push(temp.val);
    //         temp = temp.next;
    //     }
    //     int max = Integer.MIN_VALUE;
    //     temp = head;
    //     ListNode temp2 = head.next;
    //     while(temp2.next!=null){
    //         int val = st.pop();
    //         max = Math.max(max,val+temp.val);
    //         temp = temp.next;
    //         temp2 = temp2.next.next;
    //     }
    //     max = Math.max(max,st.pop()+temp.val);
    //     return max;
    // }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode main = head;
        while(main!=null){
            ListNode temp = main.next;
            main.next = pre;
            pre = main;
            main = temp;
        }
        return pre;
    }

    public int pairSum(ListNode head) {
        ListNode temp = head;
        ListNode temp2 = head.next;

        //to reach in the middle
        while(temp2.next!=null){
            temp = temp.next;
            temp2 = temp2.next.next;
        }

        //reverse the second half of the linked list
        ListNode last = reverseList(temp.next);

        //connect temp to head again
        temp = head;
        //finding the max sum of the pair
        //last --> at the end;
        //temp --> at the start
        int max = Integer.MIN_VALUE;
        ListNode temp3 = last;
        while(temp!=null){
            if(temp3!=null){
                max = Math.max(max,temp.val+temp3.val);
                temp3 = temp3.next;
            }
            
            temp = temp.next;
        }
        //make the linkedlist in default or starting form
        // reverseList(last);

        return max;
    }
}