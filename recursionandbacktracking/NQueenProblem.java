package com.manoj.recursionandbacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueenProblem {
    public List<List<String>> nQueen(int n){
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        boolean[] col = new boolean[n];
        boolean[] leftDigonal = new boolean[2*n-1];
        boolean[] rightDiagonal = new boolean[2*n-1];
        int row = 0;
        for(char[] ch: board){
            Arrays.fill(ch,'.');
        }
        solve(row,board,col,leftDigonal,rightDiagonal,ans);
        return ans;
    }

    private void solve(int row, char[][] board, boolean[] column, boolean[] leftDigonal, boolean[] rightDiagonal, List<List<String>> ans) {
        if(row == board.length) {
            List<String> list = new ArrayList<>();
            for (char[] chars : board) {
                list.add(new String(chars));
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int col = 0; col < board.length; col++){
            int leftDiagonalIndex = row+col;
            int rightDiagonalIndex = board.length-1+row-col;
            if(column[col] || leftDigonal[leftDiagonalIndex] || rightDiagonal[rightDiagonalIndex])
                continue;
            column[col] = true;
            board[row][col] = 'Q';
            leftDigonal[leftDiagonalIndex] = true;
            rightDiagonal[rightDiagonalIndex] = true;
            solve(row+1,board,column,leftDigonal,rightDiagonal,ans);
            board[row][col] = '.';
            column[col] =false;
            leftDigonal[leftDiagonalIndex] = false;
            rightDiagonal[rightDiagonalIndex] = false;

        }
    }

}
