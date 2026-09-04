package Recursion;

public class lac_54 {
    // factorial
    static long factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
