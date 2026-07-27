import java.util.*;
class Coach{
          private String Name;
          private int capacity;
          private int waiting;
          Coach(String Name,int capacity,int waiting){
                    this.Name=Name;
                    this.capacity=capacity;
                    this.waiting=waiting;
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
public class Railway {
          private List<Coach> CoachList = new ArrayList<>();
          private static Scanner scan = new Scanner(System.in);
          private void initialization(){
                    CoachList.add(new Coach("ACCoach",5,2));
                    CoachList.add(new Coach("NonACCoach",5,2));
                    CoachList.add(new Coach("Seater",5,2));
                    System.out.println("Coachs Initialized !!");
          }
          public static void main(String[] args){
                    Railway r = new Railway();
                    r.initialization();
                    boolean status=true;
                    while(status){
                              System.out.println("Press 1 for Book Ticket\nPress 2 for Cancel Ticket\n3 Check Avail\n4 Prepare Chart\n5 for exit ");
                              int option = scan.nextInt();

                    }


          }
}
