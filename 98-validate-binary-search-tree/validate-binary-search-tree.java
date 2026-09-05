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
    public boolean flag ;
    TreeNode pre;
    public void valid(TreeNode root){
        if(root == null) return;
        valid(root.left);
        if(pre != null && pre.val>=root.val) {
            flag = false;
            return;
        }
        pre = root;
        valid(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        flag = true;
        pre = null;
        TreeNode pre = new TreeNode(Integer.MIN_VALUE);
        valid(root);
        return flag;
    }
}