class pt6{
          public static void main(String[] args){
                    int n=5;
                    int num=1;
                    int[][] arr=new int[n][n];
                    for(int i=0;i<2*n-1;i++){
                              int r=Math.min(i,n-1);
                              int c= i-r;
                              while(r>=0 && c<n){
                                        arr[r][c]=num++;
                                        r--;
                                        c++;
                              }
                    }
                    for(int i=0;i<n;i++){
                              for(int j=0;j<n;j++){
                                        System.out.print(arr[i][j]);
                              }
                              System.out.println();
                    }
          }
}