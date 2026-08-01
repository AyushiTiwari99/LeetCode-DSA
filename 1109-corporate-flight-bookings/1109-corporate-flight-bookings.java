class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[]=new int[n];
        int m=bookings.length;

        for(int arr[]: bookings){
            int l=arr[0]-1;
            int u=arr[1]-1;
            int k=arr[2];

            ans[l]+=k;
            if(u+1<n){
                ans[u+1]-=k;
            }
        }

        for(int i=1; i<n; i++){
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}