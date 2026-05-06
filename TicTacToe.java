import java.util.Random;

public class TicTacToe {

    static char[][] board = {

            {'X', '-', '-'},
            {'-', 'O', '-'},
            {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {

        printBoard();

        computerMove();

        System.out.println("\nComputer Move:\n");

        printBoard();
    }

    // Computer generates random valid move
    static void computerMove() {

        Random random = new Random();

        while (true) {

            // Generate random slot (1-9)
            int slot = random.nextInt(9) + 1;

            // Convert slot to row & column
            int row = getRowFromSlot(slot);
            int col = getColFromSlot(slot);

            // Validate move
            if (isValidMove(row, col)) {

                // Place move
                placeMove(row, col, computerSymbol);

                break;
            }
        }
    }

    // Convert slot to row
    static int getRowFromSlot(int slot) {

        return (slot - 1) / 3;
    }

    // Convert slot to column
    static int getColFromSlot(int slot) {

        return (slot - 1) % 3;
    }

    // Validate move
    static boolean isValidMove(int row, int col) {

        return board[row][col] == '-';
    }

    // Place symbol
    static void placeMove(int row, int col, char symbol) {

        board[row][col] = symbol;
    }

    // Print board
    static void printBoard() {

        System.out.println("-------------");

        for (int row = 0; row < 3; row++) {

            System.out.print("| ");

            for (int col = 0; col < 3; col++) {

                System.out.print(board[row][col] + " | ");
            }

            System.out.println();
            System.out.println("-------------");
        }
    }
}