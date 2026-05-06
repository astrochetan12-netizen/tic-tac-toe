import java.util.Random;

public class TicTacToe {

    static char[][] board = new char[3][3];

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {

        initializeBoard();

        tossAndAssignSymbols();

        displayTossResult();

        printBoard();
    }

    // UC1: Initialize board
    static void initializeBoard() {

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                board[row][col] = '-';
            }
        }
    }

    // UC2: Toss and assign symbols
    static void tossAndAssignSymbols() {

        Random random = new Random();

        int toss = random.nextInt(2);

        // 0 = Human starts
        // 1 = Computer starts

        if (toss == 0) {

            isHumanTurn = true;

            humanSymbol = 'X';
            computerSymbol = 'O';

        } else {

            isHumanTurn = false;

            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    // Display toss result
    static void displayTossResult() {

        if (isHumanTurn) {

            System.out.println("Human won the toss!");

        } else {

            System.out.println("Computer won the toss!");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);

        System.out.println();
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
