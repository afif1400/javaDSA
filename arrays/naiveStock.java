package arrays;

public class naiveStock {
  public static int maxProfit(int[] price, int start, int end){
    if(end <= start){
      return 0;
    }
    int profit = 0;
    for(int i=0;i<end;++i){
      for(int j=i+1;j<=end;++j){
        if(price[j] > price[i]){
          int curr_profit = price[j] - price[i] + maxProfit(price,start,i-1) + maxProfit(price, j+1, end);
          // profit = Math.max(profit,curr_profit);
          if(curr_profit > profit){
            profit = curr_profit;
          }
        }
      }
    }
    return profit;
  }

  public static void main(String[] args){
    int[] arr = {1,5,3,8,12};
    int p = maxProfit(arr,0,4);
    // System.out.println(p);
  }
}
