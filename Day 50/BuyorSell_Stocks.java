public class BuyorSell_Stocks {
    public static int BuyorSell(int prices[]){ //BRUTE FORCE METHOD
        //In this method we are buying and selling stock on each alternative day
        int currProfit = 0;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                currProfit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, currProfit);
            }
        }
        if(maxProfit<0){
                    return 0;
        } else 
        return maxProfit;
    }
    public static int BuyOrSellStocks(int prices[]){ //OPTIMIZED METHOD
        //In this method we will only buy the stock if price at i day is less than current buy price
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++){
            if(prices[i] < buyprice){ // check if current price is less than buyprice
                buyprice = prices[i]; // update buyprice
            }
            else{ 
                int profit = prices[i] - buyprice; // calculate profit
                maxProfit = Math.max(maxProfit, profit); // update maxProfit
            }
        }  
        return maxProfit; //finally returning our max profit
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        int MaximumProfit = BuyOrSellStocks(prices);
        System.out.println("MAXIMUM PROFIT POSSIBLE FROM THIS TRADE : " + MaximumProfit);
    }
}
