package com.manoj.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, -15};
        TwoSum t = new TwoSum();
//        int[] arr = t.twoSumBetterApproach(nums,9);
//        System.out.println(Arrays.toString(arr));
//        TrappingRainWater t = new TrappingRainWater();
//        System.out.println(t.trappingRainWaterBruteForceApproach(nums));
//        System.out.println(t.trappingRainWaterBetterApproach(nums));
//        System.out.println(t.trappingRainWaterOptimalApproach(nums));
//        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
//        System.out.println(r.removeDuplicatesFromSortedArrayOptimalApproach(nums));
//        System.out.println(r.remoteDuplicatesFromSortedArray(nums));
//        MaximumConsecutiveOnes m = new MaximumConsecutiveOnes();
//        System.out.println(m.maximumConsecutiveOnes(nums));
//        RomanInteger r = new RomanInteger();
//        System.out.println(r.romanInteger("MCX"));
//        MaximumSubArray m = new MaximumSubArray();
//        System.out.println(m.maximumSubArrayOptimalApproach(nums));
//        MinimumSizeSubArray m = new MinimumSizeSubArray();
//        System.out.println(m.minimumSizeSubArrayOptimalApproach(nums,9));
//        MaximumSubArraySumAfterOneOperation m = new MaximumSubArraySumAfterOneOperation();
//        System.out.println(m.maximumSubArraySumAfterOneOperation(nums));
        HighestOccurElement h = new HighestOccurElement();
        h.highestOccurElement(nums);

    }
}
