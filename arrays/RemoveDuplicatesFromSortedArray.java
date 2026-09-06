package com.manoj.arrays;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public int remoteDuplicatesFromSortedArray(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        int index = 0;
        while(index < list.size()){
            nums[index] = list.get(index);
            index++;
        }
        return index;
    }
    public int removeDuplicatesFromSortedArrayOptimalApproach(int[] nums){
        Arrays.sort(nums);
        int i = 0, j = 1;
        while(j < nums.length){
           if(nums[i] != nums[j]){
               i++;
               nums[i] = nums[j];
           }
           j++;
        }
        return i+1;
    }
}
