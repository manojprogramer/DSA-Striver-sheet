package com.manoj.recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> palindromePartitioning(String string){
        List<List<String>> ans =new ArrayList<>();
        palindromePartition(0,string,new ArrayList<>(),ans);
        return ans;
    }
    public void palindromePartition(int index, String string, List<String>list, List<List<String>>ans){
        if(index == string.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int j = index; j < string.length(); j++){
            if (isPalindrome(index,j,string)){
                list.add(string.substring(index,j+1));
                palindromePartition(j+1,string,list,ans);
                list.remove(list.size()-1);
            }
        }
    }

    private boolean isPalindrome(int index, int j, String string) {
        while(index <= j){
            if(string.charAt(index) != string.charAt(j))
                return false;
            index++;
            j--;
        }
        return true;
    }

}
