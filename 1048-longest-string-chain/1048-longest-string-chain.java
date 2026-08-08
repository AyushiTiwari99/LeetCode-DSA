class Solution {
    int n;
    int dp[][]=new int[1001][1001];

    boolean checkP(String s1, String s0){
        int m=s0.length();
        int n=s1.length();

        if(m>n ||(n-m) != 1)
        return false;

        int i=0, j=0;
        while(i<n && j<m){
            if(s1.charAt(i)==s0.charAt(j))
            j++;

            i++;
        }
        return (j==m);
    }
    int solve(String[] str, int i, int p){
        if(i>=n){
            return 0;
        }

        if(p !=-1 && dp[i][p] != -1)
        return dp[i][p];

        int take=0;

        if(p==-1|| checkP(str[i], str[p]))
        take=1+solve(str, i+1, i);

        int skip=solve(str, i+1, p);

        if(p !=-1)
        dp[i][p]=Math.max(skip, take);

        return Math.max(skip, take);
    }
    public int longestStrChain(String[] words) {
        n=words.length;

         for(int i = 0; i < dp.length; i++) {
          Arrays.fill(dp[i], -1);
        }

        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));

        return solve(words, 0, -1);
    }
}