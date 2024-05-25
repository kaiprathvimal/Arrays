import java.util.HashMap;

public class HashingLastTime {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        SolutionOk sol = new SolutionOk();
        System.out.println(sol.bestBuy(prices));
    }
}
class SolutionOk {
    public int bestBuy(int[] prices) {
        int buy = prices[0];
        int n= prices.length;
        int profit=0;
        for (int i = 0; i < n; i++) {
            if(prices[i] < buy) {
                buy = prices[i];
            }else if(prices[i] - buy > profit) {
                profit = prices[i] -1;
            }

        }
        return profit;
    }
}
