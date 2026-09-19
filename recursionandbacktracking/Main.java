package com.manoj.recursionandbacktracking;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        String string = "abc";
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
//        PrintPermutations p = new PrintPermutations();
//        System.out.println(p.printPermutationsBruteForceApproach(nums));
//        System.out.println(p.printPermutationsOptimalApproach(nums));
//        PermutationsOfString p = new PermutationsOfString();
//        System.out.println(p.permutationOfStringBruteForceApproach(string));
//        System.out.println(p.permutationsOfStringOptimalApproach(string));
//        NQueenProblem n = new NQueenProblem();
//        System.out.println(n.nQueen(4));
        SudokuSolver s = new SudokuSolver();
        s.sudokuSolver(board);
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
