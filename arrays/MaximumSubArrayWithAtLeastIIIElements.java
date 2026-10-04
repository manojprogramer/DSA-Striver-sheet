package com.manoj.arrays;

import java.util.Arrays;

public class MaximumSubArrayWithAtLeastIIIElements {
    public int maximumSubArrayWithAtLeastElementsBruteForceApproach(int[] nums){
       if(nums.length < 3) return 0;
       int sum = nums[0]+nums[1]+nums[2];
       int max = sum;
       for(int i = 3; i < nums.length; i++){
           sum -= nums[i-3];
           sum += nums[i];
           max = Math.max(max,sum);
       }
       return max;
    }
}
