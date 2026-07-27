public class Web {
          public static void main(String[] args){
                    String s="ZOHO";
                    int n=s.length();
                    int sz=2*n-1;
                    int m=sz/2;
                    char[][] arr=new char[sz][sz];
                    for(int i=0;i<sz;i++){
                              for(int j=0;j<sz;j++){
                                        arr[i][j]=' ';
                              }
                    }
                    for(int l=0;l<n;l++){
                              char c=s.charAt(l);
                              int d=m-l;
                              
                              arr[m-d][m]=c;
                              arr[m+d][m]=c;
                              arr[m][m-d]=c;
                              arr[m][m+d]=c;
                              arr[m-d][m-d]=c;
                              arr[m-d][m+d]=c;
                              arr[m+d][m-d]=c;
                              arr[m+d][m+d]=c;

                    }
                    arr[m][m]='*';
                    for(int i=0;i<sz;i++){
                              for(int j=0;j<sz;j++){
                                        System.out.print(arr[i][j]);                                        
                              }
                              System.out.println();
                    }
          }
          
}
