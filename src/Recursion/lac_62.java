package Recursion;

public class lac_62 {
    static int solve(int[] coins, int amount){
        if(amount == 0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        int mini = Integer.MAX_VALUE;
        for(int coin:coins){
            int recursionKaAns = solve(coins,amount-coin);
            if(recursionKaAns != Integer.MAX_VALUE){
                int ans = recursionKaAns +1;
                mini = Math.min(mini,ans);
            }
        }
        return mini;
    }
   static int coinChange(int[] coins, int amount) {
        int ans = solve(coins,amount);
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
    static void main(String[] args) {
        int[] coins = {1,2,5};
       int amount = 11;
        System.out.println(coinChange(coins,amount));

    }
}
