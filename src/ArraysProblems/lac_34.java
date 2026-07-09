package ArraysProblems;

import java.util.ArrayList;
import java.util.List;

public class lac_34 {
    // problem 1

//   static void rotate(int[][] matrix) {
//        // transpose of a matrix
//        //swap matrix[i][j], matrix[j][i];
//        int n = matrix.length;
//        for(int i=0; i<n;i++){
//            for(int j=i+1; j<n;j++){
//                //swap matrix [i][j] ko [j][i];
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//        // reverse all row of matrix
//        // har row pr jauga or use reverse kr dunga
//        for(int row = 0; row<n; row++){
//            int startCol = 0 ;
//            int endCol =n-1;
//            while(startCol<=endCol){
//                int temp =  matrix[row][startCol];
//                matrix[row][startCol] = matrix[row][endCol];
//                matrix[row][endCol] = temp;
//                startCol++;
//                endCol--;
//            }
//        }
//    }
//
    //problem 2

   static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int startingRow = 0;
        int startingCol = 0;
        int endingCol = n-1;
        int endingRow = m-1;

        while(startingRow<=endingRow && startingCol<=endingCol){
            //loop:1  row wise left to right  ->
            //   starting row print krni h from starting col se end col tk
            for(int col = startingCol; col<=endingCol; col++){
                result.add(matrix[startingRow][col]);
            }
            startingRow++;
            //loop:2   col wise top to bottom ->
            // last col print krna h from starting row se ending row tk
            for(int row = startingRow; row<=endingRow; row++){
                result.add(matrix[row][endingCol]);
            }
            endingCol--;

            //loop:3  row wise  right to lefr
            // endingrow print krni h from ending col to starting col;
            if(startingRow<=endingRow){
                for(int col = endingCol ; col>=startingCol; col--){
                    result.add(matrix[endingRow][col]);
                }
                endingRow--;

            }

            //loop:4  col wise  bottom to top;
            // startting col print krna h from ending row to starting row
            if(startingCol<=endingCol){
                for(int row = endingRow; row>=startingRow;row--){
                    result.add(matrix[row][startingCol]);
                }
                startingCol++;

            }

        }
        return result;

    }



    static void main() {

//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        rotate(matrix);
//
//        // Print matrix
//        for (int[] row : matrix) {
//            for (int num : row) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> ans = spiralOrder(matrix);

        System.out.println(ans);


    }
}
