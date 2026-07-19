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
    int maxSum;

    public int findMaxBranch(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftBranch = Math.max(0, findMaxBranch(root.left));
        int rightBranch = Math.max(0, findMaxBranch(root.right));
        int currentArch = root.val + leftBranch + rightBranch;
        maxSum = Math.max(maxSum, currentArch);

        return root.val + Math.max(leftBranch, rightBranch);
    }

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        findMaxBranch(root);
        return maxSum;    
    }
}
