package com.manoj.binarysearch;

import java.util.Arrays;

public class AggressiveCows {
    public int aggressiveCowsBruteForceApproach(int[] nums, int k){
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max,nums[i]);
        }
        int ans = 0;
        for(int i = 1; i <= max; i++){
            if(!placeCows(nums,i,k)) return i-1;
            ans = i;
        }
        return ans-1;
    }
    public int aggressiveCowsOptimalApproach(int[] nums, int k){
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
            max = Math.max(max,nums[i]);
        int low = 0, high = max;
        while(low <= high){
            int mid = (low+high)/2;
            if(placeCows(nums,mid,k)) low = mid+1;
            else high = mid-1;
        }
        return high;
    }
    boolean placeCows(int[] nums, int distance, int k){
       int lastCow = nums[0];
       int cows = 1;
       for(int i = 1; i < nums.length; i++)
       {
           if(nums[i]-lastCow >= distance) {
               lastCow = nums[i];
               cows++;
           }
           if(cows >= k) return true;
       }
       return false;
    }
}
