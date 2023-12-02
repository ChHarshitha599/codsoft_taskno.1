import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int guessedNum, noOfGuesses = 0, generatedNum = 0;
        final int TotalGuesses = 3;
        int score = 0;
        String playAgain = "yes";
	System.out.println("Enter the range");
        Scanner scan = new Scanner(System.in);
        System.out.println("Minimum value : ");
	int min = scan.nextInt();
        System.out.println("Maximum value : ");
	int max = scan.nextInt();
        Random random_value = new Random();

        while (playAgain.equalsIgnoreCase("yes")) {
            generatedNum = random_value.nextInt(max - min + 1) + min;
            System.out.println("Welcome to the Number game!");
            System.out.println("Guess a number between the given range");
            noOfGuesses = 0;

            while (noOfGuesses < TotalGuesses) {
                System.out.print("Enter your guess : ");
                guessedNum = scan.nextInt();
                noOfGuesses++;  
                if (guessedNum == generatedNum) {
                    System.out.println("Congratulations! You guessed the correct number in " + noOfGuesses + " attempts.");
                    score++;
                    break;
                } 
		else {
                    System.out.println("Incorrect Guess");
                }
                if (noOfGuesses == TotalGuesses) {
                    System.out.println("The correct number was " + generatedNum + ". Better luck next time!");
                    break;
                }
            }

            System.out.println("Your score is " + score);
            System.out.print("Want to play again? (yes/no): ");
            playAgain = scan.next().toLowerCase();
        }

        System.out.println("Game over! Thanks for playing!");
        scan.close();
    }
}
