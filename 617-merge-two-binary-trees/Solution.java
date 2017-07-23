/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode merged = null;
        
        if (t1 != null && t2 == null){
            merged = new TreeNode(t1.val);
            merged.left = mergeTrees(t1.left, null);
            merged.right = mergeTrees(t1.right, null);
        } else if (t1 == null && t2 != null){
            merged = new TreeNode(t2.val);
            merged.left = mergeTrees(null, t2.left);
            merged.right = mergeTrees(null, t2.right);
        } else if (t1 != null && t2 != null){
            merged = new TreeNode(t1.val + t2.val);
            merged.left = mergeTrees(t1.left, t2.left);
            merged.right = mergeTrees(t1.right, t2.right);
        }
        
        return merged;
    }
}
