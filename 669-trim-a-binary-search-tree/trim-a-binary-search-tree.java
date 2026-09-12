class Solution {
    public TreeNode helper(TreeNode root,int low,int high){
        if(root==null) return root;
        if(root.left!=null){
            while(root.left!=null&&(root.left.val < low || root.left.val > high)){
                if(root.left!=null&&root.left.val < low) root.left = root.left.right;
                if(root.left!=null&&root.left.val > high) root.left = root.left.left;
            }
        }
        if(root.right!=null){
            while(root.right!=null&&(root.right.val < low || root.right.val > high)){
                if(root.right!=null&&root.right.val < low) root = root.right.right;
                if(root.right!=null&&root.right.val > high) root.right = root.right.left;
            }
        }
        helper(root.left,low,high);
        helper(root.right,low,high);
        return root;
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        TreeNode node = new TreeNode(Integer.MAX_VALUE);
        node.left = root;
        helper(node,low,high);
        return node.left;
    }
}