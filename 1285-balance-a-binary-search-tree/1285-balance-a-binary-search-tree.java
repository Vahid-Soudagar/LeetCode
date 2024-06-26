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
    public TreeNode balanceBST(TreeNode root) {
        if (root == null) return null;
        ArrayList<Integer> list = new ArrayList<>();
		inOrder(root, list);
		TreeNode ans = solve(list, 0, list.size() - 1);
		return ans; 
    }

    public TreeNode solve(ArrayList<Integer> list, int low, int high) {
        if (low > high) return null;
        
        int mid = (high + low) / 2;
		TreeNode newNode = new TreeNode(list.get(mid));
		newNode.left = solve(list, low, mid - 1);
		newNode.right = solve(list, mid+1, high);
		return newNode;
	}

	public void inOrder(TreeNode root, ArrayList<Integer> list) {
		if (root == null) return;

		inOrder(root.left, list);
		list.add(root.val);
		inOrder(root.right, list);
	}
}
