package com.manoj.binarysearch;

public class KthMissingNumber {
    public int kthMissingNumberBruteForceApproach(int[] nums, int k){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= k) k++;
            else break;
        }
        return k;
    }
    public int kthMissingNumberOptimalApproach(int[] nums, int k){
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            int missingNumber = nums[mid]-(mid+1);
            if(missingNumber < k) low = mid+1;
            else high = mid-1;
        }
        return low+k;
    }
}
