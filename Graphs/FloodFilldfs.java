

class Solution{
    private static int n;
    private static int m;
    public static void dfs(int i,int j,int[][] image,int color,int oldcolor){
        if(image[i][j]==oldcolor){
        image[i][j]=color;
        if(j+1<m) dfs(i,j+1,image,color,oldcolor);
        if(i+1<n) dfs(i+1,j,image,color,oldcolor);
        if(i-1>=0) dfs(i-1,j,image,color,oldcolor);
        if(j-1>=0) dfs(i,j-1,image,color,oldcolor);
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color){
        n=image.length;
        m=image[0].length;
        int oldcolor=image[sr][sc];
        if(oldcolor==color) return image;
        dfs(sr,sc,image,color,oldcolor);
        return image;
    }
        public static void main(String[] args){
        int[][] image={{1,1,1},{1,1,0},{1,0,1}};
        n=image.length;
        m=image[0].length;
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