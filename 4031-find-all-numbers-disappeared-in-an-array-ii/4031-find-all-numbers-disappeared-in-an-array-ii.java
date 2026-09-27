class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);

        int prev=lower;

        for(int num:nums){
            if(num<prev) continue;

            if(num>upper) break;

            if(num>prev){
                res.add(Arrays.asList(prev, num-1));
            }
            prev=num+1;
        }
        if(prev<=upper){
            res.add(Arrays.asList(prev,upper));
        }
        return res;
    }
}