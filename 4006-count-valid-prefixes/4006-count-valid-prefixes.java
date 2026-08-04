class Solution {
    boolean isValid(String s){
        int zero=0;
        int one=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                zero++;
            }else{
                one++;
            }
        }
        if(Math.abs(zero-one)<=1)
        return true;
        else
        return false;
    }
    public int countValidPrefixes(String s) {
        int n=s.length();
        int c=0;
        for(int i=0; i<n; i++){
           String sub=s.substring(0, i+1);
           if(isValid(sub)){
            c++;
           }
        }
        return c;
    }
}