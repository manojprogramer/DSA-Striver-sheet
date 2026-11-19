package com.manoj.binarysearch;

import java.util.Arrays;

public class MedianInARowWiseSortedMatrix {
    public int medianInARowWiseSortedMatrixBruteForceApproach(int[][] nums){
        int n = nums.length;
        int m = nums[0].length;
        int[] arr = new int[n*m];
        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[index++] = nums[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[(n*m)/2];
    }
    public int blackBox(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public int medianInARowWiseSortedMatrixOptimalApproach(int[][] nums){
        int n = nums.length;
        int m = nums[0].length;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            low = Math.min(nums[i][0],low);
            high = Math.max(nums[i][m-1],high);
        }
        int required = (n*m)/2;
        while (low <= high){
            int mid = (low+high)/2;
            int value = 0;
            for(int i = 0; i < n; i++){
                value += blackBox(nums[i],mid);
            }
            if(value <= required){
                low = mid+1;
            }
            else high = mid-1;
        }
        return low;
    }

}
