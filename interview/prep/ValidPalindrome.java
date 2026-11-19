package com.manoj.interview.prep;

public class ValidPalindrome {
    public boolean validPalindromeBruteForceApproach(String s){
        String s2 = s.replaceAll("[^a-zA-z0-9]","").toLowerCase();
        for(int i = 0; i < s2.length(); i++){
            if(s2.charAt(i) != s2.charAt(s2.length()-i-1))
                return false;
        }
        return true;
    }
    public boolean validPalindromeOptimalApproach(String s){
        int low = 0, high = s.length()-1;
        while (low < high){
            char firstCharacter = s.charAt(low);
            char lastCharacter = s.charAt(high);
            if(!Character.isLetterOrDigit(firstCharacter)) low++;
            else if(!Character.isLetterOrDigit(lastCharacter)) high--;
            else {
                if(Character.toLowerCase(firstCharacter)!= Character.toLowerCase(lastCharacter)) return false;
                low++;
                high--;
            }
        }
        return true;
    }
}
