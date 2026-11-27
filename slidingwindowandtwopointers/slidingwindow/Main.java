package com.manoj.slidingwindowandtwopointers.slidingwindow;

import com.manoj.arrays.MaximumConsecutiveOnes;

public class Main {
    public static void main(String[] args) {

        String s = "AABABBA";
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
//        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
//        System.out.println(longest.longestSubStringWithoutRepeatingCharactersBruteForceApproach(s));
//        System.out.println(longest.longestSubStringWithOutRepeatingCharactersOptimalApproach(s));
//        MaximumPointsYouCanObtainFromCards maximumPointsYouCanObtainFromCards = new MaximumPointsYouCanObtainFromCards();
//        System.out.println(maximumPointsYouCanObtainFromCards.maximumPointsYouCanObtainFromCards(nums,3));
//        MaximumConsecutiveOnesIII m = new MaximumConsecutiveOnesIII();
//        System.out.println(m.maximumConsecutiveIIIBetterApproach(nums,2));
//        System.out.println(m.maximumConsecutiveIIIBetterApproach(nums,2));
//        System.out.println(m.maximumConsecutiveIIIOptimalApproach(nums,2));
        LongestCharacterReplacement l = new LongestCharacterReplacement();
        System.out.println(l.longestCharacterReplacementBruteForceApproach(s,2));
        System.out.println(l.longestCharacterReplacementBetterApproach(s,2));
        System.out.println(l.longestCharacterReplacementOptimalApproach(s,2));
    }
}
