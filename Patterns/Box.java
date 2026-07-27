import java.util.*;
class Box{
          public static void main(String[] args){
                    int n=7;
                    int v=(n+1)/2;
                    v+=1;
                    int arr[][]=new int[n][n];
                    int t=0;
                    int b=n-1;
                    int l=0;
                    int r=n-1;
                    while(l<=r && t<=b){
                              v--;
                              for(int j=l;j<=r;j++){
                                        arr[t][j]=v;
                              }
                              t++;
                              for(int i=t;i<=b;i++){
                                        arr[i][r]=v;
                              }
                              r--;
                              if(l<=r){
                                        for(int j=r;j>=l;j--){
                                                  arr[b][j]=v;
                                        }
                              }
                              b--;
                              if(t<=b){
                                        for(int i=b;i>=t;i--){
                                                  arr[i][l]=v;
                                        }
                              }
                              l++;

                    }
                    for(int i=0;i<n;i++){
                              for(int j=0;j<n;j++){
                                        System.out.print(arr[i][j]+" ");
                              }
                              System.out.println();
                    }
          }
}