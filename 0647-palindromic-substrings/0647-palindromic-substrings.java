class Solution {
    boolean isPalin(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        return s.equals(sb.toString());
    }
    public int countSubstrings(String s) {
        int n=s.length();
        int c=0;
        for(int i=0; i<n; i++){
            String sub="";
            for(int j=i; j<n; j++){
                sub=s.substring(i, j+1);
                if(isPalin(sub))
                c++;
            }
        }
        return c;
    }
}