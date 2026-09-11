package Recursion;

public class lac_61 {
    static int solve(int amount, int[] coins,int i){
        if(amount == 0){
            return 1;
        }
        if(amount<0){
            return 0;
        }
        if(i>=coins.length){
            return 0;
        }
        int include = solve(amount-coins[i] , coins,i);
        int exclude = solve(amount, coins, i+1);
        int finalAns = include + exclude;
        return finalAns;
    }
  static int change(int amount, int[] coins) {
        int i = 0;
        int ans = solve(amount, coins,i);
        return ans;
    }
    static void main(String[] args) {
        int amount = 5;
        int[] coins = {1,2,5};
        System.out.println(change(amount,coins));

    }
}
