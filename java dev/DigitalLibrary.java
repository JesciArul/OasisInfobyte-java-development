import java.util.*;

public class DigitalLibrary {

    static Scanner sc = new Scanner(System.in);

    
    static ArrayList<String> books = new ArrayList<>();
    static ArrayList<String> issuedBooks = new ArrayList<>();

    static String adminId = "admin";
    static String adminPass = "admin123";

    static String userId = "user";
    static String userPass = "user123";

    
    static void adminModule() {
        int choice;
        do {
            System.out.println("\n--- Admin Module ---");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. View Books");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    books.add(sc.nextLine());
                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter book name to delete: ");
                    String b = sc.nextLine();
                    if (books.remove(b))
                        System.out.println("Book Deleted!");
                    else
                        System.out.println("Book Not Found!");
                    break;

                case 3:
                    System.out.println("\nAvailable Books:");
                    for (String book : books)
                        System.out.println("- " + book);
                    break;

                case 4:
                    System.out.println("Admin Logged Out!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
    }

    
    static void userModule() {
        int choice;
        do {
            System.out.println("\n--- User Module ---");
            System.out.println("1. View Books");
            System.out.println("2. Search Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Books:");
                    for (String book : books)
                        System.out.println("- " + book);
                    break;

                case 2:
                    System.out.print("Enter book name: ");
                    String search = sc.nextLine();
                    if (books.contains(search))
                        System.out.println("Book Available!");
                    else
                        System.out.println("Book Not Found!");
                    break;

                case 3:
                    System.out.print("Enter book to issue: ");
                    String issue = sc.nextLine();
                    if (books.remove(issue)) {
                        issuedBooks.add(issue);
                        System.out.println("Book Issued Successfully!");
                    } else {
                        System.out.println("Book Not Available!");
                    }
                    break;

                case 4:
                    System.out.print("Enter book to return: ");
                    String ret = sc.nextLine();
                    if (issuedBooks.remove(ret)) {
                        books.add(ret);
                        System.out.println("Book Returned Successfully!");
                    } else {
                        System.out.println("Invalid Book!");
                    }
                    break;

                case 5:
                    System.out.println("User Logged Out!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {

        
        books.add("Java Programming");
        books.add("Data Structures");
        books.add("Operating Systems");

        System.out.println("=== Digital Library Management System ===");
        System.out.print("Login as (Admin/User): ");
        String role = sc.next();

        System.out.print("Enter ID: ");
        String id = sc.next();
        System.out.print("Enter Password: ");
        String pass = sc.next();

        if (role.equalsIgnoreCase("Admin") && id.equals(adminId) && pass.equals(adminPass)) {
            adminModule();
        } 
        else if (role.equalsIgnoreCase("User") && id.equals(userId) && pass.equals(userPass)) {
            userModule();
        } 
        else {
            System.out.println("Invalid Login Credentials!");
        }

        sc.close();
    }
}
