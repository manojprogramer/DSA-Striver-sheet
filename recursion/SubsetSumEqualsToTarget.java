package com.manoj.recursion;

public class SubsetSumEqualsToTarget {
    public boolean subsetSumEqualsToTarget(int[] nums, int target){
        return subsetSum(0,0,target,nums);
    }

    private boolean subsetSum(int index, int sum, int target, int[] nums) {
        if(index == nums.length){
            if(sum == target) {
                return true;
            }
            return false;
        }
        sum += nums[index];
        if(subsetSum(index+1,sum,target,nums))
            return  true;
        sum -= nums[index];
        return subsetSum(index + 1, sum, target, nums);
    }

}
