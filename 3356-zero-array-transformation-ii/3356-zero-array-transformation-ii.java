class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int m=queries.length;

        boolean zeros=true;
        for(int x:nums){
            if(x!=0){
                zeros=false;
                break;
            }
        }
        if(zeros) return 0;

        int low=1;
        int high=m;
        int ans=-1;

        while(low <= high){
            int mid=low+(high-low)/2;

            if(diffArrayTech(nums, queries, mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    boolean diffArrayTech(int[] nums, int[][] queries, int k){
        int n=nums.length;
        int[] diff=new int[n+1];

        for(int i=0; i<k; i++){
            int l=queries[i][0];
            int u=queries[i][1];
            int x=queries[i][2];

            diff[l] += x;
            if(u+1<n)
            diff[u+1] -= x;
        }

        if(diff[0] < nums[0])
        return false;

        for(int i=1; i<n; i++){
            diff[i]+=diff[i-1];
            
            if(diff[i]<nums[i])
            return false;
        }
        return true;
    }
}