package com.manoj.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSumBruteForceApproach(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if((nums[i]+nums[j]) == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{};
    }
    public void twoSumBetterApproach(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int value = target-nums[i];

            if(!map.isEmpty() && map.containsKey(value)) {
                System.out.println("Entering");
//                return new int[]{i,map.get(value)}
            }
            else {
                map.put(nums[i], i);
            }
        }
//        return new int[]{};

    }
    public int[] twoSumOptimalApproach(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0, right = nums.length-1;
        int sum = 0;
        while(left < right) {
            sum = nums[left]+nums[right];
            if(sum < target) left++;
            else if(sum > target) right--;
            else
                return new int[]{left,right};
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {1, 6, 2, 10, 3};
        TwoSum t = new TwoSum();
        t.twoSumBetterApproach(nums,7);
    }
}
