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
    void inorder(TreeNode root, int[] arr,int[] i,int k){
        if(root==null) return;
        inorder(root.left,arr,i,k);
        if(i[0]==k) arr[0] = root.val;
        i[0] = i[0] + 1;
        inorder(root.right,arr,i,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        int[] arr = {0};
        int[] i = {1};
        inorder(root,arr,i,k);        
        return arr[0];
    }
}