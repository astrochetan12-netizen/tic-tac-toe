public class TicTacToe {

    static char[][] board = {

            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
    };

    public static void main(String[] args) {

        System.out.println(isDraw());
    }

    // Check draw condition
    static boolean isDraw() {

        // Traverse board
        for (int r = 0; r < 3; r++) {

            for (int c = 0; c < 3; c++) {

                // Empty cell found
                if (board[r][c] == '-') {

                    return false;
                }
            }
        }

        return true;
    }
}