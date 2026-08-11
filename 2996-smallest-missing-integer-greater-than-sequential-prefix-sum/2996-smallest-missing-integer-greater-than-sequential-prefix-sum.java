class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int x=nums[0];
        int sum=x;
        for(int i=1; i<n; i++){
            if(nums[i] != x+i){
                break;
            }

            sum+=nums[i];
        }
        Arrays.sort(nums);
        int ans = sum;

        while (true) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (nums[i] == ans) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return ans;
            }
            ans++;
        }
    }
}