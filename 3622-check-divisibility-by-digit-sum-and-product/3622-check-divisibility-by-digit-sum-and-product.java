class Solution {
    public boolean checkDivisibility(int n) {
        int dup=n;
        int p=1;
        int s=0;
        while(n!=0){
            int d=n%10;
            p=p*d;
            s=s+d;
            n=n/10;
        }
        int sum=s+p;
        if(dup%sum==0)
        return true;
        else
        return false;
    }
}