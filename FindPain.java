public class FindPain{
          public int GCD(int a,int b){
                    while(b!=0){
                              int t=b;
                              b=a%b;
                              a=t;    
                    }
                    return a;
          }
          public static void main(String[] args){
                    int N=10;
                    int K=3;
                    int c=0;
                    FindPain f= new FindPain();
                    for(int i=1;i<=N;i++){
                              for(int j=i+1;j<=N;j++){
                                        if(f.GCD(i,j)==K){
                                                  c++;
                                        }
                              }
                    }
                    System.out.print(c);
          }
}