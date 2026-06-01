// memoization -(remebering the answer of prev solved question);
class Listabulation{
    public static int Lis(int[] nums){
        int n=nums.length;
        int[][] dp=new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=-1;j--){
                int notpick=dp[i+1][j+1];
                int pick=0;
                if(j==-1 || nums[j]<nums[i]){
                    pick=1+dp[i+1][i+1];
                }
                dp[i][j+1]=Math.max(pick,notpick);
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
        int[] arr={10,9,2,5,3,7,101,18};
        int ans=Lis(arr);
        System.out.println(ans);
    }
}

