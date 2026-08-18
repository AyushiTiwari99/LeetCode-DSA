class Solution {
    int solve(String s){
       int i = 0;
       int j = s.length() - 1;
       int moves = 0;

       while (i < j) {
        int diff = Math.abs(s.charAt(i) - s.charAt(j));

        moves += Math.min(diff, 26 - diff);

        i++;
        j--;
    }

    return moves;

    }
    public int minOperations(String s) {
        int n=s.length();
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int moves=solve(s);
            ans=Math.min(ans, i+moves);
            s=s.substring(1)+s.charAt(0);
        }
        return ans;
    }
}