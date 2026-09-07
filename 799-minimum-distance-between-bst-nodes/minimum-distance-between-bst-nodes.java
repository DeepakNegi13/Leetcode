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
    void helper(TreeNode root,TreeNode[] temp,int[] min){
        if(root==null) return;
        helper(root.left,temp,min);
        if(temp[0]!=null) min[0] = Math.min(min[0],root.val-temp[0].val);
        temp[0] = root;
        helper(root.right,temp,min);
    }
    public int minDiffInBST(TreeNode root) {
        int[] min = {Integer.MAX_VALUE};
        TreeNode[] temp = {null};
        helper(root,temp,min);
        return min[0];
        
    }
}