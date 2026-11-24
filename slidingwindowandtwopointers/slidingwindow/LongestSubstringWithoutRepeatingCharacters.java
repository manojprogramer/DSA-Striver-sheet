package com.manoj.slidingwindowandtwopointers.slidingwindow;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public int longestSubStringWithoutRepeatingCharactersBruteForceApproach(String s){
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            int[] hash = new int[256];
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
                if(hash[ch] != 0) break;
                maxElement = Math.max(maxElement,j-i+1);
                hash[ch]++;
            }
        }
        return maxElement;
    }
    public int longestSubStringWithOutRepeatingCharactersOptimalApproach(String s){
        int maxElement = Integer.MIN_VALUE;
        int left = 0, right = 0;
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        while(right < s.length()){
            char ch = s.charAt(right);
            if(hash[ch] != -1){
                if(hash[ch] >= left){
                    left = hash[ch]+1;
                }
            }
            maxElement = Math.max(maxElement,right-left+1);
            hash[ch] = right;
            right++;
        }
        return maxElement;

    }
}
