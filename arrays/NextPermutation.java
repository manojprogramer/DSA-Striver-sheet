package com.manoj.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NextPermutation {
    public void nextPermutation(int[] arr) {
        int index = -1;
       for(int i = arr.length-1; i > 0; i--) {
           if(arr[i] > arr[i-1]) {
               index = i-1;
               break;
           }
       }
        System.out.println(index);
       if(index == -1) {
           reverse(0,arr.length-1,arr);
       }
        else{
           for(int i = arr.length-1; i > index; i--) {
               if(arr[i] > arr[index]) {
                   swap(i,index,arr);
                   break;
               }
           }
           reverse(index+1,arr.length-1,arr);
       }
    }
    public void reverse(int left, int right, int[] arr) {
        while (left < right)
            swap(left++,right--,arr);
    }
    public void swap(int n, int m, int[] arr) {
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
    public void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }


}
