package Recursion;

public class lac_54 {
    // factorial using recursion
    static long factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    // power of 2 using recursion
    static int powerOfwo(int n){
        if(n == 0){
            return 1;
        }
        return 2 * powerOfwo(n-1);
    }
    //fibonacci number
    static int fibonacci(int n){
        if(n == 0){
            return  0;
        }
        if(n == 1){
            return  1;
        }
       int ans =  fibonacci(n-1) + fibonacci(n-2);
        return ans;
    }
    static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
        System.out.println(powerOfwo(5));
        System.out.println(fibonacci(4));
    }
}
