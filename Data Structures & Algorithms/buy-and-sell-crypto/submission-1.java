class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;

        int maxVal = 0;

        while(j < prices.length){
            int val = prices[j] - prices[i];

            if(val <= 0){
                i = j; 
                j++;
            }
            else{
                maxVal = Math.max(maxVal, val);
                j++;
            }
        }
        return maxVal;
    }
}
