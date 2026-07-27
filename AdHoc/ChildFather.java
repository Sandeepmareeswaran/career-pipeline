import java.util.*;
class ChildFather{
          public static void main(String[] args){
                    HashMap<String,ArrayList<String>> hmap=new HashMap<>();
                    String[][] input = {
                              {"luke", "shaw"},
                              {"wayne", "rooney"},
                              {"rooney", "ronaldo"},
                              {"shaw", "rooney"}
                    };
                    String person="ronaldo";
                    for(String[] s: input){
                              String child=s[0];
                              String father=s[1];
                              if(!hmap.containsKey(father)){
                                        hmap.put(father,new ArrayList<>());
                                        hmap.get(father).add(child);
                              }else{
                                        hmap.get(father).add(child);
                              }
                    }
                    ArrayList<String> clst=hmap.get(person);
                    int n=0;
                    for(String s:clst){
                              if(hmap.containsKey(s)){
                                        n+=hmap.get(s).size();
                              }
                    }
                    System.out.print("No of grandchilderns: "+n);




          }
}