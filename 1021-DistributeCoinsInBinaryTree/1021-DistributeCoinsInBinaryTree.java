// Last updated: 2/10/2026, 3:14:18 PM
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
    int ans=0;
    public int distributeCoins(TreeNode root) {
        coisn(root);
        return ans;
    }
    public int coisn(TreeNode root){
        if(root==null) return 0;
        int left=coisn(root.left);
        int right=coisn(root.right);
        ans=ans+Math.abs(left)+Math.abs(right);
        return root.val+left+right-1;
    }
}