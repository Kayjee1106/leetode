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
    List<List<Integer>> ans;
    public void bfs(TreeNode root){
        if(root==null)return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
               TreeNode curr=q.poll();
                arr.add(curr.val);
                if(curr.left!=null){
                q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            ans.add(arr);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        ans=new ArrayList<>();
        bfs(root);
        return ans;
    }
}