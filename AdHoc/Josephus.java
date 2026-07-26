import java.util.*;
class Josephus{
          public static void main(String[] args){
                    int n=6;
                    int k=5;
                    List<Integer> lst = new ArrayList<>();
                    for(int i=1;i<=n;i++){
                              lst.add(i);
                    }
                    int ind=0;
                    while(lst.size()>1){
                              ind=(ind+k-1)%lst.size();
                              System.out.print("Removed lst: "+lst.remove(ind));
                    }
                    System.out.println("Winner is:"+lst.get(0));

          }
}