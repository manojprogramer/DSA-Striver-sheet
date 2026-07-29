package com.manoj.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestOccurElement {
    public static void highestOccurElement(int[] nums) {
        Map<Integer,Integer> map =new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        List<List<Integer>> list = new ArrayList<>();
        for(int key : map.keySet()) {
            List<Integer> newList = new ArrayList<>();
            newList.add(key);
            newList.add(map.get(key));
            list.add(newList);
        }
        System.out.println(list);

    }
}
