public class SudokuSolver {
    private static final int UNASSIGNED = 0;
    private int[][] board;

    public SudokuSolver(int[][] gameboard) {
        board = new int[gameboard.length][gameboard[0].length];
        for(int i = 0; i < gameboard.length; i++) {
            for(int j = 0; j < gameboard[i].length;j++) {
                board[i][j] = gameboard[i][j];
            }
        }

    }

    /**
     * returns True if the indicated row contains
     * the indicated number
     * @param row a row in the board
     * @param number the number to find
     * @return true if number is found in row, false otherwise
     */
    public boolean containsInRow(int row, int number) {
        return false;
    }

    

    /**
     * returns True if the indicated column contains
     * the indicated number
     * @param col a column in the board
     * @param number the number to find
     * @return true if number is found in column, false otherwise
     */
    public boolean containsInCol(int col, int number) {
        return false;
    }


    /**
     * returns True if the box including
     * (col,row) contains the indicated number
     * @param row a row in the board
     * @param col a column in the board
     * @param number the number to find
     * @return true if number is found in the box, false otherwise
     */
    public boolean containsInBox(int row, int col, int number) {
        return false;
    }


    /**
     * returns True if the indicated number can be placed
     * at the indicated (col, row)
     * @param row a row in the board
     * @param col a column in the board
     * @param number the number to find
     * @return true if the number can be placed at (col,row),
     *         false otherwise
     */
    public boolean isAllowed(int row, int col, int number) {
        return false;
    }


    /**
     *  Use backtracking and recursion to solve the board
     *  return true when solution found and 
     *  false if no solution is found
     * @return true if solution found, false otherwise
     */
    public boolean solveSudoku() {
        return false;
    }

    /**
     * Displays the Sudoku board
     */
    public void displayBoard() {
        for (int i=0;i<9;i++) {
            if(i%3 == 0) {
                System.out.println("+---------+---------+---------+");
            }
            for(int j=0;j<9;j++) {
                if(j%3 == 0)
                    System.out.print("|");
                if (board[i][j] == UNASSIGNED)
                    System.out.print("   ");
                else
                    System.out.print(" " + board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("+---------+---------+---------+");
    }


}
