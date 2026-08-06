package com.manoj.arrays;

public class GridUniquePaths {
    public int gridUniquePaths(int m, int n) {
        if(m == 0 && n == 0) return 1;
        if(m < 0 || n < 0) return 0;
        int left = gridUniquePaths(m-1,n);
        int right = gridUniquePaths(m,n-1);
        return left+right;
    }
    public int gridUniquePathsOptimalApproach(int m ,int n) {
        int[][] dp = new int[m][n];
        for(int i = 0 ; i < m; i++){
            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) dp[i][j] = 1;
                else {
                    int up = 0, left = 0;
                    if(i > 0) up = dp[i-1][j];
                    if(j > 0) left = dp[i][j-1];
                    dp[i][j] = up+left;
                }
            }
        }

        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        GridUniquePaths g = new GridUniquePaths();
//        System.out.println(g.gridUniquePaths(3,3));
        System.out.println(g.gridUniquePathsOptimalApproach(3,2));
    }
}
