package com.manoj.binarysearch;

public class FindPeekElement {
    public int findPeakElementBruteForceApproach(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if((i == 0 || nums[i-1] < nums[i]) && (i == nums.length-1 || nums[i] > nums[i+1])) {
                return i;
            }
        }
        return -1;
    }
    public int findPeakElementOptimalApproach(int[] nums){
        int n = nums.length;
        if(n == 1) return  0;
        if(nums[0] > nums[1]) {
            System.out.println("entering");
            return 0;
        }
        if(n-1 > n-2) return n-1;
        int low = 1, high = n-2;
        while(low <= high){
            int mid = (low+high)/2;
            if((nums[mid] > nums[mid-1]) && (nums[mid] > nums[mid+1])) return mid;
            else if(nums[mid] > nums[mid-1]) low = mid+1;
            else if (nums[mid] > nums[mid+1]) high = mid-1;
        }
        return 0;
    }
}
//1, 1, 2, 2, 6, 3, 4, 5, 5, 6, 6

