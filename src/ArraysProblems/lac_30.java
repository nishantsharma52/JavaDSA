package ArraysProblems;

import java.util.Arrays;

public class lac_30 {
    //problem 1
    static int[] twoSum(int[] arr, int target){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j= i+1; j<=n-1; j++){
                if(arr[i] + arr[j] == target){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        int[] ans = {};
        return  ans;
    }
    static void main() {
//        problem 1..
        int[] arr = { 1,2,4,5,6,7};
        int target = 3;
        int ans[] = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));

    }
}
