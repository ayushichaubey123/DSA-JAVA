package arrays;

import java.util.*;

class Stocks {
    public static int maxProfit(int[] prices) {
        int maxP=0;
        int buyP = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i]> buyP){
                int profit= prices[i]-buyP;
                if(profit>maxP){
                    maxP=profit;
                }
            }else{
                buyP=prices[i];
            }
        }

        return maxP;
    }

    public static void main(String args[]){
        System.out.println("Enter the numeber of stock u want to enter:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("enter the stock" + j + ":");
            int a = sc.nextInt();
            prices[j] = a;
        }

        int results = maxProfit(prices);
        System.out.println("Max profit is: "+ results);
    }
}