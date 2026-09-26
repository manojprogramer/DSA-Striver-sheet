package com.manoj.binarysearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
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
//        FindMinimumInRotatedSortedArray f = new FindMinimumInRotatedSortedArray();
//        System.out.println(f.findMinimumInRotatedSortedArray(nums));
        SingleElementInSortedArray s =new SingleElementInSortedArray();
//        System.out.println(s.singleElementInSortedArrayBruteForceApproach(nums));
        System.out.println(s.singleElementInSortedArrayOptimalApproach(nums));


    }
}
