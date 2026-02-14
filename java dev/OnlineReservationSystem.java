import java.util.*;

class Reservation {
    String name;
    int age;
    int trainNo;
    String trainName;
    String classType;
    String date;
    String from;
    String to;
    int pnr;

    Reservation(String name, int age, int trainNo, String trainName,
                String classType, String date, String from, String to, int pnr) {
        this.name = name;
        this.age = age;
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.classType = classType;
        this.date = date;
        this.from = from;
        this.to = to;
        this.pnr = pnr;
    }

    void display() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("PNR Number   : " + pnr);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Train No     : " + trainNo);
        System.out.println("Train Name   : " + trainName);
        System.out.println("Class Type   : " + classType);
        System.out.println("Journey Date : " + date);
        System.out.println("From         : " + from);
        System.out.println("To           : " + to);
    }
}

public class OnlineReservationSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Reservation> reservations = new ArrayList<>();
    static Random rand = new Random();

    
    static boolean login() {
        System.out.print("Enter Login ID: ");
        String id = sc.next();
        System.out.print("Enter Password: ");
        String pass = sc.next();

        return id.equals("admin") && pass.equals("admin123");
    }

    
    static String getTrainName(int trainNo) {
        switch (trainNo) {
            case 101: return "Rajdhani Express";
            case 102: return "Shatabdi Express";
            case 103: return "Duronto Express";
            default: return "Unknown Train";
        }
    }


    static void reservation() {
        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Train Number (101/102/103): ");
        int trainNo = sc.nextInt();

        String trainName = getTrainName(trainNo);
        System.out.println("Train Name: " + trainName);

        System.out.print("Enter Class Type (Sleeper/AC): ");
        String classType = sc.next();

        System.out.print("Enter Journey Date (dd-mm-yyyy): ");
        String date = sc.next();

        System.out.print("From: ");
        String from = sc.next();

        System.out.print("To: ");
        String to = sc.next();

        int pnr = rand.nextInt(9000) + 1000;

        reservations.add(new Reservation(name, age, trainNo, trainName,
                classType, date, from, to, pnr));

        System.out.println("\nReservation Successful!");
        System.out.println("Your PNR Number is: " + pnr);
    }

    
    static void cancellation() {
        System.out.print("Enter PNR Number: ");
        int pnr = sc.nextInt();

        Iterator<Reservation> itr = reservations.iterator();
        while (itr.hasNext()) {
            Reservation r = itr.next();
            if (r.pnr == pnr) {
                r.display();
                System.out.print("\nConfirm Cancellation (Y/N): ");
                char ch = sc.next().charAt(0);
                if (ch == 'Y' || ch == 'y') {
                    itr.remove();
                    System.out.println("Ticket Cancelled Successfully!");
                }
                return;
            }
        }
        System.out.println("Invalid PNR Number!");
    }

    public static void main(String[] args) {

        System.out.println("=== Online Reservation System ===");

        if (!login()) {
            System.out.println("Invalid Login Credentials!");
            return;
        }

        int choice;
        do {
            System.out.println("\n1. Reservation");
            System.out.println("2. Cancellation");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: reservation(); break;
                case 2: cancellation(); break;
                case 3: System.out.println("Thank You!"); break;
                default: System.out.println("Invalid Choice!");
            }
        } while (choice != 3);
    }
}
