package com.manoj.arrays;

import java.util.*;

public class ThreeSum {
    public void threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int k = j+1; k < nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        System.out.println(list);
    }
    public void threeSumBetterApproach(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int j = i+1; j < nums.length; j++) {
                int sum = -(nums[i]+nums[j]);
                if(!map.isEmpty() && map.containsKey(sum)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(sum);
                    Collections.sort(temp);
                    set.add(temp);
                }
                else {
                    map.put(nums[j],i);
                }
            }

        }
        System.out.println(set);
    }
    public void threeSumOptimalApproach(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int  j = i+1;
            int k = nums.length-1;
            while(j < k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    sol.add(list);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(k > j && nums[k] == nums[k+1]) k--;
                }
            }
        }
        System.out.println(sol);
    }

    public static void main(String[] args) {
        int[] nums = {8, -6, 5, 4};
        ThreeSum t = new ThreeSum();
//        t.threeSum(nums);
//        t.threeSumBetterApproach(nums);
        t.threeSumOptimalApproach(nums);
    }
}
