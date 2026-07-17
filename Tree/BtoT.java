
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
class BtoT{
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
          void BottomToTop(Node root){
                    if(root==null){
                              return;
                    }
                    List<List<Integer>> lst=new ArrayList<>();
                    Queue<Node> q = new LinkedList<>();
                    q.offer(root);
                    while(!q.isEmpty()){
                              int s=q.size();
                              List<Integer> ls = new ArrayList<>();
                              for(int i=0;i<s;i++){
                                        Node cur=q.poll();
                                        ls.add(cur.data);
                                        if(cur.left!=null){
                                                  q.offer(cur.left);
                                        }
                                        if(cur.right!=null){
                                                  q.offer(cur.right);
                                        }
                              }
                              lst.addFirst(ls);
                    }

                    for(List<Integer> l:lst){
                              for(int i:l){
                                        System.out.print(i+" ");
                              }
                    }
          }
          public static void main(String[] agrs){
                    BtoT tree= new BtoT();
                    Node root = null;

                    root=tree.insert(root,10);
                    root=tree.insert(root,30);
                    root=tree.insert(root,50);
                    root=tree.insert(root,20);
                    Node tree1=root;

                    tree.inorder(root);
                    tree.BottomToTop(tree1);


          }

}