package com.manoj.recursionandbacktracking;

public class SudokuSolver {
    public void sudokuSolver(char[][] board){
        solve(board);
    }

    private boolean solve(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    for(char ch = '1'; ch <= '9'; ch++){
                        if(isValidSudoku(i,j,ch,board)){
                            board[i][j] = ch;
                            if(solve(board)) return true;
                            else board[i][j] = '.';

                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isValidSudoku(int row, int col, char ch, char[][] board) {
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == ch) return false;
            if(board[i][col] == ch) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3] == ch) return false;
        }
        return true;
    }
}
