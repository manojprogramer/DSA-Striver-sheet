package com.manoj.slidingwindowandtwopointers.slidingwindow;

public class Main {
    public static void main(String[] args) {
        String s = "abcddabac";
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(longest.longestSubStringWithoutRepeatingCharactersBruteForceApproach(s));
        System.out.println(longest.longestSubStringWithOutRepeatingCharactersOptimalApproach(s));
    }
}
