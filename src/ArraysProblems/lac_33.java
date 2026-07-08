package ArraysProblems;

import java.util.ArrayList;
import java.util.List;

public class lac_33 {

    // problem 1

//    static List<Integer> rowSum(int[][] arr){
//        List<Integer> result =  new ArrayList<>();
//        int m = arr.length;
//        int n = arr[0].length;
//        for(int row = 0; row<m; row++){
//            //jese hi me kisi nyi row pr aauga me sum ki value ko zero kr dunga
//            int sum = 0;
//            for(int col=0; col<n; col++){
//                int value = arr[row][col];
//                sum = sum + value;
//            }
//            result.add(sum);
//        }
//        return  result;
//    }

    // problem 3

//    static List<Integer> wavePrintMatrix(int[][] arr , int m ,int n){
//        List<Integer> result = new ArrayList<>();
//        //yha n col h or m row h ;
//        for(int col = 0; col<n; col++){
//            // check krege index even or odd
//            if((col & 1) == 1){
//                //odd
//                //bottom to top
//                for(int row = m-1; row>=0; row--){
//                    result.add(arr[row][col]);
//                }
//            }
//            else{
//                //even
//                // top to bottom
//                for(int row = 0; row<m; row++){
//                    result.add(arr[row][col]);
//                }
//            }
//        }
//        return  result;
//    }
//
//           problem 2


//    static List<Integer> colSum(int[][] arr){
//        List<Integer> result = new ArrayList<>();
//        int n = arr.length;
//        int m = arr[0].length;
//        for(int col = 0; col<m; col++){
//            // jese hii nye col pr aauga sum ki vallue zero kr dunga
//            int sum = 0;
//            for(int row = 0; row<n; row++){
//                int val = arr[row][col];
//                sum = sum + val;
//            }
//            result.add(sum);
//        }
//        return result;
//    }

    // proble 4

    static int[][] transpose(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0][0];
        }
        //for original arrray
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        //for new array
        int newTotalRows = totalCols;
        int newTotalCols = totalRows;

        int ans[][] = new int [newTotalRows][newTotalCols];

        //actual logic

        for(int i = 0; i<totalRows; i++){
            for(int j= 0; j<totalCols; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;

    }

    static void main() {
//        int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//        int n = arr.length;
//        int m = arr[0].length;
////        List<Integer> ans = rowSum(arr);
//        System.out.println(wavePrintMatrix(arr, n, m));
//        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//        int[][] result = transpose(matrix);
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[0].length; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }

    }

}
