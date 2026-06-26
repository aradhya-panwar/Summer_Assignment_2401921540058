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

    public String serialize(TreeNode root) {

        StringBuilder ans = new StringBuilder();
        helper1(root, ans);
        return ans.toString();
    }

    public void helper1(TreeNode root, StringBuilder ans){

        if(root == null){
            ans.append("N,");
            return;
        }

        ans.append(root.val).append(",");

        helper1(root.left, ans);
        helper1(root.right, ans);
    }

    int i = 0;

    public TreeNode deserialize(String data) {

        String[] arr = data.split(",");
        return helper2(arr);
    }

    public TreeNode helper2(String[] arr){

        if(arr[i].equals("N")){
            i++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(arr[i]));
        i++;

        root.left = helper2(arr);
        root.right = helper2(arr);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));