public class PrintQueens {
    public static void nQueens(char Board[][], int row) {
        // Basecase
        if (row == Board.length) {
            printBoard(Board);
            return;
        }

        // work
        for (int j = 0; j < Board.length; j++) {
            Board[row][j] = 'Q';
            nQueens(Board, row + 1); // Function call
            Board[row][j] = 'X'; //Backtracking step
        }
    }

    public static void printBoard(char Board[][]) {
        System.out.println("_____Chess Board_______");
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                System.out.print(Board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 2;
        char Board[][] = new char[n][n];
        //Intialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Board[i][j] = 'X';
            }
        }
        nQueens(Board, 0);
    }
}
