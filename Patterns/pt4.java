class pt4{
          public static void main(String[] args){
                    int[] arr = {1,2,3,4,5};
                    int n=arr.length;
                    for(int i=0;i<arr.length;i++){
                              int l=i;
                              int r=n-i-1;
                              for(int j=0;j<n;j++){
                                        if(j==l){
                                                  System.out.print(arr[j]);
                                        }else if(j==r){
                                                  System.out.print(arr[j]);
                                        }else{
                                                  System.out.print(" ");
                                        }
                              }
                              System.out.println();
                    }
          }
}