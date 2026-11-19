package com.manoj.interview.prep;

public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        ValidPalindrome v = new ValidPalindrome();
        System.out.println(v.validPalindromeBruteForceApproach(s));
        System.out.println(v.validPalindromeOptimalApproach(s));
    }
}
