package day03;

import java.util.Arrays;
import java.util.List;

public class Stock {
    private List<Double> prices;

    public Stock(List<Double> prices) {
        this.prices = prices;
    }

    public double maxProfit() {
        double max = 0;
        for (int i = 0; i < prices.size(); i++) {
            for (int j = 1; j < prices.size(); j++) {
                if (max < prices.get(j) - prices.get(i)) {
                    max = prices.get(j) - prices.get(i);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
        System.out.println(stock.maxProfit());  //8.17

        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0));
        System.out.println(stock2.maxProfit()); //6.0
    }
}
