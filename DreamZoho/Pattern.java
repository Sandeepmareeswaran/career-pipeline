import java.util.*;
class Pattern{
          public static void main(String[] args){
                    int n=5;
                    
                    
                    System.out.println();
                    int num=0;
                    for(int i=0;i<n;i++){
                              
                              if(i==0){
                                        num=1;
                              }else{
                                        num+=n-i+1;
                              }
                              for(int j=n-1;j>i;j--){
                                        System.out.print("  ");
                              }
                              System.out.print(num);
                              int nnum=num;
                              for(int j=0;j<i;j++){
                                        nnum-=n-i+j;
                                        System.out.print(nnum);
                              }
                              System.out.println();
                    }
                    

          }
}