package com.manoj;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public void nQueen(int row, boolean[][] match, List<List<Integer>> sol) {
        System.out.println(row);
        if(row == match.length){
            System.out.println("Entering");
            List<Integer>list = new ArrayList<>();
            for(int i = 0; i < match.length; i++) {
                for(int j = 0; j < match[0].length; j++) {
                    if(match[i][j]){
                        list.add(j+1);
                    }
                }
            }
            System.out.println(list);
//            sol.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < match.length; i++){
            if(isSafe(row,i,match)){
                match[row][i] = true;
                nQueen(row+1,match,sol);
                match[row][i] = false;
            }
        }
    }
    private boolean isSafe(int row, int col, boolean[][] match) {
//        Row Check
        for(int i = 0; i < match[0].length; i++)
            if(match[col][i])
                return false;

//        Column Check
        for(int j = 0; j < match.length; j++)
            if(match[j][row])
                return false;

//      Upper Left Diagonal Check
        for(int i = row-1,j = col-1; i >= 0 && j >= 0; i--,j--) {
            if(match[i][j]) return false;
        }

//        Upper Right Diagonal Check
        for(int i = row-1,j = col+1; i >= 0 && j < match[0].length; i--,j++) {
            if(match[i][j]) return false;
        }

//        Lower Left Diagonal Check
        for(int i  = row+1,j = col-1; i < match.length && j >= 0; i++,j--) {
            if(match[i][j]) return false;
        }

//        Lower Right Diagonal Check
        for(int i = row+1,j = col+1; i < match.length && j < match[0].length; i++,j++){
            if(match[i][j]) return false;
        }
        return true;
    }
}
