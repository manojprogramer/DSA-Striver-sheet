package com.manoj.binarysearch;

import com.manoj.linkedlist.InsertAtEndInTheLinkedList;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
//        LowerBound l = new LowerBound();
//        System.out.println(l.lowerBound(nums,100));
//        FloorAndCeilSortedArray f = new FloorAndCeilSortedArray();
//        int[] arr = f.floorAndCeilSortedArray(nums,8);
        FirstAndLastOccurrence f = new FirstAndLastOccurrence();
//        int[] arr = f.firstAndLastOccurrenceBruteForceApproach(nums,1);
//        int[] arr = f.firstAndLastOccurrenceOptimalApproach1(nums,0);
        int[] arr = f.firstAndLastOccurrenceOptimalApproach2(nums,0);
        for (int i : arr){
            System.out.println(i);
        }
    }
}
