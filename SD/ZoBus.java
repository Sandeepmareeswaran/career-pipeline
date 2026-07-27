import java.util.*;
class Seat{
          private String SeatNumber;
          private boolean isBooked;
          private Seat AdjacentSeat;
          Seat(String SeatNumber){
                    this.SeatNumber=SeatNumber;
                    this.isBooked=false;
                    this.AdjacentSeat=null;
          }
}
class Bus{
          private int BusId;
          private String BusType;
          private int Capacity;
          private int FarePerSeat;
          private int BookedSeats;
          Bus(int BusId,String BusType,int Capacity, int FarePerSeat){
                    this.BusId=BusId;
                    this.BusType=BusType;
                    this.Capacity=Capacity;
                    this.FarePerSeat=FarePerSeat;
                    this.BookedSeats=0;
          }
          public int getBusId() {
                    return BusId;
          }
          public void setBusId(int busId) {
                    BusId = busId;
          }
          public String getBusType() {
                    return BusType;
          }
          public void setBusType(String busType) {
                    BusType = busType;
          }
          public int getCapacity() {
                    return Capacity;
          }
          public void setCapacity(int capacity) {
                    Capacity = capacity;
          }
          public int getFarePerSeat() {
                    return FarePerSeat;
          }
          public void setFarePerSeat(int farePerSeat) {
                    FarePerSeat = farePerSeat;
          }
          public int getBookedSeats() {
                    return BookedSeats;
          }
          public void setBookedSeats(int bookedSeats) {
                    BookedSeats = bookedSeats;
          }
}
class Customer{
          private String Name;
          private String Password;
          private int Age;
          private char Gender;
          private static int id=1;
          Customer(String Name,String Password,int Age,char Gender){
                    this.Name=Name;
                    this.Password=Password;
                    this.Age=Age;
                    this.Gender=Gender;
                    this.id=id++;
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
          public int getAge() {
                    return Age;
          }
          public void setAge(int age) {
                    Age = age;
          }
          public char getGender() {
                    return Gender;
          }
          public void setGender(char gender) {
                    Gender = gender;
          }
          public static int getId() {
                    return id;
          }
          public static void setId(int id) {
                    Customer.id = id;
          }
          
}
public class ZoBus {
          private List<Customer> clist = new ArrayList<>();
          private List<Bus> blist = new ArrayList<>();
          private static final Scanner scan = new Scanner(System.in);
          private void initialization(){
                    clist.add(new Customer("aaa","111",25,'F'));
                    clist.add(new Customer("bbb","ccc",61,'M'));
                    clist.add(new Customer("ccc","333",22,'M'));
                    clist.add(new Customer("ddd","444",36,'F'));
                    blist.add(new Bus(1,"AC Slepper",12,700));
                    blist.add(new Bus(2,"AC SEATER",12,550));
                    blist.add(new Bus(3,"NON-AC SLEEPER",12,600));
                    blist.add(new Bus(4,"NON-AC SEATER",12,450));
          }
          private Boolean Login(int id,String pass){
                    for(Customer c:clist){
                              if(c.getId()==id && c.getPassword().equals(pass)){
                                        System.out.println("Logged In !!!");
                                        return true;
                              }
                    }
                    return false;
          }
          private void Signup(String Name,String Password,int Age, char Gender){
                    Customer c= new Customer(Name,Password,Age,Gender);
                    clist.add(c);
                    System.out.println("Sigin created and your id is "+c.getId()+"!!!");
          }

          public static void main(String[] args){
                    ZoBus z=new ZoBus();
                    z.initialization();
                    boolean status=true;
                    while(status){
                              System.out.println("Press 1 to signup\nPress 2 to login\nPress 3 to exit");
                              int ch=scan.nextInt();
                              switch(ch){
                                        case 1:
                                                  scan.nextLine();
                                                  System.out.println("Enter your name: ");
                                                  String Name=scan.nextLine();
                                                  System.out.println("Enter your Password: ");
                                                  String Password=scan.nextLine();
                                                  System.out.println("Enter your Age: ");
                                                  int Age=scan.nextInt();
                                                  System.out.println("Enter your Gender: ");
                                                  char Gender = scan.next().charAt(0);
                                                  z.Signup(Name, Password, Age, Gender);
                                                  break;
                                        case 2:
                                                  scan.nextLine();
                                                  System.out.println("Enter your id: ");
                                                  int id=scan.nextInt();
                                                  System.out.println("Enter your Password: ");
                                                  String pass=scan.nextLine();

                                                  if(z.Login(id,pass));
                                                  break;
                                        default:
                                                  System.out.println("Exiting !!!");
                                                  status=false;
                                                  break;
                                                  

                              }

                    }


          }
          
}
