import java.util.*;
class Coach{
          private String Name;
          private int capacity;
          private int waiting;
          List<Ticket> confirmlist = new ArrayList<>();
          Queue<Ticket> waitinglist = new LinkedList<>();
          
          Coach(String Name,int capacity,int waiting){
                    this.Name=Name;
                    this.capacity=capacity;
                    this.waiting=waiting;
                    
          }

          public List<Ticket> getConfirmlist() {
                    return confirmlist;
          }

          public void setConfirmlist(List<Ticket> confirmlist) {
                    this.confirmlist = confirmlist;
          }

          public Queue<Ticket> getWaitinglist() {
                    return waitinglist;
          }

          public void setWaitinglist(Queue<Ticket> waitinglist) {
                    this.waitinglist = waitinglist;
          }

          public String getName() {
                    return Name;
          }
          public void setName(String name) {
                    Name = name;
          }
          public int getCapacity() {
                    return capacity;
          }
          public void setCapacity(int capacity) {
                    this.capacity = capacity;
          }
          public int getWaiting() {
                    return waiting;
          }
          public void setWaiting(int waiting) {
                    this.waiting = waiting;
          }
}
class Passenger{
          private String Name;
          private String Password;
          private static int ID=0;
          Passenger(String Name,String Password){
                    this.Name=Name;
                    this.Password=Password;
                    this.ID=ID+1;
          }
          public String getName() {
                    return Name;
          }
          public void setName(String name) {
                    Name = name;
          }
          public String getPassword() {
                    return Password;
          }
          public void setPassword(String password) {
                    Password = password;
          }

}
class Ticket{
          private int TicketID;
          private static int id=100;
          private Coach coach;
          private Passenger passenger;
          int seatNo;
          Ticket(Coach c,Passenger p,int seatNo){
                    this.coach=c;
                    this.passenger=p;
                    this.seatNo=seatNo;
                    this.TicketID=++id;
          }
          public Coach getCoach() {
                    return coach;
          }
          public void setCoach(Coach coach) {
                    this.coach = coach;
          }
          public Passenger getPassenger() {
                    return passenger;
          }
          public void setPassenger(Passenger passenger) {
                    this.passenger = passenger;
          }
          public int getTicketID() {
                    return TicketID;
          }
          public void setTicketID(int ticketID) {
                    TicketID = ticketID;
          }
          public int getSeatNo() {
                    return seatNo;
          }
          public void setSeatNo(int seatNo) {
                    this.seatNo = seatNo;
          }
}
public class Railway {
          private List<Coach> CoachList = new ArrayList<>();
          private List<Passenger> PList = new ArrayList<>();
          private List<Ticket> TList=new ArrayList<>();
          private static Scanner scan = new Scanner(System.in);
          private void initialization(){
                    CoachList.add(new Coach("ACCoach",5,2));
                    CoachList.add(new Coach("NonACCoach",5,2));
                    CoachList.add(new Coach("Seater",5,2));
                    System.out.println("Coachs Initialized !!");
          }
          private void signin(String name,String pass){
                    PList.add(new Passenger(name, pass));
                    System.out.println("Account Created !!!");
          }
          private Passenger searchPassenger(String name){
                    for(Passenger p:PList){
                              if(p.getName().equals(name)){
                                        return p;
                              }
                    }
                    return new Passenger(name, name);
          }
          private boolean login(String name,String pass){
                    for(Passenger p:PList){
                              if(p.getName().equals(name)){
                                        if(p.getPassword().equals(pass)){
                                                  return true;
                                        }
                              }
                    }
                    return false;
          }
          private void ListCoachs(){
                    for(Coach c: CoachList){
                              System.out.println(c.getName());
                              
                    }
          }
          private void bookCoach(String pname,String name){
                    for(Coach c:CoachList){
                              if(c.getName().equals(name)){
                                        if(c.getCapacity()>=c.getConfirmlist().size()){
                                                  Ticket t=new Ticket(c,searchPassenger(pname),c.getConfirmlist().size()+1);
                                                  c.getConfirmlist().add(t);
                                                  TList.add(t);
                                                  System.out.println("Your ticket is confirmed"+t.getSeatNo()+" "+t.getTicketID());
                                        }else if(c.getWaiting()>=c.getWaitinglist().size()){
                                                   Ticket t=new Ticket(c,searchPassenger(pname), 0);
                                                  c.getWaitinglist().add(t);
                                                  TList.add(t);
                                                  System.out.println("Your ticket is in waiting list"+t.getSeatNo()+" "+t.getTicketID());

                                        }else{
                                                  System.out.print("No seat available rejected !!");
                                                  
                                        }
                              }
                    }
          }
          private void cancelTicket(int tid){
                    Ticket rticket = null;
                    for(Ticket t:TList){
                              if(t.getTicketID()==tid){
                                        rticket=t;

                                        Coach nc = t.getCoach();
                                        if(nc.getConfirmlist().remove(t)){
                                                  System.out.println("Ticket cancelled !!!");
                                                  if(!nc.getWaitinglist().isEmpty()){
                                                            Ticket tc = nc.getWaitinglist().poll();
                                                            nc.getConfirmlist().add(tc);
                                                            System.out.println("waiting ticket prompted !");

                                                  }
                                        }else if(nc.getWaitinglist().remove(t)){
                                                  System.out.println("Removed from the waiting list !!");
                                        }
                                        break;
                                        
                              }
                    }
                    if(rticket!=null){
                              TList.remove(rticket);
                    }else{
                              System.out.println("No ticket found in that id");
                    }

          }
          public static void main(String[] args){
                    Railway r = new Railway();
                    r.initialization();
                    boolean status=true;
                    while(status){
                              System.out.println("Press 1 for Book Ticket\nPress 2 for Cancel Ticket\n3 Check Avail\n4 Prepare Chart\n5 for exit ");
                              int option = scan.nextInt();
                              switch(option){
                                        case 1:
                                                  scan.nextLine();
                                                  System.out.print("Do you have an account ? if yes enter true if not return false");
                                                  boolean account=scan.nextBoolean();
                                                  scan.nextLine();
                                                  if(account){
                                                            
                                                            System.out.println("Enter your name: ");
                                                            String name=scan.nextLine();
                                                            System.out.println("Enter your pass: ");
                                                            String pass = scan.nextLine();
                                                            if(r.login(name, pass)){
                                                                      System.out.println("Login completed !!");
                                                            }else{
                                                                      System.out.println("Login Failed !!");
                                                            }
                                                            System.out.print("List of trains that avail: ");
                                                            r.ListCoachs();
                                                            System.out.println("Enter the coach name for booking");
                                                            String cname=scan.nextLine();
                                                            r.bookCoach(name, cname);



                                                  }else{
                                                            System.out.println("Enter your name: ");
                                                            String name=scan.nextLine();
                                                            System.out.println("Enter your pass: ");
                                                            String pass = scan.nextLine();
                                                            r.signin(name, pass);
                                                            System.out.print("List of trains that avail: ");
                                                            r.ListCoachs();
                                                            System.out.println("Enter the coach name for booking");
                                                            String cname=scan.nextLine();
                                                            r.bookCoach(name, cname);
                                                  
                                                  }
                                                  break;

                                        case 2:
                                                  scan.nextLine();
                                                  System.out.println("Enter the ticket id for cancel: ");
                                                  int tid=scan.nextInt();
                                                  r.cancelTicket(tid);

                                                  break;
                                        default:
                                                  System.out.println("Exitting !!!");
                                                  status=false;
                                                  break;

                              }

                    }


          }
}
