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
    public int diameterOfBinaryTree(TreeNode root) {
       int[] maxD = new int[1];
       helper(maxD, root);
       return maxD[0];
    }

    private int helper(int[] maxD, TreeNode root){
         if(root == null){
            return 0;
        }

        int left = helper(maxD, root.left);
        int right = helper(maxD, root.right);

        maxD[0] = Math.max(left + right, maxD[0]);

        return Math.max(left, right)  + 1;
    }
}
