package com.manoj.strings;

public class Main {
    public static void main(String[] args) {
        String s = "AABABBA";
//        ValidPalindrome v = new ValidPalindrome();
//        System.out.println(v.validPalindrome(s));
//        LongestSubStringWithOutRepeatingCharacters l = new LongestSubStringWithOutRepeatingCharacters();
//        System.out.println(l.longestSubStringWithOutRepeatingCharactersBruteForceApproach(s));
//        System.out.println(l.longestSubstringWithOutRepeatingCharactersOptimalApproach(s));
        LongestRepeatingCharacterReplacement l = new LongestRepeatingCharacterReplacement();
//        System.out.println(l.longestRepeatingCharacterReplacementBruteForceApproach(s,2));
        System.out.println(l.longestRepeatingCharacterReplacementOptimalApproach(s,2));
    }

}

