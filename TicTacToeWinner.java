
import java.util.*;

public class TicTacToeWinner {

    public static String tictactoe(int[][] moves) {
        int[][] board = new int[3][3];

        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];

            board[row][col] = (i % 2 == 0) ? 1 : 2;
        }

        for (int i = 0; i < 3; i++) {
            if (board[i][0] != 0 &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2]) {
                return board[i][0] == 1 ? "A" : "B";
            }

            if (board[0][i] != 0 &&
                board[0][i] == board[1][i] &&
                board[1][i] == board[2][i]) {
                return board[0][i] == 1 ? "A" : "B";
            }
        }

        if (board[0][0] != 0 &&
            board[0][0] == board[1][1] &&
            board[1][1] == board[2][2]) {
            return board[0][0] == 1 ? "A" : "B";
        }

        if (board[0][2] != 0 &&
            board[0][2] == board[1][1] &&
            board[1][1] == board[2][0]) {
            return board[0][2] == 1 ? "A" : "B";
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of moves: ");
        int n = sc.nextInt();

        int[][] moves = new int[n][2];

        System.out.println("Enter each move as row and column (0-2):");
        for (int i = 0; i < n; i++) {
            moves[i][0] = sc.nextInt();
            moves[i][1] = sc.nextInt();
        }

        System.out.println("Result: " + tictactoe(moves));

        sc.close();
    }
}
