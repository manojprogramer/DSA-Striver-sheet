package com.manoj.strings;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagramBruteForceApproach(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] string1= s.toCharArray();
        char[] string2 = t.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        for(int i = 0; i < string1.length; i++){
            if(string1[i] != string2[i]) return false;
        }
        return true;
    }
    public boolean isAnagramOptimalApproach(String s, String t){
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;

        }
        for(int i : freq) if(i != 0) return false;
        return true;
    }
}
