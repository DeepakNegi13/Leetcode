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
    public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> arr = new ArrayList<>();
		TreeNode curr = root;
		while (curr != null) {
			if (curr.left != null) {
				TreeNode pre = curr.left;
				while (pre.right != null && pre.right != curr) pre = pre.right;
				if (pre.right == null) {
					pre.right = curr;
					curr = curr.left;
				}
				else {
					pre.right = null;
					arr.add(curr.val);
					curr = curr.right;
				}
			} else {
				arr.add(curr.val);
				curr = curr.right;
			}
		}
		return arr;
	}
}