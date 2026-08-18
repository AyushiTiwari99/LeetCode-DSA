class Solution {
    public int largestInteger(int[] nums, int k) {
        int ans=-1;
        HashMap<Integer, Integer>freq=new HashMap<>();
        for(int x: nums){
            freq.put(x, freq.getOrDefault(x,0)+1);
        }
        int n=nums.length;
        int max=-1;
        if(k==1){
            for(int x:nums){
                if(freq.get(x)==1){
                    max=Math.max(max, x);
                }
            }
            return max;
        }else if(k==n){
            for(int x:nums){
                max=Math.max(max,x);
            }
            return max;
        }else{
            int first=nums[0];
            int last=nums[n-1];
            if(freq.get(first)==1 && freq.get(last)==1)
            return Math.max(first, last);
            else if(freq.get(first)==1 && freq.get(last)!= 1)
            return first;
            else if(freq.get(first) != 1 && freq.get(last)==1)
            return last;
            else
            return -1;
        }
        
    }
}