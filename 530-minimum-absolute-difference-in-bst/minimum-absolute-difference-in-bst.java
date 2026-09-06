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
    int right(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        if(root.right==null) return root.val;
        return right(root.right);
    }
    int left(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        if(root.left==null) return root.val;
        return left(root.left);
    }
    public int getMinimumDifference(TreeNode root) {
        if(root==null) return Integer.MAX_VALUE;
        int diff = Math.min(Math.abs(root.val-right(root.left)),Math.abs(root.val-left(root.right)));
        return Math.min(diff,Math.min(getMinimumDifference(root.right),getMinimumDifference(root.left)));
    }
}