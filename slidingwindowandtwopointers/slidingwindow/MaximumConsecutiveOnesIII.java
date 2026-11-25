package com.manoj.slidingwindowandtwopointers.slidingwindow;

public class MaximumConsecutiveOnesIII {
    public int maximumConsecutiveOnesIIIBruteForceApproach(int[] nums,int k){
        int zeroes = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                if(nums[i] == 0) zeroes++;
                if(zeroes > k) break;
                max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
    public int maximumConsecutiveIIIBetterApproach(int[] nums, int k){
        int zeroes = 0, left = 0, right = 0;
        int max = Integer.MIN_VALUE;
        while(right < nums.length){
            if(nums[right] == 0) zeroes++;
            while(zeroes > k){
                if(nums[left] == 0) zeroes--;
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
    public int maximumConsecutiveIIIOptimalApproach(int[] nums, int k){
        int zeroes = 0, left = 0, right = 0;
        int max = Integer.MIN_VALUE;
        while(right < nums.length){
            if(nums[right] == 0) zeroes++;
            if(zeroes > k){
                if(nums[left] == 0) zeroes--;
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}
