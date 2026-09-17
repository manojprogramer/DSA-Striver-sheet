package com.manoj.recursionandbacktracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {
    public List<String> permutationOfStringBruteForceApproach(String string){
        List<String> list = new ArrayList<>();
        boolean[] frequency = new boolean[string.length()];
        StringBuilder str = new StringBuilder();
        permutationBruteForceApproach(string,str,frequency,list);
        return list;
    }

    private void permutationBruteForceApproach(String string, StringBuilder str,boolean[] frequency, List<String> list) {
        if(str.length() == string.length()){
            list.add(str.toString());
            return;
        }
        for(int i = 0; i < string.length(); i++){
            if(!frequency[i]){
                frequency[i] = true;
                str.append(string.charAt(i));
                permutationBruteForceApproach(string,str,frequency,list);
                frequency[i] = false;
                str.deleteCharAt(str.length()-1);
            }

        }

    }
    public List<String> permutationsOfStringOptimalApproach(String string){
        List<String> list = new ArrayList<>();
        char[] arr = string.toCharArray();
        permutationOptimalApproach(0,arr,list);
        return list;
    }

    private void permutationOptimalApproach(int index,char[] arr, List<String> list) {
        if(index == arr.length) {
           list.add(new String(arr));
            return;
        }
        for(int i = index; i < arr.length; i++){
            swapStringBuilder(i,index,arr);
            permutationOptimalApproach(index+1,arr,list);
            swapStringBuilder(i,index,arr);
        }
    }

    private void swapStringBuilder(int i, int index, char[] arr) {
        char temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
