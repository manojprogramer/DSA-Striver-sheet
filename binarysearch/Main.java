package com.manoj.binarysearch;

import com.manoj.linkedlist.InsertAtEndInTheLinkedList;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,6,7,0,1,2,3,3,3,3,4};
//        LowerBound l = new LowerBound();
//        System.out.println(l.lowerBound(nums,100));
//        FloorAndCeilSortedArray f = new FloorAndCeilSortedArray();
//        int[] arr = f.floorAndCeilSortedArray(nums,8);
//        FirstAndLastOccurrence f = new FirstAndLastOccurrence();
//        int[] arr = f.firstAndLastOccurrenceBruteForceApproach(nums,1);
//        int[] arr = f.firstAndLastOccurrenceOptimalApproach1(nums,0);
//        int[] arr = f.firstAndLastOccurrenceOptimalApproach2(nums,0);
//        for (int i : arr){
//            System.out.println(i);
//        }
//        SearchElementInSortedArrayI s = new SearchElementInSortedArrayI();
//        System.out.println(s.searchElementInSortedArrayBruteForceApproach(nums,5));
//        System.out.println(s.searchElementInSortedArrayOptimalApproach(nums,5));
//        SearchElementInSortedArrayII s = new SearchElementInSortedArrayII();
//        System.out.println(s.searchElementInSortedArrayIIBruteForceApproach(nums,100));
        FindMinimumInRotatedSortedArray f = new FindMinimumInRotatedSortedArray();
        System.out.println(f.findMinimumInRotatedSortedArray(nums));

    }
}
