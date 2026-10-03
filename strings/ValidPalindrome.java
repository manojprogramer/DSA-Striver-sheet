package com.manoj.strings;

public class ValidPalindrome {
    public boolean validPalindrome(String s){
        int low = 0;
        int high = s.length()-1;
        while(low <= high){
            int currCharacter = s.charAt(low);
            int lastCharacter = s.charAt(high);
            if(!Character.isLetterOrDigit(currCharacter)) low++;
            else if(!Character.isLetterOrDigit(lastCharacter)) high--;
            else {
                if(Character.toLowerCase(currCharacter) != Character.toLowerCase(lastCharacter)) return false;
                low++;
                high--;
            }

        }
        return true;
    }
}
//A man, a plan, a canal: Panama
