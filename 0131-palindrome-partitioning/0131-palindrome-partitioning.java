class Solution {
    void solve(String s, int i, ArrayList<String> curr, boolean[][] t,List<List<String>> result){
        if(i==s.length()){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int j=i; j<s.length(); j++){
            if(t[i][j]==true){
                curr.add(s.substring(i, j+1));
                solve(s, j+1, curr, t, result);
                curr.remove(curr.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        int n=s.length();
        boolean t[][]=new boolean[n][n];

        for(int i=0; i<n; i++){
            t[i][i]=true;
        }

        for(int L=2; L<=n; L++){
            for(int i=0; i<n-L+1; i++){
                int j=i+L-1;
                if(s.charAt(i)==s.charAt(j)){
                    if(L==2){
                        t[i][j]=true;
                    }else{
                        t[i][j]=t[i+1][j-1];
                    }
                }
            }
        }
        List<List<String>> result=new ArrayList<>();
        ArrayList<String> curr=new ArrayList<>();
        solve(s, 0, curr, t, result);

        return result;
    }
}