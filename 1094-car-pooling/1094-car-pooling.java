class Solution {
    int findmax(int[][] trips){
        int max=Integer.MIN_VALUE;
        for(int[] trip: trips){
            max=Math.max(max, trip[2]);
        }
        return max;
    }
    public boolean carPooling(int[][] trips, int capacity) {
        int maxval=findmax(trips);
        int[] diff=new int[maxval+2];
        for(int[] t: trips){
            int from=t[1];
            int to=t[2];
            int x=t[0];

            diff[from]+=x;
            diff[to]-=x;
        }

        int curr=0;
        for(int i=0; i<maxval; i++){
           curr+=diff[i];
           if(curr>capacity)
           return false;
        }
        return true;
    }
}