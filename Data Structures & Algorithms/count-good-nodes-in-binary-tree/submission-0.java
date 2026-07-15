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

    public int helper(TreeNode root, int[] count, int nodeVal){
        if(root == null){
            return 0;
        }

        if(root.val >= nodeVal){
            count[0] += 1;
            nodeVal = root.val;
        }

        helper(root.left, count, nodeVal);
        helper(root.right, count, nodeVal);

        return count[0];

    }
    public int goodNodes(TreeNode root) {
        int[] count = new int[1];
        int nodeVal = root.val;
        return helper(root, count, nodeVal);
    }
}
