package com.manoj.arrays;

import java.util.*;

public class FourSum {
    public void fourSumBruteForceApproach(int[] nums, int target) {
        Set<List<Integer>>set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    for(int l = k+1; l < nums.length; l++){
                        int sum = nums[i]+nums[j]+nums[k]+nums[l];
                        if(sum == target) {
                            List<Integer>list =  new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[l]);
                            set.add(list);
                        }
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        System.out.println(list);
    }
    public void fourSumBetterApproach(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                Map<Integer,Integer> map = new HashMap<>();
                for(int k = j+1; k < nums.length; k++) {
                    int sum = target-(nums[i]+nums[j]+nums[k]);
                    if(!map.isEmpty() && map.containsKey(sum)){
                        List<Integer>list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(sum);
                        list.add(nums[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                    else {
                        map.put(nums[k],i);
                    }

                }
            }
        }
        List<List<Integer>> sol = new ArrayList<>(set);
        System.out.println(sol);
    }
    public void fourSumOptimalApproach(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < nums.length; j++) {
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = nums.length-1;
                while(k < l) {
                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum < target) k++;
                    else if(sum > target) l--;
                    else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        set.add(list);
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(l > k && nums[l] == nums[l-1]) l--;
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 5, 7, 9};
        FourSum f = new FourSum();
//        f.fourSumBruteForceApproach(nums,5);
//        f.fourSumBetterApproach(nums,9);
        f.fourSumOptimalApproach(nums,7);
    }
}
