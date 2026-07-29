package com.manoj.arrays;

public class SetMatrixToZero {
    public void bruteForceApproach(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public void optimalApproach(int[][] matrix) {
        int col0 = 1;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if(j != 0) {
                        matrix[0][j] = 0;
                    }
                    else
                        col0 = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++)
            for(int j = 1; j < matrix[0].length; j++)
                if(matrix[i][j] != 0)
                    if(matrix[i][0] == 0 || matrix[0][j] == 0)
                        matrix[i][j] = 0;
        if(matrix[0][0] == 0) {
            for(int  i = 0; i < matrix[0].length; i++)
                matrix[0][i] = 0;
        }
        if(col0 == 0){
            for(int j = 0; j < matrix.length; j++) {
                matrix[j][0] = 0;
            }
        }
    }
    public void display(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
