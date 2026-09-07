package com.manoj.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Data {
    int start;
    int end;
    int pos;
}
public class NMeetingsOneRoom {
    public int nMeetingsOneRoom(int[] start, int[] end){
        Data[] arr = new Data[start.length];
        for(int i = 0; i < start.length; i++){
            arr[i] = new Data();
            arr[i].start = start[i];
            arr[i].end = end[i];
            arr[i].pos = i+1;
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a.end,b.end));
        List<Integer> list = new ArrayList<>();
        int count = 1, freeTime = arr[0].end;
        list.add(arr[0].end);
        for(int i = 1; i < arr.length; i++){
            if(arr[i].start > freeTime){
                count++;
                freeTime = arr[i].end;
                list.add(arr[i].pos);

            }
        }
        return count;
    }
}
