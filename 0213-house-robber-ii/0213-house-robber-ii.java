class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1)
        return nums[0];

        int[] dp=new int[n+1];

        //case1: Take 1st house
        for(int i=1; i<=n-1; i++){
            int skip=dp[i-1];
            int take=nums[i-1]+(i-2>=0 ? dp[i-2]:0);

            dp[i]=Math.max(skip, take);
        }

        int ans1=dp[n-1];

        Arrays.fill(dp,0);

        //case2: Skip 1st house hence you can take last house
        for(int i=2; i<=n; i++){
            int skip=dp[i-1];
            int take=nums[i-1]+(i-2>=0 ? dp[i-2]:0);

            dp[i]=Math.max(skip, take);
        }
        int ans2=dp[n];

        return Math.max(ans1, ans2);
    }
}