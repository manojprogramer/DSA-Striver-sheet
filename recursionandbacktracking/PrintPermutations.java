package com.manoj.recursionandbacktracking;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutations {
    public List<List<Integer>> printPermutationsBruteForceApproach(int[] nums){
        List<List<Integer>> ans =new ArrayList<>();
        boolean[] frequency = new boolean[nums.length];
        printPermutationBruteForceApproach(nums,new ArrayList<>(),frequency,ans);
        return ans;
    }

    private void printPermutationBruteForceApproach(int[] nums, List<Integer> list, boolean[] frequency, List<List<Integer>> ans) {
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!frequency[i]){
                frequency[i] = true;
                list.add(nums[i]);
                printPermutationBruteForceApproach(nums,list,frequency,ans);
                frequency[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> printPermutationsOptimalApproach(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        printPermutationOptimalApproach(0,nums,ans);
        return ans;
    }

    private void printPermutationOptimalApproach(int index, int[] nums, List<List<Integer>> ans) {
        if(index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int i : nums)
                list.add(i);
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i < nums.length; i++){
            swapArr(index,i,nums);
            printPermutationOptimalApproach(index+1,nums,ans);
            swapArr(index,i,nums);
        }
    }

    private void swapArr(int index, int i, int[] nums) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;

    }
}
