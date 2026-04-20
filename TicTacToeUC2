import java.util.Random;

public class TicTacToeUC2 {

    public static void main(String[] args) {

        // Step 1: Create random object
        Random random = new Random();

        // Step 2: Generate random number (0 or 1)
        int toss = random.nextInt(2);

        // Step 3: Game state variables
        char player1Symbol;
        char player2Symbol;
        char currentPlayerSymbol;

        // Step 4: Decide who starts and assign symbols
        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayerSymbol = player1Symbol;

            System.out.println("Player 1 wins the toss!");
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayerSymbol = player2Symbol;

            System.out.println("Player 2 wins the toss!");
        }

        // Step 5: Display assignments
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
        System.out.println("First Turn: " + currentPlayerSymbol);
    }
}
