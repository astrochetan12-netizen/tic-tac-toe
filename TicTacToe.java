public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        // Continuous game loop
        while (!gameOver) {

            // Human turn
            if (isHumanTurn) {

                System.out.println("Human Turn");

            } else {

                // Computer turn
                System.out.println("Computer Turn");
            }

            // Simulated game ending condition
            gameOver = true;

            // Switch turns
            isHumanTurn = !isHumanTurn;
        }

        System.out.println("Game Over");
    }
}