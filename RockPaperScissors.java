import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1Wins = 0;
        int player2Wins = 0;
        String playAgain;

        System.out.println("Rock, Paper, Scissors GO!");

        do {
            System.out.print("Your Turn: Rock, Paper, Scissors Go!: ");
            String player1Move = scanner.nextLine().toLowerCase();

            System.out.print("Next Players' Turn: Rock, Paper, Scissors Go!: ");
            String player2Move = scanner.nextLine().toLowerCase();

            if (player1Move.equals(player2Move)) {
                System.out.println("Tie!");
            } else if ((player1Move.equals("Rock") && player2Move.equals("Scissors")) ||
                       (player1Move.equals("Scissors") && player2Move.equals("Paper")) ||
                       (player1Move.equals("Paper") && player2Move.equals("Rock"))) {
                System.out.println("Player 1 Wins!");
                player1Wins++;
            } else {
                System.out.println("Player 2 Wins!");
                player2Wins++;
            }

            System.out.print("Continue Playing? (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();

        }  while (playAgain.equals("y"));

        System.out.println("Game Over!");
        System.out.println("Player 1 is the Winner!: " + player1Wins);
        System.out.println("Player 2 is the Winner!: " + player2Wins);

        scanner.close();
        }
    }
    
