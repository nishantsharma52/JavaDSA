package javabasics;

public class Methods {
    static void print2KaTable (){
        for (int i=1; i<=10; i++){
            System.out.println("->" + 2*i);
        }
    }

    static void printSum(int x, int y) {
        System.out.println("SUM=" + (x+y));
    }

    // non-void return-type
    static int mul(int a, int b) {
        int res = a*b;
        return res;
    }
    // METHOD OVERLOADING : (same method diff params )
    static int mul(int a, int b, int c) {
        int ans = a*b*c;
        return ans;
    }
    // CALL BY VALUE (copy pass)
    static void sum(int num) {
        System.out.println(num);
        num = num*10;
        System.out.println(num);
    }
    static void main() {
        int num =5;
        System.out.println(num);
        sum(num);
        System.out.println(num);

//        int result = mul(5, 6);
//        int resul = mul(5, 6, 7);
//        System.out.println(result);
//        System.out.println(resul);
//        printSum(5,5);
//        System.out.println("hi");
//        print2KaTable();
//        System.out.println("bye");
    }
}