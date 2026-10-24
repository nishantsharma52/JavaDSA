package Recursion;

public class lac_67 {
    static  boolean solve(int[] arr, int k , int sum, int index){
        if(index>=arr.length){
            if(sum == k){
                return true;
            }
            else{
                return  false;
            }
        }
        int currVal = arr[index];
        boolean excludeKaAns = solve(arr,k,sum,index+1);
        boolean includeKaAns = solve(arr,k,sum+currVal,index+1);
        return excludeKaAns || includeKaAns;
    }
    static  boolean ckeckSubsequenceSum(int[] arr, int k){
        int sum = 0;
        int index = 0;
        boolean ans = solve(arr,k,sum,index);
        return ans;
    }
    static void main(String[] args) {
        int[] arr = {10,1,2,7,6,5,1};
        int k = 110;
        System.out.println(ckeckSubsequenceSum(arr,k));

    }
}
