package Recursion;

public class lac_56 {
    static int climbStairs(int n){
        if(n == 1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int ans = climbStairs(n-1) + climbStairs(n-2);
        return  ans;
    }
    static void main(String[] args) {
     int n = 5;
        System.out.println(climbStairs(n));
    }
}
