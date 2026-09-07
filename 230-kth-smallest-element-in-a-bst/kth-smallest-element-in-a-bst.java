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
    void inorder(TreeNode root, int[] arr,int[] i,int[] K){
        if(i[0]>K[0]) return;
        if(root==null) return;
        inorder(root.left,arr,i,K);
        if(i[0]==K[0]) arr[0] = root.val;
        i[0] = i[0] + 1;
        inorder(root.right,arr,i,K);
    }
    public int kthSmallest(TreeNode root, int k) {
        int[] arr = {0};
        int[] i = {1};
        int[] K = {k};
        inorder(root,arr,i,K);        
        return arr[0];
    }
}