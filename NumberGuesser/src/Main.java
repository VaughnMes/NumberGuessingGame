import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("If you're ready, let's play a game! ");

        int randomNumber = (int) (Math.random() * 101);
        int guessedNumber = 0;
        int numberOfTries = 5;

        while (guessedNumber != randomNumber && numberOfTries > 0) {
            System.out.println("Enter a number between 0 and 100: ");

            guessedNumber = scanner.nextInt();
            numberOfTries--;

            if (guessedNumber < randomNumber) {
                System.out.println("Too low. You have " + numberOfTries + " tries left.");
            }
            else if (guessedNumber > randomNumber) {
                System.out.println("Too high. You have "  + numberOfTries + " tries left.");
            } else {
                System.out.println("Awesome - you got it! And you did it with " + numberOfTries + " tries left!");
            }
        }

        scanner.close();

    }
}
