package com.manoj.greedy;

public class MinimumCoins {
    public int minimumCoins(int[] nums, int target){
        int ans = minimumCoin(nums.length-1,target,nums);
        return ans == (int) 1e9 ? -1 : ans;
    }
    private int minimumCoin(int index, int target, int[] nums){
        if(index == 0) {
            if(target % nums[index] == 0) return target/nums[index];
            else return (int) 1e9;
        }
        int notTake = minimumCoin(index-1,target,nums);
        int take = (int) 1e9;
        if(nums[index] <= target) {
            take = 1+minimumCoin(index,target-nums[index],nums);
        }
        return Math.min(take,notTake);
    }

}
