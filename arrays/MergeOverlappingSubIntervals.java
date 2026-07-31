package com.manoj.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MergeOverlappingSubIntervals {
    public void mergeOverlappingSubIntervalsBruteForceApproach(List<List<Integer>> intervals) {
        intervals.sort((a,b) -> Integer.compare(a.get(0),b.get(0)));
        System.out.println(intervals);
        List<List<Integer>> sol = new ArrayList<>();
        for(int i= 0; i < intervals.size(); i++) {
            int start = intervals.get(i).get(0);
            int end = intervals.get(i).get(1);
            if(!sol.isEmpty() && (end <= sol.get(sol.size()-1).get(1)))
                continue;
            for(int j = i+1; j < intervals.size(); j++) {
                if(intervals.get(j).get(0) <= end)
                    end = intervals.get(j).get(1);
                else break;
            }
            sol.add(List.of(start,end));
        }
        System.out.println(sol);
    }
    public void mergeOverlappingSubIntervalsOptimalApproach(List<List<Integer>> intervals) {
        intervals.sort((a,b) -> Integer.compare(a.get(0),b.get(0)));
        List<List<Integer>> sol = new ArrayList<>();
        for(int i = 0; i < intervals.size(); i++) {
            if(sol.isEmpty() || intervals.get(i).get(0) > sol.get(sol.size()-1).get(1)){
                sol.add(intervals.get(i));
            }
            else {
                sol.get(sol.size()-1).set(1,Math.max(intervals.get(i).get(1),sol.get(sol.size()-1).get(1)));
            }
        }
        System.out.println(sol);
    }
}
