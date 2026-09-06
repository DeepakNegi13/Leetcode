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
    void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return ;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public TreeNode increasingBST(TreeNode root) {
        // return inorder(root,null);
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        root = new TreeNode(arr.get(0));
        TreeNode temp = root;
        for(int i = 1;i<arr.size();i++){
            root.right = new TreeNode(arr.get(i));
            root = root.right;
        }
        return temp;
    }
}