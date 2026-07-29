package com.manoj;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutations {
    public void printAllPermutationsApproach1(int[] arr, List<List<Integer>> sol, List<Integer> list, boolean[] freq) {
        if(list.size() == arr.length) {
            sol.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            if(!freq[i]) {
                list.add(arr[i]);
                freq[i] = true;
                printAllPermutationsApproach1(arr, sol, list, freq);
                list.remove(list.size()-1);
                freq[i] = false;
            }
        }
    }
    public void printAllPermutationsApproach2(int ind, int[] arr, List<List<Integer>> sol) {
        if(ind == arr.length) {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            sol.add(new ArrayList<>(list));
            return;
        }
        for(int i = ind; i < arr.length; i++) {
            swap(i,ind,arr);
            printAllPermutationsApproach2(ind+1,arr,sol);
            swap(i,ind,arr);
        }
    }
    public void swap(int i, int index, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
