import java.util.*;
class Que{
          public static void main(String[] args){
                    Scanner scan = new Scanner(System.in);
                    Queue<Integer> q = new LinkedList<>();
                    System.out.println("press 1-> for add, press 2 for del, 3 for size");
                    while(true){
                              System.out.println("press 1-> for add, press 2 for del, 3 for size");
                              int c = scan.nextInt();
                              switch(c){
                                        case 1:
                                                  System.out.print("Enter the data : ");
                                                  int data = scan.nextInt();
                                                  q.offer(data);
                                                  break;
                                        case 2:
                                                  if(q.isEmpty()){
                                                            System.out.print("no element");
                                                  }else{
                                                            q.poll();
                                                            System.out.println("Deleted");
                                                  }
                                                  break;

                                        case 3:
                                                  System.out.println(q.size());
                                                  break;
                                        case 4:
                                                  return;
                                        default:
                                                  System.out.println("Invalid one");
                              }
                    }
          }
}