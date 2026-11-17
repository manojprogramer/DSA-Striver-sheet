package com.manoj.binarysearch;

public class Search2DMatrixII {
    public boolean search2DMatrixIIBruteForceApproach(int[][] nums, int target){
        int n = nums.length;
        int m = nums[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(nums[i][j] == target) return true;
            }
        }
        return false;
    }
    public boolean binarySearch(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return true;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
    public boolean search2DMatrixIIBetterApproach(int[][] nums, int target){
        int n = nums.length;
        int m = nums[0].length;
        for(int i = 0; i < n; i++){
            if(binarySearch(nums[i],target))
                return true;
        }
        return false;
    }
    public boolean search2DMatrixIIOptimalApproach(int[][] nums, int target){
        int n = nums.length;
        int m = nums[0].length;
        int row = 0, col = m-1;
        while (row < n && col >= 0){
            if(nums[row][col] == target) return true;
            else if(nums[row][col] < target)
                row++;
            else col--;
        }
        return false;
    }
}
