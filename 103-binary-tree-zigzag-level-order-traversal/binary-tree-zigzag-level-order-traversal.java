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
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
		Queue<TreeNode> st = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Boolean leftToRight = true;
        st.add(root);
        while(st.size()!= 0){
            int size = st.size();
            int[] arr = new int[size];
            for(int i = 0;i<size;i++){
                TreeNode node = st.remove();
                int idx = (leftToRight)? i : size-1-i;
                arr[idx] = node.val;
                if(node.left!=null) st.add(node.left);
                if(node.right!=null) st.add(node.right);
            }
            List<Integer> arr2 = new ArrayList<>();
			for(int elem : arr){
				arr2.addLast(elem);
			}
			ans.add(arr2);
            leftToRight = !leftToRight;

        }
        return ans;

	}
}