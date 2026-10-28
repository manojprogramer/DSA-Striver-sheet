package com.manoj.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public boolean findDuplicateBruteForceApproach(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
    public boolean findDuplicateBetterApproach(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++)
            if(arr[i] == arr[i+1])
                return true;
        return false;
    }

    public boolean findDuplicateOptimalApproach(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) return true;
            map.put(arr[i],i);
        }
        return false;
    }

}
