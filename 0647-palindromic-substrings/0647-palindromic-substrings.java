class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        boolean t[][]=new boolean[n][n];
        int c=0;

        for(int L=1; L<=n; L++){
            for(int i=0; i+L-1<n; i++){
                int j=i+L-1;

                if(L==1){
                    t[i][j]=true;
                }else if(L==2){
                    t[i][j]=(s.charAt(i)==s.charAt(j));
                }else{
                    t[i][j]=((s.charAt(i)==s.charAt(j)) && t[i+1][j-1]);
                }

                if(t[i][j])
                c++;
            }
        }
        return c;
    }
}