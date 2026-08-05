package com.manoj.arrays;

import java.util.*;

public class MajorityElement2 {
    public void MajorityElementBruteForceApproach(int[] nums) {
        List<Integer> sol = new ArrayList<>();
        int count = 1;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++) {
            if(count > (nums.length/3))
                sol.add(nums[i]);
            if(nums[i] == nums[i+1])
                count++;
            else
                count = 1;
            if(sol.size() == 2) break;
        }
        System.out.println(sol);
    }

    public void majorityElementBetterApproach(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) > (nums.length/3))
                list.add(key);
        }
        System.out.println(list);
    }
    public void majorityElementOptimalApproach(int[] nums) {
        List<Integer> sol = new ArrayList<>();
        int el1 = 0, el2 = 0, count1 = 0, count2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count1 == 0 && nums[i] != el1) {
                count1 = 1;
                el1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != el1)
            {
                count2 = 1;
                el2 = nums[i];
            }
            else if(nums[i] == el1) count1++;
            else if(nums[i] == el2) count2++;
            else {
                count1--;count2--;
            }
        }
        count1 = 0; count2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == el1) count1++;
            else if(nums[i] == el2) count2++;
        }
        if(count1 > (nums.length/3))
            sol.add(el1);
        if(count2 > (nums.length/3))
            sol.add(el2);
        System.out.println(sol);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3, 2};
        MajorityElement2 m = new MajorityElement2();
//        m.MajorityElementBruteForceApproach(nums);
//        m.majorityElementBetterApproach(nums);
        m.majorityElementOptimalApproach(nums);
    }
}
