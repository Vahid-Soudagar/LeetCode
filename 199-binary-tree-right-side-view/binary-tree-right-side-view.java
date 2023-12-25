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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        LinkedList<TreeNode> que = new LinkedList<>();
        que.add(root);  

        while (que.size() != 0) {
            list.add(que.getLast().val);
            int size = que.size();

            while (size > 0) {
                TreeNode curr = que.removeFirst();
                if (curr.left != null) {
                    que.add(curr.left);
                }

                if (curr.right != null) {
                    que.add(curr.right);
                }

                size--;
            }
        }

        return list;
    }
}