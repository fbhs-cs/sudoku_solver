public class SudokuTester {

    public static void main(String[] args) {
        int[][] board = {{0,5,3,2,0,7,0,0,8},
                         {6,0,1,5,0,0,0,0,2},
                         {2,0,0,9,1,3,0,5,0},
                         {7,1,4,6,9,2,0,0,0},
                         {0,2,0,0,0,0,0,6,0},
                         {0,0,0,4,5,1,2,9,7},
                         {0,6,0,3,2,5,0,0,9},
                         {1,0,0,0,0,6,3,0,4},
                         {8,0,0,1,0,9,6,7,0}};

        SudokuSolver solver = new SudokuSolver(board);

        solver.displayBoard();
        if(solver.solveSudoku()) {
            System.out.println("Solution found!");
            solver.displayBoard();
        } else {
            System.out.println("No solution found.");
        }
        
    }
}