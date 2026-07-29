package com.manoj;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {
    public void combinationSum2(int index, int[] arr, List<List<Integer>> sol, List<Integer> list) {
        sol.add(new ArrayList<>(list));
        for(int i = index; i < arr.length; i++) {
            if(i != index && arr[i] == arr[i-1]) continue;;
            list.add(arr[i]);
            combinationSum2(i+1, arr,sol,list);
            list.remove(list.size()-1);
        }
    }
}
