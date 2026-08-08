class Solution {
    int n;
    int dp[][]=new int[2501][2501];

    int solve(int[] nums, int i, int prev){

        if(i>=n){
            return 0;
        }

        if(prev != -1 && dp[i][prev] != -1)
        return dp[i][prev];

        int take=0;
        if(prev==-1 || nums[i]>nums[prev]){
            take=1+solve(nums, i+1, i);
        }
        int skip=solve(nums, i+1, prev);

        if(prev !=-1)
        dp[i][prev]=Math.max(skip, take);

        return Math.max(skip, take);
    }
    public int lengthOfLIS(int[] nums) {

        for(int i = 0; i < dp.length; i++) {
          Arrays.fill(dp[i], -1);
        }
        
        n=nums.length;

        return solve(nums, 0, -1);
    }
}