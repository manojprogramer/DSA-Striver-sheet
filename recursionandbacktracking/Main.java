package com.manoj.recursionandbacktracking;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        PrintPermutations p = new PrintPermutations();
//        System.out.println(p.printPermutationsBruteForceApproach(nums));
        System.out.println(p.printPermutationsOptimalApproach(nums));
    }
}
