class Solution {
    public int maximumPopulation(int[][] logs) {
        int diff[]=new int[2051];
        int max=-1;

        for(int[] arr: logs){
            int l=arr[0];
            int r=arr[1];

            diff[l]++;
            diff[r]--;
        }
        for(int i=1; i<2051; i++){
            diff[i]=diff[i]+diff[i-1];
        }
        int year=0;
        for(int i=2050; i>=1950; i--){
            if(diff[i]>=max){
                max=diff[i];
                year=i;
            }
        }
        return year;
    }
}