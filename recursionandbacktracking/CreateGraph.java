package com.manoj.recursionandbacktracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateGraph {
    public void createGraphUsingList(int V, int[][] edges){
        List<List<Integer>> matrix = new ArrayList<>();
        for(int i = 0; i <= V; i++){
            matrix.add(new ArrayList<>(Collections.nCopies(V+1,0)));
        }
        for(int[] it : edges){
            int u = it[0];
            int v = it[1];
            matrix.get(u).set(v,1);
            matrix.get(v).set(u,1);
        }
        System.out.println(matrix);

    }
    public void createGraphUsingAdjacencyMatrix(int V, int[][] edges){
        int[][] matrix = new int[edges.length][edges.length];
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
