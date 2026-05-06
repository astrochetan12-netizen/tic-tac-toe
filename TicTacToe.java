import java.util.Scanner;

public class TicTacToe {

    // 3x3 Tic-Tac-Toe board
    static char[][] board = new char[3][3];

    // Global Scanner object
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        initializeBoard();

        printBoard();

        int slot = getUserSlot();

        System.out.println("Slot entered: " + slot);
    }

    // UC1: Initialize board with '-'
    static void initializeBoard() {

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                board[row][col] = '-';
            }
        }
    }

    // UC1: Print board
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

    // UC3: Read slot input from user
    static int getUserSlot() {

        System.out.print("Enter slot number (1-9): ");

        int slot = scanner.nextInt();

        return slot;
    }
}