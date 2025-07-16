class Solution {
public:
    int maxProfit(vector<int>& prices) 
    {
        int minPrice = INT_MAX;
    int maxProfit = 0;

    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price; // update buying day
        } else {
            int profit = price - minPrice; // selling today
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
    }
    return maxProfit;
        
    }
};