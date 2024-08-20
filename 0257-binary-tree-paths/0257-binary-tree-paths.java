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
    public static void dfs(List<String> res,TreeNode root,String path){
        if(root==null)return;
        path+=Integer.toString(root.val);
        if(root.left==null && root.right==null)res.add(path);
        else{
            dfs(res,root.left,path+"->");
            dfs(res,root.right,path+"->");
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> res=new ArrayList<>();
       dfs(res,root,"");
       return res;
    }
}