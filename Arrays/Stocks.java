public class Stocks {
    public static int maxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxiMumProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            } else {
                int profit = prices[i] - buyPrice; // calculating profit
                maxiMumProfit = Math.max(profit, maxiMumProfit);

            }
        }
        return maxiMumProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("The maximum profit will be " + maxProfit(prices));
    }
}

// Time complexity = O(n)
// Space complexity = O(1)