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
    static void main() {
        int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//        List<Integer> ans = rowSum(arr);
        System.out.println(rowSum(arr));

    }

}
