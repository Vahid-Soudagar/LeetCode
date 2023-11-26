/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();        
    }

    public void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }

        sb.append(root.val+",");
        serialize(root.left, sb);
        serialize(root.right, sb);
    }

    int i = 0;

    public TreeNode deserialize(String[] arr) {
        if (i >= arr.length || arr[i].equals("null")) {
            i++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(arr[i++]));
        node.left = deserialize(arr);
        node.right = deserialize(arr);

        return node;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        // System.out.println(Arrays.toString(arr));
        TreeNode node = deserialize(arr);
        // return new TreeNode(0);
        return node;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));