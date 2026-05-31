import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain = true;

        System.out.println("======== Welcome To Number Guessing Game ==========");

        while (playAgain) {

            int secretNumber = random.nextInt(100) + 1;
            int userGuess = 0;
            int attempts = 5;

            System.out.println("Guess a number from 1 to 100");
            System.out.println("You have " + attempts + " attempts.");

            while (attempts > 0) {

                System.out.print("Enter your guess: ");

                try {

                    userGuess = input.nextInt();
                    attempts--;

                    if (userGuess > secretNumber) {
                        System.out.println("Too High! Try a smaller number.");
                    } else if (userGuess < secretNumber) {
                        System.out.println("Too Low! Try a bigger number.");
                    } else {
                        System.out.println("Correct! You guessed it.");
                        score++;
                        break;
                    }

                    System.out.println("Remaining attempts: " + attempts);

                } catch (Exception e) {
                    System.out.println("Invalid input! Enter numbers only.");
                    input.nextLine();
                }
            }

            if (userGuess != secretNumber) {
                System.out.println("Game Over!");
                System.out.println("The correct number was: " + secretNumber);
            }

            System.out.println("Current Score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String answer = input.next();

            if (!answer.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }
        System.out.println("Final Score: " + score);
        System.out.println("Thanks for playing!");

    }
}