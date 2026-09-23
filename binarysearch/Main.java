package com.manoj.binarysearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
//        LowerBound l = new LowerBound();
//        System.out.println(l.lowerBound(nums,100));
        FloorAndCeilSortedArray f = new FloorAndCeilSortedArray();
        int[] arr = f.floorAndCeilSortedArray(nums,8);
        for (int i : arr){
            System.out.println(i);
        }
    }
}
