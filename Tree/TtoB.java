import java.util.*;

class Node{
          int data;
          Node left;
          Node right;
          Node(int data){
                    this.data=data;
                    this.left=null;
                    this.right=null;
          }
}
class TtoB{
          Node insert(Node root,int data){
                    if(root==null){
                              return new Node(data);
                    }

                    if(root.data>data){
                              root.left=insert(root.left,data);
                    }else{
                              root.right=insert(root.right,data);
                    }
                    return root;
          }
          void inorder(Node root){
                    if(root==null){
                              return;
                    }
                    inorder(root.left);
                    System.out.print(root.data+"->");
                    inorder(root.right);
          }

          void LevelOrderTraversal(Node root){
                    Queue<Node>q=new LinkedList<>();
                    q.offer(root);
                    while(!q.isEmpty()){
                              int s=q.size();
                              for(int i=0;i<s;i++){
                                        Node cur=q.poll();
                                        System.out.print(cur.data+" ");
                                        if(cur.left!=null){
                                                  q.offer(cur.left);
                                        }
                                        if(cur.right!=null){
                                                  q.offer(cur.right);
                                        }
                              }
                    }
          }
          public static void main(String[] agrs){
                    TtoB tree= new TtoB();
                    Node root = null;

                    root=tree.insert(root,10);
                    root=tree.insert(root,30);
                    root=tree.insert(root,50);
                    root=tree.insert(root,20);
                    Node root1=root;

                    tree.inorder(root1);
                    tree.LevelOrderTraversal(root);


          }

}