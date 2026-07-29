package com.manoj.arrays;

public class PascalTriangle {
    public int pascalTriangle(int row, int col) {
        for(int i = 0; i < row; i++){
            int value = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(value);
                if(i == row-1 && j == col-1) return value;
                value = value*(i-j)/(j+1);

            }
            System.out.println();
        }
        return 0;
    }
}
