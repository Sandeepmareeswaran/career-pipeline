import java.util.*;
class Bpalindrome{
          public static void main(String[] args){
                    int n=9;
                    String bin="";
                    while(n>0){
                              int rem=n%2;
                              bin=rem+bin;
                              n/=2;

                    }
                    String rev="";
                    for(int i=0;i<bin.length();i++){
                              rev+=bin.charAt(bin.length()-1-i);
                    }
                    System.out.println(bin);
                    System.out.println(rev);
                    System.out.println(bin.equals(rev));
          }
}