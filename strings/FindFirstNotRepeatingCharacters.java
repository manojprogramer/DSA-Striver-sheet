package com.manoj.strings;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNotRepeatingCharacters {
    public String findFirstNotRepeatingCharacters(String s){
        Map<Character,Integer>map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                break;
            }
            map.put(s.charAt(i),i);
            stringBuilder.append(s.charAt(i));

        }
        return new String(stringBuilder);
    }
}
