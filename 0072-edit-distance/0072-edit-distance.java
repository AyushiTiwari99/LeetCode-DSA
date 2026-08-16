class Solution {
    int m,n;
    int dp[][]=new int[501][501];

    int solve(String s1, String s2, int i, int j){
        if(i==m){
            return n-j;  //Insert in s1
        }
        if(j==n){
            return m-i; //Delete from s1
        }

        if(dp[i][j] != -1)
        return dp[i][j];

        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=solve(s1,s2, i+1, j+1);
        }

        int insert=1+solve(s1, s2, i, j+1);
        int delete=1+solve(s1, s2, i+1, j);
        int replace=1+solve(s1, s2, i+1, j+1);

        return dp[i][j]=Math.min(insert, Math.min(delete, replace));       
    }
    public int minDistance(String word1, String word2) {
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }

        m=word1.length();
        n=word2.length();

        return solve(word1, word2, 0, 0);
    }
}