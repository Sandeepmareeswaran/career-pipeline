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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        if(root==null){return lst;}
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Integer> ls = new ArrayList<>();
        
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> l = new ArrayList<>();
                for(int i=0;i<s;i++){
                    TreeNode cur = q.poll();
                    l.add(cur.val);
                    
                    if(cur.left!=null){
                        
                        q.offer(cur.left);
                    }
                    if(cur.right!=null){
                        
                        q.offer(cur.right);
                    }
                   
                }
            lst.add(l);
            
        }
        return lst;
        
    }
}