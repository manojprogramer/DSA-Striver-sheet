package com.manoj.binarysearch;

public class FindTheSmallestDivisor {
    public int findTheSmallestDivisorOptimalApproach(int[] nums, int limit){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
            max = Math.max(max,nums[i]);
        int low = 1, high = max,ans = -1;
        while(low <= high){
            int mid =  (low+high)/2;
            int divisor = findDivisor(nums,mid);
            if(divisor <= limit) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    public int findTheSmallestDivisorBruteForceApproach(int[] nums, int threshold){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max,nums[i]);
        }
        for(int i = 1; i <= max; i++){
            int divisor = findDivisor(nums,i);
            if(divisor >= threshold) return i;
        }
        return -1;
    }

    private int findDivisor(int[] nums, int divisor) {
        int val = 0;
        for(int i = 0; i < nums.length; i++){
             val += (nums[i]+divisor-1)/divisor;
        }
        return val;
    }
}
