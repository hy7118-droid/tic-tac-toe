public class TicTacToeUC4 {

    // Utility method to convert slot to row & column
    public static int[] getRowCol(int slot) {

        int index = slot - 1; // convert to 0-based index

        int row = index / 3;  // division → row
        int col = index % 3;  // modulo → column

        return new int[]{row, col}; // return both values
    }

    public static void main(String[] args) {

        int slot = 5; // example input

        int[] position = getRowCol(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}
