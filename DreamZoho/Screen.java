import java.util.*;
public class Screen {
          public static void main(String[] args){

                    String str = "Today is a go day";
                    int sl=27;
                    int cl=0;
                    int space=0;
                    for(int i=0;i<str.length();i++){
                              char t= str.charAt(i);
                              
                              if(t==' '){
                                        space++;
                              }
                    }
                    cl=str.length()-space;
                    int reminder = sl-cl;
                    int rep=reminder/space;
                    int extra=0;
                    if(((rep*space)%reminder) != 0){
                              extra=reminder-(rep*space);
                    }
                    String result="";
                    String repeat="";
                    for(int i=0;i<rep;i++){
                              repeat=repeat+"*";
                    }
                    for(int i=0;i<str.length();i++){
                              char t=str.charAt(i);
                              
                              if(t==' '){
                                        if(extra>0){
                                                  result=result+"*";
                                                  extra--;
                                        }
                                        result=result+repeat;
                              }else{
                                      result=result+String.valueOf(t);  
                              }
                    }
                    System.out.println(result);
          }
}
