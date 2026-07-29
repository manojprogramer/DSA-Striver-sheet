package com.manoj;

public class SudokuSolver {
    public static boolean sudokuSolver(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == '.') {
                    for(char ch = '1'; ch <= '9'; ch++){
                        if(isvalid(board,i,j,ch)){
                            board[i][j] = ch;
                            if(sudokuSolver(board)) return true;
                            else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isvalid(char[][] board,int row, int col, char ch) {
        for(int i = 0; i < 9; i++) {
            if(board[row][i] == ch) return false;

            if(board[i][col] == ch) return  false;

            int r = 3*(row/3)+(i/3);
            int c = 3*(col/3)+(i%3);

            if(board[r][c] == ch)
                return false;

        }
        return true;
    }
}
