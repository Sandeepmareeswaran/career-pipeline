import java.util.*;

class Booking {
    int bid;
    String cid;
    String pickup;
    String drop;
    int pickuptime;
    int droptime;
    int amount;

    Booking(int bid, String cid, String pickup, String drop, int pickuptime, int droptime, int amount) {
        this.bid = bid;
        this.cid = cid;
        this.pickup = pickup;
        this.drop = drop;
        this.pickuptime = pickuptime;
        this.droptime = droptime;
        this.amount = amount;
    }
}

class cab {
    String name;
    int cur;
    int amount;
    int time;
    List<Booking> history;

    cab(String name) {
        this.name = name;
        this.cur = 1;
        this.amount = 0;
        this.time = 0;
        this.history = new ArrayList<>();
    }
}

public class CabBooking {

    List<cab> clst = new ArrayList<>();
    int b = 0;

    void Make_History(cab taxi, String cid, String pickup, String drop, int wt) {

        int p = pickup.charAt(0) - 'A' + 1;
        int d = drop.charAt(0) - 'A' + 1;

        int dist = Math.abs(d - p);
        dist*=15;

        int far = 100;
        

        if (dist > 5) {
            far += (dist - 5) * 10;
        }

        int dt = dist / 15;

        taxi.amount += far;

        Booking hist = new Booking(++b, cid, pickup, drop, wt, dt, far);

        taxi.history.add(hist);
    }

    cab Search_avail(String c1, String pickup, String drop, int wt) {

        cab selected = null;

        int pick = pickup.charAt(0) - 'A' + 1;

        int minDistance = Integer.MAX_VALUE;

        for (cab c : clst) {

            if (c.time > wt) {
                continue;
            }

            int distance = Math.abs(c.cur - pick);

            if (selected == null) {

                selected = c;
                minDistance = distance;

            } else if (distance < minDistance) {

                selected = c;
                minDistance = distance;

            } else if (distance == minDistance) {

                if (c.amount < selected.amount) {

                    selected = c;

                }
            }
        }

        return selected;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        CabBooking c = new CabBooking();

        c.clst.add(new cab("Taxi1"));
        c.clst.add(new cab("Taxi2"));
        c.clst.add(new cab("Taxi3"));
        c.clst.add(new cab("Taxi4"));

        boolean status = true;

        while (status) {

            System.out.println("Press 1 for booking cap \n 2 to display the bookings of the each cab \n other for exiting ");

            int ch = scan.nextInt();

            switch (ch) {

                case 1:

                    scan.nextLine();

                    System.out.println("Enter the customer id: ");
                    String cid = scan.nextLine();

                    System.out.println("Enter the Pickup point: ");
                    String pickup = scan.nextLine();

                    System.out.println("Enter the drop point: ");
                    String drop = scan.nextLine();

                    System.out.println("Enter the waiting time: ");
                    int wtime = scan.nextInt();

                    cab selected = c.Search_avail(cid, pickup, drop, wtime);

                    if (selected != null) {

                        c.Make_History(selected, cid, pickup, drop, wtime);

                        System.out.print("cab " + selected.name + " may alloted");

                    } else {

                        System.out.println("Rejected");

                    }

                    break;

                case 2:

                    scan.nextLine();

                    System.out.println("Enter the cab name to get its history: ");

                    String cb = scan.nextLine();

                    for (cab cbb : c.clst) {

                        if (cbb.name.equals(cb)) {

                            for (Booking bk : cbb.history) {

                                System.out.println(
                                        "Booking id:" + bk.bid +
                                                " Client id: " + bk.cid +
                                                " Pickup: " + bk.pickup +
                                                " Drop: " + bk.drop +
                                                " pickuptime: " + bk.pickuptime +
                                                " droptime:" + bk.droptime +
                                                " amount:" + bk.amount);

                            }

                        }

                    }

                    break;

                default:

                    System.out.println("Exiting !!");
                    status=false;
                    break;
            }

        }

    }

}