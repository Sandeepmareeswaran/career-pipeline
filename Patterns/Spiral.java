public class Spiral {
          public static void main(String[] args){
                    int n=5;
                    int arr[][]=new int[n][n];
                    int v=1;
                    int t=0;
                    int b=n-1;
                    int l=0;
                    int r=n-1;
                    while(l<=r && t<=b){
                              for(int j=l;j<=r;j++){
                                        arr[t][j]=v;
                                        v+=1;
                              
                              }
                              t++;
                              for(int i=t;i<=b;i++){
                                        arr[i][r]=v;
                                        v+=1;
                              }
                              r--;
                              if(t<=b){
                                        for(int j=r;j>=l;j--){
                                                  arr[b][j]=v;
                                                  v+=1;
                                        }
                                        b--;
                              }
                              if(l<=r){
                                        for(int i=b;i>=t;i--){
                                                  arr[i][l]=v;
                                                  v+=1;
                                        }
                                        l++;
                              }
                              
                    }
                    for(int i=0;i<n;i++){
                              for(int j=0;j<n;j++){
                                        System.out.print(arr[i][j] +" ");
                              }
                              System.out.println();
                    }
          }
          
}
