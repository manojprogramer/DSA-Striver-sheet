package com.manoj.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public String permutationSequence(int n, int k){
        int fact = 1;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < n; i++)
        {
            list.add(i);
            fact = fact*i;
        }
        list.add(n);
        k = k-1;
        StringBuilder stringBuilder = new StringBuilder();
        while (!list.isEmpty()){
            int index  = k/fact;
            stringBuilder.append(list.get(index));
            k = k % fact;
            list.remove(index);
            if(list.isEmpty()) break;
            fact = fact/ list.size();
        }
        return stringBuilder.toString();
    }
}
