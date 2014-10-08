//Say you have an array for which the ith element is the price of a given stock on day i.
//Design an algorithm to find the maximum profit. 
//You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). 
//However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

class Solution {
public:
    int maxProfit(vector<int> &prices) {
        if(prices.size() == 0){
            return 0;
        }
        int max = 0;
        int status = 0;
        int buy = prices[0];
        int sell = prices[0];
        for(int i = 1;i < prices.size();i ++){
            if(status == 0 && buy >= prices[i]){
                buy = prices[i];
                sell = prices[i];
		        continue;
            }else if(status == 0){
                status = 1;
            }
            if(status == 1 && sell <= prices[i]){
                sell = prices[i];
            }else if(status == 1){
                max = max + sell - buy;
                sell = prices[i];
	        	buy = prices[i];
                status = 0;
            }
        }
        max = max + sell - buy;
        return max;
    }
};
