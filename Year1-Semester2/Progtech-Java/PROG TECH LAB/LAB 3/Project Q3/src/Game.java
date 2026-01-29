import java.util.Random;
import java.util.Scanner;

public class Game {
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    private int userScore = 0;
    private int comScore = 0;

    public void play() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Enter 0 for ROCK, 1 for PAPER, 2 for SCISSORS: ");

            if (input.hasNextInt()) {
                int userChoice = input.nextInt();

                if (userChoice >= 0 && userChoice <= 2) {
                    String userMove = getMoveString(userChoice);
                    int comChoice = random.nextInt(3);
                    String comMove = getMoveString(comChoice);

                    System.out.println("You enter: " + userMove);
                    System.out.println("Computer: " + comMove);

                    String result = determineWinner(userChoice, comChoice);
                    System.out.println(result);

                    if (comScore - userScore == 2) {
                        System.out.println("----------------------------------------");
                        System.out.println("Too bad! You lose.");
                        System.out.println("User Score: " + userScore);
                        System.out.println("Computer score: " + comScore);
                        break;
                    } else if (userScore - comScore == 2) {
                        System.out.println("----------------------------------------");
                        System.out.println("Congrats! You win.");
                        System.out.println("User Score: " + userScore);
                        System.out.println("Computer score: " + comScore);
                        break;
                    }
                }
            }
            input.nextLine();
        }
    }

    private String getMoveString(int move) {
        return switch (move) {
            case ROCK -> "ROCK";
            case PAPER -> "PAPER";
            case SCISSORS -> "SCISSORS";
            default -> "UNKNOWN";
        };
    }

    private String determineWinner(int userChoice, int comChoice) {
        if (userChoice == comChoice) {
            return "It's a tie.";
        } else if ((userChoice == ROCK && comChoice == SCISSORS) ||
                (userChoice == PAPER && comChoice == ROCK) ||
                (userChoice == SCISSORS && comChoice == PAPER)) {
            userScore++;
            return "You win!";
        } else {
            comScore++;
            return "You lose!";
        }
    }
}