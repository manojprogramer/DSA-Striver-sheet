package com.manoj.arrays;

public class MinimumSizeSubArray {
    public int minimumSizeSubArrayBruteForceApproach(int[] nums, int target){
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum >= target) {
                    min = Math.min(min, j - i + 1);
                }
            }
        }
        return min;
    }
    public int minimumSizeSubArrayOptimalApproach(int[] nums, int target){
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                ans = Math.min(ans,right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
