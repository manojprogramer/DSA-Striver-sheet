package com.manoj.arrays;

public class TrappingRainWater {
    public int trappingRainWaterBruteForceApproach(int[] nums){
        int n = nums.length;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        prefixMax[0] = nums[0];
        int total = 0;
        for(int i = 1; i < n; i++){
            prefixMax[i] = Math.max(prefixMax[i-1],nums[i]);
        }
        suffixMax[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            suffixMax[i] = Math.max(suffixMax[i+1],nums[i]);
        }
        for(int i = 0; i < n; i++){
            int leftMax = prefixMax[i];
            int rightMax = suffixMax[i];
            if(nums[i] < leftMax && nums[i] < rightMax){
                total += Math.min(leftMax,rightMax)-nums[i];
            }
        }
        return total;
    }
    public int trappingRainWaterBetterApproach(int[] nums){
        int[] suffixSum = new int[nums.length];
        int n = nums.length;
        suffixSum[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            suffixSum[i] = Math.max(suffixSum[i+1],nums[i]);
        }
        int leftMax = Integer.MIN_VALUE;
        int total = 0;
        for(int i = 0; i < nums.length; i++){
             leftMax = Math.max(leftMax,nums[i]);
             int rightMax = suffixSum[i];
             if(nums[i] < leftMax && nums[i] < rightMax){
                 total += Math.min(leftMax,rightMax)-nums[i];
             }
        }
        return total;
    }
    public int trappingRainWaterOptimalApproach(int[] nums){
        int left = 0, right = nums.length-1, leftMax = 0, rightMax = 0, total = 0;
        while(left <= right){
            if(nums[left] <= nums[right]){
                if(leftMax > nums[left]){
                    total += leftMax-nums[left];
                }
                else {
                    leftMax = nums[left];
                }
                left++;
            }
            else {
                if(rightMax > nums[right]){
                    total += rightMax-nums[right];
                }
                else {
                    rightMax = nums[right];
                }
                right--;
            }
        }
        return  total;
    }
}
