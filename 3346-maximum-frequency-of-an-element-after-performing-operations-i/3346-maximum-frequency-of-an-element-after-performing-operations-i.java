class Solution {
    int maxelement(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max=Math.max(max, arr[i]);
        }
        return max;
    }
    public int maxFrequency(int[] nums, int k, int numOperations) {
        int n=nums.length;
        int maxVal=maxelement(nums)+k;
        int diff[]=new int[maxVal+2];
        HashMap<Integer, Integer>freq=new HashMap<>();

        for(int i=0; i<n; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

            int l=Math.max(nums[i]-k, 0);
            int r=Math.min(nums[i]+k, maxVal);

            diff[l]++;
            diff[r+1]--;
        }
        int result=1;

        for(int target=0; target<=maxVal; target++){
            diff[target]+=(target>0? diff[target-1]:0);

            int targetFreq = freq.getOrDefault(target, 0);
            int needConversion=diff[target]-targetFreq;

            int maxPossibleFreq=Math.min(needConversion, numOperations);

            result=Math.max(result, targetFreq+maxPossibleFreq);
        }
        return result;
    }
}