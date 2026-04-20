import java.util.Scanner;

public class TicTacToeUC3 {

    // Method to get slot input from user
    public static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");

        int slot = scanner.nextInt(); // Read integer input

        return slot; // Return slot value to game logic
    }

    public static void main(String[] args) {

        // Call method
        int userSlot = getUserSlot();

        // Display entered slot (for testing)
        System.out.println("You selected slot: " + userSlot);
    }
}
