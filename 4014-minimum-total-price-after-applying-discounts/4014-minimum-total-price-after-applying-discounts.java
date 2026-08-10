class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int n=prices.length;
        int m=discounts.length;

        int x=Math.min(n,m);
        
        double sum=0;
        for(int i=Math.min(n,m)-1; i>=0; i--){
            sum += (prices[n - 1 - i] * (100.0 - discounts[m - 1 - i])) / 100.0;
        }

        if(n>m){
            for(int i=0; i<n-m; i++){
                sum+=prices[i];
            }
        }
        return sum;
    }
}