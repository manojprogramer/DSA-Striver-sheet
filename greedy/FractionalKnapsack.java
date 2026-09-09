package com.manoj.greedy;

import java.util.Arrays;

class Item {
    int val;
    int weight;
}
public class FractionalKnapsack {
    public double fractionalKnapsackSecondApproach(int[] val, int[] weight, int capacity){
        Integer[] index = new Integer[val.length];
        for(int i = 0; i < val.length; i++)
            index[i] = i;
        Arrays.sort(index, (a,b) ->{
            double rational1 = (double) (val[a])/weight[a];
            double rational2 = (double) (val[b]/weight[b]);
            return Double.compare(rational2,rational1);
        });
        double total = 0;
        for(Integer i : index) {
            if(weight[i] <= capacity){
                total += val[i];
                capacity -= weight[i];
            }
            else {
                total += (double) (val[i]/weight[i])*capacity;
                break;
            }
        }
        return total;

    }
     public double fractionalKnapsack(int[] val, int[] weight, int capacity){
         Item[] item = new Item[val.length];
         for(int i = 0; i < val.length; i++){
             item[i] = new Item();
             item[i].val = val[i];
             item[i].weight = weight[i];
         }
         Arrays.sort(item,(a,b)->{
             double rational1 = (double) (a.val)/a.weight;
             double rational2 = (double) (b.val)/b.weight;
             return Double.compare(rational2,rational1);
         });
         double total = 0;

         for(Item i : item) {
             if(i.weight <= capacity){
                 total += i.val;
                 capacity -= i.weight;
             }
             else {
                 total += (double) (i.val/i.weight)*capacity;
                 break;
             }
         }
        return total;
     }
}
