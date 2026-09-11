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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        //morries traversal for binary node in inorder manner  time complexity(O(n)) and space complexity (O(n)) for storing the data
		List<Integer> arr = new ArrayList<>();
		TreeNode curr = root1;
		while (curr != null) {
			if (curr.left != null) {
				TreeNode pre = curr.left;
				while (pre.right != null && pre.right != curr) pre = pre.right;
				if (pre.right == null) {
					pre.right = curr;
					curr = curr.left;
				} else {
					pre.right = null;
					arr.add(curr.val);
					curr = curr.right;
				}
			} else {
				arr.add(curr.val);
				curr = curr.right;
			}
		}


        //morries traversal for binary node in inorder manner  time complexity(O(n)) and space complexity (O(n)) for storing the data
		List<Integer> arr2 = new ArrayList<>();
		TreeNode curr2 = root2;
		while (curr2 != null) {
			if (curr2.left != null) {
				TreeNode pre2 = curr2.left;
				while (pre2.right != null && pre2.right != curr2) pre2 = pre2.right;
				if (pre2.right == null) {
					pre2.right = curr2;
					curr2 = curr2.left;
				} else {
					pre2.right = null;
					arr2.add(curr2.val);
					curr2 = curr2.right;
				}
			} else {
				arr2.add(curr2.val);
				curr2 = curr2.right;
			}
		}
		List<Integer> arr3 = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<arr.size() && j<arr2.size()){
            if(arr.get(i)<=arr2.get(j)) {
                arr3.add(arr.get(i));
                i++;

            }else {
                arr3.add(arr2.get(j));
                j++;

            }
        }
        if(j==arr2.size()){
            while(i<arr.size()){
                arr3.add(arr.get(i));
                i++;
            }
        }else if(i==arr.size()){
            while(j<arr2.size()){
                arr3.add(arr2.get(j));
                j++;
            }
        }

        return arr3;


	


    }
}