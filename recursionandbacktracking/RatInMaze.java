package com.manoj.recursionandbacktracking;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
    public List<String> ratInMaze(int[][] maze){
        List<String> ans = new ArrayList<>();
        int[][] visited = new int[maze.length][maze.length];
        solve(0,0,maze,visited,ans,"");
        return ans;

    }

    private void solve(int i, int j, int[][] maze, int[][] visited, List<String> ans, String path) {
        int n = maze.length;
        if(i == n-1 && j == n-1){
            ans.add(path);
            return;
        }
//        Down
        if(i+1 < n && maze[i+1][j] == 1 && visited[i+1][j] != 1){
            path += "D";
            visited[i+1][j] = 1;
            solve(i+1,j,maze,visited,ans,path);
            visited[i+1][j] = 0;
        }
//        Left
        if(j-1 >= 0 && maze[i][j-1] == 1 && visited[i][j-1] != 1){
            path += "L";
            visited[i][j-1] = 1;
            solve(i,j-1,maze,visited,ans,path);
            visited[i][j-1] = 0;
        }
//        Right
        if(j+1 < n && maze[i][j+1] == 1 && visited[i][j+1] != 1){
            path += "R";
            visited[i][j+1] = 1;
            solve(i,j+1,maze,visited,ans,path);
            visited[i][j+1] = 0;
        }
        if(i-1 >= 0 && maze[i-1][j] == 1 && visited[i-1][j] != 1){
            path += "U";
            visited[i-1][j] = 1;
            solve(i-1,j,maze,visited,ans,path);
            visited[i-1][j] = 0;
        }

    }
}
