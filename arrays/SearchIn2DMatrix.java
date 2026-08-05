package com.manoj.arrays;

public class SearchIn2DMatrix {
    public boolean searchIn2DMatrix(int[][] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[0].length;j++) {
                if(nums[i][j] == target)
                    return true;
            }
        }
        return false;
    }
    public boolean searchIn2DMatrixOptimalApproach(int[][] nums, int target) {

        int i = 0, j = nums[0].length-1;
        while(i < nums.length && j >= 0 && j < nums[0].length)
        {
            if(nums[i][j] == target) {
                return true;
            }
            else if(nums[i][j] > target) {
                j--;
            }
            else
                i++;
        }
        return false;
    }
}
