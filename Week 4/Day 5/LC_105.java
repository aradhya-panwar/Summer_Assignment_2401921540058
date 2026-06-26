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

    int i = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for(int j = 0; j < inorder.length; j++){
            map.put(inorder[j], j);
        }

        return helper(preorder, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] preorder, int start, int end){

        if(start > end){
            return null;
        }

        TreeNode root = new TreeNode(preorder[i]);
        i++;

        int index = map.get(root.val);

        root.left = helper(preorder, start, index - 1);
        root.right = helper(preorder, index + 1, end);

        return root;
    }
}