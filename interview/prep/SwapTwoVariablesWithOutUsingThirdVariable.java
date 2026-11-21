package com.manoj.interview.prep;

import java.util.ArrayList;
import java.util.List;

public class SwapTwoVariablesWithOutUsingThirdVariable {
    public List<Integer> swapTwoVariablesWithOutUsingThirdVariable(int a, int b){
         a = a+b;
         b = a-b;
         a = a-b;
         return new ArrayList<>(List.of(a,b));
    }
}
