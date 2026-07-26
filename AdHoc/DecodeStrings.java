import java.util.*;
public class DecodeStrings {
          public static void main(String[] args){
                    String s="2[a]2[bc]";
                    Stack<Integer> nstk=new Stack<>();
                    Stack<String> sstk=new Stack<>();
                    for(int i=0;i<s.length();i++){
                              char t= s.charAt(i);
                              if(Character.isDigit(t)){
                                        int num=0;
                                        while(i<s.length() && Character.isDigit(s.charAt(i))){
                                                  num=num*10+(s.charAt(i)-'0');
                                                  i++;
                                        }
                                        nstk.push(num);
                                        i--;
                              }else if(t==']'){
                                        String temp="";
                                        while(!sstk.peek().equals("[")){
                                                  temp=sstk.pop()+temp;
                                        }
                                        sstk.pop();
                                        int rep=nstk.pop();
                                        String reps="";
                                        for(int j=0;j<rep;j++){
                                                  reps+=temp;
                                        }
                                        sstk.push(reps);
                              }else{
                                        sstk.push(String.valueOf(t));
                              }
                    }
                    String result="";
                    while(!sstk.isEmpty()){
                              result=sstk.pop()+result;
                    }
                    System.out.println(result);

          }
          
}
