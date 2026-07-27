import java.util.*;
public class DecodeStrings2 {
          public static void main(String[] agrs){
                    String str = "a1b10";
                    Stack<String> stk =new Stack<>();
                    String s="";
                    for(int i=0;i<str.length();i++){
                              
                              char t=str.charAt(i);
                              
                              if(Character.isDigit(t)){
                                        int num=0;
                                        while(i<str.length() && Character.isDigit(str.charAt(i))){
                                                  num=num*10+(str.charAt(i)-'0');
                                                  i++;
                                        }
                                        i--;
                                        String pop=stk.pop();
                                        String rep="";
                                        for(int j=0;j<num;j++){
                                                  rep+=pop;
                                        }
                                        s+=rep;
                              }else{
                                        stk.push(String.valueOf(str.charAt(i)));
                              }
                    }
                    System.out.println(s);
          }
          
}
