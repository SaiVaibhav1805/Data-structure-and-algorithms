class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int max_profit=0;
        int n=prices.length;
        int min=prices[0];
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            profit=prices[i]-min;
            if(max_profit<profit){
                max_profit=profit;
            }
        }
        return max_profit;

    }
}