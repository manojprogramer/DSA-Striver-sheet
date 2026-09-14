package com.manoj.recursion;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,1,2,6,7,1,5};
        String s = "aabaa";
//        SubsetSumEqualsToTarget s = new SubsetSumEqualsToTarget();
//        System.out.println(s.subsetSumEqualsToTarget(nums,6));
//        SubsetII s = new SubsetII();
//        System.out.println(s.subsetII(nums));
//        CombinationSum c = new CombinationSum();
//        System.out.println(c.combinationSum(nums,7));
//        CombinationSumII c = new CombinationSumII();
//        System.out.println(c.combinationSumIIBruteForceApproach(nums,8));
//        System.out.println(c.combinationSumIIOptimalApproach(nums,8));
        PalindromePartitioning p = new PalindromePartitioning();
        System.out.println(p.palindromePartitioning(s));

    }
}
