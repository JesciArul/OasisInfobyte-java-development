import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        char playAgain;

        System.out.println("🎮 Welcome to the Number Guessing Game 🎮");

        do {
            int number = rand.nextInt(100) + 1; // 1 to 100
            int attempts = 5;
            boolean isGuessed = false;

            System.out.println("\nI have generated a number between 1 and 100.");
            System.out.println("You have " + attempts + " attempts to guess it!");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts--;

                if (guess == number) {
                    System.out.println("🎉 Correct! You guessed the number!");
                    int roundScore = (attempts + 1) * 10;
                    System.out.println("Points earned: " + roundScore);
                    totalScore += roundScore;
                    isGuessed = true;
                    break;
                } else if (guess > number) {
                    System.out.println("📉 Too High!");
                } else {
                    System.out.println("📈 Too Low!");
                }

                System.out.println("Attempts left: " + attempts);
            }

            if (!isGuessed) {
                System.out.println("❌ You've used all attempts!");
                System.out.println("The correct number was: " + number);
            }

            System.out.println("\nTotal Score: " + totalScore);
            System.out.print("Do you want to play another round? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n🏁 Game Over!");
        System.out.println("Final Score: " + totalScore);
        sc.close();
    }
}
