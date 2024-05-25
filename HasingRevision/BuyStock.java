package HasingRevision;

public class BuyStock {
    public static void main(String[] args) {
       int[] prices = {7,1,5,3,6,4};
       Solutions sol = new Solutions();
        System.out.println(sol.buySell(prices));
    }
}
class Solutions {
    public int buySell(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[1]<buy){
                buy = prices[i];
            }else if(prices[i] - buy > profit){
                profit = prices[i] - 1;
            }
        }
        return profit;
    }
}