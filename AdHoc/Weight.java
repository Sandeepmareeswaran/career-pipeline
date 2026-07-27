import java.util.*;
class Weight{
          public static void main(String[] agrs){
                    int arr[]={10,36,54,89,12};
                    HashMap<Integer,Integer> hmap =new HashMap<>();
                    for(int i=0;i<arr.length;i++){
                              int cur = arr[i];
                              int sqr = (int)Math.sqrt(cur);
                              int w=0;

                              if(sqr*sqr==cur){
                                        w+=5;
                              }
                              if(cur%4==0 && cur%6==0){
                                        w+=4;
                              }
                              if(cur%2==0){
                                        w+=3;
                              }
                              hmap.put(cur,w);

                    }
                    for(Map.Entry<Integer,Integer> e:hmap.entrySet()){
                              System.out.print(e.getKey()+" "+e.getValue()+" ");
                              System.out.println();
                    }
          }
}