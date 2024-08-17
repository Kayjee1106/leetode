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
    List<Integer> ans;

    public void solve(TreeNode root, int level){
        if(root == null) return;
        
        // If this is the first node we encounter at this level, add it to the answer
        if(level == ans.size()) {
            ans.add(root.val);
        }
        
        // Recurse on the right subtree first, then the left subtree
        solve(root.right, level + 1);
        solve(root.left, level + 1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        ans = new ArrayList<>();
        solve(root, 0);
        return ans;
    }
}
