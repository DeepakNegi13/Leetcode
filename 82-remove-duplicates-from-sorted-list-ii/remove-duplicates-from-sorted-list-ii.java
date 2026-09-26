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
    public static ListNode deleteDuplicates(ListNode head) {
		ListNode temp = head;
		HashSet<Integer> hs = new HashSet<>();
		while (temp!=null){
            //problem is this line
			if(hs.contains(temp.val)){
                hs.remove(temp.val);
                int val = temp.val;
                while(temp!=null && temp.val==val) temp = temp.next;
            }
			else {
                hs.add(temp.val);
                temp = temp.next;
            };
			
		}

        //no problem
		temp = null;
		ListNode move = head;
        head = null;
		while (move!=null){
			if (hs.contains(move.val)){
				if(temp==null) {
					temp = move;
					head = temp;
				}else {
					temp.next = move;
					temp = temp.next;
				}
			}
            move = move.next;
            if(temp!=null) temp.next = null;
		}

		return head;
	}
}