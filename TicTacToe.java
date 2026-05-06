public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initializeBoard();

        placeMove(0, 0, 'X');

        printBoard();
    }

    // Initialize board
    static void initializeBoard() {

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                board[row][col] = '-';
            }
        }
    }

    // Place symbol on board
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