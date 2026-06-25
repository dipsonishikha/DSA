//  leetcode-209 Minimum Subarray sum 
// Given an array of positive integers nums and a positive integer target, 
// return the minimal length of a whose sum is greater than or equal to target. 
// If there is no such subarray, return 0 instead.
// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
class minisubarraysum{
    public static int minSubArrayLen(int target, int[] nums){
       int i=0,j=0,sum=0;
       int mini=Integer.MAX_VALUE;
       int n=nums.length;
       while(j<n){
        sum+=nums[j];
        while(sum>=target){
            int length=j-i+1;
            mini=Math.min(mini,length);
            sum-=nums[i];
            i++;
        }
        j++;
       }
       return mini == Integer.MAX_VALUE ? 0 : mini;
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        int result=minSubArrayLen(target, nums);
        System.out.println(result);
    }}
