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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null){
            return lst;
        }
        q.offer(root);
        boolean leftright = true;
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> ls = new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode cur = q.poll();
                if(leftright){
                    ls.add(cur.val);
                }else{
                    ls.addFirst(cur.val);
                }
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }

            }
            lst.add(ls);
            leftright=!leftright;
        }
        return lst;
        
    }
}