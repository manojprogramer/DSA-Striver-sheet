package com.manoj.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetII {
    public List<List<Integer>> subsetII(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        subset(0,nums,new ArrayList<>(),ans);
        return ans;
    }
    public void subset(int index, int[] nums, List<Integer> list, List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));
        for(int i = index; i < nums.length; i++){
            if(i != index && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            subset(i+1,nums,list,ans);
            list.removeLast();
        }
    }

}
