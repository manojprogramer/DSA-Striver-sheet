package com.manoj.binarysearch;

public class FloorAndCeilSortedArray {
    public int[] floorAndCeilSortedArray(int[] arr, int x){
        int low = 0, high = arr.length-1;
        int floor = -1;
        int ceil = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
            if(arr[mid] < x){
                floor = arr[mid];
                low = mid+1;
            }
            else {
                ceil = arr[mid];
                high = mid-1;
            }
        }
        return new int[]{floor,ceil};
    }
}
