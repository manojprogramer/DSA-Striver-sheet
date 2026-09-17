package com.manoj.recursionandbacktracking;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        String string = "abc";
//        PrintPermutations p = new PrintPermutations();
//        System.out.println(p.printPermutationsBruteForceApproach(nums));
//        System.out.println(p.printPermutationsOptimalApproach(nums));
        PermutationsOfString p = new PermutationsOfString();
//        System.out.println(p.permutationOfStringBruteForceApproach(string));
        System.out.println(p.permutationsOfStringOptimalApproach(string));

    }
}
