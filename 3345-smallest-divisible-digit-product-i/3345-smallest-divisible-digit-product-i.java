class Solution {
    boolean check(int n,int t){
        int p=1;
        int dup=n;
        while(n>0){
            int d=n%10;
            p=p*d;
            n=n/10;
        }
        if(p%t==0)
        return true;
        else
        return false;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            if(check(n, t))
            return n;

            n=n+1;
        }
    }
}