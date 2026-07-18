import java.util.*;
class Stk{
          public static void main(String[] agrs){
                    Stack<Integer> s= new Stack<>();
                    Scanner scan = new Scanner(System.in);
                    while(true){
                              System.out.print("press 1-> add element, press 2 to del element, 3 for peek element and 4 for size 5 for terminate");
                              int c = scan.nextInt();
                              switch(c){
                                        case 1:
                                                  System.out.print("Enter the data");
                                                  int data = scan.nextInt();
                                                  s.push(data);
                                                  break;
                                        case 2:
                                                  if(s.isEmpty()){
                                                            System.out.print("there is no element");
                                        
                                                  }else{
                                                            s.pop();
                                                            System.out.print("deleted");
                                                  }
                                                  break;
                                        case 3:
                                                  if(s.isEmpty()){
                                                            System.out.print("no elements");
                                                  }else{
                                                            System.out.print(s.peek());
                                                  }
                                                  break;
                                        case 4:
                                                  System.out.print(s.size());
                                                  break;
                                        case 5:
                                                  return;
                                        default:
                                                  System.out.print("need valid input");
                              }
                    }
          }
}