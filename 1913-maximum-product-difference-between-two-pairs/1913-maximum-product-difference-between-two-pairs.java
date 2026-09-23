class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=nums[0];
        int b=nums[1];
        int c=nums[n-1];
        int d=nums[n-2];

        int p1=a*b;
        int p2=c*d;

        return p2-p1;
    }
}