package com.manoj.recursion;

import java.util.*;

public class CombinationSumII {
    public List<List<Integer>> combinationSumIIBruteForceApproach(int[] nums, int target){
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        combinationSumBruteForce(0,target,nums,new ArrayList<>(),set);
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
    public void combinationSumBruteForce(int index, int target, int[] nums, List<Integer>list, Set<List<Integer>>set){
        if(index == nums.length) {
            if(target == 0){
                set.add(new ArrayList<>(list));
            }
            return;
        }
        if(nums[index] <= target) {
            list.add(nums[index]);
            combinationSumBruteForce(index+1,target-nums[index],nums,list,set);
            list.removeLast();
        }
        combinationSumBruteForce(index+1,target,nums,list,set);
    }
    public List<List<Integer>> combinationSumIIOptimalApproach(int[] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i : nums)
            System.out.print(i);
        System.out.println();
        combinationSumOptimal(0,target,nums,new ArrayList<>(),ans);

        return ans;
    }
    public void combinationSumOptimal(int index, int target, int[] nums, List<Integer>list, List<List<Integer>>ans){
        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i < nums.length; i++){
            if(i > index && nums[i] == nums[i-1]) {
                continue;
            }
            if(nums[index] > target) break;
            list.add(nums[i]);
            combinationSumOptimal(i+1, target-nums[i],nums,list,ans);
            list.removeLast();
        }
    }


}
