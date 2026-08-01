class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int ans[]=new int[n];
        int x=-1;
        for(int[] arr: queries){
            int l=arr[0];
            int u=arr[1];

            ans[l]+=x;
            if(u+1<n)
            ans[u+1]-=x;
        }
        for(int i=1; i<n; i++){
            ans[i]+=ans[i-1];
        }
        for(int i=0; i<n; i++){
            if(-ans[i] < nums[i])
            return false;
        }
        return true;
    }
}