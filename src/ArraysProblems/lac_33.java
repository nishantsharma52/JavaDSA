package ArraysProblems;

import java.util.ArrayList;
import java.util.List;

public class lac_33 {
    static List<Integer> rowSum(int[][] arr){
        List<Integer> result =  new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        for(int row = 0; row<m; row++){
            //jese hi me kisi nyi row pr aauga me sum ki value ko zero kr dunga
            int sum = 0;
            for(int col=0; col<n; col++){
                int value = arr[row][col];
                sum = sum + value;
            }
            result.add(sum);
        }
        return  result;
    }

    static List<Integer> colSum(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        for(int col = 0; col<m; col++){
            // jese hii nye col pr aauga sum ki vallue zero kr dunga
            int sum = 0;
            for(int row = 0; row<n; row++){
                int val = arr[row][col];
                sum = sum + val;
            }
            result.add(sum);
        }
        return result;
    }
    static void main() {
        int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//        List<Integer> ans = rowSum(arr);
        System.out.println(colSum(arr));

    }

}
