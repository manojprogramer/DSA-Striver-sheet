package com.manoj.arrays;

public class SortAnArrayOf1And2And3s {
    public void sortZeroesOnesAndTwos(int[] arr) {
        int low = 0, mid = 0, high = arr.length-1;
        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(low++,mid,arr);
            }
            else if(arr[mid] == 1) mid++;
            else {
                swap(mid,high--,arr);

            }
        }
    }
    public void swap(int n, int m, int[] arr) {
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
    public void display(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
