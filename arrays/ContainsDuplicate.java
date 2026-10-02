package com.manoj.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicateBruteForceApproach(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
    public boolean containsDuplicateBetterApproach(int[] nums){
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]) return true;
        }
        return false;
    }
    public boolean containsDuplicateOptimalApproach(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])) return true;
            else map.put(nums[i],i);
        }
        return false;
    }
}
