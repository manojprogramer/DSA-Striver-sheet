package com.manoj.strings;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class LongestSubStringWithOutRepeatingCharacters {
    public int longestSubStringWithOutRepeatingCharactersBruteForceApproach(String s){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
           int[] arr = new int[256];
           for(int j = i; j < s.length(); j++){
               if(arr[s.charAt(j)] != 0)
                   break;
               arr[s.charAt(j)]++;
               max = Math.max(max,j-i+1);
           }
        }
        return max;
    }
    public int longestSubstringWithOutRepeatingCharactersOptimalApproach(String s){
        int max = Integer.MIN_VALUE;
        int[] arr = new int[256];
        Arrays.fill(arr,-1);
        int left =0, right = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            if(arr[ch] != -1){
                left  = Math.max(left,arr[ch]+1);
            }
            arr[ch] = right;
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}
