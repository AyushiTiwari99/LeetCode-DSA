class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int i=k;
        while(i<=101*k){
            if(!set.contains(i)){
                return i;
            }
            i=i+k;
        }
        return -1;
    }
}