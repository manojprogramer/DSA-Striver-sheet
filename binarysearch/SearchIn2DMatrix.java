package com.manoj.binarysearch;

public class SearchIn2DMatrix {
    public boolean searchIn2DMatrixBruteForceApproach(int[][] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                if(nums[i][j] == target) return true;
            }
        }
        return false;
    }
    public boolean binarySearch(int[] nums, int target){
        int low = 0, high = nums.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return true;
            if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
    public boolean searchIn2DMatrixBetterApproach(int[][] nums, int target){
        int n = nums.length;
        int m = nums[0].length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i][0] <= target && nums[i][m-1] >= target)
                return binarySearch(nums[i],target);
        }
        return false;
    }
    public boolean searchIn2DMatrixOptimalApproach(int[][] nums, int target){
        int n = nums.length;
        int m = nums[0].length;
        int low = 0, high = (n*m-1);
        while(low <= high){
            int mid = (low+high)/2;
            int r = mid/m;
            int c = mid%m;
            if(nums[r][c] == target) return true;
            if(nums[r][c] > target) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
}
