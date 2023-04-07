import java.util.Random;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class RockPaperScissorsGame {

    private static final String rock = "Rock";
    private static final String paper = "Paper";
    private static final String scissors = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerInput = scanner.nextLine();

        if (playerInput.equals("r") || playerInput.equalsIgnoreCase("Rock")) {
            playerInput = rock;

        } else if (playerInput.equals("p") || playerInput.equalsIgnoreCase("Paper")) {
            playerInput = paper;

        } else if (playerInput.equals("s") || playerInput.equalsIgnoreCase("Scissors")) {
            playerInput = scissors;

        } else {
            System.out.println("Invalid input. Try again: ");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);

        String computerMove = "";

        if (computerRandomNumber == 1) {
            computerMove = rock;

        } else if (computerRandomNumber == 2) {
            computerMove = paper;

        } else if (computerRandomNumber == 3) {
            computerMove = scissors;
        }

        System.out.printf("Computer choose: %s%n", computerMove);

        if (playerInput.equals(rock) && computerMove.equals(scissors) ||
                playerInput.equals(paper) && computerMove.equals(rock) ||
                playerInput.equals(scissors) && computerMove.equals(paper)) {
            System.out.println("You win!");

        } else if (playerInput.equals(rock) && computerMove.equals(paper) ||
                playerInput.equals(paper) && computerMove.equals(scissors) ||
                playerInput.equals(scissors) && computerMove.equals(rock)) {
            System.out.println("You lose!");

        } else if (playerInput.equals(rock) && computerMove.equals(rock) ||
                playerInput.equals(paper) && computerMove.equals(paper) ||
                playerInput.equals(scissors) && computerMove.equals(scissors)) {
            System.out.println("Draw. Try again");
        }
    }
}
