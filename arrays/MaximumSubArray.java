package com.manoj.arrays;

public class MaximumSubArray {
    public int maximumSubArrayOptimalApproach(int[] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(nums[i],currentSum);
        }
        return maxSum;
    }
}
