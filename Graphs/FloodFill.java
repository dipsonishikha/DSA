// Leetcode -733

// You are given an image represented by an m x n grid of integers image, where image[i][j] represents the pixel value of the image. You are also given three integers sr, sc, and color. Your task is to perform a flood fill on the image starting from the pixel image[sr][sc].

// To perform a flood fill:

//     Begin with the starting pixel and change its color to color.
//     Perform the same process for each pixel that is directly adjacent (pixels that share a side with the original pixel, 
//     either horizontally or vertically) and shares the same color as the starting pixel.
//     Keep repeating this process by checking neighboring pixels of the updated pixels and modifying their color 
//     if it matches the original color of the starting pixel.
//     The process stops when there are no more adjacent pixels of the original color to update.

// Return the modified image after performing the flood fill.


// Input: image = [[1,1,1],
                //[1,1,0],
                //[1,0,1]]
                //   sr = 1, sc = 1,
                //    color = 2

// Output: [[2,2,2],[2,2,0],[2,0,1]]


// So in the given question we are give with 1,0 graph,source index and color-->we gotta change the cell of source index and 
// all its neighbouring indexes to the given new color.
// so i will store the color at source index--if incase the source index ka color is same as the given color mtlb the grid require 
// no change right?(edge case)...
// else we could run a bfs on the grid from the source index as in if we encouter oldcolor in neighbouring of source index,we color
// that to new color and push it to the queue.

// code bfs approch.
import java.util.*;
class Solution{
    public static int[][] floodFill(int[][] image, int sr, int sc, int color){
           int n=image.length;
           int m=image[0].length;
           int oldcolor=image[sr][sc];
           if(oldcolor==color) return image;
           int[] dx={0,0,-1,1};
           int[] dy={-1,1,0,0};
        //    arrays to help traversal up,down,right,left.
           Queue<int[]> q=new LinkedList<>();
           q.offer(new int[]{sr,sc});
           image[sr][sc]=color;
           while(!q.isEmpty()){
            int[] curr=q.poll();
            int x=curr[0];
            int y=curr[1];
            for(int i=0;i<4;i++){
                int movex=x+dx[i];
                int movey=y+dy[i];
                if(movex>=0 && movey>=0 && movex<n && movey<m && image[movex][movey]==oldcolor){
                    image[movex][movey]=color;
                    // this works same as visited array.
                    q.offer(new int[]{movex,movey});
                }
            }
           }
        return image;
    }
    public static void main(String[] args){
        int[][] image={{1,1,1},{1,1,0},{1,0,1}};
        int n=image.length;
        int m=image[0].length;
        int sr=0;
        int sc=0;
        int color=2;
        floodFill(image,sr,sc,color);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// Timecomplexity-O(n*m);
// SpaceComplexity-:O(n*m);