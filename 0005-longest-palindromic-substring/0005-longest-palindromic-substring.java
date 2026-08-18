class Solution {
    boolean check(String s,int i, int j){
        if(i>=j)
        return true;

        if(s.charAt(i)==s.charAt(j))
        return check(s,i+1, j-1);
        else
        return false;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxLen=0;
        int sp=-1;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(check(s, i, j)){
                    if((j-i+1)>maxLen){
                        sp=i;
                        maxLen=j-i+1;
                    }
                }
            }
        }
        return s.substring(sp, sp+maxLen);
    }
}