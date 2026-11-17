package com.manoj.binarysearch;

public class FindPeakElementII {
    public int[] findPeakElementIIBruteForceApproach(int[][] nums){
        int n = nums.length;
        int m = nums[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int left = (j == 0) ? -1 : nums[i][j-1];
                int right = (j == m-1) ? -1 : nums[i][j+1];
                int top = (i == 0) ? -1 : nums[i-1][j];
                int bottom = (i == n-1) ? -1 : nums[i+1][j];
                int val = nums[i][j];
                if(val > left && val > right && val > top && val > bottom) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    public int[] findPeakElementIIBruteForceApproachII(int[][] nums){
        int n = nums.length;
        int m = nums[0].length;
        int maxElement = Integer.MIN_VALUE;
        int row = -1, col = -1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(maxElement < nums[i][j]){
                    maxElement = nums[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row,col};
    }
    public int findMaxElementInColumn(int[][] nums, int col){
        int index = -1;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(maxValue < nums[i][col]) {
                maxValue = nums[i][col];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakElementIIOptimalApproach(int[][] nums){
        int n = nums.length;
        int m = nums[0].length;
        int low = 0, high = m-1;
        while(low <= high){
            int mid = (low+high)/2;
            int rowIndex = findMaxElementInColumn(nums,mid);
            int left = (mid == 0) ? -1 : nums[rowIndex][mid-1];
            int right = (mid == m-1) ? -1 : nums[rowIndex][mid+1];
            int val = nums[rowIndex][mid];
            if (val > left && val > right) return new int[]{rowIndex,mid};
            else if(left > val) high = mid-1;
            else low = mid+1;
        }
        return new int[]{-1,-1};
    }
}
