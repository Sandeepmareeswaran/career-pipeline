import java.util.*;
class Operation{
          public static void main(String[] args){
                    int n=3;
                    int op=0;
                    while(n!=1){
                              if(n%2==0){
                                        n/=2;
                                        op++;
                              }else{
                                        if((n==3)||(n&3)==1){
                                                  n=n-1;
                                                  op++;
                                        }else{
                                                  n=n+1;
                                                  op++;
                                        }
                              }
                    }
                    System.out.println("The output is : "+op);
          }
}