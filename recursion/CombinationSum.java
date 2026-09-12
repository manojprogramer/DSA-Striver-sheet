package com.manoj.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] arr,int target){
        List<List<Integer>>ans = new ArrayList<>();
        combination(0,arr,target,new ArrayList<>(),ans);
        return ans;
    }
    public void combination(int index,int[] arr, int target, List<Integer>list, List<List<Integer>>ans){
        if(index == arr.length){
            if(target == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[index] <= target){
            list.add(arr[index]);
            combination(index,arr,target-arr[index],list,ans);
            list.removeLast();
        }
        combination(index+1,arr,target,list,ans);

    }
}
