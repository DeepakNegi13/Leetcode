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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode main = new ListNode(0);
        ListNode temp = main;
        while(true){
            boolean flag = true;
            ListNode min = new ListNode(Integer.MAX_VALUE);
            int idx=-1;
            for(int i = 0;i<lists.length;i++){
                if(lists[i]==null) continue;
                if(min.val>=lists[i].val){
                    flag = false;
                    min = lists[i];
                    idx = i;
                }
            }
            if(flag) return main.next; 
            lists[idx] = lists[idx].next;
            temp.next = min;
            temp = temp.next;
        }

    }
}