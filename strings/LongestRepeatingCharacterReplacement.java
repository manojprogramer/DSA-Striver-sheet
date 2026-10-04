package com.manoj.strings;

public class LongestRepeatingCharacterReplacement {
    public int longestRepeatingCharacterReplacementBruteForceApproach(String s,int k){
        int maxFrequency = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            int[] arr = new int[26];
            for(int j = i; j < s.length(); j++){
                arr[s.charAt(j)-'A']++;
                maxFrequency = Math.max(maxFrequency,arr[s.charAt(j)-'A']);
                int windowLength = j-i+1;
                int replacement = windowLength-maxFrequency;
                if(replacement <= k) max = Math.max(max,windowLength);
                else break;

            }
        }
        return max;
    }
    public int longestRepeatingCharacterReplacementOptimalApproach(String s, int k){
        int maxFrequency = 0, max = Integer.MIN_VALUE;
        int left = 0, right = 0;
        int[] arr = new int[26];
        while(right < s.length()){
            arr[s.charAt(right)-'A']++;
            maxFrequency = Math.max(maxFrequency,arr[s.charAt(right)-'A']);
            int windowLength = right-left+1;
            int replacement = windowLength-maxFrequency;
            if(replacement > k){
                arr[s.charAt(left)-'A']--;
                maxFrequency = 0;
                left++;
            }
            if(replacement <= k){
                max = Math.max(max, windowLength);
            }
            right++;
        }
        return max;
    }
}
