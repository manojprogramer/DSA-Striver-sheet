package com.manoj.arrays;

import java.util.Arrays;

public class FindDuplicate {
    public void findDuplicateBetterApproach1(int[] arr) {
        Arrays.sort(arr);
        int duplicate = 0;
        for(int i = 0; i < arr.length-1; i++)
            if(arr[i] == arr[i+1])
            {
                duplicate = arr[i];
                break;
            }
        System.out.println(duplicate);
    }

    public void findDuplicateBruteForceApproach(int[] arr) {
        boolean[] duplicate = new boolean[arr.length];
        int duplicateValue = 0;
        for(int i = 0; i < arr.length; i++) {
            if(!duplicate[arr[i]])
                duplicate[arr[i]] = true;
            else{
                duplicateValue = arr[i];
                break;
            }
        }
        System.out.println(duplicateValue);
    }

}
