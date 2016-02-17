class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        if(prices.length <= 1) {
            return 0;
        }
        
        int first = prices[0];
        int last;
        int sum = 0;
        
        for(int i = 1; i < prices.length; i++) {
            last = prices[i];
            if(first > last) {
                first = last;
            } else {
                sum = sum + last - first;
                first = last;
            }
        }
        return sum;
    }
}
