import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int []prefix=new int[n];
        int []suffix=new int[n];
        prefix[0]=prices[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.min(prefix[i-1],prices[i]);
        }
        suffix[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],prices[i]);
        }
        int profit=0;
        for(int i=0;i<n;i++){
            profit=Math.max(profit,suffix[i]-prefix[i]);
        }
        return profit;
    }
}