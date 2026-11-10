package com.manoj.binarysearch;

public class SplitArrayLargestSum {
    public int splitArrayLargestSumBruteForceApproach(int[] nums, int k){
        int max = Integer.MIN_VALUE;
        int totalSum = 0;
        for( int i = 0; i < nums.length; i++)
        {
            max = Integer.max(max,nums[i]);
            totalSum += nums[i];
        }
        for(int i = max; i <= totalSum; i++){
            int countSubArray = splitSubArray(nums,i);
            if(countSubArray <= k) return i;
        }
        return -1;
    }
    public int splitArrayLargestSumOptimalApproach(int[] nums, int k){
        int max = Integer.MIN_VALUE;
        int totalSum = 0;
        for( int i = 0; i < nums.length; i++)
        {
            max = Integer.max(max,nums[i]);
            totalSum += nums[i];
        }
        int low = max, high = totalSum;
        while(low <= high){
            int mid = (low+high)/2;
            int countSubArray = splitSubArray(nums,mid);
            if(countSubArray <= k) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    private int splitSubArray(int[] nums, int range) {
        int countSubArray = 1;
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(sum+nums[i] <= range){
                sum += nums[i];
            }
            else{
                countSubArray++;
                sum = nums[i];
            }
        }
        return countSubArray;
    }
}
