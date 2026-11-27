package com.manoj.slidingwindowandtwopointers.slidingwindow;

public class LongestCharacterReplacement {
    public int longestCharacterReplacementBruteForceApproach(String s, int k){
        int maxF = 0, maxL = 0;
        for(int i = 0; i < s.length(); i++){
            int[] hash = new int[26];
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
                hash[ch-'A']++;
                maxF = Math.max(maxF,hash[ch-'A']);
                if((j-i+1)-maxF > k) break;
                maxL = Math.max(maxL,(j-i+1));
            }
        }
        return maxL;
    }
    public int longestCharacterReplacementBetterApproach(String s, int k){

        int maxF = 0, maxL = 0;
        int left = 0, right = 0;
        int[] hash = new int[26];
        while(right < s.length()){
            char ch = s.charAt(right);
            hash[ch-'A']++;
            maxF = Math.max(maxF,hash[ch-'A']);
            while((right-left+1)-maxF > k) {
                maxF = 0;
                hash[s.charAt(left)-'A']--;
                for (int i = 0; i < 26; i++)
                    maxF = Math.max(maxF,hash[i]);
                left++;
            }
            maxL = Math.max(maxL,right-left+1);
            right++;
        }
        return maxL;
    }
    public int longestCharacterReplacementOptimalApproach(String s, int k){
        int maxF = 0, maxL = 0;
        int left = 0, right = 0;
        int[] hash = new int[26];
        while(right < s.length()){
            char ch = s.charAt(right);
            hash[ch-'A']++;
            maxF = Math.max(maxF,hash[ch-'A']);
            if((right-left+1)-maxF > k) {
                hash[s.charAt(left)-'A']--;
                left++;
            }
            maxL = Math.max(maxL,right-left+1);
            right++;
        }
        return maxL;
    }
}
