import java.util.*;

public class ATMInterface {

    static Scanner sc = new Scanner(System.in);

    
    static String userId = "user123";
    static String userPin = "1234";

   
    static double balance = 10000;
    static double targetBalance = 5000;

    
    static ArrayList<String> history = new ArrayList<>();

    
    static boolean login() {
        System.out.print("Enter User ID: ");
        String id = sc.next();
        System.out.print("Enter PIN: ");
        String pin = sc.next();

        return id.equals(userId) && pin.equals(userPin);
    }

 
    static void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("\n--- Transaction History ---");
            for (String h : history) {
                System.out.println(h);
            }
        }
    }

    
    static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            history.add("Withdrawn: ₹" + amount);
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }


    static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        balance += amount;
        history.add("Deposited: ₹" + amount);
        System.out.println("Deposit Successful!");
    }

    
    static void transfer() {
        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            targetBalance += amount;
            history.add("Transferred: ₹" + amount);
            System.out.println("Transfer Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public static void main(String[] args) {

        System.out.println("🏧 Welcome to ATM Interface 🏧");

        if (!login()) {
            System.out.println("Invalid Login Credentials!");
            return;
        }

        System.out.println("Login Successful!");

        int choice;
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showHistory();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.println("Current Balance: ₹" + balance);

        } while (choice != 5);

        sc.close();
    }
}
