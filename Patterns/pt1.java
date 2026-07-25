import java.util.*;
class pt1{
          public static void main(String[] args){
                    int n=5;
                    int[] start=new int[n];
                    start[0]=1;
                    for(int i=1;i<n;i++){
                              start[i]=start[i-1]+(n-i+1);
                    }
                    for(int i=0;i<n;i++){
                              for(int j=0;j<=i;j++){
                                        System.out.print(start[j]+(i-j)+" ");
                              }
                              System.out.println();
                    }
          }
}