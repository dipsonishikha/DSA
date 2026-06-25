// Leetcode 1962
// You are given an m x n matrix maze (0-indexed) with empty cells (represented as '.') and walls (represented as '+').
//  You are also given the entrance of the maze, where entrance = [entrancerow, entrancecol] denotes the row and column of the cell 
//  you are initially standing at.

// In one step, you can move one cell up, down, left, or right. 
// You cannot step into a cell with a wall, and you cannot step outside the maze. 
// Your goal is to find the nearest exit from the entrance. An exit is defined as an empty cell that is at the border of the maze.
//  The entrance does not count as an exit.

// Return the number of steps in the shortest path from the entrance to the nearest exit, or -1 if no such path exists.

// TestCase 1-maze = [["+","+",".","+"],[".",".",".","+"],["+","+","+","."]], entrance = [1,2] Output=1;

// TestCase 2-: maze=[["+","+","+"],[".",".","."],["+","+","+"]], entrance = [1,0] Output=2;
import java.util.*;
class ne {
    public static int nearestExit(char[][] maze, int[] e){
        int n=maze.length,m=maze[0].length; 
        // no. of rows=n and m=no. of cols;

        int u=e[0],v=e[1];
        // x and y coordinate of entrace;
        Queue<int[]> q=new LinkedList<>();
        boolean[][] vis=new boolean[n][m];
        // declaring queue and visited array;
        q.offer(new int[]{u,v,0});
        vis[u][v]=true;
        // added the source and distance 0 to the q.
        int[] dx={0,0,-1,1};
        int[] dy={-1,1,0,0};
        // traversal array which helps us traverse up,down,right,left;
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int x=curr[0];
            int y=curr[1];
            int d=curr[2];

            if((x==0 || y==0 || x==n-1 || y==m-1) && !(x==u && y==v)) return d;
            // boundary condition i mean if they reached the bourdary that means they reached exit right?
            for(int i=0;i<4;i++){
                int movex=dx[i]+x;
                int movey=dy[i]+y;
                if(movex>=0 && movey>=0 && movex<n && movey<m && maze[movex][movey]=='.'){
                    // checking if the index is reachable and valid.
                    if(!vis[movex][movey]){
                        q.offer(new int[]{movex,movey,d+1});
                        vis[movex][movey]=true;
                    }
                }
            }

        }
        return -1;

    }
    public static void main(String[] args){
            char[][] maze = {
            {'+','+','.','+'},
            {'.','.','.','+'},
            {'+','+','+','.'}
            };
            int[] e={1,2};
            int ans=nearestExit(maze, e);
            System.out.println(ans);
    }
}