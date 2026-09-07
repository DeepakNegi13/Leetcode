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
    // int sum(TreeNode root){
    //     if(root==null) return 0;
    //     return root.val + sum(root.left) + sum(root.right);
    // }
    void helper(TreeNode root,int[] sum){
        if(root==null) return;
        helper(root.right,sum);
        root.val = root.val + sum[0];
        sum[0] = root.val;
        helper(root.left,sum);
    }
    public TreeNode convertBST(TreeNode root) {
        TreeNode temp = root;
        int[] sum = {0};
        helper(temp,sum);
        return temp;
    }
}