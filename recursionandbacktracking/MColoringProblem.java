package com.manoj.recursionandbacktracking;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MColoringProblem {
    public boolean mColoringProblem(int V, int m, int[][] edges){
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < V; i++){
            graph.add(new ArrayList<>(Collections.nCopies(V+1,0)));
        }
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).set(v,1);
            graph.get(v).set(u,1);
        }
        int[] color = new int[V];
        return solve(0,graph,color,m);
    }

    private boolean solve(int node, List<List<Integer>> graph, int[] color, int m) {
        if(node == graph.size()) return true;
        for(int i = 1; i <= m; i++){
            if(isSafe(node,graph,color,i))
            {
                color[node] = i;
                if(solve(node+1,graph,color,m))
                    return true;
                color[node] = 0;
            }
        }
        return false;

    }

    private boolean isSafe(int node, List<List<Integer>> graph, int[] color, int col) {
        for(int i = 0; i < graph.size(); i++)
        {
            if(graph.get(node).get(i) == 1 && color[i] == col) return false;
        }
        return true;
    }

}
