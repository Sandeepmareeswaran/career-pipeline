class pt5{
          public static void main(String[] args){
                    int n=5;
                    for(int i=1;i<=n;i++){
                              int c=0;
                              for(int j=i;j<=n;j++){
                                        c++;
                                        System.out.print(j+" ");
                              }
                              int k=n-c;
                              for(int j=1;j<=k;j++){
                                        System.out.print(j+" ");
                              }
                              System.out.println();

                    }
          }
}