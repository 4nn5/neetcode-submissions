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


    public void inorder(TreeNode root, List ans, int k){
        if (root != null) {
            inorder(root.left, ans, k);             
            ans.add(root.val);
            inorder(root.right, ans,k);            
        }
    }
    
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans= new ArrayList<>();
        inorder(root, ans, k);

        return ans.get(k - 1);
    }
}
