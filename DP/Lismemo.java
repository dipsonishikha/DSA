// memoization -(remebering the answer of prev solved question);
import java.util.*;
class Lismemo{
    public static int solve(int[] nums,int idx,int prev,int[][] dp){
        if (idx==nums.length) {
            return 0;
        }
        if(dp[idx][prev+1]!=-1) return dp[idx][prev+1];
        int pick=0;
        int notpick=solve(nums,idx+1,prev,dp);
        // the not picking case here we voluntarily donot pick the element at curr index.
        if(prev ==-1 || nums[idx]>nums[prev]){
            // for pick condition there are only 2 condition possible 1.either we have no element pick
            // yet or the curr element is greater than the prev element(increasing).
            pick=1+solve(nums,idx+1,idx,dp);
        }
        return dp[idx][prev+1]=Math.max(pick,notpick);
    }
    public static int Lis(int[] nums){
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return solve(nums,0,-1,dp);
    }
    public static void main(String[] args) {
        int[] arr={10,9,2,5,3,7,101,18};
        int ans=Lis(arr);
        System.out.println(ans);
    }
}

