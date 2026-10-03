package com.manoj.arrays;

public class TwoSumII {
    public int[] twoSumIIBruteForceApproach(int[] nums,int target){
        for(int i = 0; i < nums.length; i++){
            for(int j=i+1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{};
    }
    public int[] twoSumIIOptimalApproach(int[] nums, int target){
        int left = 0, right = nums.length-1;
        while(left <= right){
            int sum = nums[left]+nums[right];
            if(sum == target) return new int[]{left+1,right+1};
            if(sum < target) left++;
            else right--;
        }
        return new int[]{};
    }

}
