
//you wanna maximize the profit by choosing a single day to buy one stock and choosing a different day 
//in the future to sell that stock. Return the max profit you can achieve from the transition. if You can't 
//achieve any profit , return 0;
//Prices = [7, 1, 5, 3, 6, 4]


public class buyAndSell {
    public static int profit(int prices[]){
        int max_profit = Integer.MIN_VALUE;
        int buy_price = Integer.MAX_VALUE;


        for(int i = 0 ; i < prices.length ; i++){
            if(buy_price < prices[i]){
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            } else {
                buy_price = prices[i];
            }
        }

        return max_profit;

    }

    public static void main(String[] args) {
        int a[] = {7, 1, 5, 3, 6, 4};
        int max_profit = profit(a);
        System.out.println("max profit is " + max_profit);
    }
}