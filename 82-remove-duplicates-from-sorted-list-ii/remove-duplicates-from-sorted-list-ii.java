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

    //trying to make optimal 

    public static ListNode deleteDuplicates(ListNode head) {
		ListNode main = new ListNode(-1);
        ListNode t1 = main;
        ListNode t2 = head;
        while(t2 != null){
            if(t2.next!=null && t2.val == t2.next.val){
                int val = t2.val;
                while(t2!=null && t2.val==val) t2 = t2.next;
            }
            else {
                t1.next = t2;
                t1 = t2;
                t2 = t2.next;
            }
        }
                if(t2==null) t1.next = null;

        return main.next;
	}

    
    //not a optimal solution
    // public static ListNode deleteDuplicates(ListNode head) {
	// 	ListNode temp = head;
	// 	HashSet<Integer> hs = new HashSet<>();
	// 	while (temp!=null){
	// 		if(hs.contains(temp.val)){
    //             hs.remove(temp.val);
    //             int val = temp.val;
    //             while(temp!=null && temp.val==val) temp = temp.next;
    //         }
	// 		else {
    //             hs.add(temp.val);
    //             temp = temp.next;
    //         };
			
	// 	}

	// 	temp = null;
	// 	ListNode move = head;
    //     head = null;
	// 	while (move!=null){
	// 		if (hs.contains(move.val)){
	// 			if(temp==null) {
	// 				temp = move;
	// 				head = temp;
	// 			}else {
	// 				temp.next = move;
	// 				temp = temp.next;
	// 			}
	// 		}
    //         move = move.next;
    //         if(temp!=null) temp.next = null;
	// 	}
	// 	return head;
	// }
}