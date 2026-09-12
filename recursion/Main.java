package com.manoj.recursion;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
//        SubsetSumEqualsToTarget s = new SubsetSumEqualsToTarget();
//        System.out.println(s.subsetSumEqualsToTarget(nums,6));
//        SubsetII s = new SubsetII();
//        System.out.println(s.subsetII(nums));
        CombinationSum c = new CombinationSum();
        System.out.println(c.combinationSum(nums,7));
    }
}
