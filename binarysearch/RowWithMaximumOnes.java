package com.manoj.binarysearch;

public class RowWithMaximumOnes {
    public int rowWithMaximumOnesBruteForceApproach(int[][] nums){
        int maxOnes = 0;
        int index = -1;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                count += nums[i][j];
            }
            if(count > maxOnes){
                maxOnes = count;
                index = i;
            }
        }
        return index;
    }
    public int lowerBound(int[] nums, int key){
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] >= key) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public int rowWithMaximumOnesOptimalApproach(int[][] nums){
        int index = -1;
        int maxOnes = 0;
        int m = nums[0].length;
        for(int i = 0; i < nums.length; i++){
            int count = m-lowerBound(nums[i],1);
            if(count > maxOnes) {
                index = i;
                maxOnes = count;
            }
        }
        return index;
    }
}
