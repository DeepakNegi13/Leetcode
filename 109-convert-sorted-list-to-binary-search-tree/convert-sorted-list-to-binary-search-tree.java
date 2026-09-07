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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode helper(int[] nums, int st,int end){
        if(st>end) return null;
        int mid = (st + end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,st,mid-1);
        root.right = helper(nums,mid+1,end);
        return root;
    }
    // public TreeNode helper(ListNode temp,int n){
    //     for(int i = 1;i<n/2;i++){
        
    //     }
    //     TreeNode root = new TreeNode();
    //     root.left = helper(nums,st,mid-1);
    //     root.right = helper(nums,mid+1,end);
    //     return root;
    // }
    public TreeNode sortedListToBST(ListNode head) {
        // int size = 0;
        // ListNode temp = head;
        // while(temp!=null){
        //     temp = temp.next;
        //     size++;
        // }
        // temp = head;
        // return helper(temp,size);
        ListNode temp = head;
        int i = 0;
        while(temp!=null){
            i++;
            temp = temp.next;
        }
        temp = head;
        int[] arr = new  int[i];

        for(int j = 0;j<i;j++){
            arr[j] = temp.val;
            temp = temp.next;
        }
        return helper(arr,0,arr.length-1);



    }
}