import java.util.*;

class User {
    String username = "student";
    String password = "1234";
}

public class OnlineExamSystem {

    static User user = new User();
    static Scanner sc = new Scanner(System.in);
    static int score = 0;
    static boolean submitted = false;

    public static void login() {
        System.out.print("Username: ");
        String u = sc.next();
        System.out.print("Password: ");
        String p = sc.next();

        if (u.equals(user.username) && p.equals(user.password)) {
            System.out.println("Login Successful!\n");
            menu();
        } else {
            System.out.println("Invalid Login!\n");
        }
    }

    public static void updatePassword() {
        System.out.print("Enter new password: ");
        user.password = sc.next();
        System.out.println("Password Updated Successfully!\n");
    }

    public static void startExam() {

        Thread timer = new Thread(() -> {
            try {
                for (int i = 30; i >= 0; i--) {
                    if (submitted) return;
                    System.out.println("Time Left: " + i + " seconds");
                    Thread.sleep(1000);
                }
                System.out.println("\nTime Over! Auto Submitting...");
                submitted = true;
                showResult();
            } catch (Exception e) {}
        });

        timer.start();

        askQuestions();
    }

    public static void askQuestions() {

        String[][] questions = {
            {"Java is ___ ?", "1) OOP", "2) OS", "3) Browser", "4) DB", "1"},
            {"JVM stands for?", "1) Java Virtual Machine", "2) Java Verify Mode", "3) Joint VM", "4) None", "1"},
            {"Which is not OOP?", "1) Java", "2) C++", "3) Python", "4) C", "4"}
        };

        for (int i = 0; i < questions.length; i++) {
            if (submitted) return;

            System.out.println("\n" + questions[i][0]);
            System.out.println(questions[i][1]);
            System.out.println(questions[i][2]);
            System.out.println(questions[i][3]);
            System.out.println(questions[i][4]);

            System.out.print("Your Answer: ");
            String ans = sc.next();

            if (ans.equals(questions[i][5]))
                score++;
        }

        submitted = true;
        showResult();
    }

    public static void showResult() {
        System.out.println("\nExam Finished!");
        System.out.println("Score: " + score + "/3\n");
    }

    public static void menu() {
        while (true) {
            System.out.println("1. Update Password");
            System.out.println("2. Start Exam");
            System.out.println("3. Logout");

            System.out.print("Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: updatePassword(); break;
                case 2: startExam(); break;
                case 3: 
                    System.out.println("Logged out successfully!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Option\n");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Online Examination System ===");
        login();
    }
}
