class Solution {
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length;
        int dp[]=new int[n+1];

        Arrays.fill(dp, 1);

        int maxL=1;

        Arrays.sort(pairs, (a,b)-> Integer.compare(a[0], b[0]));

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(pairs[j][1] < pairs[i][0]){
                    dp[i]=Math.max(dp[i], dp[j]+1);
                    maxL=Math.max(maxL, dp[i]);
                }
            }
        }
        return maxL;
    }
}