// Leetcode 300-Longest Increaasing Subsequence
// An arrays is given our task is to return the maximum possible length of a subsequence.
// TestCase1-[10,9,2,5,3,7,101,18]--[2,5,7,101] hence length 4.
// TestCase2-[0,1,0,3,2,3]--[0,1,2,3] length 4;

// all ways --recursion i.e,pick not pick procedure

//  [10,101] [9,101] [2,5,7,101] [5,7,101] [3,7,101] [7,101] [101] [18] []
class Lis{
    public static int solve(int[] nums,int idx,int prev){
        if (idx==nums.length) {
            return 0;
        }
        int pick=0;
        int notpick=solve(nums,idx+1,prev);
        if(prev ==-1 || nums[idx]>nums[prev]){
            pick=1+solve(nums,idx+1,idx);
        }
        return Math.max(pick,notpick);
    }
    public static int Lis(int[] nums){
        return solve(nums,0,-1);
    }
    public static void main(String[] args) {
        int[] arr={10,9,2,5,3,7,101,18};
        int ans=Lis(arr);
        System.out.println(ans);
    }
}
// Time complexity--O(2^n);
// Spqce complexity--O(n)--recursive stack;
// Memoization

