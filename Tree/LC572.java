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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return false;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode cur = q.poll();
                if(check(cur,subRoot)){
                    return true;
                }
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }
            }
        }
        return false;
        

        
    }
    private boolean check(TreeNode root,TreeNode sub){
        if(root==null && sub==null) return true;
        if(root==null || sub==null) return false;
        if(root.val != sub.val) return false;

        return check(root.left,sub.left)&&check(root.right,sub.right);
    }
}