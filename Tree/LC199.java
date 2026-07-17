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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null){
            return lst;
        }
        q.offer(root);

        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode cur = q.poll();
                if(i==s-1){
                    lst.add(cur.val);
                }
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }
            }
        }
        return lst;
        
    }
}