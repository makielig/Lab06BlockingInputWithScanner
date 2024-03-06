import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        int userGuess;

        do {
            System.out.println("Guess the number (between 1 and 10 inclusive):");
            userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Invalid guess. Please enter a number between 1 and 10.");
            } else {
                System.out.println("The random number was: " + randomNumber);
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! Your guess is correct!");
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
        } while (userGuess != randomNumber);

        scanner.close();
    }
}