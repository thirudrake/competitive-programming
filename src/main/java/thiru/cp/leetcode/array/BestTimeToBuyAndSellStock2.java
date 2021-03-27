package thiru.cp.leetcode.array;

/*
  Best Time to Buy and Sell Stock II
  https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
*/

public class BestTimeToBuyAndSellStock2 {

    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        int currentBuyIndex = 0;
        int currentProfit = 0;
        int currentSellIndex = 1;
        while (currentSellIndex < prices.length){
            if(prices[currentSellIndex] > prices[currentBuyIndex]){
                if(currentProfit < (prices[currentSellIndex] - prices[currentBuyIndex])){
                    currentProfit = prices[currentSellIndex] - prices[currentBuyIndex];
                    currentSellIndex++;
                }
                else {
                    totalProfit += currentProfit;
                    currentProfit = 0;
                    currentBuyIndex = currentSellIndex;
                    currentSellIndex = currentBuyIndex + 1;
                }
            }
            else {
                totalProfit += currentProfit;
                currentProfit = 0;
                currentBuyIndex = currentSellIndex;
                currentSellIndex = currentBuyIndex + 1;
            }
        }
        totalProfit += currentProfit;
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

        prices = new int[]{1, 2, 3, 4, 5};
        System.out.println(maxProfit(prices));

        prices = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));

        prices = new int[]{2,4,1};
        System.out.println(maxProfit(prices));
    }
}
