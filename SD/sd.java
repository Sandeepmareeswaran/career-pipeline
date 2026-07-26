import java.util.*;
class Driver{
          String name;
          int loc;
          boolean served;
          String number;

          Driver(String name,int loc,String number){
                    this.name=name;
                    this.loc=loc;
                    this.number=number;
                    served=false;
          }

}
class Pass{
          String name;
          String number;
          Pass(String name,String number){
                    this.name=name;
                    this.number=number;
          }
}
 class sd{
          public static void main(String[] args){
                    List<Driver> dr=new ArrayList<>();
                    List<Pass> ps =  new ArrayList<>();
                    Scanner scan = new Scanner(System.in);
                    sd obj = new sd();
                    boolean state=true;
                    while(state){
                              System.out.print("Press 1 for add Driver \n 2 for add Add passengers\n");
                              
                              int c=scan.nextInt();
                              switch(c){
                                        case 1:
                                                  scan.nextLine();
                                                  System.out.println("Enter your name: ");
                                                  String name = scan.nextLine();
                                                  System.out.println("Enter your phone number: ");
                                                  String number = scan.nextLine();
                                                  System.out.println("Enter your location at where you are now: ");
                                                  int loc = scan.nextInt();
                                                  dr.add(new Driver(name,loc,number));
                                                  break;
                                        case 2:
                                                  scan.nextLine();
                                                  System.out.println("Enter your name: ");
                                                  String cname=scan.nextLine();
                                                  System.out.println("Enter your phone number: ");
                                                  String cnumber=scan.nextLine();
                                                  ps.add(new Pass(cname,cnumber));
                                                  break;
                                        default:
                                                  System.out.println("Exiting !!!");
                                                  state=false;
                                                  break;


                              }
                    }


          }
 }